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
 * Created by user on 2017/11/15.
 *
 */
@Controller
@RequestMapping(value = "/itemInsert/")
public class InsertItem {
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

    @RequestMapping("dataInput")
    public String dataInput(HttpSession session) {
        session.invalidate();
        return "itemInsert/dataInput";
    }

    @RequestMapping(value = "InsertAnt", method = RequestMethod.POST)
    public String insertAnt(Antenna antenna, HttpServletRequest request,
                            @RequestParam("mainImg") MultipartFile mainImg,
                            @RequestParam("files") MultipartFile[] files) throws IOException {
        antennaService.addAntenna(antenna);
        return "itemInsert/InsertSuccessed";
    }

    @RequestMapping(value = "InsertBat", method = RequestMethod.POST)
    public String insertBat(Battery battery, HttpServletRequest request,
                            @RequestParam("mainImg") MultipartFile mainImg,
                            @RequestParam("files") MultipartFile[] files) throws IOException {
        batteryService.addBattery(battery);
        return "itemInsert/InsertSuccessed";
    }

    @RequestMapping(value = "InsertProp", method = RequestMethod.POST)
    public String insertProp(Prop prop, HttpServletRequest request,
                             @RequestParam("mainImg") MultipartFile mainImg,
                             @RequestParam("files") MultipartFile[] files) throws IOException {
        propService.addProp(prop);
        return "itemInsert/InsertSuccessed";
    }

    @RequestMapping(value = "InsertCam", method = RequestMethod.POST)
    public String insertCam(Cam cam, HttpServletRequest request,
                            @RequestParam("mainImg") MultipartFile mainImg,
                            @RequestParam("files") MultipartFile[] files) throws IOException {
        HttpSession session = request.getSession();
        ImageTransmission imageTransmission = (ImageTransmission) session.getAttribute("imageTransmission");
        if ((imageTransmission != null)) {
            imageTransmission.setCam(cam);
            session.setAttribute("imageTransmission", imageTransmission);
            return "itemInsert/ItIntergrat";
        } else {
            cam.setUseAlone(true);
            camService.addCam(cam);
            return "itemInsert/InsertSuccessed";
        }
    }

    @RequestMapping(value = "InsertPh", method = RequestMethod.POST)
    public String insertPH(PowerHub powerHub, HttpServletRequest request,
                           @RequestParam("mainImg") MultipartFile mainImg,
                           @RequestParam("files") MultipartFile[] files,
                           @RequestParam("pinDefinitionDiagramUrl") MultipartFile pinDef) throws IOException {
        HttpSession session = request.getSession();
        Frame frame = (Frame) session.getAttribute("frame");
        FlightControl flightControl = (FlightControl) session.getAttribute("flightControl");
        if ((frame != null)) {
            frame.setIntegratedPh(powerHub);
            session.setAttribute("frame", frame);
            return "itemInsert/FraIntergrat";
        }
        if ((flightControl != null)) {
            flightControl.setPowerHub(powerHub);
            session.setAttribute("flightControl", flightControl);
            return "itemInsert/FcIntergrat";
        }
        powerHub.setUseAlone(true);
        powerHubService.addPowerHub(powerHub);
        return "itemInsert/InsertSuccessed";
    }

    @RequestMapping(value = "InsertEsc", method = RequestMethod.POST)
    public String insertEsc(ElectroSpeedRegulator electroSpeedRegulator, HttpServletRequest request,
                            @RequestParam("mainImg") MultipartFile mainImg,
                            @RequestParam("files") MultipartFile[] files) throws IOException {
        HttpSession session = request.getSession();
        FlightControl flightControl = (FlightControl) session.getAttribute("flightControl");
        if ((flightControl != null)) {
            flightControl.setEsc(electroSpeedRegulator);
            session.setAttribute("flightControl", flightControl);
            return "itemInsert/FcIntergrat";
        }
        electroSpeedRegulator.setUseAlone(true);
        electroSpeedRegulatorService.addElectroSpeedRegulato(electroSpeedRegulator);
        return "itemInsert/InsertSuccessed";
    }

    @RequestMapping(value = "InsertMoto", method = RequestMethod.POST)
    public String insertMoto(Moto moto, HttpServletRequest request,
                             @RequestParam("mainImg") MultipartFile mainImg,
                             @RequestParam("files") MultipartFile[] files) throws IOException {
        motoService.addMoto(moto);
        return "itemInsert/InsertSuccessed";
    }

    @RequestMapping(value = "InsertFra", method = RequestMethod.POST)
    public String insertFra(Frame frame, HttpServletRequest request,
                            @RequestParam("mainImg") MultipartFile mainImg,
                            @RequestParam("files") MultipartFile[] files) throws IOException {
        HttpSession session = request.getSession();
        session.setAttribute("frame", frame);
        return "itemInsert/FraIntergrat";
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @RequestMapping(value = "InsertFra", method = RequestMethod.GET)
    public String insertFra(HttpSession session) {
        Frame frame = (Frame) session.getAttribute("frame");
        frameService.addFrame(frame);
        session.invalidate();
        return "itemInsert/InsertSuccessed";
    }

    @RequestMapping(value = "InsertFC", method = RequestMethod.POST)
    public String insetFc(FlightControl flightControl, HttpServletRequest request,
                          @RequestParam("mainImg") MultipartFile mainImg,
                          @RequestParam("files") MultipartFile[] files,
                          @RequestParam("pinDefinitionDiagramUrl") MultipartFile pinDef) throws IOException {
        HttpSession session = request.getSession();
        session.setAttribute("flightControl", flightControl);
        return "itemInsert/FcIntergrat";
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @RequestMapping(value = "InsertFC", method = RequestMethod.GET)
    public String insertFc(HttpSession session) {
        FlightControl flightControl = (FlightControl) session.getAttribute("flightControl");
        flightControlService.addFlightControl(flightControl);
        session.invalidate();
        return "itemInsert/InsertSuccessed";
    }

    @RequestMapping(value = "InsertIt", method = RequestMethod.POST)
    public String insetIt(ImageTransmission imageTransmission, HttpServletRequest request,
                          @RequestParam("mainImg") MultipartFile mainImg,
                          @RequestParam("files") MultipartFile[] files,
                          @RequestParam("pinDefinitionDiagramUrl") MultipartFile pinDef,
                          @RequestParam("frequencyTableUrl") MultipartFile fre) throws IOException {
        HttpSession session = request.getSession();
        FlightControl flightControl = (FlightControl) session.getAttribute("flightControl");
        if ((flightControl != null)) {
            flightControl.setImageTransmission(imageTransmission);
            session.setAttribute("flightControl", flightControl);
            return "itemInsert/FcIntergrat";
        } else {
            imageTransmission.setUseAlone(true);
            session.setAttribute("imageTransmission", imageTransmission);
            return "itemInsert/ItIntergrat";
        }
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @RequestMapping(value = "InsertIt", method = RequestMethod.GET)
    public String insertIt(HttpSession session) {
        ImageTransmission imageTransmission = (ImageTransmission) session.getAttribute("imageTransmission");
        imageTransmissionService.addImageTransmission(imageTransmission);
        session.invalidate();
        return "itemInsert/InsertSuccessed";
    }
}
