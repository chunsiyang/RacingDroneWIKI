package com.RacingDroneWIKI.controller;

import com.RacingDroneWIKI.pojo.*;
import com.RacingDroneWIKI.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by user on 2017/11/7.
 */
@Controller
public class SearchAll {
    final int PAGENUMBER = 10;
    int pages;
    int first;
    int last;
    @Autowired
    MotoService motoService;
    @Autowired
    ElectroSpeedRegulatorService electroSpeedRegulatorServiicer;
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

    @RequestMapping(value = "/moto_{page}")
    public String motoList(Model model, @PathVariable(value = "page") int page) {
        List<Moto> list = motoService.findAll();
        pages = list.size() % PAGENUMBER != 0 ? list.size() / PAGENUMBER + 1 : list.size() / PAGENUMBER;
        first = (page - 1) * PAGENUMBER;
        last = list.size() > (first + PAGENUMBER) ? first + PAGENUMBER : list.size();
        list = list.subList(first, last);
        model.addAttribute("uri", "/moto_");
        model.addAttribute("pages", pages);
        model.addAttribute("page", page);
        model.addAttribute("motoList", list);
        return "resultSet";
    }

    @RequestMapping(value = "/electroSpeedRegulator_{page}")
    public String electroSpeedRegulatorList(Model model, @PathVariable(value = "page") int page) {
        List<ElectroSpeedRegulator> list = electroSpeedRegulatorServiicer.findAll();
        pages = list.size() % PAGENUMBER != 0 ? list.size() / PAGENUMBER + 1 : list.size() / PAGENUMBER;
        first = (page - 1) * PAGENUMBER;
        last = list.size() > (first + PAGENUMBER) ? first + PAGENUMBER : list.size();
        list = list.subList(first, last);
        model.addAttribute("uri", "/electroSpeedRegulator_");
        model.addAttribute("pages", pages);
        model.addAttribute("page", page);
        model.addAttribute("electroSpeedRegulatorList", list);
        return "resultSet";
    }

    @RequestMapping(value = "/frame_{page}")
    public String frameList(Model model, @PathVariable(value = "page") int page) {
        List<Frame> list = frameService.findAll();
        pages = list.size() % PAGENUMBER != 0 ? list.size() / PAGENUMBER + 1 : list.size() / PAGENUMBER;
        first = (page - 1) * PAGENUMBER;
        last = list.size() > (first + PAGENUMBER) ? first + PAGENUMBER : list.size();
        list = list.subList(first, last);
        model.addAttribute("uri", "/frame_");
        model.addAttribute("pages", pages);
        model.addAttribute("page", page);
        model.addAttribute("frameList", list);
        return "resultSet";
    }

    @RequestMapping(value = "/imageTransmission_{page}")
    public String imageTransmissionList(Model model, @PathVariable(value = "page") int page) {
        List<ImageTransmission> list = imageTransmissionService.findAll();
        pages = list.size() % PAGENUMBER != 0 ? list.size() / PAGENUMBER + 1 : list.size() / PAGENUMBER;
        first = (page - 1) * PAGENUMBER;
        last = list.size() > (first + PAGENUMBER) ? first + PAGENUMBER : list.size();
        list = list.subList(first, last);
        model.addAttribute("uri", "/imageTransmission_");
        model.addAttribute("pages", pages);
        model.addAttribute("page", page);
        model.addAttribute("imageTransmissionList", list);
        return "resultSet";
    }

    @RequestMapping(value = "/cam_{page}")
    public String camList(Model model, @PathVariable(value = "page") int page) {
        List<Cam> list = camService.findAll();
        pages = list.size() % PAGENUMBER != 0 ? list.size() / PAGENUMBER + 1 : list.size() / PAGENUMBER;
        first = (page - 1) * PAGENUMBER;
        last = list.size() > (first + PAGENUMBER) ? first + PAGENUMBER : list.size();
        list = list.subList(first, last);
        model.addAttribute("uri", "/cam_");
        model.addAttribute("pages", pages);
        model.addAttribute("page", page);
        model.addAttribute("camList", list);
        return "resultSet";
    }

    @RequestMapping(value = "/flightControl_{page}")
    public String flightControlList(Model model, @PathVariable(value = "page") int page) {
        List<FlightControl> list = flightControlService.findAll();
        pages = list.size() % PAGENUMBER != 0 ? list.size() / PAGENUMBER + 1 : list.size() / PAGENUMBER;
        first = (page - 1) * PAGENUMBER;
        last = list.size() > (first + PAGENUMBER) ? first + PAGENUMBER : list.size();
        list = list.subList(first, last);
        model.addAttribute("uri", "/flightControl_");
        model.addAttribute("pages", pages);
        model.addAttribute("page", page);
        model.addAttribute("flightControlList", list);
        return "resultSet";
    }

    @RequestMapping(value = "/antenna_{page}")
    public String antennaList(Model model, @PathVariable(value = "page") int page) {
        List<Antenna> list = antennaService.findAll();
        pages = list.size() % PAGENUMBER != 0 ? list.size() / PAGENUMBER + 1 : list.size() / PAGENUMBER;
        first = (page - 1) * PAGENUMBER;
        last = list.size() > (first + PAGENUMBER) ? first + PAGENUMBER : list.size();
        list = list.subList(first, last);
        model.addAttribute("uri", "/antenna_");
        model.addAttribute("pages", pages);
        model.addAttribute("page", page);
        model.addAttribute("antennaList", list);
        return "resultSet";
    }

    @RequestMapping(value = "/powerHub_{page}")
    public String powerHubList(Model model, @PathVariable(value = "page") int page) {
        List<PowerHub> list = powerHubService.findAll();
        pages = list.size() % PAGENUMBER != 0 ? list.size() / PAGENUMBER + 1 : list.size() / PAGENUMBER;
        first = (page - 1) * PAGENUMBER;
        last = list.size() > (first + PAGENUMBER) ? first + PAGENUMBER : list.size();
        list = list.subList(first, last);
        model.addAttribute("uri", "/powerHub_");
        model.addAttribute("pages", pages);
        model.addAttribute("page", page);
        model.addAttribute("powerHubList", list);
        return "resultSet";
    }

    @RequestMapping(value = "/prop_{page}")
    public String propList(Model model, @PathVariable(value = "page") int page) {
        List<Prop> list = propService.findAll();
        pages = list.size() % PAGENUMBER != 0 ? list.size() / PAGENUMBER + 1 : list.size() / PAGENUMBER;
        first = (page - 1) * PAGENUMBER;
        last = list.size() > (first + PAGENUMBER) ? first + PAGENUMBER : list.size();
        list = list.subList(first, last);
        model.addAttribute("uri", "/prop_");
        model.addAttribute("pages", pages);
        model.addAttribute("page", page);
        model.addAttribute("propList", list);
        return "resultSet";
    }

    @RequestMapping(value = "/battery_{page}")
    public String batteryList(Model model, @PathVariable(value = "page") int page) {
        List<Battery> list = batteryService.findAll();
        pages = list.size() % PAGENUMBER != 0 ? list.size() / PAGENUMBER + 1 : list.size() / PAGENUMBER;
        first = (page - 1) * PAGENUMBER;
        last = list.size() > (first + PAGENUMBER) ? first + PAGENUMBER : list.size();
        list = list.subList(first, last);
        model.addAttribute("uri", "/battery_");
        model.addAttribute("pages", pages);
        model.addAttribute("page", page);
        model.addAttribute("batteryList", list);
        return "resultSet";
    }
}
