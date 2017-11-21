<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
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
<section>
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
    <C:if test="${item.connector!=null&&item.connector!=''}">
        <p>插头类型：${item.connector}</p>
    </C:if>
    <C:if test="${item.wireNumber!=null&&item.wireNumber!=''}">
        <p>电源线号：${item.wireNumber}</p>
    </C:if>
    <C:if test="${item.wireLength!=0}">
        <p>电源线长度：${item.wireLength} mm</p>
    </C:if>
    <C:if test="${item.capacity!=0}">
        <p>容量：${item.capacity} mah</p>
    </C:if>
    <C:if test="${item.dischargeRate!=0}">
        <p>放电倍率：${item.dischargeRate} C</p>
    </C:if>
    <C:if test="${item.instantaneousDischargeRate!=0}">
        <p>瞬时放电倍率：${item.instantaneousDischargeRate} C</p>
    </C:if>
    <C:if test="${item.maxChargingRate!=0}">
        <P>最大充电倍率：${item.maxChargingRate} C</P>
    </C:if>
    <C:if test="${item.voltage!=0}">
        <p>电压：${item.voltage} V</p>
    </C:if>
    <C:if test="${item.recommendedChargingCurrent!=0}">
        <p>推荐充电电流：${item.recommendedChargingCurrent} A</p>
    </C:if>
    <C:if test="${item.maximumChargeCurrent!=0}">
        <p>最大充电电流：${item.maximumChargeCurrent} A</p>
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
