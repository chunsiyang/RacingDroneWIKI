package com.RacingDroneWIKI.servlet.itemInsert;

import com.RacingDroneWIKI.pojo.Moto;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by user on 2017/9/23.
 */
public class InsertMoto extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        Moto moto=new Moto();
        /*
            数据录入
         */
        request.getRequestDispatcher("/itemInsert/insertEC.jsp").forward(request,response);
    }
}
