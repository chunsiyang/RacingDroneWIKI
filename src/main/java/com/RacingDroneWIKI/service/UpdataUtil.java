package com.RacingDroneWIKI.service;

import com.RacingDroneWIKI.pojo.Item;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.LinkedList;

/**
 * Created by asus-pc on 2017/9/26.
 */
@Service
public class UpdataUtil {

    public String insertImg(Item item, HttpServletRequest request, MultipartFile img)throws IOException
    {
        if (!img.isEmpty())
        {
            //文件夹地址
            String filepath=getPath(request);
            //存储路径
            String path=request.getSession().getServletContext().getRealPath("/img/"+filepath);
            //原始文件名
            String filename=img.getOriginalFilename();
            //utf-8重编码型号名
            String name=this.utf8Decode(item.getModel());
            //合成完整文件名
            filename=name+filename.substring(filename.lastIndexOf("."));
            File file = new File(path, filename);
            img.transferTo(file);
            item.setImgUrl(filepath+filename);
            return filepath+filename;
        }
        return null;
    }

    public LinkedList<String> insertImgMutl(Item item, HttpServletRequest request, MultipartFile[] img)throws IOException
    {
        //文件夹地址
        String filepath=getPath(request);
        //存储路径
        String path=request.getSession().getServletContext().getRealPath("/img/"+filepath);
        //返回值
        LinkedList<String> list=new LinkedList();
        for (int i = 0; i < img.length; i++) {
            if (!img[i].isEmpty())
            {
                //原始文件名
                String filename=img[i].getOriginalFilename();
                //utf-8重编码型号名
                String name=this.utf8Decode(item.getModel());
                //合成完整文件名
                filename=name+"_ep"+i+filename.substring(filename.lastIndexOf("."));
                File file = new File(path, filename);
                img[i].transferTo(file);
                list.add(filepath+filename);
            }
        }
        item.setExtraPictures(list);
        return list;
    }

    private static String utf8Decode(String img) {
        String url = new String();
        try {
            url = java.net.URLEncoder.encode(img, "utf-8");
            url = url.replaceAll("%", "-");
            return url;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return url;
    }
    private static String getPath(HttpServletRequest request){
        String uri=request.getRequestURI().toString();
        if(uri.equals("/itemInsert/InsertAnt"))
            return "ant/";
        if(uri.equals("/itemInsert/InsertMoto"))
            return "moto/";
        if(uri.equals("/itemInsert/Esc"))
            return "esc/";
        if(uri.equals("/itemInsert/InsertFra"))
            return "fra/";
        if(uri.equals("/itemInsert/InsertFc"))
            return "fc/";
        if(uri.equals("/itemInsert/InsertCam"))
            return "cam/";
        if(uri.equals("/itemInsert/InsertPh"))
            return "ph/";
        if(uri.equals("/itemInsert/InsertIt"))
            return "it/";
        if(uri.equals("/itemInsert/InsertProp"))
            return "prop/";
        if(uri.equals("/itemInsert/InsertBat"))
            return "bat/";
        return null;
    }
}
