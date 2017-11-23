package com.RacingDroneWIKI.controller;

import com.RacingDroneWIKI.dao.PowerHubDao;
import com.RacingDroneWIKI.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 响应详情查询的Controller
 * 针对用户发出的详情查询请求进行数据库查询并做出响应
 * @author ChunsiYang
 * @version SSM 3.0
 */
@Controller
@RequestMapping(value = "/detail")
public class Detail {
    @Autowired
    private MotoService motoService;
    @Autowired
    private ElectroSpeedRegulatorService electroSpeedRegulatorService;
    @Autowired
    private FrameService frameService;
    @Autowired
    private ImageTransmissionService imageTransmissionService;
    @Autowired
    private CamService camService;
    @Autowired
    private FlightControlService flightControlService;
    @Autowired
    private AntennaService antennaService;
    @Autowired
    private PowerHubDao powerHubDao;
    @Autowired
    private PropService propService;
    @Autowired
    private BatteryService batteryService;

    /**
     * Moto detail string.
     * 响应获取电机详情的请求
     *
     * @param modelId the request model id
     * @param model   the springMVC model
     * @return the URI  string
     */
    @RequestMapping(value = "/moto/{modelId}")
    public String motoDetail(@PathVariable("modelId") String modelId, Model model) {
        model.addAttribute("item", motoService.findDetail(modelId));
        return "item/moto";
    }

    /**
     * Electro speed regulator detail string.
     * 响应获取电子调速器详情的请求
     *
     * @param modelId the request model id
     * @param model   the springMVC model
     * @return the URI  string
     */
    @RequestMapping(value = "/esc/{modelId}")
    public String electroSpeedRegulatorDetail(@PathVariable("modelId") String modelId, Model model) {
        model.addAttribute("item", electroSpeedRegulatorService.findDetail(modelId));
        return "item/esc";
    }

    /**
     * Frame detail string.
     * 响应获取机架详情的请求
     *
     * @param modelId the request model id
     * @param model   the springMVC model
     * @return the URI string
     */
    @RequestMapping(value = "/frame/{modelId}")
    public String frameDetail(@PathVariable("modelId") String modelId, Model model) {
        model.addAttribute("item", frameService.findDetail(modelId));
        return "item/fra";
    }

    /**
     * Image transmission detail string.
     * 响应获取图传详情的请求
     *
     * @param modelId the request model id
     * @param model   the springMVC model
     * @return the URI string
     */
    @RequestMapping(value = "/it/{modelId}")
    public String imageTransmissionDetail(@PathVariable("modelId") String modelId, Model model) {
        model.addAttribute("item", imageTransmissionService.findDetail(modelId));
        System.err.println(modelId);
        return "item/it";
    }

    /**
     * Cam detail string.
     * 响应获取摄像头详情的请求
     *
     * @param modelId the request model id
     * @param model   the springMVC model
     * @return the URI string
     */
    @RequestMapping(value = "/cam/{modelId}")
    public String camDetail(@PathVariable("modelId") String modelId, Model model) {
        model.addAttribute("item", camService.findDetail(modelId));
        return "item/cam";
    }

    /**
     * Flight control detail string.
     * 响应获取飞控详情的请求
     *
     * @param modelId the request model id
     * @param model   the springMVC model
     * @return the URI string
     */
    @RequestMapping(value = "/fc/{modelId}")
    public String flightControlDetail(@PathVariable("modelId") String modelId, Model model) {
        model.addAttribute("item", flightControlService.findDetail(modelId));
        return "item/fc";
    }

    /**
     * Antenna detail string.
     * 响应获取天线详情的请求
     *
     * @param modelId the request model id
     * @param model   the springMVC model
     * @return the URI string
     */
    @RequestMapping(value = "/antenna/{modelId}")
    public String antennaDetail(@PathVariable("modelId") String modelId, Model model) {
        model.addAttribute("item", antennaService.findDetail(modelId));
        return "item/ant";
    }

    /**
     * Power hub detail string.
     * 响应获取分电板详情的请求
     *
     * @param modelId the request model id
     * @param model   the springMVC model
     * @return the URI string
     */
    @RequestMapping(value = "/powerHub/{modelId}")
    public String powerHubDetail(@PathVariable("modelId") String modelId, Model model) {
        model.addAttribute("item", powerHubDao.findDetail(modelId));
        return "item/ph";
    }

    /**
     * Prop detail string.
     * 响应获取桨叶详情的请求
     *
     * @param modelId the request model id
     * @param model   the springMVC model
     * @return the URI string
     */
    @RequestMapping(value = "/prop/{modelId}")
    public String propDetail(@PathVariable("modelId") String modelId, Model model) {
        model.addAttribute("item", propService.findDetail(modelId));
        return "item/prop";
    }

    /**
     * Battery detail string.
     * 响应获取电池详情的请求
     *
     * @param modelId the request model id
     * @param model   the springMVC model
     * @return the URI string
     */
    @RequestMapping(value = "/battery/{modelId}")
    public String batteryDetail(@PathVariable("modelId") String modelId, Model model) {
        model.addAttribute("item", batteryService.findDetail(modelId));
        return "item/bat";
    }
}
