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
    private static final String DRONE = "drone";
    private static final String ELECTRO_SPEED_REGULATOR = "electroSpeedRegulator";
    private static final String BATTERY = "battery";
    private static final String IMAGE_TRANSMISSION = "imageTransmission";
    private static final String NULL = "null";
    private static final String CAM = "cam";
    private static final String ANTENNA = "antenna";
    private static final String FRAME = "frame";
    private static final String FLIGHT_CONTROL = "flightControl";
    private static final String POWER_HUB = "powerHub";
    private static final String SEARCH_MODEL = "?searchModel=";
    private static final String SEARCH_MODEL1 = "searchModel";
    private static final String PAGE = "page";
    private static final String URI = "uri";
    private static final String PAGES_STR = "pages";
    private static final String RESULT_SET = "resultSet";
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
        if (session.getAttribute(DRONE) == null) {
            session.setAttribute(DRONE, new Drone());
        }
        Drone drone = (Drone) session.getAttribute(DRONE);
        if (request.getParameter("moto") != null) {
            if (NULL.equals(request.getParameter("moto"))) {
                drone.setMoto(null);
            } else {
                drone.setMoto(motoService.findDetail(request.getParameter("moto")));
            }
        }
        if (request.getParameter(ELECTRO_SPEED_REGULATOR) != null) {
            if (NULL.equals(request.getParameter(ELECTRO_SPEED_REGULATOR))) {
                drone.setElectroSpeedRegulator(null);
            } else {
                drone.setElectroSpeedRegulator(electroSpeedRegulatorService.findDetail(request.getParameter(ELECTRO_SPEED_REGULATOR)));
            }
        }
        if (request.getParameter("prop") != null) {
            if (NULL.equals(request.getParameter("prop"))) {
                drone.setProp(null);
            } else {
                drone.setProp(propService.findDetail(request.getParameter("prop")));
            }
        }
        if (request.getParameter(BATTERY) != null) {
            if (NULL.equals(request.getParameter(BATTERY))) {
                drone.setBattery(null);
            } else {
                drone.setBattery(batteryService.findDetail(request.getParameter(BATTERY)));
            }
        }
        if (request.getParameter(IMAGE_TRANSMISSION) != null) {
            if (NULL.equals(request.getParameter(IMAGE_TRANSMISSION))) {
                if (drone.getCam() != null && drone.getImageTransmission().getCam() != null && drone.getImageTransmission().getCam().getModel().equals(drone.getCam().getModel())) {
                    drone.setCam(null);
                }
                drone.setImageTransmission(null);
            } else {
                drone.setImageTransmission(imageTransmissionService.findDetail(request.getParameter(IMAGE_TRANSMISSION)));
                if (drone.getImageTransmission().getCam() != null) {
                    drone.setCam(drone.getImageTransmission().getCam());
                    if (drone.getCam().getImgUrl() == null) {
                        drone.getCam().setImgUrl(drone.getImageTransmission().getImgUrl());
                    }
                }
            }
        }
        if (request.getParameter(CAM) != null) {
            if (NULL.equals(request.getParameter(CAM))) {
                drone.setCam(null);
            } else {
                drone.setCam(camService.findDetail(request.getParameter(CAM)));
            }
        }
        if (request.getParameter(ANTENNA) != null) {
            if (NULL.equals(request.getParameter(ANTENNA))) {
                drone.setAntenna(null);
            } else {
                drone.setAntenna(antennaService.findDetail(request.getParameter(ANTENNA)));
            }
        }
        if (request.getParameter(FRAME) != null) {
            if (NULL.equals(request.getParameter(FRAME))) {
                if (drone.getPowerHub() != null && drone.getFrame().getIntegratedPh() != null && drone.getFrame().getIntegratedPh().getModel().equals(drone.getPowerHub().getModel())) {
                    drone.setPowerHub(null);
                }
                drone.setFrame(null);
            } else {
                drone.setFrame(frameService.findDetail(request.getParameter(FRAME)));
                if (drone.getFrame().getIntegratedPh() != null) {
                    drone.setPowerHub(drone.getFrame().getIntegratedPh());
                    if (drone.getPowerHub().getImgUrl() == null) {
                        drone.getPowerHub().setImgUrl(drone.getFrame().getImgUrl());
                    }
                }
            }
        }
        if (request.getParameter(FLIGHT_CONTROL) != null) {
            if (NULL.equals(request.getParameter(FLIGHT_CONTROL))) {
                if (drone.getElectroSpeedRegulator() != null && drone.getFlightControl().getEsc() != null && drone.getFlightControl().getEsc().getModel().equals(drone.getElectroSpeedRegulator().getModel())) {
                    drone.setElectroSpeedRegulator(null);
                }
                if (drone.getPowerHub() != null && drone.getFlightControl().getPowerHub() != null && drone.getFlightControl().getPowerHub().getModel().equals(drone.getPowerHub().getModel())) {
                    drone.setPowerHub(null);
                }
                if (drone.getImageTransmission() != null && drone.getFlightControl().getImageTransmission() != null && drone.getFlightControl().getImageTransmission().getModel().equals(drone.getImageTransmission().getModel())) {
                    drone.setImageTransmission(null);
                }
                drone.setFlightControl(null);
            } else {
                drone.setFlightControl(flightControlService.findDetail(request.getParameter(FLIGHT_CONTROL)));
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
        if (request.getParameter(POWER_HUB) != null) {
            if (NULL.equals(request.getParameter(POWER_HUB))) {
                drone.setPowerHub(null);
            } else {
                drone.setPowerHub(powerHubService.findDetail(request.getParameter(POWER_HUB)));
            }
        }
        droneInfoService.updata(drone);
        session.setAttribute(DRONE, drone);
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
    public String getMotoList(@RequestParam(SEARCH_MODEL1) String searchModel, Model model, @PathVariable(value = PAGE) int page) {
        List<Moto> list = motoService.findByModel(searchModel);
        pages = list.size() % PAGENUMBER != 0 ? list.size() / PAGENUMBER + 1 : list.size() / PAGENUMBER;
        first = (page - 1) * PAGENUMBER;
        last = list.size() > (first + PAGENUMBER) ? first + PAGENUMBER : list.size();
        list = list.subList(first, last);
        model.addAttribute(URI, "/virtualAssembly/moto_");
        model.addAttribute(PAGES_STR, pages);
        model.addAttribute(PAGE, page);
        model.addAttribute(SEARCH_MODEL1, SEARCH_MODEL + searchModel);
        model.addAttribute("motoList", list);
        return RESULT_SET;
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
    public String electroSpeedRegulatorList(@RequestParam(SEARCH_MODEL1) String searchModel, Model model, @PathVariable(value = PAGE) int page) {
        List<ElectroSpeedRegulator> list = electroSpeedRegulatorService.findByModel(searchModel);
        pages = list.size() % PAGENUMBER != 0 ? list.size() / PAGENUMBER + 1 : list.size() / PAGENUMBER;
        first = (page - 1) * PAGENUMBER;
        last = list.size() > (first + PAGENUMBER) ? first + PAGENUMBER : list.size();
        list = list.subList(first, last);
        model.addAttribute(URI, "/virtualAssembly/electroSpeedRegulator_");
        model.addAttribute(PAGES_STR, pages);
        model.addAttribute(PAGE, page);
        model.addAttribute(SEARCH_MODEL1, SEARCH_MODEL + searchModel);
        model.addAttribute("electroSpeedRegulatorList", list);
        return RESULT_SET;
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
    public String frameList(@RequestParam(SEARCH_MODEL1) String searchModel, Model model, @PathVariable(value = PAGE) int page) {
        List<Frame> list = frameService.findByModel(searchModel);
        pages = list.size() % PAGENUMBER != 0 ? list.size() / PAGENUMBER + 1 : list.size() / PAGENUMBER;
        first = (page - 1) * PAGENUMBER;
        last = list.size() > (first + PAGENUMBER) ? first + PAGENUMBER : list.size();
        list = list.subList(first, last);
        model.addAttribute(URI, "/virtualAssembly/frame_");
        model.addAttribute(PAGES_STR, pages);
        model.addAttribute(PAGE, page);
        model.addAttribute(SEARCH_MODEL1, SEARCH_MODEL + searchModel);
        model.addAttribute("frameList", list);

        return RESULT_SET;
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
    public String imageTransmissionList(@RequestParam(SEARCH_MODEL1) String searchModel, Model model, @PathVariable(value = PAGE) int page) {
        List<ImageTransmission> list = imageTransmissionService.findByModel(searchModel);
        pages = list.size() % PAGENUMBER != 0 ? list.size() / PAGENUMBER + 1 : list.size() / PAGENUMBER;
        first = (page - 1) * PAGENUMBER;
        last = list.size() > (first + PAGENUMBER) ? first + PAGENUMBER : list.size();
        list = list.subList(first, last);
        model.addAttribute(URI, "/virtualAssembly/imageTransmission_");
        model.addAttribute(PAGES_STR, pages);
        model.addAttribute(PAGE, page);
        model.addAttribute(SEARCH_MODEL1, SEARCH_MODEL + searchModel);
        model.addAttribute("imageTransmissionList", list);
        return RESULT_SET;
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
    public String camList(@RequestParam(SEARCH_MODEL1) String searchModel, Model model, @PathVariable(value = PAGE) int page) {
        List<Cam> list = camService.findByModel(searchModel);
        pages = list.size() % PAGENUMBER != 0 ? list.size() / PAGENUMBER + 1 : list.size() / PAGENUMBER;
        first = (page - 1) * PAGENUMBER;
        last = list.size() > (first + PAGENUMBER) ? first + PAGENUMBER : list.size();
        list = list.subList(first, last);
        model.addAttribute(URI, "/virtualAssembly/cam_");
        model.addAttribute(PAGES_STR, pages);
        model.addAttribute(PAGE, page);
        model.addAttribute(SEARCH_MODEL1, SEARCH_MODEL + searchModel);
        model.addAttribute("camList", list);
        return RESULT_SET;
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
    public String flightControlList(@RequestParam(SEARCH_MODEL1) String searchModel, Model model, @PathVariable(value = PAGE) int page) {
        List<FlightControl> list = flightControlService.findByModel(searchModel);
        pages = list.size() % PAGENUMBER != 0 ? list.size() / PAGENUMBER + 1 : list.size() / PAGENUMBER;
        first = (page - 1) * PAGENUMBER;
        last = list.size() > (first + PAGENUMBER) ? first + PAGENUMBER : list.size();
        list = list.subList(first, last);
        model.addAttribute(URI, "/virtualAssembly/flightControl_");
        model.addAttribute(PAGES_STR, pages);
        model.addAttribute(PAGE, page);
        model.addAttribute(SEARCH_MODEL1, SEARCH_MODEL + searchModel);
        model.addAttribute("flightControlList", list);
        return RESULT_SET;
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
    public String antennaList(@RequestParam(SEARCH_MODEL1) String searchModel, Model model, @PathVariable(value = PAGE) int page) {
        List<Antenna> list = antennaService.findByModel(searchModel);
        pages = list.size() % PAGENUMBER != 0 ? list.size() / PAGENUMBER + 1 : list.size() / PAGENUMBER;
        first = (page - 1) * PAGENUMBER;
        last = list.size() > (first + PAGENUMBER) ? first + PAGENUMBER : list.size();
        list = list.subList(first, last);
        model.addAttribute(URI, "/virtualAssembly/antenna_");
        model.addAttribute(PAGES_STR, pages);
        model.addAttribute(PAGE, page);
        model.addAttribute(SEARCH_MODEL1, SEARCH_MODEL + searchModel);
        model.addAttribute("antennaList", list);
        return RESULT_SET;
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
    public String powerHubList(@RequestParam(SEARCH_MODEL1) String searchModel, Model model, @PathVariable(value = PAGE) int page) {
        List<PowerHub> list = powerHubService.findByModel(searchModel);
        pages = list.size() % PAGENUMBER != 0 ? list.size() / PAGENUMBER + 1 : list.size() / PAGENUMBER;
        first = (page - 1) * PAGENUMBER;
        last = list.size() > (first + PAGENUMBER) ? first + PAGENUMBER : list.size();
        list = list.subList(first, last);
        model.addAttribute(URI, "/virtualAssembly/powerHub_");
        model.addAttribute(PAGES_STR, pages);
        model.addAttribute(PAGE, page);
        model.addAttribute(SEARCH_MODEL1, SEARCH_MODEL + searchModel);
        model.addAttribute("powerHubList", list);
        return RESULT_SET;
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
    public String propList(@RequestParam(SEARCH_MODEL1) String searchModel, Model model, @PathVariable(value = PAGE) int page) {
        List<Prop> list = propService.findByModel(searchModel);
        pages = list.size() % PAGENUMBER != 0 ? list.size() / PAGENUMBER + 1 : list.size() / PAGENUMBER;
        first = (page - 1) * PAGENUMBER;
        last = list.size() > (first + PAGENUMBER) ? first + PAGENUMBER : list.size();
        list = list.subList(first, last);
        model.addAttribute(URI, "/virtualAssembly/prop_");
        model.addAttribute(PAGES_STR, pages);
        model.addAttribute(PAGE, page);
        model.addAttribute(SEARCH_MODEL1, SEARCH_MODEL + searchModel);
        model.addAttribute("propList", list);
        return RESULT_SET;
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
    public String batteryList(@RequestParam(SEARCH_MODEL1) String searchModel, Model model, @PathVariable(value = PAGE) int page) {
        List<Battery> list = batteryService.findByModel(searchModel);
        pages = list.size() % PAGENUMBER != 0 ? list.size() / PAGENUMBER + 1 : list.size() / PAGENUMBER;
        first = (page - 1) * PAGENUMBER;
        last = list.size() > (first + PAGENUMBER) ? first + PAGENUMBER : list.size();
        list = list.subList(first, last);
        model.addAttribute(URI, "/virtualAssembly/battery_");
        model.addAttribute(PAGES_STR, pages);
        model.addAttribute(PAGE, page);
        model.addAttribute(SEARCH_MODEL1, SEARCH_MODEL + searchModel);
        model.addAttribute("batteryList", list);
        return RESULT_SET;
    }
}
