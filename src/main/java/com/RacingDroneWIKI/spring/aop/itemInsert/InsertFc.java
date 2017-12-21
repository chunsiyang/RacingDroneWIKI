package com.RacingDroneWIKI.spring.aop.itemInsert;

import com.RacingDroneWIKI.pojo.ElectroSpeedRegulator;
import com.RacingDroneWIKI.pojo.FlightControl;
import com.RacingDroneWIKI.pojo.ImageTransmission;
import com.RacingDroneWIKI.pojo.PowerHub;
import com.RacingDroneWIKI.service.ElectroSpeedRegulatorService;
import com.RacingDroneWIKI.service.ImageTransmissionService;
import com.RacingDroneWIKI.service.PowerHubService;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * The type Insert fc.
 * Spring AOP 切面
 * 在进行飞控数据录入前使用Spring AOP对飞控中可能存在的集成部件进行录入
 *
 * @author ChunsiYang
 * @version SSM 3.0
 */
@Component
@Aspect
public class InsertFc {
    /**
     * The Power hub service.
     */
    @Autowired
    private PowerHubService powerHubService;
    /**
     * The Electro speed regulator service.
     */
    @Autowired
    private ElectroSpeedRegulatorService electroSpeedRegulatorService;
    /**
     * The Image transmission service.
     */
    @Autowired
    private ImageTransmissionService imageTransmissionService;

    /**
     * Inset fc. 在飞控数据录入前对飞控对像中可能存在的集成部件（分电板，电子调速器，图传）进行信息录入
     *
     * @param flightControl the flight control 准备进行数据录入的飞控对象
     */
    @Before("execution(* com.RacingDroneWIKI.service.FlightControlService.addFlightControl(..))" +
            "&& args(flightControl)")
    public void insetFc(FlightControl flightControl) {
        if (flightControl.getPowerHub() != null) {
            PowerHub powerHub = flightControl.getPowerHub();
            powerHub.setUseAlone(false);
            powerHub.setModel(flightControl.getModel());
            flightControl.setPowerHub(powerHub);
            powerHubService.addPowerHub(powerHub);
        }
        if (flightControl.getImageTransmission() != null) {
            ImageTransmission imageTransmission = flightControl.getImageTransmission();
            imageTransmission.setUseAlone(false);
            imageTransmission.setModel(flightControl.getModel());
            flightControl.setImageTransmission(imageTransmission);
            imageTransmissionService.addImageTransmission(imageTransmission);
        }
        if (flightControl.getEsc() != null) {
            ElectroSpeedRegulator electroSpeedRegulator = flightControl.getEsc();
            electroSpeedRegulator.setUseAlone(false);
            electroSpeedRegulator.setModel(flightControl.getModel());
            flightControl.setEsc(electroSpeedRegulator);
            electroSpeedRegulatorService.addElectroSpeedRegulato(electroSpeedRegulator);
        }
    }
}
