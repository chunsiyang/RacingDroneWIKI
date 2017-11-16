package com.RacingDroneWIKI.taglibs;

import com.sun.org.apache.xpath.internal.operations.Bool;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * Created by asus-pc on 2017/9/7.
 */
public class BoolToString extends SimpleTagSupport {
    private String bool;

    public String getBoolBool() {
        return bool;
    }

    public void setBool(String bool) {
        this.bool = bool;
    }

    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();
        JspContext context = getJspContext();
        JspWriter out = context.getOut();
        if (bool.equals("true")) {
            out.print("支持");
        } else {
            out.print("不支持");
        }
    }
}
