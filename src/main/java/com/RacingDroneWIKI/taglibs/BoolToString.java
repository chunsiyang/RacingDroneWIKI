package com.RacingDroneWIKI.taglibs;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * The type Bool to string.
 * TagLib函数将逻辑值转换为文字
 * @author ChunsiYang
 * @version SSM 3.0
 */
public class BoolToString extends SimpleTagSupport {
    private String bool;

    /**
     * Gets bool bool.
     *
     * @return the bool bool
     */
    public String getBoolBool() {
        return bool;
    }

    /**
     * Sets bool.将前台的逻辑值转换为文字
     * True 转换为‘支持’
     * False 转换为‘不支持’
     *
     * @param bool the bool 前台传入的逻辑值
     */
    public void setBool(String bool) {
        this.bool = bool;
    }

    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();
        JspContext context=getJspContext();
        JspWriter out=context.getOut();
        if("true".equals(bool))
        {
            out.print("支持");
        }
        else {
            out.print("不支持");
        }
    }
}
