package com.RacingDroneWIKI.servlet.itemInsert;

import com.RacingDroneWIKI.dao.dao.PropDao;
import com.RacingDroneWIKI.dao.daoProxy.PropDaoProxy;
import com.RacingDroneWIKI.dao.daoProxy.UpdataUtil;
import com.RacingDroneWIKI.pojo.Item;
import com.RacingDroneWIKI.pojo.Prop;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * Created by user on 2017/9/23.
 */
public class InsertProp extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        Prop prop = new Prop();
        //数据录入
        UpdataUtil updataUtil=new UpdataUtil(request);
        Map<String,String> parmMap=updataUtil.getParmeter();
        //对象初始化赋值
        prop.setModel(parmMap.get("model"));
        if (parmMap.get("bladeNumber")==null&&parmMap.get("bladeNumber").trim().equals(""))
            prop.setBladeNumber(Integer.parseInt(parmMap.get("bladeNumber")));
        prop.setMaterial(parmMap.get("material"));
        if (parmMap.get("mountingHoleSpacing")!=null&&!parmMap.get("mountingHoleSpacing").trim().equals(""))
            prop.setMountingHoleSpacing(Float.parseFloat(parmMap.get("mountingHoleSpacing")));
        prop.setSize(parmMap.get("size"));
        if (parmMap.get("weight")!=null&&!parmMap.get("weight").trim().equals(""))
            prop.setWeight(Float.parseFloat(parmMap.get("weight")));
        prop.setAnufacturer(parmMap.get("anufacturer"));
        prop.setCaption(parmMap.get("caption"));
        if (parmMap.get("referencePrice")!=null&&!parmMap.get("referencePrice").trim().equals(""))
            prop.setReferencePrice(Integer.parseInt(parmMap.get("referencePrice")));
        Item item= updataUtil.updataImg(this,prop.getModel(),"prop/");
        prop.setImgUrl(item.getImgUrl());
        prop.setExtraPictures(item.getExtraPictures());
        PropDao propDao=new PropDaoProxy();
        propDao.addProp(prop);
        request.getRequestDispatcher("/itemInsert/InsertSuccessed.jsp").forward(request, response);
    }
}
