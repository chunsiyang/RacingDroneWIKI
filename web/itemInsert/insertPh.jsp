<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/19
  Time: 20:52
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
  <h2>分电板信息录入</h2>
  <section id="infoTable">
    <div class="infoTableRow">
      <div class="name">
        <p>型号：</p>
        <p>主图片：</p>
        <p>参考价格：</p>
        <p>品牌：</p>
        <p>重量：</p>
        <p>安装孔距：</p>
        <P>长度：</P>
        <p>宽度：</p>
        <p>厚度：</p>
        <p>5V供电：</p>
        <p>9V供电：</p>
        <p>12V供电：</p>
        <p>最大电流：</p>
        <p>引脚定义图：</p>
        <p id="capP">文字描述：</p>
        <p>辅助图片：</p>
      </div>
      <div class="value">
        <form id="itemInfo" method="post" action="putIntoDB" enctype="multipart/form-data">
          <input type="text" name="model" class="inputText" placeholder="分电板型号"><br>
          <input type="file" name="mainImg" class="inputText"><br>
          <input type="text" name="referencePrice" class="inputText" placeholder="分电板参考价格"><br>
          <input type="text" name="anufacturer" class="inputText" placeholder="分电板制造商、品牌"><br>
          <input type="text" name="weight" class="inputText" placeholder="分电板净重，单位：g"><br>
          <input type="text" name="thickness" class="inputText" placeholder="分电板安装孔间距，单位：mm"><br>
          <input type="text" name="length" class="inputText" placeholder="分电板长度，单位：mm"><br>
          <input type="text" name="width" class="inputText" placeholder="分电板宽度，单位：mm"><br>
          <input type="text" name="thickness" class="inputText" placeholder="分电板厚度，单位：mm"><br>
          <input type="radio" name="bec5v" class="inputRadio" value="yes">支持
          <input type="radio" name="bec5v" class="inputRadio" value="no">不支持<br>
          <input type="radio" name="bec9v" class="inputRadio" value="yes">支持
          <input type="radio" name="bec9v" class="inputRadio" value="no">不支持<br>
          <input type="radio" name="bec12v" class="inputRadio" value="yes">支持
          <input type="radio" name="bec12v" class="inputRadio" value="no">不支持<br>
          <input type="text" name="maxCurrent" class="inputText" placeholder="最大电流,单位：V"><br>
          <input type="file" name="pinDefinitionDiagram"class="inputText"><br>
          <textarea name="caption" placeholder="桨叶相关文字描述、配置、备注等信息"></textarea>
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

