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
public class InsertEsc extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        ElectroSpeedRegulator electroSpeedRegulator = null;
        HttpSession session = request.getSession();
        electroSpeedRegulator = new ElectroSpeedRegulator();
        if (session.getAttribute("flightControl") != null) {
            if (session.getAttribute("electroSpeedRegulator") == null) {
                session.setAttribute("electroSpeedRegulator", electroSpeedRegulator);
                request.getRequestDispatcher("/itemInsert/FcIntergrat.jsp").forward(request, response);
            }
        } else {
             /*
                数据录入
             */
            request.getRequestDispatcher("/itemInsert/InsertSuccessed.jsp").forward(request, response);
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}
