package com.RacingDroneWIKI.spring.aop;

import com.RacingDroneWIKI.pojo.FlightControl;
import com.RacingDroneWIKI.pojo.ImageTransmission;
import com.RacingDroneWIKI.pojo.Item;
import com.RacingDroneWIKI.pojo.PowerHub;
import com.RacingDroneWIKI.service.UpdataUtil;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by user on 2017/11/16.
 */
@Component
@Aspect
public class InsertImg {
    @Autowired
    UpdataUtil updataUtil;
    @Pointcut("execution(* com.RacingDroneWIKI.controller.InsertItem.*(..))&& args(item,request,mainImg,files)")
    public void itemImg(Item item, HttpServletRequest request, MultipartFile mainImg,MultipartFile[] files){}
    //标准只含有主图片和辅助图片的item
    @Before("itemImg(item, request, mainImg,files)")
    public void upLoadItemImg(Item item, HttpServletRequest request, MultipartFile mainImg, MultipartFile[] files)throws IOException
    {
        System.err.println(item.getModel());
        updataUtil.insertImg(item,request,mainImg);
        updataUtil.insertImgMutl(item,request,files);
    }
    //分电板单独处理由于含有引脚定义图
    @Before("execution(* com.RacingDroneWIKI.controller.InsertItem.*(..))" +
            "&&args(item,request,mainImg,files,pinDef)")
    public void powerHubImg(PowerHub item, HttpServletRequest request,
                            MultipartFile mainImg,
                            MultipartFile[] files,
                            MultipartFile pinDef)throws IOException
    {
        updataUtil.insertImg(item,request,mainImg);
        updataUtil.insertImgMutl(item,request,files);
        item.setPinDefinitionDiagram(updataUtil.insertSpecialImg
                (item,request,pinDef,UpdataUtil.PINDEFINTIONDIAGRAM));
    }
    //飞控单独处理由于含有引脚定义图
    @Before("execution(* com.RacingDroneWIKI.controller.InsertItem.*(..))" +
            "&&args(item,request,mainImg,files,pinDef)")
    public void flightControlImg(FlightControl item, HttpServletRequest request,
                                 MultipartFile mainImg,
                                 MultipartFile[] files,
                                 MultipartFile pinDef)throws IOException
    {
        updataUtil.insertImg(item,request,mainImg);
        updataUtil.insertImgMutl(item,request,files);
        item.setPinDefintionDiagram(updataUtil.insertSpecialImg
                (item,request,pinDef,UpdataUtil.PINDEFINTIONDIAGRAM));
    }
    //图传单独处理由于含有引脚定义图和频率表
    @Before("execution(* com.RacingDroneWIKI.controller.InsertItem.*(..))" +
            "&&args(item,request,mainImg,files,pinDef,fre)")
    public void imageTransmissionImg(ImageTransmission item, HttpServletRequest request,
                                     MultipartFile mainImg,
                                     MultipartFile[] files,
                                     MultipartFile pinDef,
                                     MultipartFile fre)throws IOException
    {
        updataUtil.insertImg(item,request,mainImg);
        updataUtil.insertImgMutl(item,request,files);
        item.setPinDefinitionDiagram(updataUtil.insertSpecialImg
                (item,request,pinDef,UpdataUtil.PINDEFINTIONDIAGRAM));
        item.setFrequencyTable(updataUtil.insertSpecialImg
                (item,request,pinDef,UpdataUtil.FREQUENCYTABLE));
    }
}
