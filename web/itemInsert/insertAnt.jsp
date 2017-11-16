<%--
  Created by IntelliJ IDEA.
  User: asus-pc
  Date: 2017/9/14
  Time: 13:10
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
    <h2>天线信息录入</h2>
    <section id="infoTable">
        <div class="infoTableRow">
            <div class="name">
                <p>型号：</p>
                <p>主图片：</p>
                <p>参考价格：</p>
                <p>品牌：</p>
                <p>重量：</p>
                <p>长度：</p>
                <p>天线插头：</p>
                <p>天线频率：</p>
                <p>增益：</p>
                <p>轴比：</p>
                <p>极化方式：</p>
                <p id="capP">文字描述：</p>
                <p>辅助图片：</p>
            </div>
            <div class="value">
                <form id="itemInfo" method="post" action="/itemInsert/InsertAnt"  enctype="multipart/form-data">
                    <input type="text" name="model"class="inputText" placeholder="天线型号"><br>
                    <input type="file" name="mainImg"class="inputText"><br>
                    <input type="text" name="referencePrice" class="inputText" placeholder="天线参考价格"><br>
                    <input type="text" name="anufacturer" class="inputText" placeholder="天线制造商、品牌"><br>
                    <input type="text" name="weight" class="inputText" placeholder="天线净重，单位：g"><br>
                    <input type="text" name="length" class="inputText" placeholder="天线长度，单位：mm"><br>
                    <input type="text" name="connectors" class="inputText" placeholder="天线接头类型RP-SMA(内螺纹内孔)SMA(内螺纹内针)"><br>
                    <input type="text" name="frequency" class="inputText" placeholder="天线频率 exp：5600-5900，单位：Hz"><br>
                    <input type="text" name="gain" class="inputText" placeholder="天线增益"><br>
                    <input type="text" name="axialRatic" class="inputText" placeholder="天线轴比"><br>
                    <input type="text" name="polarization" class="inputText" placeholder="天线极化方式RHCP(右旋极化)LHCP(左旋极化)"><br>
                    <textarea name="caption" class="inputText" placeholder="天线相关文字描述、配置、备注等信息"></textarea>
                    <input type="file" name="files" multiple class="inputText"/><br/>
                    <input type="submit" value="   提交   " class="inputText">
                </form>
            </div>
        </div>

    </section>
</div>
<%@include file="../foot.html"%>
</body>
</html>