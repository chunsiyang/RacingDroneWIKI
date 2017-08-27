package com.RacingDroneWILI.servlet;

import com.RacingDroneWIKI.dao.daoProxy.*;
import com.RacingDroneWIKI.javaBean.*;

import javax.servlet.ServletContext;
import java.io.IOException;
import java.util.List;

/**
 * Created by asus-pc on 2017/8/26.
 */
public class SearchAllReq extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String url=request.getRequestURL().toString();
        ServletContext context= getServletContext();
        request.setAttribute("motoList",null);
        request.setAttribute("electroSpeedRegulatorList",null);
        request.setAttribute("frameList",null);
        request.setAttribute("imageTransmissionList",null);
        request.setAttribute("camList",null);
        request.setAttribute("flightControlList",null);
        request.setAttribute("antennaList",null);
        request.setAttribute("propList",null);
        if(url==context.getInitParameter("moto"))
        {
            List<Moto> list=new MotoDAOProxy().findAll();
            request.setAttribute("motoList",list);
        }
        if(url==context.getInitParameter("esc"))
        {
            List<ElectroSpeedRegulator> list=new ElectroSpeedRegulatorDaoProxy().findAll();
            request.setAttribute("motoList",list);
        }
        if(url==context.getInitParameter("fra"))
        {
            List<Frame> list=new FrameDaoProxy().findAll();
            request.setAttribute("motoList",list);
        }
        if(url==context.getInitParameter("it"))
        {
            List<ImageTransmission> list=new ImageTransmissionDaoProxy().findAll();
            request.setAttribute("motoList",list);
        }
        if(url==context.getInitParameter("cam"))
        {
            List<Cam> list=new CamDAOProxy().findAll();
            request.setAttribute("motoList",list);
        }
        if(url==context.getInitParameter("fc"))
        {
            List<FlightControl> list=new FlightControlDaoProxy().findAll();
            request.setAttribute("motoList",list);
        }
        if(url==context.getInitParameter("ant"))
        {
            List<Antenna> list= new AntennaDaoProxy().findAll();
            request.setAttribute("motoList",list);
        }
        if(url==context.getInitParameter("prop"))
        {
            List<Prop> list=new PropDaoProxy().findAll();
            request.setAttribute("motoList",list);
        }
        request.getRequestDispatcher("/resultSet.jsp").forward(request,response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request,response);
    }
}
