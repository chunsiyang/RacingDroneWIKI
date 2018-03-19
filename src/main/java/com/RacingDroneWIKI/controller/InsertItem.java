package com.RacingDroneWIKI.controller;

import com.RacingDroneWIKI.pojo.*;
import com.RacingDroneWIKI.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 响应数据录入请求的Controller
 * 对用户的数据录入请求进行整理并启用服务添加至数据库
 *
 * @author ChunsiYang
 * @version SSM 3.0
 */
@Controller
@RequestMapping(value = "/itemInsert/")
public class InsertItem {
    public static final String ITEM_INSERT_INSERT_SUCCESSED = "itemInsert/InsertSuccessed";
    public static final String IMAGE_TRANSMISSION = "imageTransmission";
    public static final String FRAME = "frame";
    public static final String FLIGHT_CONTROL = "flightControl";
    public static final String ITEM_INSERT_FC_INTERGRAT = "itemInsert/FcIntergrat";
    @Autowired
    private AntennaService antennaService;
    @Autowired
    private BatteryService batteryService;
    @Autowired
    private PropService propService;
    @Autowired
    private CamService camService;
    @Autowired
    private PowerHubService powerHubService;
    @Autowired
    private ElectroSpeedRegulatorService electroSpeedRegulatorService;
    @Autowired
    private MotoService motoService;
    @Autowired
    private FrameService frameService;
    @Autowired
    private FlightControlService flightControlService;
    @Autowired
    private ImageTransmissionService imageTransmissionService;

    /**
     * 数据录入模型选择界面
     * Data input string.
     *
     * @param session the HTTP session
     * @return the URI string
     */
    @RequestMapping("dataInput")
    public String dataInput(HttpSession session) {
        session.invalidate();
        return "itemInsert/dataInput";
    }

    /**
     * 响应天线录入请求
     * Insert ant string.
     *
     * @param antenna the antenna SpringMVC绑定的前台天线数据
     * @param request the HTTP servlet request
     * @param mainImg the main img 主图片
     * @param files   the files 辅助图片
     * @return the URI string
     * @throws IOException the io exception
     */
    @RequestMapping(value = "InsertAnt", method = RequestMethod.POST)
    public String insertAnt(Antenna antenna, HttpServletRequest request,
                            @RequestParam("mainImg") MultipartFile mainImg,
                            @RequestParam("files") MultipartFile[] files) throws IOException {
        antennaService.addAntenna(antenna);
        return ITEM_INSERT_INSERT_SUCCESSED;
    }

    /**
     * 响应电池录入请求
     * Insert bat string.
     *
     * @param battery the battery SpringMVC绑定的前台电池数据
     * @param request the HTTP servlet request
     * @param mainImg the main img 主图片
     * @param files   the files 辅助图片
     * @return the URI string
     * @throws IOException the io exception
     */
    @RequestMapping(value = "InsertBat", method = RequestMethod.POST)
    public String insertBat(Battery battery, HttpServletRequest request,
                            @RequestParam("mainImg") MultipartFile mainImg,
                            @RequestParam("files") MultipartFile[] files) throws IOException {
        batteryService.addBattery(battery);
        return ITEM_INSERT_INSERT_SUCCESSED;
    }

    /**
     * 响应桨叶录入请求
     * Insert prop string.
     *
     * @param prop    the prop SpringMVC绑定的前台桨叶数据
     * @param request the HTTP servlet request
     * @param mainImg the main img 主图片
     * @param files   the files 辅助图片
     * @return the URI string
     * @throws IOException the io exception
     */
    @RequestMapping(value = "InsertProp", method = RequestMethod.POST)
    public String insertProp(Prop prop, HttpServletRequest request,
                             @RequestParam("mainImg") MultipartFile mainImg,
                             @RequestParam("files") MultipartFile[] files) throws IOException {
        propService.addProp(prop);
        return ITEM_INSERT_INSERT_SUCCESSED;
    }

    /**
     * 响应摄像头录入请求
     * Insert cam string.
     *
     * @param cam     the cam SpringMVC绑定的前台摄像头数据
     * @param request the HTTP servlet request
     * @param mainImg the main img 诸如片
     * @param files   the files 辅助图片
     * @return the URI string
     * @throws IOException the io exception
     */
    @RequestMapping(value = "InsertCam", method = RequestMethod.POST)
    public String insertCam(Cam cam, HttpServletRequest request,
                            @RequestParam("mainImg") MultipartFile mainImg,
                            @RequestParam("files") MultipartFile[] files) throws IOException {
        HttpSession session = request.getSession();
        ImageTransmission imageTransmission = (ImageTransmission) session.getAttribute(IMAGE_TRANSMISSION);
        if ((imageTransmission != null)) {
            imageTransmission.setCam(cam);
            session.setAttribute(IMAGE_TRANSMISSION, imageTransmission);
            return "itemInsert/ItIntergrat";
        } else {
            cam.setUseAlone(true);
            camService.addCam(cam);
            return ITEM_INSERT_INSERT_SUCCESSED;
        }
    }

    /**
     * 响应分电板录入请求
     * Insert ph string.
     *
     * @param powerHub the power hub SpringMVC绑定的前台分电板数据
     * @param request  the HTTP servlet request
     * @param mainImg  the main img 主图片
     * @param files    the files 辅助图片
     * @param pinDef   the pin def 引脚定义图
     * @return the URI string
     * @throws IOException the io exception
     */
    @RequestMapping(value = "InsertPh", method = RequestMethod.POST)
    public String insertPH(PowerHub powerHub, HttpServletRequest request,
                           @RequestParam("mainImg") MultipartFile mainImg,
                           @RequestParam("files") MultipartFile[] files,
                           @RequestParam("pinDefinitionDiagramUrl") MultipartFile pinDef) throws IOException {
        HttpSession session = request.getSession();
        Frame frame = (Frame) session.getAttribute(FRAME);
        FlightControl flightControl = (FlightControl) session.getAttribute(FLIGHT_CONTROL);
        if ((frame != null)) {
            frame.setIntegratedPh(powerHub);
            session.setAttribute(FRAME, frame);
            return "itemInsert/FraIntergrat";
        }
        if ((flightControl != null)) {
            flightControl.setPowerHub(powerHub);
            session.setAttribute(FLIGHT_CONTROL, flightControl);
            return ITEM_INSERT_FC_INTERGRAT;
        }
        powerHub.setUseAlone(true);
        powerHubService.addPowerHub(powerHub);
        return ITEM_INSERT_INSERT_SUCCESSED;
    }

    /**
     * 响应电子调速器录入请求
     * Insert esc string.
     *
     * @param electroSpeedRegulator the electro speed regulator SpringMVC绑定的前台电子调速器数据
     * @param request               the HTTP servlet request
     * @param mainImg               the main img 主图片
     * @param files                 the files 辅助图片
     * @return the URI string
     * @throws IOException the io exception
     */
    @RequestMapping(value = "InsertEsc", method = RequestMethod.POST)
    public String insertEsc(ElectroSpeedRegulator electroSpeedRegulator, HttpServletRequest request,
                            @RequestParam("mainImg") MultipartFile mainImg,
                            @RequestParam("files") MultipartFile[] files) throws IOException {
        HttpSession session = request.getSession();
        FlightControl flightControl = (FlightControl) session.getAttribute(FLIGHT_CONTROL);
        if ((flightControl != null)) {
            flightControl.setEsc(electroSpeedRegulator);
            session.setAttribute(FLIGHT_CONTROL, flightControl);
            return ITEM_INSERT_FC_INTERGRAT;
        }
        electroSpeedRegulator.setUseAlone(true);
        electroSpeedRegulatorService.addElectroSpeedRegulato(electroSpeedRegulator);
        return ITEM_INSERT_INSERT_SUCCESSED;
    }

    /**
     * 响应电机录入请求
     * Insert moto string.
     *
     * @param moto    the moto SpringMVC绑定的前台电机数据
     * @param request the HTTP servlet request
     * @param mainImg the main img 主图片
     * @param files   the files 辅助图片
     * @return the URI string
     * @throws IOException the io exception
     */
    @RequestMapping(value = "InsertMoto", method = RequestMethod.POST)
    public String insertMoto(Moto moto, HttpServletRequest request,
                             @RequestParam("mainImg") MultipartFile mainImg,
                             @RequestParam("files") MultipartFile[] files) throws IOException {
        motoService.addMoto(moto);
        return ITEM_INSERT_INSERT_SUCCESSED;
    }

    /**
     * 响应机架中集成部件录入请求
     * Insert fra string.
     *
     * @param frame   the frame SpringMVC绑定的前台机架数据
     * @param request the HTTP servlet request
     * @param mainImg the main img 主图片
     * @param files   the files 辅助图片
     * @return the URI string
     * @throws IOException the io exception
     */
    @RequestMapping(value = "InsertFra", method = RequestMethod.POST)
    public String insertFra(Frame frame, HttpServletRequest request,
                            @RequestParam("mainImg") MultipartFile mainImg,
                            @RequestParam("files") MultipartFile[] files) throws IOException {
        HttpSession session = request.getSession();
        session.setAttribute(FRAME, frame);
        return "itemInsert/FraIntergrat";
    }

    /**
     * 响应机架录入请求
     * Insert fra string.
     *
     * @param session the HTTP servlet session
     * @return the URI string
     */
    @Transactional(propagation = Propagation.REQUIRED)
    @RequestMapping(value = "InsertFra", method = RequestMethod.GET)
    public String insertFra(HttpSession session) {
        Frame frame = (Frame) session.getAttribute(FRAME);
        frameService.addFrame(frame);
        session.invalidate();
        return ITEM_INSERT_INSERT_SUCCESSED;
    }

    /**
     * 响应飞控中集成部件录入请求
     * Inset fc string.
     *
     * @param flightControl the flight control SpringMVC绑定的前台飞控数据
     * @param request       the HTTP servlet request
     * @param mainImg       the main img 主图片
     * @param files         the files 辅助图片
     * @param pinDef        the pin def 引脚定义图
     * @return the URI string
     * @throws IOException the io exception
     */
    @RequestMapping(value = "InsertFC", method = RequestMethod.POST)
    public String insetFc(FlightControl flightControl, HttpServletRequest request,
                          @RequestParam("mainImg") MultipartFile mainImg,
                          @RequestParam("files") MultipartFile[] files,
                          @RequestParam("pinDefinitionDiagramUrl") MultipartFile pinDef) throws IOException {
        HttpSession session = request.getSession();
        session.setAttribute(FLIGHT_CONTROL, flightControl);
        return ITEM_INSERT_FC_INTERGRAT;
    }

    /**
     * 响应飞控录入秦桂青
     * Insert fc string.
     *
     * @param session the HTTP servlet session
     * @return the URI string
     */
    @Transactional(propagation = Propagation.REQUIRED)
    @RequestMapping(value = "InsertFC", method = RequestMethod.GET)
    public String insertFc(HttpSession session) {
        FlightControl flightControl = (FlightControl) session.getAttribute(FLIGHT_CONTROL);
        flightControlService.addFlightControl(flightControl);
        session.invalidate();
        return ITEM_INSERT_INSERT_SUCCESSED;
    }

    /**
     * 响应图传中集成部件的录入请求
     * Inset it string.
     *
     * @param imageTransmission the image transmission SpringMVC绑定的前台图传数据
     * @param request           the HTTP servlet request
     * @param mainImg           the main img 主图片
     * @param files             the files 辅助图片
     * @param pinDef            the pin def 引脚定义图
     * @param fre               the fre 频率表
     * @return the URI string
     * @throws IOException the io exception
     */
    @RequestMapping(value = "InsertIt", method = RequestMethod.POST)
    public String insetIt(ImageTransmission imageTransmission, HttpServletRequest request,
                          @RequestParam("mainImg") MultipartFile mainImg,
                          @RequestParam("files") MultipartFile[] files,
                          @RequestParam("pinDefinitionDiagramUrl") MultipartFile pinDef,
                          @RequestParam("frequencyTableUrl") MultipartFile fre) throws IOException {
        HttpSession session = request.getSession();
        FlightControl flightControl = (FlightControl) session.getAttribute(FLIGHT_CONTROL);
        if ((flightControl != null)) {
            flightControl.setImageTransmission(imageTransmission);
            session.setAttribute(FLIGHT_CONTROL, flightControl);
            return ITEM_INSERT_FC_INTERGRAT;
        } else {
            imageTransmission.setUseAlone(true);
            session.setAttribute(IMAGE_TRANSMISSION, imageTransmission);
            return "itemInsert/ItIntergrat";
        }
    }

    /**
     * 响应图传路途请求
     * Insert it string.
     *
     * @param session the HTTP servlet session
     * @return the URI string
     */
    @Transactional(propagation = Propagation.REQUIRED)
    @RequestMapping(value = "InsertIt", method = RequestMethod.GET)
    public String insertIt(HttpSession session) {
        ImageTransmission imageTransmission = (ImageTransmission) session.getAttribute(IMAGE_TRANSMISSION);
        imageTransmissionService.addImageTransmission(imageTransmission);
        session.invalidate();
        return ITEM_INSERT_INSERT_SUCCESSED;
    }
}
