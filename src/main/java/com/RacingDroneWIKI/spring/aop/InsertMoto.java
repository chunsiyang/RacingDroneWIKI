package com.RacingDroneWIKI.spring.aop;

import com.RacingDroneWIKI.pojo.EfficacyChart;
import com.RacingDroneWIKI.pojo.Moto;
import com.RacingDroneWIKI.service.EfficacyChartService;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Iterator;
import java.util.List;

/**
 * Created by user on 2017/11/17.
 */

@Component
@Aspect
public class InsertMoto
{
    @Autowired
    EfficacyChartService  efficacyChartService;
    @Before("execution(* com.RacingDroneWIKI.service.MotoService.addMoto(..))&& args(moto)")
    public void insertEC(Moto moto)
    {
        List<EfficacyChart> efficacyCharts =moto.getEfficacyChart();
        Iterator<EfficacyChart> efficacyChartIterator=efficacyCharts.iterator();
        while (efficacyChartIterator.hasNext())
        {
            EfficacyChart efficacyChart=efficacyChartIterator.next();
            efficacyChart.setMotoModel(moto.getModel());
            efficacyChartService.addEfficacyChart(efficacyChart);
        }
    }

}
