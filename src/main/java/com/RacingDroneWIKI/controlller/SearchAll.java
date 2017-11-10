package com.RacingDroneWIKI.controlller;

import com.RacingDroneWIKI.pojo.*;
import com.RacingDroneWIKI.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by user on 2017/11/7.
 */
@Controller
public class SearchAll  {
    @Autowired
    MotoService motoService;
    @RequestMapping(value = "/moto")
    public String motoList(Model model)
    {
        List<Moto> list=motoService.findAll();
        model.addAttribute("motoList",list);
        return "resultSet";
    }
    @Autowired
    ElectroSpeedRegulatorService electroSpeedRegulatorServiicer;
    @RequestMapping(value = "/electroSpeedRegulator")
    public String electroSpeedRegulatorList(Model model){
        List<ElectroSpeedRegulator> list =electroSpeedRegulatorServiicer.findAll();
        model.addAttribute("electroSpeedRegulatorList",list);
        return "resultSet";
    }
    @Autowired
    FrameService frameService;
    @RequestMapping(value = "/frame")
    public String frameList(Model model){
        List<Frame> list =frameService.findAll();
        model.addAttribute("frameList",list);
        return "resultSet";
    }
    @Autowired
    ImageTransmissionService imageTransmissionService;
    @RequestMapping(value = "/imageTransmission")
    public String imageTransmissionList(Model model){
        List<ImageTransmission> list =imageTransmissionService.findAll();
        model.addAttribute("imageTransmissionList",list);
        return "resultSet";
    }
    @Autowired
    CamService camService;
    @RequestMapping(value = "/cam")
    public String camList(Model model){
        List<Cam> list =camService.findAll();
        model.addAttribute("camList",list);
        return "resultSet";
    }
    @Autowired
    FlightControlService flightControlService;
    @RequestMapping(value = "/flightControl")
    public String flightControlList(Model model){
        List<FlightControl> list =flightControlService.findAll();
        model.addAttribute("flightControlList",list);
        return "resultSet";
    }
    @Autowired
    AntennaService antennaService;
    @RequestMapping(value = "/antenna")
    public String antennaList(Model model){
        List<Antenna> list =antennaService.findAll();
        model.addAttribute("antennaList",list);
        return "resultSet";
    }
    @Autowired
    PowerHubService powerHubService;
    @RequestMapping(value = "/powerHub")
    public String powerHubList(Model model){
        List<PowerHub> list =powerHubService.findAll();
        model.addAttribute("powerHubList",list);
        return "resultSet";
    }
    @Autowired
    PropService propService;
    @RequestMapping(value = "/prop")
    public String propList(Model model){
        List<Prop> list =propService.findAll();
        model.addAttribute("propList",list);
        return "resultSet";
    }
    @Autowired
    BatteryService batteryService;
    @RequestMapping(value = "/battery")
    public String batteryList(Model model){
        List<Battery> list =batteryService.findAll();
        model.addAttribute("batteryList",list);
        return "resultSet";
    }
}
