package com.RacingDroneWIKI.spring.aop.itemInsert;

import com.RacingDroneWIKI.pojo.Frame;
import com.RacingDroneWIKI.pojo.PowerHub;
import com.RacingDroneWIKI.service.PowerHubService;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * The type Insert fra.
 * Spring AOP 切面
 * 在进行机架数据录入前使用Spring AOP对飞控中可能存在的集成部件进行录入
 *
 * @author ChunsiYang
 * @version SSM 3.0
 */
@Component
@Aspect
public class InsertFra {
    /**
     * The Power hub service.
     */
    @Autowired
    private PowerHubService powerHubService;

    /**
     * Inset fra.在机架数据录入前对飞控对像中可能存在的集成部件（分电板）进行信息录入
     *
     * @param frame the frame 待录入的机架对象
     */
    @Before("execution(* com.RacingDroneWIKI.service.FrameService.addFrame(..))&& args(frame)")
    public void insetFra(Frame frame)
    {
        if (frame.getIntegratedPh()!=null)
        {
            PowerHub powerHub=frame.getIntegratedPh();
            powerHub.setUseAlone(false);
            powerHub.setModel(frame.getModel());
            frame.setIntegratedPh(powerHub);
            powerHubService.addPowerHub(powerHub);
        }
    }
}
