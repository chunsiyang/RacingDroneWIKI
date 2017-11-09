package com.RacingDroneWIKI.controlller;

import com.RacingDroneWIKI.service.MotoService;
import com.RacingDroneWIKI.pojo.Moto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by user on 2017/11/7.
 */
@Controller
public class SearchAll  {
    @Autowired
    MotoService motoService;
    @RequestMapping(value = "/moto")
    public String motoList(Model model)
    {
        List<Moto> list=motoService.findAll();
        model.addAttribute("motoList",list);
        return "resultSet";
    }
}
