package com.RacingDroneWIKI.service;

import com.RacingDroneWIKI.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by user on 2017/11/14.
 */
@Service
public class Search {
    @Autowired
    MotoService  motoService;
    @Autowired
    ElectroSpeedRegulatorService electroSpeedRegulatorService;
    @Autowired
    FrameService frameService;
    @Autowired
    ImageTransmissionService imageTransmissionService;
    @Autowired
    CamService camService;
    @Autowired
    FlightControlService flightControlService;
    @Autowired
    AntennaService antennaService;
    @Autowired
    PowerHubService powerHubService;
    @Autowired
    PropService propService;
    @Autowired
    BatteryService batteryService;

    public int searchModel(String model,List<Moto> motoList, List<ElectroSpeedRegulator> electroSpeedRegulatorList,
                           List<Frame> frameList , List<ImageTransmission> imageTransmissionList,
                           List<Cam> camList, List<FlightControl> flightControlList,
                           List<Antenna> antennaList, List<PowerHub> powerHubList,
                           List<Prop> propList, List<Battery> batteryList)

    {
        if (motoService.findByModel(model)!=null)
            motoList.addAll(motoService.findByModel(model));
        if (electroSpeedRegulatorService.findByModel(model)!=null)
            electroSpeedRegulatorList.addAll(electroSpeedRegulatorService.findByModel(model));
        if (frameService.findByModel(model)!=null)
            frameList.addAll(frameService.findByModel(model));
        if (imageTransmissionService.findByModel(model)!=null)
            imageTransmissionList.addAll(imageTransmissionService.findByModel(model));
        if (camService.findByModel(model)!=null)
            camList.addAll(camService.findByModel(model));
        if (flightControlService.findByModel(model)!=null)
            flightControlList.addAll(flightControlService.findByModel(model));
        if (antennaService.findByModel(model)!=null)
            antennaList.addAll(antennaService.findByModel(model));
        if (powerHubService.findByModel(model)!=null)
            powerHubList.addAll(powerHubService.findByModel(model));
        if (propService.findByModel(model)!=null)
            propList.addAll(propService.findByModel(model));
        if (batteryService.findByModel(model)!=null)
            batteryList.addAll(batteryService.findByModel(model));
        return 0;
    }
}
















