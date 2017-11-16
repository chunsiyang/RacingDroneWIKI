package com.RacingDroneWIKI.servlet.itemInsert;

import com.RacingDroneWIKI.pojo.Cam;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by user on 2017/9/23.
 */
public class InsertCam extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        Cam cam=null;
        HttpSession session=request.getSession();
        cam=new Cam();
        if(session.getAttribute("imageTransmission")!=null)
        {
            if(session.getAttribute("cam")==null)
            {
                session.setAttribute("cam",cam);
                request.getRequestDispatcher("/itemInsert/ItIntergrat.jsp").forward(request,response);
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
