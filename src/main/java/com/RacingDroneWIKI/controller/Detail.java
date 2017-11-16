package com.RacingDroneWIKI.controller;

import com.RacingDroneWIKI.dao.*;
import com.RacingDroneWIKI.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by user on 2017/11/13.
 */

@Controller
@RequestMapping(value = "/detail")
public class Detail {
    @Autowired
    MotoService motoService;
    @RequestMapping(value = "/moto/{modelId}")
    public String motoDetail(@PathVariable("modelId") String modelId, Model model)
    {
        model.addAttribute("item",motoService.findDetail(modelId));
        return "item/moto";
    }
    @Autowired
    ElectroSpeedRegulatorService electroSpeedRegulatorService;
    @RequestMapping(value = "/esc/{modelId}")
    public String electroSpeedRegulatorDetail(@PathVariable("modelId") String modelId, Model model)
    {
        model.addAttribute("item",electroSpeedRegulatorService.findDetail(modelId));
        return "item/esc";
    }
    @Autowired
    FrameService frameService;
    @RequestMapping(value = "/frame/{modelId}")
    public String frameDetail(@PathVariable("modelId") String modelId, Model model)
    {
        model.addAttribute("item",frameService.findDetail(modelId));
        return "item/fra";
    }
    @Autowired
    ImageTransmissionService imageTransmissionService;
    @RequestMapping(value = "/it/{modelId}")
    public String imageTransmissionDetail(@PathVariable("modelId") String modelId, Model model)
    {
        model.addAttribute("item",imageTransmissionService.findDetail(modelId));
        System.err.println(modelId);
        return "item/it";
    }
    @Autowired
    CamService camService;
    @RequestMapping(value = "/cam/{modelId}")
    public String camDetail(@PathVariable("modelId") String modelId, Model model)
    {
        model.addAttribute("item", camService.findDetail(modelId));
        return "item/cam";
    }
    @Autowired
    FlightControlService flightControlService;
    @RequestMapping(value = "/fc/{modelId}")
    public String flightControlDetail(@PathVariable("modelId") String modelId, Model model)
    {
        model.addAttribute("item",flightControlService.findDetail(modelId));
        return "item/fc";
    }
    @Autowired
    AntennaService antennaService;
    @RequestMapping(value = "/antenna/{modelId}")
    public String antennaDetail(@PathVariable("modelId") String modelId, Model model)
    {
        model.addAttribute("item",antennaService.findDetail(modelId));
        return "item/ant";
    }
    @Autowired
    PowerHubDao powerHubDao;
    @RequestMapping(value = "/powerHub/{modelId}")
    public String powerHubDetail(@PathVariable("modelId") String modelId, Model model)
    {
        model.addAttribute("item",powerHubDao.findDetail(modelId));
        return "item/ph";
    }
    @Autowired
    PropService propService;
    @RequestMapping(value = "/prop/{modelId}")
    public String propDetail(@PathVariable("modelId") String modelId, Model model)
    {
        model.addAttribute("item",propService.findDetail(modelId));
        return "item/prop";
    }
    @Autowired
    BatteryService batteryService;
    @RequestMapping(value = "/battery/{modelId}")
    public String batteryDetail(@PathVariable("modelId") String modelId, Model model)
    {
        model.addAttribute("item",batteryService.findDetail(modelId));
        return "item/bat";
    }
}
