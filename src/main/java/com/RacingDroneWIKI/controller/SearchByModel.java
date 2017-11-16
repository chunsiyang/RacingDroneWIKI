package com.RacingDroneWIKI.controller;

import com.RacingDroneWIKI.pojo.*;
import com.RacingDroneWIKI.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by user on 2017/11/13.
 */
@Controller
public class SearchByModel {
    @Autowired
    Search search;
    @RequestMapping(value = "/search")
    public String search(@RequestParam("searchModel") String searchModel, Model model){
        List<Moto> motoList =new LinkedList<>();
        List<ElectroSpeedRegulator> electroSpeedRegulatorList=new LinkedList<>();
        List<Frame> frameList =new LinkedList<>();
        List<ImageTransmission> imageTransmissionList=new LinkedList<>();
        List<Cam> camList=new LinkedList<>();
        List<FlightControl> flightControlList=new LinkedList<>();
        List<Antenna> antennaList=new LinkedList<>();
        List<PowerHub> powerHubList=new LinkedList<>();
        List<Prop> propList=new LinkedList<>();
        List<Battery> batteryList=new LinkedList<>();
        search.searchModel(searchModel,motoList,electroSpeedRegulatorList,frameList,
                imageTransmissionList,camList,flightControlList,antennaList,
                powerHubList,propList,batteryList);
        model.addAttribute("motoList",motoList);
        model.addAttribute("electroSpeedRegulatorList",electroSpeedRegulatorList);
        model.addAttribute("frameList",frameList);
        model.addAttribute("imageTransmissionList",imageTransmissionList);
        model.addAttribute("camList",camList);
        model.addAttribute("flightControlList",flightControlList);
        model.addAttribute("antennaList",antennaList);
        model.addAttribute("powerHubList",powerHubList);
        model.addAttribute("propList",propList);
        model.addAttribute("batteryList",batteryList);
        return "resultSet";
    }
}
