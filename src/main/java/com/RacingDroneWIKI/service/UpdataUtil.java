package com.RacingDroneWIKI.service;

import com.RacingDroneWIKI.pojo.Item;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by asus-pc on 2017/9/26.
 */
@Service
public class UpdataUtil {
    List<FileItem> list;
    //public UpdataUtil()
    {

    }
    @Autowired
    public UpdataUtil(HttpServletRequest request)
    {
        try {
            DiskFileItemFactory factory = new DiskFileItemFactory();
            //2、创建一个文件上传解析器
            ServletFileUpload upload = new ServletFileUpload(factory);
            //解决上传文件名的中文乱码
            upload.setHeaderEncoding("UTF-8");
            //3、判断提交上来的数据是否是上传表单的数据
            if (!ServletFileUpload.isMultipartContent(request)) {
                //按照传统方式获取数据
                System.out.println("err is hear");
                return;
            }
            list = upload.parseRequest(request);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public Item updataImg(HttpServlet servlet, String model, String path) {
        //得到上传文件的保存目录，将上传的文件存放于WEB-INF目录下，不允许外界直接访问，保证上传文件的安全
        String savePath = servlet.getServletContext().getRealPath("/img/" + path);
        String imgUrl = path;
        LinkedList<String> extraPictures = new LinkedList<>();
        Item res =new Item();
        File file = new File(savePath);
        //判断上传文件的保存目录是否存在
        if (!file.exists() && !file.isDirectory()) {
            //创建目录
            file.mkdir();
        }
        try {
            //使用Apache文件上传组件处理文件上传步骤：
            int index=0;
            for (FileItem item : list) {
                //如果fileitem中封装的是普通输入项的数据
                if (item.isFormField()) {
                    String name = item.getFieldName();
                    //解决普通输入项的数据的中文乱码问题
                    String value = item.getString("UTF-8");
                } else {//如果fileitem中封装的是上传文件
                    //得到上传的文件名称，
                    String filename = item.getName();
                    if (filename == null || filename.trim().equals("")) {
                        continue;
                    }
                    //注意：不同的浏览器提交的文件名是不一样的，有些浏览器提交上来的文件名是带有路径的，如：  c:\a\b\1.txt，而有些只是单纯的文件名，如：1.txt
                    //处理获取到的上传文件的文件名的路径部分，只保留文件名部分
                    filename = filename.substring(filename.lastIndexOf("\\") + 1);
                    if (item.getFieldName().equals("files")) {
                        index++;
                        filename=UpdataUtil.utf8Decode(model)+"_ep"+index+filename.substring(filename.lastIndexOf("."));
                        extraPictures.add(path+filename);
                    } else {
                        filename=model+filename.substring(filename.lastIndexOf("."));
                        filename = UpdataUtil.utf8Decode(filename);
                        imgUrl += filename;
                    }
                    //获取item中的上传文件的输入流
                    InputStream in = item.getInputStream();
                    //创建一个文件输出流
                    FileOutputStream out = new FileOutputStream(savePath + "\\" + filename);
                    //创建一个缓冲区
                    byte buffer[] = new byte[1024];
                    //判断输入流中的数据是否已经读完的标识
                    int len = 0;
                    //循环将输入流读入到缓冲区当中，(len=in.read(buffer))>0就表示in里面还有数据
                    while ((len = in.read(buffer)) > 0) {
                        //使用FileOutputStream输出流将缓冲区的数据写入到指定的目录(savePath + "\\" + filename)当中
                        out.write(buffer, 0, len);
                    }
                    //关闭输入流
                    in.close();
                    //关闭输出流
                    out.close();
                    //删除处理文件上传时生成的临时文件
                    item.delete();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        res.setExtraPictures(extraPictures);
        res.setImgUrl(imgUrl);
        return res;
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

    public Map<String, String> getParmeter() {
        Map<String,String> res=new HashMap<>();
        try {
            for (FileItem item : list)
            {
                //如果fileitem中封装的是普通输入项的数据
                if (item.isFormField()) {
                    String name = item.getFieldName();
                    //解决普通输入项的数据的中文乱码问题
                    String value = item.getString("UTF-8");
                    res.put(name,value);
                    //System.out.println(name + "=" + value);
                }
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return res;
    }
}
