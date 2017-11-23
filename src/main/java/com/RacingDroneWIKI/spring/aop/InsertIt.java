package com.RacingDroneWIKI.spring.aop;

import com.RacingDroneWIKI.pojo.Cam;
import com.RacingDroneWIKI.pojo.ImageTransmission;
import com.RacingDroneWIKI.service.CamService;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * The type Insert it.
 * Spring AOP 切面
 * 在进行图传数据录入前使用Spring AOP对飞控中可能存在的集成部件进行录入
 *
 * @author ChunsiYang
 * @version SSM 3.0
 */
@Component
@Aspect
public class InsertIt {
    /**
     * The Cam service.
     */
    @Autowired
    private CamService camService;

    /**
     * Inset it.在图传数据录入前对飞控对像中可能存在的集成部件（摄像头）进行信息录入
     *
     * @param imageTransmission the image transmission 待录入的图传对象
     */
    @Before("execution(* com.RacingDroneWIKI.service.ImageTransmissionService.addImageTransmission(..))" +
            "&& args(imageTransmission)")
    public void insetIt(ImageTransmission imageTransmission) {
        if (imageTransmission.getCam() != null) {
            Cam cam = imageTransmission.getCam();
            cam.setUseAlone(false);
            cam.setModel(imageTransmission.getModel());
            imageTransmission.setCam(cam);
            camService.addCam(cam);
        }
    }
}
