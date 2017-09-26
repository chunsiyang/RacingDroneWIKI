<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/19
  Time: 20:30
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
  <h2>桨叶信息录入</h2>
  <section id="infoTable">
    <div class="infoTableRow">
      <div class="name">
        <p>型号：</p>
        <p>主图片：</p>
        <p>参考价格：</p>
        <p>品牌：</p>
        <p>重量：</p>
        <P>叶片数：</P>
        <p>尺寸：</p>
        <p>安装孔距：</p>
        <p>材料：</p>
        <p id="capP">文字描述：</p>
        <p>辅助图片：</p>
      </div>
      <div class="value">
        <form id="itemInfo" method="post" action="/itemInsert/InsertProp" enctype="multipart/form-data">
          <input type="text" name="model" class="inputText"placeholder="桨叶型号"><br>
          <input type="file" name="mainImg"class="inputText"><br>
          <input type="text" name="referencePrice" class="inputText"placeholder="桨叶参考价格"><br>
          <input type="text" name="anufacturer" class="inputText"placeholder="桨叶制造商、品牌"><br>
          <input type="text" name="weight" class="inputText"placeholder="桨叶净重，单位：g"><br>
          <input type="text" name="bladeNumber" class="inputText"placeholder="叶片数量"><br>
          <input type="text" name="size" class="inputText"placeholder="叶片尺寸,exp：5*4*3（5040桨叶）"><br>
          <input type="text" name="mountingHoleSpacing" class="inputText"placeholder="桨叶安装间距,单位：mm"><br>
          <input type="text" name="material" class="inputText"placeholder="桨叶材料"><br>
          <textarea name="caption" class="inputText"placeholder="桨叶相关文字描述、配置、备注等信息"></textarea>
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
