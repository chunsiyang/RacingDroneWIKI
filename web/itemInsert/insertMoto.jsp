<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/20
  Time: 18:43
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
  <h2>电机信息录入</h2>
  <section id="infoTable">
    <div class="infoTableRow">
      <div class="name">
        <p>型号：</p>
        <p>主图片：</p>
        <p>参考价格：</p>
        <p>品牌：</p>
        <p>重量：</p>
        <P>长度：</P>
        <p>定子长度：</p>
        <p>轴径：</p>
        <p>空载电流：</p>
        <p>直径：</p>
        <p>支持锂电池节数：</p>
        <p>最大推力：</p>
        <p>KV值：</p>
        <p>支持螺旋桨：</p>
        <p>定子直径：</p>
        <p>内阻：</p>
        <p id="capP">文字描述：</p>
        <p>辅助图片：</p>
      </div>
      <div class="value">
        <form id="itemInfo" method="post" action="putIntoDB" enctype="multipart/form-data">
          <input type="text" name="model" placeholder="电机型号"class="inputText"><br>
          <input type="file" name="mainImg"class="inputText"><br>
          <input type="text" name="referencePrice" class="inputText"placeholder="电机参考价格"><br>
          <input type="text" name="anufacturer" class="inputText"placeholder="电机制造商、品牌"><br>
          <input type="text" name="weight" class="inputText"placeholder="电机净重，单位：g"><br>
          <input type="text" name="length" class="inputText"placeholder="电机长度，单位：mm"><br>
          <input type="text" name="statorLength" class="inputText"placeholder="电机定子长度，单位：mm"><br>
          <input type="text" name="shaftDiameter" class="inputText"placeholder="电机轴径，单位：mm"><br>
          <input type="text" name="idleCurrent" class="inputText"placeholder="电机空载电流，单位：A"><br>
          <input type="text" name="diameter" class="inputText"placeholder="电机直径，单位：mm"><br>
          <input type="text" name="noOfCells" class="inputText"placeholder="电机支持锂电池节数，单位：S"><br>
          <input type="text" name="maxThrust" class="inputText"placeholder="电机最大推力，单位：g"><br>
          <input type="text" name="kv" class="inputText"placeholder="电机KV值，单位：kv"><br>
          <input type="text" name="propeller" class="inputText"placeholder="电机支持螺旋桨，单位：寸"><br>
          <input type="text" name="statorDiameter" class="inputText"placeholder="电机定子直径，单位：mm"><br>
          <input type="text" name="internalRestance" class="inputText"placeholder="电机内阻，单位：Ω"><br>
          <textarea name="caption" class="inputText"placeholder="电机相关文字描述、配置、备注等信息"></textarea>
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
