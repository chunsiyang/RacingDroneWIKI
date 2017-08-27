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
        response.setContentType("text/html");
        String url=request.getRequestURL().toString();
        ServletContext context= getServletContext();
        if(url==context.getInitParameter("moto"))
        {
            List<Moto> list=new MotoDAOProxy().findAll();
        }
        if(url==context.getInitParameter("esc"))
        {
            List<ElectroSpeedRegulator> list=new ElectroSpeedRegulatorDaoProxy().findAll();
        }
        if(url==context.getInitParameter("fra"))
        {
            List<Frame> list=new FrameDaoProxy().findAll();
        }
        if(url==context.getInitParameter("it"))
        {
            List<ImageTransmission> list=new ImageTransmissionDaoProxy().findAll();
        }
        if(url==context.getInitParameter("cam"))
        {
            List<Cam> list=new CamDAOProxy().findAll();
        }
        if(url==context.getInitParameter("fc"))
        {
            List<FlightControl> list=new FlightControlDaoProxy().findAll();
        }
        if(url==context.getInitParameter("ant"))
        {
            List<Antenna> list= new AntennaDaoProxy().findAll();
        }
        if(url==context.getInitParameter("prop"))
        {
            List<Prop> list=new PropDaoProxy().findAll();
        }

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request,response);
    }
}
