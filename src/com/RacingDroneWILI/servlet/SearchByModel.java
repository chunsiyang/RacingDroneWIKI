package com.RacingDroneWILI.servlet;

import com.RacingDroneWIKI.dao.daoProxy.*;
import com.RacingDroneWIKI.javaBean.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by asus-pc on 2017/8/27.
 */
@WebServlet(name = "SearchByModel")
public class SearchByModel extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String model=request.getParameter("model");
        List<Moto> motoList=new MotoDAOProxy().findByModel(model);
        List<ElectroSpeedRegulator> electroSpeedRegulatorList=new ElectroSpeedRegulatorDaoProxy().findByModel(model);
        List<Frame> frameList =new FrameDaoProxy().findByModel(model);
        List<ImageTransmission> imageTransmissionList=new ImageTransmissionDaoProxy().findByModel(model);
        List<Cam> camList=new CamDAOProxy().findByModel(model);
        List<FlightControl> flightControlList=new FlightControlDaoProxy().findByModel(model);
        List<Antenna> antennaList=new AntennaDaoProxy().findByModel(model);
        List<PowerHub> powerHubList=new PowerHubDaoProxy().findByModel(model);
        List<Prop> propList=new PropDaoProxy().findByModel(model);
        request.setAttribute("motoList",motoList);
        request.setAttribute("electroSpeedRegulatorList",electroSpeedRegulatorList);
        request.setAttribute("frameList",frameList);
        request.setAttribute("imageTransmissionList",imageTransmissionList);
        request.setAttribute("camList",camList);
        request.setAttribute("flightControlList",flightControlList);
        request.setAttribute("antennaList",antennaList);
        request.setAttribute("propList",propList);
        request.getRequestDispatcher("/resultSet.jsp").forward(request,response);

    }
}
