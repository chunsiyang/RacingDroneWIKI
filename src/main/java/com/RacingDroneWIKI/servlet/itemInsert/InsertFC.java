package com.RacingDroneWIKI.servlet.itemInsert;

import com.RacingDroneWIKI.pojo.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;
import java.io.IOException;

/**
 * Created by asus-pc on 2017/8/27.
 */
@WebServlet(name = "SearchByModel")
public class InsertFC extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        FlightControl flightControl=null;
        HttpSession session=request.getSession();
        flightControl=new FlightControl();
        session.setAttribute("flightControl",flightControl);
        request.getRequestDispatcher("/itemInsert/FcIntergrat.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        FlightControl flightControl=null;
        HttpSession session=request.getSession();
        if(session.getAttribute("flightControl")!=null)
        {
            flightControl=(FlightControl) session.getAttribute("flightControl");
            if(session.getAttribute("electroSpeedRegulator")!=null)
                flightControl.setEsc((ElectroSpeedRegulator) session.getAttribute("electroSpeedRegulator"));
            if(session.getAttribute("imageTransmission")!=null)
                flightControl.setImageTransmission((ImageTransmission) session.getAttribute("imageTransmission"));
            if(session.getAttribute("powerHub")!=null)
                flightControl.setPowerHub((PowerHub) session.getAttribute("powerHub"));
            session.invalidate();
            /*
                数据录入
             */
            request.getRequestDispatcher("/itemInsert/InsertSuccessed.jsp").forward(request,response);
        }

    }
}
