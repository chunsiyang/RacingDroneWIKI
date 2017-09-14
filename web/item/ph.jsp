<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="bTs" uri="http://RacingDroneWIKI.com" %>
<%--
  Created by IntelliJ IDEA.
  User: asus-pc
  Date: 2017/9/4
  Time: 17:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <link type="text/css" rel="stylesheet" href="/headNav.css">
    <link type="text/css" rel="stylesheet" href="/item/item.css">
    <title>竞速无人机资料库</title>
</head>
<body>
<jsp:include page="/headNav.jsp">
    <jsp:param name="searchModel" value="${param.searchModel}"/>
</jsp:include>
<section id="main">
    <img id="mainImg" src="img/${item.imgUrl}"/>
    <h2>${item.model}</h2>
    <p>品牌：${item.anufacturer}</p>
    <p>参考价格：${item.referencePrice}</p>
    <p>重量：${item.weight} g</p>
    <p>长度：${item.length} mm</p>
    <p>宽度：${item.width} mm</p>
    <p>厚度：${item.thickness} mm</p>
    <p>安装孔间距：${item.mountingHoleSpacing} mm</p>
    <p>5V BEC供电：<bTs:BoolToString bool="${item.bec5v}"/></p>
    <p>9V BEC供电：<bTs:BoolToString bool="${item.bec9v}"/></p>
    <p>12V BEC供电：<bTs:BoolToString bool="${item.bec12v}"/></p>
    <p>最大电流：${item.maxCurrent} A</p>
    <br>
    <div id="other">
        <C:if test="${item.pinDefinitionDiagram!=null}">
            <h4>引脚定义图：</h4>
            <div class="expImgDiv">
                <img class="expImg" src="img/${item.pinDefinitionDiagram}"/>
            </div>
        </C:if>
        <p>${item.caption}</p>
        <C:if test="${item.extraPictures!=null}">
            <br>
            <C:forEach items="${item.extraPictures}" var="expic">
                <div class="expImgDiv">
                    <img class="expImg" src="img/${expic}"/>
                </div>
            </C:forEach>
        </C:if>
        <br>
    </div>
</section>
<%@include file="../foot.html" %>
</body>
</html>
