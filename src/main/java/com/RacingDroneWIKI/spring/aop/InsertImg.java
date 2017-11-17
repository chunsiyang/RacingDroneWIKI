package com.RacingDroneWIKI.spring.aop;

import com.RacingDroneWIKI.pojo.Item;
import com.RacingDroneWIKI.service.UpdataUtil;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
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

    @Before("itemImg(item, request, mainImg,files)")
    public void upLoadItemImg(Item item, HttpServletRequest request, MultipartFile mainImg, MultipartFile[] files)throws IOException
    {
        System.err.println(item.getModel());
        updataUtil.insertImg(item,request,mainImg);
        updataUtil.insertImgMutl(item,request,files);
    }

}
