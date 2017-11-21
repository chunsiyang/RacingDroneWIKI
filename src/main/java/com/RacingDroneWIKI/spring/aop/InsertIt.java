package com.RacingDroneWIKI.spring.aop;

import com.RacingDroneWIKI.pojo.Cam;
import com.RacingDroneWIKI.pojo.ImageTransmission;
import com.RacingDroneWIKI.service.CamService;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by user on 2017/11/21.
 */
@Component
@Aspect
public class InsertIt {
    @Autowired
    CamService camService;
    @Before("execution(* com.RacingDroneWIKI.service.ImageTransmissionService.addImageTransmission(..))" +
            "&& args(imageTransmission)")
    public void insetIt(ImageTransmission imageTransmission)
    {
        if (imageTransmission.getCam()!=null)
        {
            Cam cam=imageTransmission.getCam();
            cam.setUseAlone(false);
            cam.setModel(imageTransmission.getModel());
            imageTransmission.setCam(cam);
            camService.addCam(cam);
        }
    }
}
