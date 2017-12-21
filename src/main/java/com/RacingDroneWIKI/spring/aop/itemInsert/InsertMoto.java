package com.RacingDroneWIKI.spring.aop.itemInsert;

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
 * The type Insert moto.
 * Spring AOP 切面
 * 在进行电机数据录入前使用Spring AOP对飞控中可能存在的集成部件进行录入
 *
 * @author ChunsiYang
 * @version SSM 3.0
 */
@Component
@Aspect
public class InsertMoto
{
    /**
     * The Efficacy chart service.
     */
    @Autowired
    private EfficacyChartService  efficacyChartService;

    /**
     * Insert ec.在电机数据录入前对飞控对像中可能存在的集成部件（力效表）进行信息录入
     *
     * @param moto the moto 待录入的电机对象
     */
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
