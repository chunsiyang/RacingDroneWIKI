package com.RacingDroneWIKI.servlet;

import com.RacingDroneWIKI.pojo.*;
import com.RacingDroneWIKI.service.*;

import javax.servlet.ServletConfig;
import java.io.IOException;
import java.util.List;

/**
 * Created by asus-pc on 2017/8/26.
 */
public class SearchAllReq extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String url=request.getRequestURI().toString();
        ServletConfig config= getServletConfig();
        request.setAttribute("motoList",null);
        request.setAttribute("electroSpeedRegulatorList",null);
        request.setAttribute("frameList",null);
        request.setAttribute("imageTransmissionList",null);
        request.setAttribute("camList",null);
        request.setAttribute("flightControlList",null);
        request.setAttribute("antennaList",null);
        request.setAttribute("powerHubList",null);
        request.setAttribute("propList",null);
        request.setAttribute("batteryList",null);
        if(url.equals(config.getInitParameter("moto")))
        {
            List<Moto> list=new MotoService().findAll();
            request.setAttribute("motoList",list);
        }
        if(url.equals(config.getInitParameter("esc")))
        {
            List<ElectroSpeedRegulator> list=new ElectroSpeedRegulatorService().findAll();
            request.setAttribute("electroSpeedRegulatorList",list);
        }
        if(url.equals(config.getInitParameter("fra")))
        {
            List<Frame> list=new FrameService().findAll();
            request.setAttribute("frameList",list);
        }
        if(url.equals(config.getInitParameter("it")))
        {
            List<ImageTransmission> list=new ImageTransmissionService().findAll();
            request.setAttribute("imageTransmissionList",list);
        }
        if(url.equals(config.getInitParameter("cam")))
        {
            List<Cam> list=new CamService().findAll();
            request.setAttribute("camList",list);
        }
        if(url.equals(config.getInitParameter("fc")))
        {
            List<FlightControl> list=new FlightControlService().findAll();
            request.setAttribute("flightControlList",list);
        }
        if(url.equals(config.getInitParameter("ant")))
        {
            List<Antenna> list= new AntennaService().findAll();
            request.setAttribute("antennaList",list);
        }
        if(url.equals(config.getInitParameter("ph")))
        {
            List<PowerHub> list=new PowerHubService().findAll();
            request.setAttribute("powerHubList",list);
        }
        if(url.equals(config.getInitParameter("prop")))
        {
            List<Prop> list=new PropService().findAll();
            request.setAttribute("propList",list);
        }
        if(url.equals(config.getInitParameter("bat")))
        {
            List<Battery> list=new BatteryService().findAll();
            request.setAttribute("batteryList",list);
        }
        request.getRequestDispatcher("/resultSet.jsp").forward(request,response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request,response);
    }
}
