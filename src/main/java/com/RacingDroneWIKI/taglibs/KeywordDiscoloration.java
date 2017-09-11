package com.RacingDroneWIKI.taglibs;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * Created by user on 2017/9/10.
 */
public class KeywordDiscoloration extends SimpleTagSupport {
    String keyWord;
    String title;

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();
        JspContext context=getJspContext();
        JspWriter out=context.getOut();
        String temp=title;
        String replacement="<P style=\"color:red;display: inline;\">"+keyWord+"</P>";
        temp=temp.replaceAll(keyWord,replacement);
    }
}
