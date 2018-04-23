package com.RacingDroneWIKI.service;

import com.RacingDroneWIKI.pojo.Drone;
import com.RacingDroneWIKI.pojo.EfficacyChart;
import com.RacingDroneWIKI.pojo.Frame;
import com.RacingDroneWIKI.pojo.Item;
import jdk.nashorn.internal.runtime.arrays.IteratorAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

/**
 * The type Drone information service.无人机信息
 *
 * @author ChunsiYang
 * @version SSM 3.0
 */
@Service
public class DroneInfoService {
    @Autowired
    private DroneAssemblyInfoService droneAssemblyInfoService;

    /**
     * Updata. 更新无人机信息包括基本信息和组装信息
     *
     * @param drone the drone
     */
    public void updata(Drone drone) {
        updataWeight(drone);
        updataPrice(drone);
        updataMaximumThrust(drone);
        updataThrustWeightRatio(drone);
        droneAssemblyInfoService.updataAssemblyInfo(drone);
    }
    private float getMaterialWeight(Frame frame){
        if (frame==null){
            return 0;
        }
        int wheekBase=frame.getWheekBase();
        if (wheekBase<100) {
            return 10;
        }
        if (wheekBase<130) {
            return 20;
        }
        return 30;
    }

    private float getPrice(Item item) {
        return item != null ? item.getReferencePrice() : 0;
    }

    private float getWeight(Item item) {
        return item != null ? item.getWeight() : 0;
    }

    private void updataWeight(Drone drone) {
        float weight = 0;
        weight = getWeight(drone.getAntenna()) + getWeight(drone.getCam()) + getWeight(drone.getImageTransmission()) +
                getWeight(drone.getFlightControl()) + getWeight(drone.getPowerHub()) + getWeight(drone.getMoto()) * 4 +
                getWeight(drone.getProp()) + getWeight(drone.getBattery()) + getWeight(drone.getFrame());
        if (drone.getElectroSpeedRegulator() != null) {
            weight += drone.getElectroSpeedRegulator().isFourInone() ? getWeight(drone.getElectroSpeedRegulator())
                    : getWeight(drone.getElectroSpeedRegulator()) * 4;
        }
        weight+=getMaterialWeight(drone.getFrame());
        drone.setTotalWeight(weight);
    }

    private void updataPrice(Drone drone) {
        float price = 0;
        price = getPrice(drone.getAntenna()) + getPrice(drone.getCam()) + getPrice(drone.getImageTransmission()) +
                getPrice(drone.getFlightControl()) + getPrice(drone.getPowerHub()) + getPrice(drone.getMoto()) * 4 +
                getPrice(drone.getProp()) + getPrice(drone.getBattery()) + getPrice(drone.getFrame());
        if (drone.getElectroSpeedRegulator() != null) {
            price += drone.getElectroSpeedRegulator().isFourInone() ? getPrice(drone.getElectroSpeedRegulator())
                    : getPrice(drone.getElectroSpeedRegulator()) * 4;
        }
        drone.setTotalPrice(price);
    }

    /**
     * Gets match efficacy chart. 获取与当前无人机配置适配的力效表
     *
     * @param drone the drone
     * @return the match efficacy chart
     */
    public EfficacyChart getMatchEfficacyChart(Drone drone) {
        if (drone.getMoto() == null || drone.getProp() == null || drone.getBattery() == null) {
            return null;
        }
        List<EfficacyChart> efficacyChartList = drone.getMoto().getEfficacyChart();
        Iterator<EfficacyChart> efficacyChartIterator = efficacyChartList.iterator();
        EfficacyChart matchEfficacyChart = null;
        while (efficacyChartIterator.hasNext()) {
            EfficacyChart efficacyChart = efficacyChartIterator.next();
            //如果有符合的桨型信息
            if (efficacyChart.getProp().equals(drone.getProp().getSize())) {
                if (efficacyChart.getVoltages() == drone.getBattery().getVoltage()) {
                    matchEfficacyChart = efficacyChart;
                    break;
                }
            }
            //没有符合的桨型使用桨尺寸匹配
            else if (efficacyChart.getProp().charAt(0) == drone.getProp().getSize().charAt(0)) {
                if (efficacyChart.getVoltages() == drone.getBattery().getVoltage()) {
                    matchEfficacyChart = efficacyChart;
                }
            }
        }
        return matchEfficacyChart;
    }

    private void updataMaximumThrust(Drone drone) {
        float maximumThrust = 0;
        EfficacyChart efficacyChart = getMatchEfficacyChart(drone);
        if (efficacyChart != null) {
            maximumThrust = efficacyChart.getFullPull() * 4;
        }
        drone.setMaximumThrust(maximumThrust);
    }

    private void updataThrustWeightRatio(Drone drone) {
        float thrustWeightRatio = 0;
        if (drone.getMaximumThrust() == 0) {
            return;
        }
        if (drone.getTotalWeight() != 0 && drone.getMaximumThrust() != 0) {
            thrustWeightRatio = drone.getMaximumThrust() / drone.getTotalWeight();
        }
        drone.setThrustWeightRatio((float) (Math.round(thrustWeightRatio * 100) / 100));
    }

}
