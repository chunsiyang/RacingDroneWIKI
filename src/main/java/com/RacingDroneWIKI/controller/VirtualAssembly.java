package com.RacingDroneWIKI.controller;

import com.RacingDroneWIKI.pojo.*;
import com.RacingDroneWIKI.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 处理虚拟组装相关请求
 *
 * @author ChunsiYang
 * @version SSM 3.1
 */
@Controller
@RequestMapping(value = "/virtualAssembly")
public class VirtualAssembly {
    private final int PAGENUMBER = 10;
    private int pages;
    private int first;
    private int last;
    @Autowired
    private DroneInfoService droneInfoService;
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
    private PowerHubService powerHubService;
    @Autowired
    private PropService propService;
    @Autowired
    private BatteryService batteryService;

    /**
     * Main page string.
     *
     * @param request the request
     * @return the string
     */
    @RequestMapping(value = "")
    public String mainPage(HttpServletRequest request) {
        HttpSession session = request.getSession();
        if (session.getAttribute("drone") == null)
            session.setAttribute("drone", new Drone());
        Drone drone = (Drone) session.getAttribute("drone");
        if (request.getParameter("moto") != null) {
            if (request.getParameter("moto").equals("null"))
                drone.setMoto(null);
            else
                drone.setMoto(motoService.findDetail(request.getParameter("moto")));
        }
        if (request.getParameter("electroSpeedRegulator") != null) {
            if (request.getParameter("electroSpeedRegulator").equals("null"))
                drone.setElectroSpeedRegulator(null);
            else
                drone.setElectroSpeedRegulator(electroSpeedRegulatorService.findDetail(request.getParameter("electroSpeedRegulator")));
        }
        if (request.getParameter("prop") != null) {
            if (request.getParameter("prop").equals("null"))
                drone.setProp(null);
            else
                drone.setProp(propService.findDetail(request.getParameter("prop")));
        }
        if (request.getParameter("battery") != null) {
            if (request.getParameter("battery").equals("null"))
                drone.setBattery(null);
            else
                drone.setBattery(batteryService.findDetail(request.getParameter("battery")));
        }
        if (request.getParameter("imageTransmission") != null) {
            if (request.getParameter("imageTransmission").equals("null")) {
                if (drone.getCam() != null && drone.getImageTransmission().getCam() != null && drone.getImageTransmission().getCam().getModel().equals(drone.getCam().getModel()))
                    drone.setCam(null);
                drone.setImageTransmission(null);
            } else {
                drone.setImageTransmission(imageTransmissionService.findDetail(request.getParameter("imageTransmission")));
                if (drone.getImageTransmission().getCam() != null) {
                    drone.setCam(drone.getImageTransmission().getCam());
                    if (drone.getCam().getImgUrl() == null) {
                        drone.getCam().setImgUrl(drone.getImageTransmission().getImgUrl());
                    }
                }
            }
        }
        if (request.getParameter("cam") != null) {
            if (request.getParameter("cam").equals("null"))
                drone.setCam(null);
            else
                drone.setCam(camService.findDetail(request.getParameter("cam")));
        }
        if (request.getParameter("antenna") != null) {
            if (request.getParameter("antenna").equals("null"))
                drone.setAntenna(null);
            else
                drone.setAntenna(antennaService.findDetail(request.getParameter("antenna")));
        }
        if (request.getParameter("frame") != null) {
            if (request.getParameter("frame").equals("null")) {
                if (drone.getPowerHub() != null && drone.getFrame().getIntegratedPh() != null && drone.getFrame().getIntegratedPh().getModel().equals(drone.getPowerHub().getModel()))
                    drone.setPowerHub(null);
                drone.setFrame(null);
            } else {
                drone.setFrame(frameService.findDetail(request.getParameter("frame")));
                if (drone.getFrame().getIntegratedPh() != null) {
                    drone.setPowerHub(drone.getFrame().getIntegratedPh());
                    if (drone.getPowerHub().getImgUrl() == null) {
                        drone.getPowerHub().setImgUrl(drone.getFrame().getImgUrl());
                    }
                }
            }
        }
        if (request.getParameter("flightControl") != null) {
            if (request.getParameter("flightControl").equals("null")) {
                if (drone.getElectroSpeedRegulator() != null && drone.getFlightControl().getEsc() != null && drone.getFlightControl().getEsc().getModel().equals(drone.getElectroSpeedRegulator().getModel()))
                    drone.setElectroSpeedRegulator(null);
                if (drone.getPowerHub() != null && drone.getFlightControl().getPowerHub() != null && drone.getFlightControl().getPowerHub().getModel().equals(drone.getPowerHub().getModel()))
                    drone.setPowerHub(null);
                if (drone.getImageTransmission() != null && drone.getFlightControl().getImageTransmission() != null && drone.getFlightControl().getImageTransmission().getModel().equals(drone.getImageTransmission().getModel()))
                    drone.setImageTransmission(null);
                drone.setFlightControl(null);
            } else {
                drone.setFlightControl(flightControlService.findDetail(request.getParameter("flightControl")));
                if (drone.getFlightControl().getImageTransmission() != null) {
                    drone.setImageTransmission(drone.getFlightControl().getImageTransmission());
                    if (drone.getImageTransmission().getImgUrl() == null) {
                        drone.getImageTransmission().setImgUrl(drone.getFlightControl().getImgUrl());
                    }
                }
                if (drone.getFlightControl().getEsc() != null) {
                    drone.setElectroSpeedRegulator(drone.getFlightControl().getEsc());
                    if (drone.getElectroSpeedRegulator().getImgUrl() == null) {
                        drone.getElectroSpeedRegulator().setImgUrl(drone.getFlightControl().getImgUrl());
                    }
                }
                if (drone.getFlightControl().getPowerHub() != null) {
                    drone.setPowerHub(drone.getFlightControl().getPowerHub());
                    if (drone.getPowerHub().getImgUrl() == null) {
                        drone.getPowerHub().setImgUrl(drone.getFlightControl().getImgUrl());
                    }
                }
            }
        }
        if (request.getParameter("powerHub") != null) {
            if (request.getParameter("powerHub").equals("null"))
                drone.setPowerHub(null);
            else
                drone.setPowerHub(powerHubService.findDetail(request.getParameter("powerHub")));
        }
        droneInfoService.updata(drone);
        session.setAttribute("drone", drone);
        request.setAttribute("scrollTop", request.getParameter("scrollTop"));
        return "virtualAssembly/virtualAssembly";
    }

    /**
     * Gets moto list.
     *
     * @param searchModel the search model
     * @param model       the model
     * @param page        the page
     * @return the moto list
     */
    @RequestMapping(value = "/moto_{page}")
    public String getMotoList(@RequestParam("searchModel") String searchModel, Model model, @PathVariable(value = "page") int page) {
        List<Moto> list = motoService.findByModel(searchModel);
        pages = list.size() % PAGENUMBER != 0 ? list.size() / PAGENUMBER + 1 : list.size() / PAGENUMBER;
        first = (page - 1) * PAGENUMBER;
        last = list.size() > (first + PAGENUMBER) ? first + PAGENUMBER : list.size();
        list = list.subList(first, last);
        model.addAttribute("uri", "/virtualAssembly/moto_");
        model.addAttribute("pages", pages);
        model.addAttribute("page", page);
        model.addAttribute("searchModel", "?searchModel=" + searchModel);
        model.addAttribute("motoList", list);
        return "resultSet";
    }

    /**
     * Electro speed regulator list string.
     *
     * @param searchModel the search model
     * @param model       the model
     * @param page        the page
     * @return the string
     */
    @RequestMapping(value = "/electroSpeedRegulator_{page}")
    public String electroSpeedRegulatorList(@RequestParam("searchModel") String searchModel, Model model, @PathVariable(value = "page") int page) {
        List<ElectroSpeedRegulator> list = electroSpeedRegulatorService.findByModel(searchModel);
        pages = list.size() % PAGENUMBER != 0 ? list.size() / PAGENUMBER + 1 : list.size() / PAGENUMBER;
        first = (page - 1) * PAGENUMBER;
        last = list.size() > (first + PAGENUMBER) ? first + PAGENUMBER : list.size();
        list = list.subList(first, last);
        model.addAttribute("uri", "/virtualAssembly/electroSpeedRegulator_");
        model.addAttribute("pages", pages);
        model.addAttribute("page", page);
        model.addAttribute("searchModel", "?searchModel=" + searchModel);
        model.addAttribute("electroSpeedRegulatorList", list);
        return "resultSet";
    }

    /**
     * Frame list string.
     *
     * @param searchModel the search model
     * @param model       the model
     * @param page        the page
     * @return the string
     */
    @RequestMapping(value = "/frame_{page}")
    public String frameList(@RequestParam("searchModel") String searchModel, Model model, @PathVariable(value = "page") int page) {
        List<Frame> list = frameService.findByModel(searchModel);
        pages = list.size() % PAGENUMBER != 0 ? list.size() / PAGENUMBER + 1 : list.size() / PAGENUMBER;
        first = (page - 1) * PAGENUMBER;
        last = list.size() > (first + PAGENUMBER) ? first + PAGENUMBER : list.size();
        list = list.subList(first, last);
        model.addAttribute("uri", "/virtualAssembly/frame_");
        model.addAttribute("pages", pages);
        model.addAttribute("page", page);
        model.addAttribute("searchModel", "?searchModel=" + searchModel);
        model.addAttribute("frameList", list);

        return "resultSet";
    }

    /**
     * Image transmission list string.
     *
     * @param searchModel the search model
     * @param model       the model
     * @param page        the page
     * @return the string
     */
    @RequestMapping(value = "/imageTransmission_{page}")
    public String imageTransmissionList(@RequestParam("searchModel") String searchModel, Model model, @PathVariable(value = "page") int page) {
        List<ImageTransmission> list = imageTransmissionService.findByModel(searchModel);
        pages = list.size() % PAGENUMBER != 0 ? list.size() / PAGENUMBER + 1 : list.size() / PAGENUMBER;
        first = (page - 1) * PAGENUMBER;
        last = list.size() > (first + PAGENUMBER) ? first + PAGENUMBER : list.size();
        list = list.subList(first, last);
        model.addAttribute("uri", "/virtualAssembly/imageTransmission_");
        model.addAttribute("pages", pages);
        model.addAttribute("page", page);
        model.addAttribute("searchModel", "?searchModel=" + searchModel);
        model.addAttribute("imageTransmissionList", list);
        return "resultSet";
    }

    /**
     * Cam list string.
     *
     * @param searchModel the search model
     * @param model       the model
     * @param page        the page
     * @return the string
     */
    @RequestMapping(value = "/cam_{page}")
    public String camList(@RequestParam("searchModel") String searchModel, Model model, @PathVariable(value = "page") int page) {
        List<Cam> list = camService.findByModel(searchModel);
        pages = list.size() % PAGENUMBER != 0 ? list.size() / PAGENUMBER + 1 : list.size() / PAGENUMBER;
        first = (page - 1) * PAGENUMBER;
        last = list.size() > (first + PAGENUMBER) ? first + PAGENUMBER : list.size();
        list = list.subList(first, last);
        model.addAttribute("uri", "/virtualAssembly/cam_");
        model.addAttribute("pages", pages);
        model.addAttribute("page", page);
        model.addAttribute("searchModel", "?searchModel=" + searchModel);
        model.addAttribute("camList", list);
        return "resultSet";
    }

    /**
     * Flight control list string.
     *
     * @param searchModel the search model
     * @param model       the model
     * @param page        the page
     * @return the string
     */
    @RequestMapping(value = "/flightControl_{page}")
    public String flightControlList(@RequestParam("searchModel") String searchModel, Model model, @PathVariable(value = "page") int page) {
        List<FlightControl> list = flightControlService.findByModel(searchModel);
        pages = list.size() % PAGENUMBER != 0 ? list.size() / PAGENUMBER + 1 : list.size() / PAGENUMBER;
        first = (page - 1) * PAGENUMBER;
        last = list.size() > (first + PAGENUMBER) ? first + PAGENUMBER : list.size();
        list = list.subList(first, last);
        model.addAttribute("uri", "/virtualAssembly/flightControl_");
        model.addAttribute("pages", pages);
        model.addAttribute("page", page);
        model.addAttribute("searchModel", "?searchModel=" + searchModel);
        model.addAttribute("flightControlList", list);
        return "resultSet";
    }

    /**
     * Antenna list string.
     *
     * @param searchModel the search model
     * @param model       the model
     * @param page        the page
     * @return the string
     */
    @RequestMapping(value = "/antenna_{page}")
    public String antennaList(@RequestParam("searchModel") String searchModel, Model model, @PathVariable(value = "page") int page) {
        List<Antenna> list = antennaService.findByModel(searchModel);
        pages = list.size() % PAGENUMBER != 0 ? list.size() / PAGENUMBER + 1 : list.size() / PAGENUMBER;
        first = (page - 1) * PAGENUMBER;
        last = list.size() > (first + PAGENUMBER) ? first + PAGENUMBER : list.size();
        list = list.subList(first, last);
        model.addAttribute("uri", "/virtualAssembly/antenna_");
        model.addAttribute("pages", pages);
        model.addAttribute("page", page);
        model.addAttribute("searchModel", "?searchModel=" + searchModel);
        model.addAttribute("antennaList", list);
        return "resultSet";
    }

    /**
     * Power hub list string.
     *
     * @param searchModel the search model
     * @param model       the model
     * @param page        the page
     * @return the string
     */
    @RequestMapping(value = "/powerHub_{page}")
    public String powerHubList(@RequestParam("searchModel") String searchModel, Model model, @PathVariable(value = "page") int page) {
        List<PowerHub> list = powerHubService.findByModel(searchModel);
        pages = list.size() % PAGENUMBER != 0 ? list.size() / PAGENUMBER + 1 : list.size() / PAGENUMBER;
        first = (page - 1) * PAGENUMBER;
        last = list.size() > (first + PAGENUMBER) ? first + PAGENUMBER : list.size();
        list = list.subList(first, last);
        model.addAttribute("uri", "/virtualAssembly/powerHub_");
        model.addAttribute("pages", pages);
        model.addAttribute("page", page);
        model.addAttribute("searchModel", "?searchModel=" + searchModel);
        model.addAttribute("powerHubList", list);
        return "resultSet";
    }

    /**
     * Prop list string.
     *
     * @param searchModel the search model
     * @param model       the model
     * @param page        the page
     * @return the string
     */
    @RequestMapping(value = "/prop_{page}")
    public String propList(@RequestParam("searchModel") String searchModel, Model model, @PathVariable(value = "page") int page) {
        List<Prop> list = propService.findByModel(searchModel);
        pages = list.size() % PAGENUMBER != 0 ? list.size() / PAGENUMBER + 1 : list.size() / PAGENUMBER;
        first = (page - 1) * PAGENUMBER;
        last = list.size() > (first + PAGENUMBER) ? first + PAGENUMBER : list.size();
        list = list.subList(first, last);
        model.addAttribute("uri", "/virtualAssembly/prop_");
        model.addAttribute("pages", pages);
        model.addAttribute("page", page);
        model.addAttribute("searchModel", "?searchModel=" + searchModel);
        model.addAttribute("propList", list);
        return "resultSet";
    }

    /**
     * Battery list string.
     *
     * @param searchModel the search model
     * @param model       the model
     * @param page        the page
     * @return the string
     */
    @RequestMapping(value = "/battery_{page}")
    public String batteryList(@RequestParam("searchModel") String searchModel, Model model, @PathVariable(value = "page") int page) {
        List<Battery> list = batteryService.findByModel(searchModel);
        pages = list.size() % PAGENUMBER != 0 ? list.size() / PAGENUMBER + 1 : list.size() / PAGENUMBER;
        first = (page - 1) * PAGENUMBER;
        last = list.size() > (first + PAGENUMBER) ? first + PAGENUMBER : list.size();
        list = list.subList(first, last);
        model.addAttribute("uri", "/virtualAssembly/battery_");
        model.addAttribute("pages", pages);
        model.addAttribute("page", page);
        model.addAttribute("searchModel", "?searchModel=" + searchModel);
        model.addAttribute("batteryList", list);
        return "resultSet";
    }
}
