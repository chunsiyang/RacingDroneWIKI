package com.RacingDroneWIKI.spring.aop;

import com.RacingDroneWIKI.pojo.Frame;
import com.RacingDroneWIKI.pojo.PowerHub;
import com.RacingDroneWIKI.service.PowerHubService;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.ref.PhantomReference;

/**
 * Created by user on 2017/11/20.
 */
@Component
@Aspect
public class InsertFra {
    @Autowired
    PowerHubService powerHubService;
    @Before("execution(* com.RacingDroneWIKI.service.FrameService.addFrame(..))&& args(frame)")
    public void insetPh(Frame frame)
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
