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
 * The type Updata util.图片上传服务模块
 * @author ChunsiYang
 * @version SSM 3.0
 */
@Service
public class UpdataUtil {

    /**
     * The constant PINDEFINTIONDIAGRAM. 引脚定义图  供外部使用的图片类型常量
     */
    public static final String  PINDEFINTIONDIAGRAM="pin";//引脚定义图
    /**
     * The constant FREQUENCYTABLE. 频率表  供外部使用的图片类型常量
     */
    public static final String  FREQUENCYTABLE="_fre";//频率表

    /**
     * Insert img string. 上传主图片
     *
     * @param item    the item 目标对象
     * @param request the HTTP servlet request
     * @param img     the img 主图片
     * @return the string 上传图片物理地址
     * @throws IOException the io exception
     */
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
            String name= utf8Decode(item.getModel());
            //合成完整文件名
            filename=name+filename.substring(filename.lastIndexOf("."));
            File file = new File(path, filename);
            img.transferTo(file);
            item.setImgUrl(filepath+filename);
            return filepath+filename;
        }
        return null;
    }

    /**
     * Insert img mutl linked list. 上传辅助图片
     *
     * @param item    the item 目标对象
     * @param request the HTTP servlet equest
     * @param img     the img 辅助图片集合
     * @return the linked list 辅助图片物理地址结合
     * @throws IOException the io exception
     */
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
                String name= utf8Decode(item.getModel());
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

    /**
     * Insert special img string. 上传特殊类型图片
     *
     * @param item    the item 目标对象
     * @param request the HTTP servlet request
     * @param img     the img 目标图片
     * @param type    the type 图片类型
     * @return the string 图片物理地址
     * @throws IOException the io exception
     */
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
        String name= utf8Decode(item.getModel());
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
        if(uri.equals("/itemInsert/InsertAnt")) {
            return "ant/";
        }
        if(uri.equals("/itemInsert/InsertMoto")) {
            return "moto/";
        }
        if(uri.equals("/itemInsert/Esc")) {
            return "esc/";
        }
        if(uri.equals("/itemInsert/InsertFra")) {
            return "fra/";
        }
        if(uri.equals("/itemInsert/InsertFc")) {
            return "fc/";
        }
        if(uri.equals("/itemInsert/InsertCam")) {
            return "cam/";
        }
        if(uri.equals("/itemInsert/InsertPh")) {
            return "ph/";
        }
        if(uri.equals("/itemInsert/InsertIt")) {
            return "it/";
        }
        if(uri.equals("/itemInsert/InsertProp")) {
            return "prop/";
        }
        if(uri.equals("/itemInsert/InsertBat")) {
            return "bat/";
        }
        return null;
    }

}
