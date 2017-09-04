package com.RacingDroneWILI.servlet;

import com.RacingDroneWIKI.dao.daoProxy.*;
import com.RacingDroneWIKI.javaBean.*;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/**
 * Created by asus-pc on 2017/8/26.
 */
public class SearchAllReq extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
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
            List<Moto> list=new MotoDAOProxy().findAll();
            request.setAttribute("motoList",list);
        }
        if(url.equals(config.getInitParameter("esc")))
        {
            List<ElectroSpeedRegulator> list=new ElectroSpeedRegulatorDaoProxy().findAllUseAlone();
            request.setAttribute("electroSpeedRegulatorList",list);
        }
        if(url.equals(config.getInitParameter("fra")))
        {
            List<Frame> list=new FrameDaoProxy().findAll();
            request.setAttribute("frameList",list);
        }
        if(url.equals(config.getInitParameter("it")))
        {
            List<ImageTransmission> list=new ImageTransmissionDaoProxy().findAllUseAlone();
            request.setAttribute("imageTransmissionList",list);
        }
        if(url.equals(config.getInitParameter("cam")))
        {
            List<Cam> list=new CamDAOProxy().findAllUseAlone();
            request.setAttribute("camList",list);
        }
        if(url.equals(config.getInitParameter("fc")))
        {
            List<FlightControl> list=new FlightControlDaoProxy().findAll();
            request.setAttribute("flightControlList",list);
        }
        if(url.equals(config.getInitParameter("ant")))
        {
            List<Antenna> list= new AntennaDaoProxy().findAll();
            request.setAttribute("antennaList",list);
        }
        if(url.equals(config.getInitParameter("ph")))
        {
            List<PowerHub> list=new PowerHubDaoProxy().findAllUseAlone();
            request.setAttribute("powerHubList",list);
        }
        if(url.equals(config.getInitParameter("prop")))
        {
            List<Prop> list=new PropDaoProxy().findAll();
            request.setAttribute("propList",list);
        }
        if(url.equals(config.getInitParameter("bat")))
        {
            List<Battery> list=new BatteryDaoProxy().findAll();
            request.setAttribute("batteryList",list);
        }
        request.getRequestDispatcher("/resultSet.jsp").forward(request,response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request,response);
    }
}
