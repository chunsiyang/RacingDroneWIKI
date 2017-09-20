<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/19
  Time: 21:20
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
  <h2>摄像头信息录入</h2>
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
        <p>图像传感器：</p>
        <p>水平分辨率：</p>
        <p>镜头视场：</p>
        <p>信号制式：</p>
        <p>结成OSD：</p>
        <p>集成MIC：</p>
        <p>信噪比：</p>
        <p>电子快门速度：</p>
        <p>自动增益：</p>
        <p>背光补偿：</p>
        <p>最低照度：</p>
        <p>宽动态：</p>
        <P>数字降噪：</P>
        <p>日夜切换：</p>
        <p>输入电压：</p>
        <p>外壳材料：</p>
        <p id="capP">文字描述：</p>
        <p>辅助图片：</p>
      </div>
      <div class="value">
        <form id="itemInfo" method="post" action="putIntoDB" enctype="multipart/form-data">
          <input type="text" name="model" placeholder="摄像头型号"class="inputText"><br>
          <input type="file" name="mainImg"class="inputText"><br>
          <input type="text" name="referencePrice" class="inputText"placeholder="摄像头参考价格"><br>
          <input type="text" name="anufacturer" class="inputText"placeholder="摄像头制造商、品牌"><br>
          <input type="text" name="weight" class="inputText"placeholder="摄像头净重，单位：g"><br>
          <input type="text" name="length" class="inputText"placeholder="摄像头长度，单位：mm"><br>
          <input type="text" name="width" class="inputText"placeholder="摄像头宽度，单位：mm"><br>
          <input type="text" name="thickness" class="inputText"placeholder="摄像头厚度，单位：mm"><br>
          <input type="text" name="imageSensor" class="inputText"placeholder="摄像头感应器"><br>
          <input type="text" name="horizontalResolustion" class="inputText"placeholder="摄像头分辨率,单位："><br>
          <input type="text" name="lensFov" class="inputText"placeholder="摄像头镜头视场TVL，单位：度"><br>
          <input type="text" name="signalSystem" class="inputText"placeholder="摄像头信号制式"><br>
          <input type="radio" name="integratedOsd" class="inputRadio"value="yes">支持
          <input type="radio" name="integratedOsd" class="inputRadio"value="no">不支持<br>
          <input type="radio" name="integratedMic" class="inputRadio"value="yes">支持
          <input type="radio" name="integratedMic" class="inputRadio"value="no">不支持<br>
          <input type="text" name="snRatio" class="inputText"placeholder="摄像头信噪比,单位：dB"><br>
          <input type="text" name="electronicShutterSpeed" class="inputText"placeholder="摄像头电子快门速度"><br>
          <input type="radio" name="autoGainControl" class="inputRadio"value="yes">支持
          <input type="radio" name="autoGainControl" class="inputRadio"value="no">不支持<br>
          <input type="radio" name="backLightCompensation" class="inputRadio"value="yes">支持
          <input type="radio" name="backLightCompensation" class="inputRadio"value="no">不支持<br>
          <input type="text" name="minIllumination" class="inputText"placeholder="摄像头最低照亮，单位：Lux/F"><br>
          <input type="text" name="wdr" class="inputText"placeholder="摄像头宽动态"><br>
          <input type="text" name="dnr" class="inputText"placeholder="摄像头数字降噪"><br>
          <input type="text" name="dayNight" class="inputText"placeholder="摄像头日夜切换"><br>
          <input type="text" name="inputVoltages" class="inputText"placeholder="摄像头输入电压，单位：V"><br>
          <input type="text" name="housingMasterial" class="inputText"placeholder="摄像头外壳材料"><br>
          <textarea name="caption" class="inputText"placeholder="摄像头相关文字描述、配置、备注等信息"></textarea>
          <input type="file" name="files" multiple class="inputText"/><br/>
          <input type="submit" value="   提交   "class="inputText">
        </form>
      </div>
    </div>

  </section>
</div>
<%@include file="../foot.html"%>
</body>
</html>
