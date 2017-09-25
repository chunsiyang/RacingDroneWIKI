package com.RacingDroneWIKI.servlet.itemInsert;

import com.RacingDroneWIKI.pojo.Cam;
import com.RacingDroneWIKI.pojo.ImageTransmission;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by user on 2017/9/23.
 */
public class InsertIt extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ImageTransmission imageTransmission=null;
        HttpSession session=request.getSession();
        if(session.getAttribute("imageTransmission")!=null)
        {
            imageTransmission=(ImageTransmission) session.getAttribute("imageTransmission");
            if(session.getAttribute("cam")!=null)
                imageTransmission.setCam((Cam) session.getAttribute("cam"));
            session.invalidate();
            /*
                数据录入
             */
            request.getRequestDispatcher("/itemInsert/InsertSuccessed.jsp").forward(request,response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        ImageTransmission imageTransmission=null;
        HttpSession session=request.getSession();
        imageTransmission=new ImageTransmission();
        if(session.getAttribute("flightControl")!=null)
        {
            if(session.getAttribute("imageTransmission")==null)
            {
                session.setAttribute("imageTransmission",imageTransmission);
                request.getRequestDispatcher("/itemInsert/FcIntergrat.jsp").forward(request,response);
            }
        }
        else {
            session.setAttribute("imageTransmission",imageTransmission);
            request.getRequestDispatcher("/itemInsert/ItIntergrat.jsp").forward(request,response);
        }

    }
}
