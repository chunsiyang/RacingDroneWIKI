package com.RacingDroneWIKI.servlet;

import com.RacingDroneWIKI.dao.daoProxy.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by asus-pc on 2017/9/4.
 */
public class Detail extends javax.servlet.http.HttpServlet {
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String item=request.getParameter("item");
        String model=request.getParameter("model");
        if(item.equals("moto"))
        {
            request.setAttribute("item",new MotoDAOProxy().findByModel(model).get(0));
            request.getRequestDispatcher("/item/moto.jsp").forward(request,response);
        }
        if(item.equals("esc"))
        {
            request.setAttribute("item",new ElectroSpeedRegulatorDaoProxy().findByModel(model).get(0));
            request.getRequestDispatcher("/item/esc.jsp").forward(request,response);
        }
        if(item.equals("fra"))
        {
            request.setAttribute("item",new FrameDaoProxy().findByModel(model).get(0));
            request.getRequestDispatcher("/item/fra.jsp").forward(request,response);
        }
        if(item.equals("it"))
        {
            request.setAttribute("item",new ImageTransmissionDaoProxy().findByModel(model).get(0));
            request.getRequestDispatcher("/item/it.jsp").forward(request,response);
        }
        if(item.equals("cam"))
        {
            request.setAttribute("item",new CamDAOProxy().findByModel(model).get(0));
            request.getRequestDispatcher("/item/cam.jsp").forward(request,response);
        }
        if(item.equals("fc"))
        {
            request.setAttribute("item",new FlightControlDaoProxy().findByModel(model).get(0));
            request.getRequestDispatcher("/item/fc.jsp").forward(request,response);
        }
        if(item.equals("ant"))
        {
            request.setAttribute("item",new AntennaDaoProxy().findDetail(model));
            request.getRequestDispatcher("/item/ant.jsp").forward(request,response);
        }
        if(item.equals("ph"))
        {
            request.setAttribute("item",new PowerHubDaoProxy().findByModel(model).get(0));
            request.getRequestDispatcher("/item/ph.jsp").forward(request,response);
        }
        if(item.equals("prop"))
        {
            request.setAttribute("item",new PropDaoProxy().findByModel(model).get(0));
            request.getRequestDispatcher("/item/prop.jsp").forward(request,response);
        }
        if(item.equals("bat"))
        {
            request.setAttribute("item",new BatteryDaoProxy().findByModel(model).get(0));
            request.getRequestDispatcher("/item/bat.jsp").forward(request,response);
        }
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
