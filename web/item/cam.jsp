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
    <img id="mainImg" src="img/${item.imgUrl}"/>
    <h2>${item.model}</h2>
    <p>品牌：${item.anufacturer}</p>
    <p>参考价格：${item.referencePrice}</p>
    <p>重量：${item.weight}g</p>
    <p>长度：${item.length}mm</p>
    <p>宽度：${item.width}mm</p>
    <p>厚度：${item.thickness}mm</p>
    <p>输入电压：${item.inputVoltages}V</p>
    <p>水平分辨率：${item.horizontalResolustion}</p>
    <p>结成OSD：<bTs:BoolToString bool="${item.integratedOsd}"/></p>
    <p>集成MIC：<bTs:BoolToString bool="${item.integratedMic}"/></p>
    <p>自动增益：<bTs:BoolToString bool="${item.autoGainControl}"/></p>
    <p>背光补偿：<bTs:BoolToString bool="${item.backLightCompensation}"/></p>
    <C:if test="${item.imageSensor}">
        <p>图像传感器：${item.imageSensor}</p>
    </C:if>
    <C:if test="${item.lensFov!=null}">
        <p>镜头视场：${item.lensFov}</p>
    </C:if>
    <C:if test="${item.signalSystem!=null}">
        <p>信号制式：${item.signalSystem}</p>
    </C:if>
    <C:if test="${item.snRatio!=null}">
        <p>信噪比：${item.snRatio}</p>
    </C:if>
    <C:if test="${item.electronicShutterSpeed!=null}">
        <p>电子快门速度：${item.electronicShutterSpeed}</p>
    </C:if>
    <C:if test="${item.minIllumination!=null}">
        <p>最低照度：${item.minIllumination}</p>
    </C:if>
    <C:if test="${item.wdr!=null}">
        <p>宽动态：${item.wdr}</p>
    </C:if>
    <C:if test="${item.dnr!=null}">
        <p>数字降噪：${item.dnr}</p>
    </C:if>
    <C:if test="${item.dayNight!=null}">
        <p>日夜切换：${item.dayNight}</p>
    </C:if>
    <C:if test="${item.housingMasterial!=null}">
        <p>外壳材料：${item.housingMasterial}</p>
    </C:if>
    <div id="other">
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
