package com.RacingDroneWIKI.taglibs;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * The type Keyword discoloration.
 * TagLib函数
 * 实现搜索关键字变成红色
 * @author ChunsiYang
 * @version SSM 3.0
 */
public class KeywordDiscoloration extends SimpleTagSupport {
    /**
     * The Key word.
     */
    private String keyWord;
    /**
     * The Title.
     */
    private String title;

    /**
     * Gets key word.
     *
     * @return the key word
     */
    public String getKeyWord() {
        return keyWord;
    }

    /**
     * Sets key word.
     *
     * @param keyWord the key word
     */
    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets title.将前台传入字段中的关键字变成红色
     *
     * @param title the title 关键字
     */
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();
        JspContext context=getJspContext();
        JspWriter out=context.getOut();
        String temp=title;
        keyWord=keyWord.toUpperCase();
        String replacement="<P style=\"color:red;display: inline;\">"+keyWord+"</P>";
        temp=temp.replaceAll("(?i)"+keyWord,replacement);
        out.print(temp);
    }
}
