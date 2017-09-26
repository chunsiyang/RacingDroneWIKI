<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="bTs" uri="http://RacingDroneWIKI.com" %>
<%--
  Created by IntelliJ IDEA.
  User: asus-pc
  Date: 2017/9/4
  Time: 17:01
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
    <C:if test="${item.wheekbase!=null}">
        <p>轴距：${item.wheekbase} mm</p>
    </C:if>
    <C:if test="${item.fcMountingHoleSpacing!=null}">
        <p>飞控安装孔距：${item.fcMountingHoleSpacing} mm</p>
    </C:if>
    <C:if test="${item.camraAdjustingAngle!=null}">
        <p>摄像头可调角度：${item.camraAdjustingAngle} °</p>
    </C:if>
    <C:if test="${item.material!=null}">
        <p>主要材料：${item.material}</p>
    </C:if>
    <C:if test="${item.maximumSupportProp!=null}">
        <p>最大可用螺旋桨：${item.maximumSupportProp} 寸</p>
    </C:if>
    <C:if test="${item.bottomThickness!=null}">
        <p>下板厚度：${item.bottomThickness} mm</p>
    </C:if>
    <C:if test="${item.roofThickness!=null}">
        <p>顶板厚度：${item.roofThickness} mm</p>
    </C:if>
    <C:if test="${item.armThickness!=null}">
        <p>机臂厚度：${item.armThickness} mm</p>
    </C:if>
    <C:if test="${item.integratedPh!=null}">
        <h4>内置分电板：</h4>
        <C:if test="${item.integratedPh.weight!=0}">
            <p>重量：${item.integratedPh.weight} g</p>
        </C:if>
        <C:if test="${item.integratedPh.length!=0}">
            <p>长度：${item.integratedPh.length} mm</p>
        </C:if>
        <C:if test="${item.integratedPh.width!=0}">
            <p>宽度：${item.integratedPh.width} mm</p>
        </C:if>
        <C:if test="${item.integratedPh.thickness!=0}">
            <p>厚度：${item.integratedPh.thickness} mm</p>
        </C:if>
        <C:if test="${item.integratedPh.mountingHoleSpacing!=0}">
            <p>安装孔间距：${item.integratedPh.mountingHoleSpacing} mm</p>
        </C:if>
        <C:if test="${item.integratedPh.maxCurrent!=0}">
            <<p>最大电流：${item.integratedPh.maxCurrent} A</p>
        </C:if>
        <C:if test="${item.integratedPh.bec5v}">
            <p>5V BEC供电：<bTs:BoolToString bool="${item.integratedPh.bec5v}"/></p>
        </C:if>
        <C:if test="${item.integratedPh.bec9v}">
            <p>9V BEC供电：<bTs:BoolToString bool="${item.integratedPh.bec9v}"/></p>
        </C:if>
        <C:if test="${item.integratedPh.bec12v}">
            <p>12V BEC供电：<bTs:BoolToString bool="${item.integratedPh.bec12v}"/></p>
        </C:if>
        <C:if test="${item.integratedPh.pinDefinitionDiagram!=null}">
            <h4>引脚定义图：</h4>
            <div class="expImgDiv">
                <img class="expImg" src="img/${item.integratedPh.pinDefinitionDiagram}"/>
            </div>
        </C:if>
        <C:if test="${item.integratedPh.extraPictures!=null}">
            <br>
            <C:forEach items="${item.integratedPh.extraPictures}" var="expic">
                <div class="expImgDiv">
                    <img class="expImg" src="img/${expic}"/>
                </div>
            </C:forEach>
        </C:if>
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
