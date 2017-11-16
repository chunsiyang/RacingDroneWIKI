package com.RacingDroneWIKI.servlet;

import com.RacingDroneWIKI.pojo.*;
import com.RacingDroneWIKI.service.*;

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
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String model=request.getParameter("searchModel");
        List<Moto> motoList=new MotoService().findByModel(model);
        List<ElectroSpeedRegulator> electroSpeedRegulatorList=new ElectroSpeedRegulatorService().findByModel(model);
        List<Frame> frameList =new FrameService().findByModel(model);
        List<ImageTransmission> imageTransmissionList=new ImageTransmissionService().findByModel(model);
        List<Cam> camList=new CamService().findByModel(model);
        List<FlightControl> flightControlList=new FlightControlService().findByModel(model);
        List<Antenna> antennaList=new AntennaService().findByModel(model);
        List<PowerHub> powerHubList=new PowerHubService().findByModel(model);
        List<Prop> propList=new PropService().findByModel(model);
        List<Battery> batteryList=new BatteryService().findByModel(model);
        request.setAttribute("motoList",motoList);
        request.setAttribute("electroSpeedRegulatorList",electroSpeedRegulatorList);
        request.setAttribute("frameList",frameList);
        request.setAttribute("imageTransmissionList",imageTransmissionList);
        request.setAttribute("camList",camList);
        request.setAttribute("flightControlList",flightControlList);
        request.setAttribute("antennaList",antennaList);
        request.setAttribute("powerHubList",powerHubList);
        request.setAttribute("propList",propList);
        request.setAttribute("batteryList",batteryList);
        request.getRequestDispatcher("/resultSet.jsp").forward(request,response);

    }
}
