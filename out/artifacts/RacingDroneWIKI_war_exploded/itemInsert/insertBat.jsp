<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2017/9/19
  Time: 19:01
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
    <h2>电池信息录入</h2>
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
                <p>容量：</p>
                <p>放电倍率：</p>
                <p>电压：</p>
                <p>瞬时放电倍率：</p>
                <P>最大充电倍率：</P>
                <p>推荐充电电流：</p>
                <p>最大充电电流：</p>
                <p>电源线号：</p>
                <p>电源线长度：</p>
                <p>插头类型：</p>
                <p id="capP">文字描述：</p>
                <p>辅助图片：</p>
            </div>
            <div class="value">
                <form id="itemInfo" method="post" action="/itemInsert/InsertBat"  enctype="multipart/form-data">
                    <input type="text" name="model" placeholder="电池型号"class="inputText"><br>
                    <input type="file" name="mainImg"class="inputText"><br>
                    <input type="text" name="referencePrice" class="inputText"placeholder="电池参考价格"><br>
                    <input type="text" name="anufacturer" class="inputText"placeholder="电池制造商、品牌"><br>
                    <input type="text" name="weight" class="inputText"placeholder="电池净重，单位：g"><br>
                    <input type="text" name="length" class="inputText"placeholder="电池长度，单位：mm"><br>
                    <input type="text" name="width" class="inputText"placeholder="电池宽度，单位：mm"><br>
                    <input type="text" name="thickness" class="inputText"placeholder="电池厚度，单位：mm"><br>
                    <input type="text" name="capacity" class="inputText"placeholder="电池容量，单位：mah"><br>
                    <input type="text" name="dischargeRate" class="inputText"placeholder="放电倍率，单位：C"><br>
                    <input type="text" name="voltage" class="inputText"placeholder="电压，单位：V"><br>
                    <input type="text" name="instantaneousDischargeRate" class="inputText"placeholder="瞬时放电倍率，单位：C"><br>
                    <input type="text" name="maxChargingRate" class="inputText"placeholder="最大充电倍率，单位：C"><br>
                    <input type="text" name="recommendedChargingCurrent" class="inputText"placeholder="推荐充电电流,单位：A"><br>
                    <input type="text" name="maximumChargeCurrent" class="inputText"placeholder="最大充电电流，单位：A"><br>
                    <input type="text" name="wireNumber" class="inputText"placeholder="电源线号"><br>
                    <input type="text" name="wireLength" class="inputText"placeholder="电源线长度，单位：mm"><br>
                    <input type="text" name="connector" class="inputText"placeholder="插头类型"><br>
                    <textarea name="caption" class="inputText"placeholder="电池相关文字描述、配置、备注等信息"></textarea>
                    <input type="file" name="files" multiple class="inputText"/><br/>
                    <input type="submit" value="   提交   "class="inputText"/>
                </form>
            </div>
        </div>

    </section>
</div>
<%@include file="../foot.html"%>
</body>
</html>
