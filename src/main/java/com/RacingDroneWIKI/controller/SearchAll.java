package com.RacingDroneWIKI.controller;

import com.RacingDroneWIKI.pojo.*;
import com.RacingDroneWIKI.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 响应按类型查询的Controller
 * 针对用户选择的设备类型进行分类查询并进行结果展示
 * @author ChunsiYang
 * @version SSM 3.0
 */
@Controller
public class SearchAll {
    private static final String PAGES = "pages";
    private static final String RESULT_SET = "resultSet";
    private final int PAGENUMBER = 10;
    private int pages;
    private int first;
    private int last;
    @Autowired
    private MotoService motoService;
    @Autowired
    private ElectroSpeedRegulatorService electroSpeedRegulatorServiicer;
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
    private PowerHubService powerHubService;
    @Autowired
    private PropService propService;
    @Autowired
    private BatteryService batteryService;

    /**
     * 响应获取并展示电机列表的请求
     * Moto list string.
     *
     * @param model the SpringMVC model
     * @param page  the page 当前页号
     * @return the URI string
     */
    @RequestMapping(value = "/moto_{page}")
    public String motoList(Model model, @PathVariable(value = "page") int page,HttpServletRequest request) {
        request.getSession().invalidate();
        List<Moto> list = motoService.findAll();
        pages = list.size() % PAGENUMBER != 0 ? list.size() / PAGENUMBER + 1 : list.size() / PAGENUMBER;
        first = (page - 1) * PAGENUMBER;
        last = list.size() > (first + PAGENUMBER) ? first + PAGENUMBER : list.size();
        list = list.subList(first, last);
        model.addAttribute("uri", "/moto_");
        model.addAttribute(PAGES, pages);
        model.addAttribute("page", page);
        model.addAttribute("motoList", list);
        return RESULT_SET;
    }

    /**
     * 响应获取并展示电子调速器列表的请求
     * Electro speed regulator list string.
     *
     * @param model the SpringMVC model
     * @param page  the page 当前页号
     * @return the URI string
     */
    @RequestMapping(value = "/electroSpeedRegulator_{page}")
    public String electroSpeedRegulatorList(Model model, @PathVariable(value = "page") int page,HttpServletRequest request) {
        request.getSession().invalidate();
        List<ElectroSpeedRegulator> list = electroSpeedRegulatorServiicer.findAll();
        pages = list.size() % PAGENUMBER != 0 ? list.size() / PAGENUMBER + 1 : list.size() / PAGENUMBER;
        first = (page - 1) * PAGENUMBER;
        last = list.size() > (first + PAGENUMBER) ? first + PAGENUMBER : list.size();
        list = list.subList(first, last);
        model.addAttribute("uri", "/electroSpeedRegulator_");
        model.addAttribute(PAGES, pages);
        model.addAttribute("page", page);
        model.addAttribute("electroSpeedRegulatorList", list);
        return RESULT_SET;
    }

    /**
     * 响应获取并展示机架列表的请求
     * Frame list string.
     *
     * @param model the SpringMVC model
     * @param page  the page 当前页号
     * @return the URI string
     */
    @RequestMapping(value = "/frame_{page}")
    public String frameList(Model model, @PathVariable(value = "page") int page,HttpServletRequest request) {
        request.getSession().invalidate();
        List<Frame> list = frameService.findAll();
        pages = list.size() % PAGENUMBER != 0 ? list.size() / PAGENUMBER + 1 : list.size() / PAGENUMBER;
        first = (page - 1) * PAGENUMBER;
        last = list.size() > (first + PAGENUMBER) ? first + PAGENUMBER : list.size();
        list = list.subList(first, last);
        model.addAttribute("uri", "/frame_");
        model.addAttribute(PAGES, pages);
        model.addAttribute("page", page);
        model.addAttribute("frameList", list);
        return RESULT_SET;
    }

    /**
     * 响应获取并展示图传列表的请求
     * Image transmission list string.
     *
     * @param model the SpringMVC model
     * @param page  the page 当前页号
     * @return the URI string
     */
    @RequestMapping(value = "/imageTransmission_{page}")
    public String imageTransmissionList(Model model, @PathVariable(value = "page") int page,HttpServletRequest request) {
        request.getSession().invalidate();
        List<ImageTransmission> list = imageTransmissionService.findAll();
        pages = list.size() % PAGENUMBER != 0 ? list.size() / PAGENUMBER + 1 : list.size() / PAGENUMBER;
        first = (page - 1) * PAGENUMBER;
        last = list.size() > (first + PAGENUMBER) ? first + PAGENUMBER : list.size();
        list = list.subList(first, last);
        model.addAttribute("uri", "/imageTransmission_");
        model.addAttribute(PAGES, pages);
        model.addAttribute("page", page);
        model.addAttribute("imageTransmissionList", list);
        return RESULT_SET;
    }

    /**
     * 响应获取并展示摄像头列表的请求
     * Cam list string.
     *
     * @param model the SpringMVC model
     * @param page  the page 当前页号
     * @return the URI string
     */
    @RequestMapping(value = "/cam_{page}")
    public String camList(Model model, @PathVariable(value = "page") int page,HttpServletRequest request) {
        request.getSession().invalidate();
        List<Cam> list = camService.findAll();
        pages = list.size() % PAGENUMBER != 0 ? list.size() / PAGENUMBER + 1 : list.size() / PAGENUMBER;
        first = (page - 1) * PAGENUMBER;
        last = list.size() > (first + PAGENUMBER) ? first + PAGENUMBER : list.size();
        list = list.subList(first, last);
        model.addAttribute("uri", "/cam_");
        model.addAttribute(PAGES, pages);
        model.addAttribute("page", page);
        model.addAttribute("camList", list);
        return RESULT_SET;
    }

    /**
     * 响应获取并展示飞控列表的请求
     * Flight control list string.
     *
     * @param model the SpringMVC model
     * @param page  the page 当前页号
     * @return the URI string
     */
    @RequestMapping(value = "/flightControl_{page}")
    public String flightControlList(Model model, @PathVariable(value = "page") int page,HttpServletRequest request) {
        request.getSession().invalidate();
        List<FlightControl> list = flightControlService.findAll();
        pages = list.size() % PAGENUMBER != 0 ? list.size() / PAGENUMBER + 1 : list.size() / PAGENUMBER;
        first = (page - 1) * PAGENUMBER;
        last = list.size() > (first + PAGENUMBER) ? first + PAGENUMBER : list.size();
        list = list.subList(first, last);
        model.addAttribute("uri", "/flightControl_");
        model.addAttribute(PAGES, pages);
        model.addAttribute("page", page);
        model.addAttribute("flightControlList", list);
        return RESULT_SET;
    }

    /**
     * 响应获取并展示天线列表的请求
     * Antenna list string.
     *
     * @param model the SpringMVC model
     * @param page  the page 当前页号
     * @return the URI string
     */
        @RequestMapping(value = "/antenna_{page}")
        public String antennaList(Model model, @PathVariable(value = "page") int page,HttpServletRequest request) {
            request.getSession().invalidate();
            List<Antenna> list = antennaService.findAll();
        pages = list.size() % PAGENUMBER != 0 ? list.size() / PAGENUMBER + 1 : list.size() / PAGENUMBER;
        first = (page - 1) * PAGENUMBER;
        last = list.size() > (first + PAGENUMBER) ? first + PAGENUMBER : list.size();
        list = list.subList(first, last);
        model.addAttribute("uri", "/antenna_");
        model.addAttribute(PAGES, pages);
        model.addAttribute("page", page);
        model.addAttribute("antennaList", list);
        return RESULT_SET;
    }

    /**
     * 相应获取并展示分电板列表的请求
     * Power hub list string.
     *
     * @param model the SpringMVC model
     * @param page  the page 当前页号
     * @return the URI string
     */
    @RequestMapping(value = "/powerHub_{page}")
    public String powerHubList(Model model, @PathVariable(value = "page") int page,HttpServletRequest request) {
        request.getSession().invalidate();
        List<PowerHub> list = powerHubService.findAll();
        pages = list.size() % PAGENUMBER != 0 ? list.size() / PAGENUMBER + 1 : list.size() / PAGENUMBER;
        first = (page - 1) * PAGENUMBER;
        last = list.size() > (first + PAGENUMBER) ? first + PAGENUMBER : list.size();
        list = list.subList(first, last);
        model.addAttribute("uri", "/powerHub_");
        model.addAttribute(PAGES, pages);
        model.addAttribute("page", page);
        model.addAttribute("powerHubList", list);
        return RESULT_SET;
    }

    /**
     * 响应获取并展示桨叶列表的请求
     * Prop list string.
     *
     * @param model the SpringMVC model
     * @param page  the page 当前页号
     * @return the URI string
     */
    @RequestMapping(value = "/prop_{page}")
    public String propList(Model model, @PathVariable(value = "page") int page,HttpServletRequest request) {
        request.getSession().invalidate();
        List<Prop> list = propService.findAll();
        pages = list.size() % PAGENUMBER != 0 ? list.size() / PAGENUMBER + 1 : list.size() / PAGENUMBER;
        first = (page - 1) * PAGENUMBER;
        last = list.size() > (first + PAGENUMBER) ? first + PAGENUMBER : list.size();
        list = list.subList(first, last);
        model.addAttribute("uri", "/prop_");
        model.addAttribute(PAGES, pages);
        model.addAttribute("page", page);
        model.addAttribute("propList", list);
        return RESULT_SET;
    }

    /**
     * 响应获取并展示电池列表的请i去
     * Battery list string.
     *
     * @param model the SpringMVC model
     * @param page  the page 当前页号
     * @return the URI string
     */
    @RequestMapping(value = "/battery_{page}")
    public String batteryList(Model model, @PathVariable(value = "page") int page,HttpServletRequest request) {
        request.getSession().invalidate();
        List<Battery> list = batteryService.findAll();
        pages = list.size() % PAGENUMBER != 0 ? list.size() / PAGENUMBER + 1 : list.size() / PAGENUMBER;
        first = (page - 1) * PAGENUMBER;
        last = list.size() > (first + PAGENUMBER) ? first + PAGENUMBER : list.size();
        list = list.subList(first, last);
        model.addAttribute("uri", "/battery_");
        model.addAttribute(PAGES, pages);
        model.addAttribute("page", page);
        model.addAttribute("batteryList", list);
        return RESULT_SET;
    }
}
