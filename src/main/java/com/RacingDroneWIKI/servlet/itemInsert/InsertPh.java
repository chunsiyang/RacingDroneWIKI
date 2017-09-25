package com.RacingDroneWIKI.servlet.itemInsert;

import com.RacingDroneWIKI.pojo.PowerHub;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by user on 2017/9/23.
 */
public class InsertPh extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        PowerHub powerHub=null;
        HttpSession session=request.getSession();
        powerHub=new PowerHub();
        if(session.getAttribute("flightControl")!=null)
        {
            if(session.getAttribute("powerHub")==null)
            {
                session.setAttribute("powerHub",powerHub);
                request.getRequestDispatcher("/itemInsert/FcIntergrat.jsp").forward(request,response);
            }
        }
        if(session.getAttribute("frame")!=null)
        {
            if(session.getAttribute("powerHub")==null)
            {
                session.setAttribute("powerHub",powerHub);
                request.getRequestDispatcher("/itemInsert/FraIntergrat.jsp").forward(request,response);
            }
        }
        else {
             /*
                数据录入
             */
            request.getRequestDispatcher("/itemInsert/InsertSuccessed.jsp").forward(request,response);
        }
    }
}
