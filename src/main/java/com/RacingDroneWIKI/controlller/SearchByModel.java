package com.RacingDroneWIKI.controlller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by user on 2017/11/13.
 */
@Controller
public class SearchByModel {
    @RequestMapping(value = "/search")
    public String search(@RequestParam("searchModel") String searchModel, Model model){



        return "resultSet";
    }
}
