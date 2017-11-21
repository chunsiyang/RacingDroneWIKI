package com.RacingDroneWIKI.spring.aop;

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
 * Created by user on 2017/11/21.
 */
@Component
@Aspect
public class InsertFc {
    @Autowired
    PowerHubService powerHubService;
    @Autowired
    ElectroSpeedRegulatorService electroSpeedRegulatorService;
    @Autowired
    ImageTransmissionService imageTransmissionService;
    @Before("execution(* com.RacingDroneWIKI.service.FlightControlService.addFlightControl(..))" +
            "&& args(flightControl)")
    public void insetFc(FlightControl flightControl)
    {
        if (flightControl.getPowerHub()!=null)
        {
            PowerHub powerHub=flightControl.getPowerHub();
            powerHub.setUseAlone(false);
            powerHub.setModel(flightControl.getModel());
            flightControl.setPowerHub(powerHub);
            powerHubService.addPowerHub(powerHub);
        }
        if (flightControl.getImageTransmission()!=null)
        {
            ImageTransmission imageTransmission=flightControl.getImageTransmission();
            imageTransmission.setUseAlone(false);
            imageTransmission.setModel(flightControl.getModel());
            flightControl.setImageTransmission(imageTransmission);
            imageTransmissionService.addImageTransmission(imageTransmission);
        }
        if (flightControl.getEsc()!=null)
        {
            ElectroSpeedRegulator electroSpeedRegulator=flightControl.getEsc();
            electroSpeedRegulator.setUseAlone(false);
            electroSpeedRegulator.setModel(flightControl.getModel());
            flightControl.setEsc(electroSpeedRegulator);
            electroSpeedRegulatorService.addElectroSpeedRegulato(electroSpeedRegulator);
        }
    }
}
