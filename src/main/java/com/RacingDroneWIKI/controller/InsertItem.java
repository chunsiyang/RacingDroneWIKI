package com.RacingDroneWIKI.controller;

import com.RacingDroneWIKI.pojo.*;
import com.RacingDroneWIKI.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by user on 2017/11/15.
 */
@Controller
@RequestMapping(value = "/itemInsert/")
public class InsertItem {
    @Autowired
    AntennaService antennaService;
    @RequestMapping(value = "InsertAnt" ,method = RequestMethod.POST)
    public String insertAnt(Antenna antenna,HttpServletRequest request,
                         @RequestParam("mainImg")MultipartFile mainImg,
                         @RequestParam("files")MultipartFile[] files)throws IOException
    {
        antennaService.addAntenna(antenna);
        return "itemInsert/InsertSuccessed";
    }

    @Autowired
    BatteryService batteryService;
    @RequestMapping(value = "InsertBat" ,method = RequestMethod.POST)
    public String insertBat(Battery battery, HttpServletRequest request,
                            @RequestParam("mainImg")MultipartFile mainImg,
                            @RequestParam("files")MultipartFile[] files)throws IOException
    {
        batteryService.addBattery(battery);
        return "itemInsert/InsertSuccessed";
    }
    @Autowired
    PropService propService;
    @RequestMapping(value = "InsertProp" ,method = RequestMethod.POST)
    public String insertProp(Prop prop, HttpServletRequest request,
                            @RequestParam("mainImg")MultipartFile mainImg,
                            @RequestParam("files")MultipartFile[] files)throws IOException
    {
        propService.addProp(prop);
        return "itemInsert/InsertSuccessed";
    }
    @Autowired
    CamService camService;
    @RequestMapping(value = "InsertCam" ,method = RequestMethod.POST)
    public String insertCam(Cam cam, HttpServletRequest request,
                            @RequestParam("mainImg")MultipartFile mainImg,
                            @RequestParam("files")MultipartFile[] files)throws IOException
    {
        camService.addCam(cam);
        return "itemInsert/InsertSuccessed";
    }
    @Autowired
    PowerHubService powerHubService;
    @RequestMapping(value = "InsertPh" ,method = RequestMethod.POST)
    public String insertPH(PowerHub powerHub, HttpServletRequest request,
                           @RequestParam("mainImg")MultipartFile mainImg,
                           @RequestParam("files")MultipartFile[] files)throws IOException
    {
        powerHubService.addPowerHub(powerHub);
        return "itemInsert/InsertSuccessed";
    }
    @Autowired
    ElectroSpeedRegulatorService electroSpeedRegulatorService;
    @RequestMapping(value = "InsertEsc" ,method = RequestMethod.POST)
    public String insertEsc(ElectroSpeedRegulator electroSpeedRegulator,HttpServletRequest request,
                            @RequestParam("mainImg")MultipartFile mainImg,
                            @RequestParam("files")MultipartFile[] files)throws IOException
    {
        electroSpeedRegulatorService.addElectroSpeedRegulato(electroSpeedRegulator);
        return "itemInsert/InsertSuccessed";
    }
    @Autowired
    MotoService motoService;
    @RequestMapping(value = "InsertMoto" ,method = RequestMethod.POST)
    public String insertMoto(Moto moto,HttpServletRequest request,
                            @RequestParam("mainImg")MultipartFile mainImg,
                            @RequestParam("files")MultipartFile[] files)throws IOException
    {
        motoService.addMoto(moto);
        return "itemInsert/InsertSuccessed";
    }
}
