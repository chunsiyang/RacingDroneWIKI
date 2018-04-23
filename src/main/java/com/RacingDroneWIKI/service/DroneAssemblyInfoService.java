package com.RacingDroneWIKI.service;

import com.RacingDroneWIKI.pojo.Battery;
import com.RacingDroneWIKI.pojo.Drone;
import com.RacingDroneWIKI.pojo.EfficacyChart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * The type Drone assembly info service. 获取无人机相关组装信息
 *
 * @author ChunsiYang
 * @version SSM 3.0
 */
@Service
public class DroneAssemblyInfoService {
    private final float LOADCURRENT = 10;
    @Autowired
    private DroneInfoService droneInfoService;

    /**
     * Updata assembly info. 更新无人机组装信息
     *
     * @param drone the drone
     */
    public void updataAssemblyInfo(Drone drone) {
        drone.getNotification().clear();
        escCurrent(drone);
        batteryCurrent(drone);
    }

    private void updataMap(Drone drone, String key, String value) {
        Map<String, String> map = drone.getNotification();
        map.put(key, value);
    }

    private void escCurrent(Drone drone) {
        String key = "escCurrent", value;
        EfficacyChart efficacyChart = droneInfoService.getMatchEfficacyChart(drone);
        if (efficacyChart == null || drone.getElectroSpeedRegulator() == null)
            return;
        if (efficacyChart.getFullLoadCurrency() > drone.getElectroSpeedRegulator().getInstantaneousCurrent()) {
            value = "\"" + drone.getElectroSpeedRegulator().getModel() + "\"瞬时耐流能力为" +
                    drone.getElectroSpeedRegulator().getInstantaneousCurrent() + "A,小于\""
                    + drone.getMoto().getModel() + "\"最大" + efficacyChart.getFullLoadCurrency() +
                    "A电流，建议换装耐流能力更强的电子调速器";
            updataMap(drone, key, value);
        }
    }

    private void batteryCurrent(Drone drone) {
        String key = "batteryCurrent", value;
        EfficacyChart efficacyChart = droneInfoService.getMatchEfficacyChart(drone);
        if (efficacyChart == null || drone.getBattery() == null)
            return;
        Battery battery = drone.getBattery();
        //电池信息不全
        if (battery.getCapacity() == 0 || battery.getDischargeRate() == 0)
            return;
        float disChargeRate;
        disChargeRate = battery.getInstantaneousDischargeRate() != 0 ?
                battery.getInstantaneousDischargeRate() : battery.getDischargeRate();
        System.err.println(disChargeRate);
        float fullLoadCurrency = efficacyChart.getFullLoadCurrency() * 4 + LOADCURRENT;
        float batteryCurrency = battery.getCapacity() * disChargeRate / 1000;
        if (fullLoadCurrency > batteryCurrency) {
            value = "\"" + battery.getModel() + "\"最大可提供" +
                    batteryCurrency + "A电流,小于系统最大\"" +
                    fullLoadCurrency + "A电流需求，建议更换C数（放电倍率）更高的电池";
            updataMap(drone, key, value);
        }
    }
}
