package com.RacingDroneWIKI.servlet.itemInsert;

import com.RacingDroneWIKI.pojo.Frame;
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
public class InsertFra extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Frame frame=null;
        HttpSession session=request.getSession();
        if(session.getAttribute("frame")!=null)
        {
            frame=(Frame) session.getAttribute("frame");
            if(session.getAttribute("powerHub")!=null)
                frame.setIntegratedPh((PowerHub) session.getAttribute("powerHub"));
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
        Frame frame=null;
        HttpSession session=request.getSession();
        frame=new Frame();
        session.setAttribute("frame",frame);
        request.getRequestDispatcher("/itemInsert/FraIntergrat.jsp").forward(request,response);

    }
}
