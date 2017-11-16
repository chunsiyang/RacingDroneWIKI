<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/20
  Time: 15:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en" xmlns:jsp="http://java.sun.com/jsf/facelets">
<head>
    <link type="text/css" rel="stylesheet" href="/headNav.css"/>
    <link type="text/css" rel="stylesheet" href="insertItem.css"/>
    <title>竞速无人机资料库</title>
</head>
<body>
<div id="main">
    <jsp:include page="../headNav.jsp">
        <jsp:param name="searchModel" value="${param.searchModel}"/>
    </jsp:include>
    <h2>电调信息录入</h2>
    <section id="infoTable">
        <div class="infoTableRow">
            <div class="name">
                <p>型号：</p>
                <p>主图片：</p>
                <p>参考价格：</p>
                <p>品牌：</p>
                <p>重量：</p>
                <p>长度：</p>
                <p>宽度：</p>
                <p>厚度：</p>
                <p>支持锂电池电芯片数：</p>
                <p>持续工作电流：</p>
                <p>瞬时工作电流：</p>
                <p>固件：</p>
                <p>主控制芯片：</p>
                <p>四合一：</p>
                <p>PWM输入模式：</p>
                <p>oneshot125输入模式：</p>
                <p>oneshot42输入模式：</p>
                <p>mutishot输入模式：</p>
                <p>dshot输入模式：</p>
                <p id="capP">文字描述：</p>
                <p>辅助图片：</p>
            </div>
            <div class="value">
                <form id="itemInfo" method="post" action="/itemInsert/InsertEsc">
                    <input type="text" name="model" placeholder="电调型号" class="inputText"><br>
                    <input type="file" name="mainImg" class="inputText"><br>
                    <input type="text" name="referencePrice" class="inputText" placeholder="电调参考价格"><br>
                    <input type="text" name="anufacturer" class="inputText" placeholder="电调制造商、品牌"><br>
                    <input type="text" name="weight" class="inputText" placeholder="电调净重，单位：g"><br>
                    <input type="text" name="length" class="inputText" placeholder="电调长度，单位：mm"><br>
                    <input type="text" name="width" class="inputText" placeholder="电调宽度，单位：mm"><br>
                    <input type="text" name="thickness" class="inputText" placeholder="电调厚度，单位：mm"><br>
                    <input type="text" name="noOfCells" class="inputText" placeholder="电调支持锂电池电芯数，单位：S"><br>
                    <input type="text" name="persistentCurrent" class="inputText" placeholder="电调持续工作电流，单位：A"><br>
                    <input type="text" name="instantaneousCurrent" class="inputText" placeholder="电调瞬时工作电流，单位：A"><br>
                    <input type="text" name="firmware" class="inputText" placeholder="电调固件"><br>
                    <input type="text" name="controlChip" class="inputText" placeholder="电调主控芯片"><br>
                    <input type="radio" name="fourInone" class="inputRadio" value="yes">支持
                    <input type="radio" name="fourInone" class="inputRadio" value="no">不支持<br>
                    <input type="radio" name="pwmMode" class="inputRadio" value="yes">支持
                    <input type="radio" name="pwmMode" class="inputRadio" value="no">不支持<br>
                    <input type="radio" name="oneshot125" class="inputRadio" value="yes">支持
                    <input type="radio" name="oneshot125" class="inputRadio" value="no">不支持<br>
                    <input type="radio" name="oneshot42" class="inputRadio" value="yes">支持
                    <input type="radio" name="oneshot42" class="inputRadio" value="no">不支持<br>
                    <input type="radio" name="mutishot" class="inputRadio" value="yes">支持
                    <input type="radio" name="mutishot" class="inputRadio" value="no">不支持<br>
                    <input type="radio" name="dshot" class="inputRadio" value="yes">支持
                    <input type="radio" name="dshot" class="inputRadio" value="no">不支持<br>
                    <textarea name="caption" class="inputText" placeholder="电调相关文字描述、配置、备注等信息"></textarea>
                    <input type="file" name="files" multiple class="inputText"/><br/>
                    <input type="submit" value="   提交   " class="inputText"/>
                </form>
            </div>
        </div>

    </section>
</div>
<%@include file="../foot.html" %>
</body>
</html>
