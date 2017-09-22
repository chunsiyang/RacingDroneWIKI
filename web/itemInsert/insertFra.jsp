<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/20
  Time: 15:35
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
  <h2>机架信息录入</h2>
  <section id="infoTable">
    <div class="infoTableRow">
      <div class="name">
        <p>型号：</p>
        <p>主图片：</p>
        <p>参考价格：</p>
        <p>品牌：</p>
        <p>重量：</p>
        <P>轴距：</P>
        <P>飞控安装孔距：</P>
        <P>摄像头可调角度：</P>
        <P>主要材料：</P>
        <P>最大可用螺旋桨：</P>
        <P>下板厚度：</P>
        <P>顶板厚度：</P>
        <P>机臂厚度：</P>
        <p id="capP">文字描述：</p>
        <p>辅助图片：</p>
      </div>
      <div class="value">
        <form id="itemInfo" method="post" action="putIntoDB" enctype="multipart/form-data">
          <input type="text" name="model" class="inputText" placeholder="机架型号"><br>
          <input type="file" name="mainImg" class="inputText"><br>
          <input type="text" name="referencePrice" class="inputText" placeholder="机架参考价格"><br>
          <input type="text" name="anufacturer" class="inputText" placeholder="机架制造商、品牌"><br>
          <input type="text" name="weight" class="inputText" placeholder="机架净重，单位：g"><br>
          <input type="text" name="wheekbase" class="inputText" placeholder="机架轴距，单位：mm"><br>
          <input type="text" name="fcMountingHoleSpacing" class="inputText" placeholder="机架飞控安装孔距，单位：mm"><br>
          <input type="text" name="camraAdjustingAngle" class="inputText" placeholder="机架摄像头可调角度，单位：度"><br>
          <input type="text" name="material" class="inputText" placeholder="机架主要材料"><br>
          <input type="text" name="maximumSupportProp" class="inputText" placeholder="机架最大可用螺旋桨"><br>
          <input type="text" name="bottomThickness" class="inputText" placeholder="机架下板厚度，单位：mm"><br>
          <input type="text" name="roofThickness" class="inputText" placeholder="机架顶板厚度，单位：mm"><br>
          <input type="text" name="armThikness" class="inputText" placeholder="机架机臂厚度，单位：mm"><br>
          <textarea name="caption" placeholder="机架相关文字描述、配置、备注等信息"></textarea>
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
