package com.RacingDroneWIKI.service;

import com.RacingDroneWIKI.pojo.Item;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.LinkedList;

/**
 * Created by asus-pc on 2017/9/26.
 */
@Service
public class UpdataUtil {

    public static final String  PINDEFINTIONDIAGRAM="pin";//引脚定义图
    public static final String  FREQUENCYTABLE="_fre";//频率表
    //主图片上传
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
    //辅助图片上传
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
    //特种图片上传
    public String insertSpecialImg(Item item,HttpServletRequest request, MultipartFile img,String type)throws IOException
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
        if (!img.isEmpty()){
            filename=name+type+filename.substring(filename.lastIndexOf("."));
            File file = new File(path, filename);
            img.transferTo(file);
            return filepath+filename;
        }
        return null;

    }

    //UTF-8转码辅助函数
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
    //路径辅助函数
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
