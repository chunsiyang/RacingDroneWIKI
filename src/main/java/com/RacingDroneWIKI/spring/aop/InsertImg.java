package com.RacingDroneWIKI.spring.aop;

import com.RacingDroneWIKI.pojo.FlightControl;
import com.RacingDroneWIKI.pojo.ImageTransmission;
import com.RacingDroneWIKI.pojo.Item;
import com.RacingDroneWIKI.pojo.PowerHub;
import com.RacingDroneWIKI.service.UpdataUtil;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * The type Insert img.
 * Spring AOP 切面
 * 在进行SpringMVC将绑定的前台对象数据交由Controller处理前使用SpringMVC对前台对象中包含的图片进行上传和提前处理
 *
 * @author ChunsiYang
 * @version SSM 3.0
 */
@Component
@Aspect
public class InsertImg {
    /**
     * The Updata util.
     */
    @Autowired
    private UpdataUtil updataUtil;

    /**
     * Item img. 定义SpringAOP切点，目标需要处理仅包含主图片和辅助图片上传请求的Controller控制器
     *
     * @param item    the item 目标对象
     * @param request the HTTP servlet request
     * @param mainImg the main img 主图片
     * @param files   the files 辅助图片
     */
    @Pointcut("execution(* com.RacingDroneWIKI.controller.InsertItem.*(..))&& args(item,request,mainImg,files)")
    public void itemImg(Item item, HttpServletRequest request, MultipartFile mainImg, MultipartFile[] files) {
    }

    /**
     * up load item img. 主图片和辅助图片的上传和绑定
     *
     * @param item    the item 目标对象
     * @param request the HTTP servlet request
     * @param mainImg the main img 主图片
     * @param files   the files 辅助图片
     */
//标准只含有主图片和辅助图片的item
    @Before("itemImg(item, request, mainImg,files)")
    public void upLoadItemImg(Item item, HttpServletRequest request, MultipartFile mainImg, MultipartFile[] files) throws IOException {
        System.err.println(item.getModel());
        updataUtil.insertImg(item, request, mainImg);
        updataUtil.insertImgMutl(item, request, files);
    }

    /**
     * Power hub img. 处理分电板数据录入Controller控制器中的图片上传
     *
     * @param item    the item 目标对象
     * @param request the HTTP servlet request
     * @param mainImg the main img 主图片
     * @param files   the files 辅助图片
     * @param pinDef  the pin def 引脚定义图
     * @throws IOException the io exception
     */
//分电板单独处理由于含有引脚定义图
    @Before("execution(* com.RacingDroneWIKI.controller.InsertItem.*(..))" +
            "&&args(item,request,mainImg,files,pinDef)")
    public void powerHubImg(PowerHub item, HttpServletRequest request,
                            MultipartFile mainImg,
                            MultipartFile[] files,
                            MultipartFile pinDef) throws IOException {
        updataUtil.insertImg(item, request, mainImg);
        updataUtil.insertImgMutl(item, request, files);
        item.setPinDefinitionDiagram(updataUtil.insertSpecialImg
                (item, request, pinDef, UpdataUtil.PINDEFINTIONDIAGRAM));
    }

    /**
     * Flight control img. 处理飞控数据录入Controller控制器中的图片上传
     *
     * @param item    the item 目标对象
     * @param request the HTTP servlet request
     * @param mainImg the main img 主图片
     * @param files   the files 辅助图片
     * @param pinDef  the pin def 引脚定义图
     * @throws IOException the io exception
     */
//飞控单独处理由于含有引脚定义图
    @Before("execution(* com.RacingDroneWIKI.controller.InsertItem.*(..))" +
            "&&args(item,request,mainImg,files,pinDef)")
    public void flightControlImg(FlightControl item, HttpServletRequest request,
                                 MultipartFile mainImg,
                                 MultipartFile[] files,
                                 MultipartFile pinDef) throws IOException {
        updataUtil.insertImg(item, request, mainImg);
        updataUtil.insertImgMutl(item, request, files);
        item.setPinDefintionDiagram(updataUtil.insertSpecialImg
                (item, request, pinDef, UpdataUtil.PINDEFINTIONDIAGRAM));
    }

    /**
     * Image transmission img.处理图传数据录入Controller控制器中的图片上传
     *
     * @param item    the item 目标对象
     * @param request the HTTP servlet request
     * @param mainImg the main img 主图片
     * @param files   the files 辅助图片
     * @param pinDef  the pin def 引脚定义图
     * @param fre     the fre 频率表
     * @throws IOException the io exception
     */
//图传单独处理由于含有引脚定义图和频率表
    @Before("execution(* com.RacingDroneWIKI.controller.InsertItem.*(..))" +
            "&&args(item,request,mainImg,files,pinDef,fre)")
    public void imageTransmissionImg(ImageTransmission item, HttpServletRequest request,
                                     MultipartFile mainImg,
                                     MultipartFile[] files,
                                     MultipartFile pinDef,
                                     MultipartFile fre) throws IOException {
        updataUtil.insertImg(item, request, mainImg);
        updataUtil.insertImgMutl(item, request, files);
        item.setPinDefinitionDiagram(updataUtil.insertSpecialImg
                (item, request, pinDef, UpdataUtil.PINDEFINTIONDIAGRAM));
        item.setFrequencyTable(updataUtil.insertSpecialImg
                (item, request, pinDef, UpdataUtil.FREQUENCYTABLE));
    }
}
