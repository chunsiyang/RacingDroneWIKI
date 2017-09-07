<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="bTs" uri="http://RacingDroneWIKI.com" %>
<%--
  Created by IntelliJ IDEA.
  User: asus-pc
  Date: 2017/9/4
  Time: 17:00
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
    <jsp:param name="model" value="${param.model}"/>
</jsp:include>
<section id="main">
    <img id="mainImg" src="img/${item.imgUrl}"/>
    <h2>${item.model}</h2>
    <p>品牌：${item.anufacturer}</p>
    <p>参考价格：${item.referencePrice}</p>
    <p>重量：${item.weight}g</p>
    <p>长度：${item.length}mm</p>
    <p>宽度：${item.width}mm</p>
    <p>厚度：${item.thickness}mm</p>
    <p>支持锂电池电芯片数：${item.noOfCells}S</p>
    <p>持续工作电流：${item.persistentCurrent}A</p>
    <p>瞬时工作电流：${item.instantaneousCurrent}A</p>
    <p>固件：${item.firmware}</p>
    <p>主控制芯片：${item.controlChip}</p>
    <p>四合一集成电调：<bTs:BoolToString bool="${item.fourInone}"/></p>
    <p>PWM输入模式：<bTs:BoolToString bool="${item.pwmMode}"/></p>
    <p>oneshot125输入模式：<bTs:BoolToString bool="${item.oneshot125}"/></p>
    <p>oneshot42输入模式：<bTs:BoolToString bool="${item.oneshot42}"/></p>
    <p>mutishot输入模式：<bTs:BoolToString bool="${item.mutishot}"/></p>
    <p>dshot输入模式：<bTs:BoolToString bool="${item.dshot}"/></p>
    <br>
    <section id="other">
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
    </section>
</section>
<%@include file="../foot.html" %>
</body>
</html>
