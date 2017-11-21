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
    <jsp:param name="searchModel" value="${param.searchModel}"/>
</jsp:include>
<section id="main">
    <img id="mainImg" src="/img/${item.imgUrl}"/>
    <h2>${item.model}</h2>
    <p>品牌：${item.anufacturer}</p>
    <p>参考价格：${item.referencePrice}</p>
    <p>重量：${item.weight} g</p>
    <C:if test="${item.length!=0}">
        <p>长度：${item.length} mm</p>
    </C:if>
    <C:if test="${item.width!=0}">
        <p>宽度：${item.width} mm</p>
    </C:if>
    <C:if test="${item.thickness!=0}">
        <p>厚度：${item.thickness} mm</p>
    </C:if>
    <C:if test="${item.noOfCells!=null&&item.noOfCells!=''}">
        <p>支持锂电池电芯片数：${item.noOfCells} S</p>
    </C:if>
    <C:if test="${item.persistentCurrent!=null&&item.persistentCurrent!=''}">
        <p>持续工作电流：${item.persistentCurrent} A</p>
    </C:if>
    <C:if test="${item.instantaneousCurrent!=null&&item.instantaneousCurrent!=''}">
        <p>瞬时工作电流：${item.instantaneousCurrent} A</p>
    </C:if>
    <C:if test="${item.firmware!=null||item.firmware!=''}">
        <p>固件：${item.firmware}</p>
    </C:if>
    <C:if test="${item.controlChip!=null||item.controlChip!=''}">
        <p>主控制芯片：${item.controlChip}</p>
    </C:if>
    <C:if test="${item.fourInone}">
        <p>四合一集成电调：<bTs:BoolToString bool="${item.fourInone}"/></p>
    </C:if>
    <C:if test="${item.pwmMode}">
        <p>PWM输入模式：<bTs:BoolToString bool="${item.pwmMode}"/></p>
    </C:if>
    <C:if test="${item.oneshot125}">
        <p>oneshot125输入模式：<bTs:BoolToString bool="${item.oneshot125}"/></p>
    </C:if>
    <C:if test="${item.oneshot42}">
        <p>oneshot42输入模式：<bTs:BoolToString bool="${item.oneshot42}"/></p>
    </C:if>
    <C:if test="${item.mutishot}">
        <p>mutishot输入模式：<bTs:BoolToString bool="${item.mutishot}"/></p>
    </C:if>
    <C:if test="${item.dshot}">
        <p>dshot输入模式：<bTs:BoolToString bool="${item.dshot}"/></p>
    </C:if>
    <br>
    <div id="other">
        <p>${item.caption}</p>
        <C:if test="${item.extraPictures!=null}">
            <br>
            <C:forEach items="${item.extraPictures}" var="expic">
                <div class="expImgDiv">
                    <img class="expImg" src="/img/${expic}"/>
                </div>
            </C:forEach>
        </C:if>
        <br>
    </div>
</section>
<%@include file="../foot.html" %>
</body>
</html>
