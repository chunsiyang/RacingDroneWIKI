package com.RacingDroneWIKI.controlller;

import com.RacingDroneWIKI.pojo.Antenna;
import com.RacingDroneWIKI.service.AntennaService;
import com.RacingDroneWIKI.service.UpdataUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by user on 2017/11/15.
 */
@Controller
@RequestMapping(value = "/itemInsert/")
public class InsertItem {
    @Autowired
    AntennaService antennaService;
    @RequestMapping(value = "InsertAnt" ,method = RequestMethod.POST)
    public String insertAnt(Antenna antenna,HttpServletRequest request,
                         @RequestParam("mainImg")MultipartFile mainImg,
                         @RequestParam("files")MultipartFile[] files)throws IOException
    {
        antennaService.addAntenna(antenna);
        return "itemInsert/InsertSuccessed";
    }
}
