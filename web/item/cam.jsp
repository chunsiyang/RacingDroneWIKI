<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="bTs" uri="http://RacingDroneWIKI.com" %>
<%--
  Created by IntelliJ IDEA.
  User: asus-pc
  Date: 2017/9/4
  Time: 17:03
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
    <C:if test="${item.inputVoltages!=null&&item.inputVoltages!=''}">
        <p>输入电压：${item.inputVoltages} V</p>
    </C:if>
    <C:if test="${item.horizontalResolustion!=null&&item.horizontalResolustion!=''}">
        <p>水平分辨率：${item.horizontalResolustion} TVL</p>
    </C:if>
    <C:if test="${item.integratedOsd}">
        <p>结成OSD：<bTs:BoolToString bool="${item.integratedOsd}"/></p>
    </C:if>
    <C:if test="${item.integratedMic}">
        <p>集成MIC：<bTs:BoolToString bool="${item.integratedMic}"/></p>
    </C:if>
    <C:if test="${item.autoGainControl}">
        <p>自动增益：<bTs:BoolToString bool="${item.autoGainControl}"/></p>
    </C:if>
    <C:if test="${item.backLightCompensation}">
        <p>背光补偿：<bTs:BoolToString bool="${item.backLightCompensation}"/></p>
    </C:if>
    <C:if test="${item.imageSensor!=null&&item.imageSensor!=''}">
        <p>图像传感器：${item.imageSensor}</p>
    </C:if>
    <C:if test="${item.lensFov!=null&&item.lensFov!=''}">
        <p>镜头视场：${item.lensFov}</p>
    </C:if>
    <C:if test="${item.signalSystem!=null&&item.signalSystem!=''}">
        <p>信号制式：${item.signalSystem}</p>
    </C:if>
    <C:if test="${item.snRatio!=null&&item.snRatio!=''}">
        <p>信噪比：${item.snRatio} dB</p>
    </C:if>
    <C:if test="${item.electronicShutterSpeed!=null&&item.electronicShutterSpeed!=''}">
        <p>电子快门速度：${item.electronicShutterSpeed}</p>
    </C:if>
    <C:if test="${item.minIllumination!=null&&item.minIllumination!=''}">
        <p>最低照度：${item.minIllumination} Lux/F</p>
    </C:if>
    <C:if test="${item.wdr!=null&&item.wdr!=''}">
        <p>宽动态：${item.wdr}</p>
    </C:if>
    <C:if test="${item.dnr!=null&&item.dnr!=''}">
        <p>数字降噪：${item.dnr}</p>
    </C:if>
    <C:if test="${item.dayNight!=null&&item.dayNight!=''}">
        <p>日夜切换：${item.dayNight}</p>
    </C:if>
    <C:if test="${item.housingMasterial!=null&&item.housingMasterial!=''}">
        <p>外壳材料：${item.housingMasterial}</p>
    </C:if>
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
