package com.RacingDroneWIKI.service;

import com.RacingDroneWIKI.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * The type Search.模糊查找服务
 * @author ChunsiYang
 * @version SSM 3.0
 */
@Service
public class Search {
    /**
     * The Moto service.
     */
    @Autowired
    private MotoService  motoService;
    /**
     * The Electro speed regulator service.
     */
    @Autowired
    private ElectroSpeedRegulatorService electroSpeedRegulatorService;
    /**
     * The Frame service.
     */
    @Autowired
    private FrameService frameService;
    /**
     * The Image transmission service.
     */
    @Autowired
    private ImageTransmissionService imageTransmissionService;
    /**
     * The Cam service.
     */
    @Autowired
    private CamService camService;
    /**
     * The Flight control service.
     */
    @Autowired
    private FlightControlService flightControlService;
    /**
     * The Antenna service.
     */
    @Autowired
    private AntennaService antennaService;
    /**
     * The Power hub service.
     */
    @Autowired
    private PowerHubService powerHubService;
    /**
     * The Prop service.
     */
    @Autowired
    private PropService propService;
    /**
     * The Battery service.
     */
    @Autowired
    private BatteryService batteryService;

    /**
     * Search model int.
     *
     * @param model                     the model
     * @param motoList                  the moto list
     * @param electroSpeedRegulatorList the electro speed regulator list
     * @param frameList                 the frame list
     * @param imageTransmissionList     the image transmission list
     * @param camList                   the cam list
     * @param flightControlList         the flight control list
     * @param antennaList               the antenna list
     * @param powerHubList              the power hub list
     * @param propList                  the prop list
     * @param batteryList               the battery list
     * @return the int
     */
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
















