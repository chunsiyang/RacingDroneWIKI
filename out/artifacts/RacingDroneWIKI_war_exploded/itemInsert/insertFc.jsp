<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/20
  Time: 17:38
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
  <h2>飞控信息录入</h2>
  <section id="infoTable">
    <div class="infoTableRow">
      <div class="name">
        <p>型号：</p>
        <p>主图片：</p>
        <p>参考价格：</p>
        <p>品牌：</p>
        <p>重量：</p>
        <P>长度：</P>
        <p>宽度：</p>
        <p>厚度：</p>
        <p>安装孔距：</p>
        <p>mcu：</p>
        <p>mpu：</p>
        <p>SD卡支持：</p>
        <p>BOOT按键：</p>
        <p>内置OSD：</p>
        <p>内置蜂鸣器：</p>
        <p>最大PID刷新率：</p>
        <p>最大陀螺仪刷新率：</p>
        <p>阵脚定义图：</p>
        <p id="capP">文字描述：</p>
        <p>辅助图片：</p>
      </div>
      <div class="value">
        <form id="itemInfo" method="post" action="/itemInsert/InsertFC" enctype="multipart/form-data">
          <input type="text" name="model" class="inputText" placeholder="飞控型号"><br>
          <input type="file" name="mainImg" class="inputText"><br>
          <input type="text" name="referencePrice" class="inputText" placeholder="飞控参考价格"><br>
          <input type="text" name="anufacturer" class="inputText" placeholder="飞控制造商、品牌"><br>
          <input type="text" name="weight" class="inputText" placeholder="飞控净重，单位：g"><br>
          <input type="text" name="length" class="inputText" placeholder="飞控长度，单位：mm"><br>
          <input type="text" name="width" class="inputText" placeholder="飞控宽度，单位：mm"><br>
          <input type="text" name="thickness" class="inputText" placeholder="飞控厚度，单位：mm"><br>
          <input type="text" name="mountingHoleSpacing" class="inputText" placeholder="飞控安装孔距，单位：mm"><br>
          <input type="text" name="mcu" class="inputText" placeholder="飞控mcu"><br>
          <input type="text" name="mpu" class="inputText" placeholder="飞控mpu"><br>
          <input type="radio" name="sdcard" class="inputRadio"value="yes">支持
          <input type="radio" name="sdcard" class="inputRadio"value="no">不支持<br>
          <input type="radio" name="bootButton" class="inputRadio"value="yes">支持
          <input type="radio" name="bootButton" class="inputRadio"value="no">不支持<br>
          <input type="radio" name="osd" class="inputRadio"value="yes">支持
          <input type="radio" name="osd" class="inputRadio"value="no">不支持<br>
          <input type="radio" name="buzzer" class="inputRadio"value="yes">支持
          <input type="radio" name="buzzer" class="inputRadio"value="no">不支持<br>
          <input type="text" name="maxPidLoopFrequancy" class="inputText" placeholder="飞控最大PID刷新率，单位：Khz"><br>
          <input type="text" name="maxGyroUpdata" class="inputText" placeholder="飞控最大陀螺仪刷新率，单位：Khz"><br>
          <input type="file" name="pinDefinitionDiagramUrl" class="inputText"><br>
          <textarea name="caption" placeholder="飞控相关文字描述、配置、备注等信息"></textarea>
          <input type="file" name="files" multiple class="inputText"/><br/>
          <input type="submit" value="   提交   " class="inputText"/>
        </form>
      </div>
    </div>

  </section>
</div>
<%@include file="../foot.html"%>
</body>
</html>
