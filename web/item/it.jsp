<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="bTs" uri="http://RacingDroneWIKI.com" %>
<%--
  Created by IntelliJ IDEA.
  User: asus-pc
  Date: 2017/9/4
  Time: 17:02
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
    <C:if test="${item.length!=0}">
        <p>长度：${item.length} mm</p>
    </C:if>
    <C:if test="${item.width!=0}">
        <p>宽度：${item.width} mm</p>
    </C:if>
    <C:if test="${item.thickness!=0}">
        <p>厚度：${item.thickness} mm</p>
    </C:if>
    <C:if test="${item.sbus}">
        <p>SBUS支持：<bTs:BoolToString bool="${item.sbus}"/></p>
    </C:if>
    <C:if test="${item.audioSupport}">
        <p>音频支持：<bTs:BoolToString bool="${item.audioSupport}"/></p>
    </C:if>
    <C:if test="${item.integratedMic}">
        <p>内置收音器：<bTs:BoolToString bool="${item.integratedMic}"/></p>
    </C:if>
    <C:if test="${item.powerAdjustable}">
        <p>功率可调：<bTs:BoolToString bool="${item.powerAdjustable}"/></p>
    </C:if>
    <C:if test="${item.frequencyQuantity!=null}">
        <p>频道数：${item.frequencyQuantity} CH</p>
    </C:if>
    <C:if test="${item.outputPower!=null}">
        <p>输出功率：${item.outputPower} mW</p>
    </C:if>
    <C:if test="${item.inputVoltage!=null}">
        <p>输入电压：${item.inputVoltage} V</p>
    </C:if>
    <C:if test="${item.outputVoltage!=null}">
        <p>输出电压：${item.outputVoltage} V</p>
    </C:if>
    <C:if test="${item.antennaConnectors!=null}">
        <p>天线接头：${item.antennaConnectors}</p>
    </C:if>
    <C:if test="${item.videoBandWidth!=null}">
        <p>视频带宽：${item.videoBandWidth} MHz</p>
    </C:if>
    <C:if test="${item.audioCarrierFrequency!=null}">
        <P>音频带宽：${item.audioCarrierFrequency} MHz</P>
    </C:if>
    <C:if test="${item.videoInputLevel!=null}">
        <p>视频输入电平：${item.videoInputLevel} Vp-p</p>
    </C:if>
    <C:if test="${item.audioInputLevel!=null}">
        <p>音频输入水平：${item.audioInputLevel} Vp-p</p>
    </C:if>
    <C:if test="${item.audioInputImpedance!=null}">
        <p>音频输入阻抗：${item.audioInputImpedance} Ohm</p>
    </C:if>
    <C:if test="${item.cam!=null}">
        <h4>内置摄像头：</h4>
        <C:if test="${item.cam.weight!=0}">
            <p>重量：${item.cam.weight} g</p>
        </C:if>
        <C:if test="${item.cam.length!=0}">
            <p>长度：${item.cam.length} mm</p>
        </C:if>
        <C:if test="${item.cam.width!=0}">
            <p>宽度：${item.cam.width} mm</p>
        </C:if>
        <C:if test="${item.cam.thickness!=0}">
            <p>厚度：${item.cam.thickness} mm</p>
        </C:if>
        <C:if test="${item.cam.inputVoltages!=null}">
            <p>输入电压：${item.cam.inputVoltages} V</p>
        </C:if>
        <C:if test="${item.cam.horizontalResolustion!=null}">
            <p>水平分辨率：${item.cam.horizontalResolustion} TVL</p>
        </C:if>
        <C:if test="${item.cam.integratedOsd}">
            <p>结成OSD：<bTs:BoolToString bool="${item.cam.integratedOsd}"/></p>
        </C:if>
        <C:if test="${item.cam.integratedMic}">
            <p>集成MIC：<bTs:BoolToString bool="${item.cam.integratedMic}"/></p>
        </C:if>
        <C:if test="${item.cam.autoGainControl}">
            <p>自动增益：<bTs:BoolToString bool="${item.cam.autoGainControl}"/></p>
        </C:if>
        <C:if test="${item.cam.backLightCompensation}">
            <p>背光补偿：<bTs:BoolToString bool="${item.cam.backLightCompensation}"/></p>
        </C:if>
        <C:if test="${item.cam.imageSensor}">
            <p>图像传感器：${item.cam.imageSensor}</p>
        </C:if>
        <C:if test="${item.cam.lensFov!=null}">
            <p>镜头视场：${item.cam.lensFov} °</p>
        </C:if>
        <C:if test="${item.cam.signalSystem!=null}">
            <p>信号制式：${item.cam.signalSystem}</p>
        </C:if>
        <C:if test="${item.cam.snRatio!=null}">
            <p>信噪比：${item.cam.snRatio} dB</p>
        </C:if>
        <C:if test="${item.cam.electronicShutterSpeed!=null}">
            <p>电子快门速度：${item.cam.electronicShutterSpeed}</p>
        </C:if>
        <C:if test="${item.cam.minIllumination!=null}">
            <p>最低照度：${item.cam.minIllumination} Lux/F</p>
        </C:if>
        <C:if test="${item.cam.wdr!=null}">
            <p>宽动态：${item.cam.wdr}</p>
        </C:if>
        <C:if test="${item.cam.dnr!=null}">
            <p>数字降噪：${item.cam.dnr}</p>
        </C:if>
        <C:if test="${item.cam.dayNight!=null}">
            <p>日夜切换：${item.cam.dayNight}</p>
        </C:if>
        <C:if test="${item.cam.housingMasterial!=null}">
            <p>外壳材料：${item.cam.housingMasterial}</p>
        </C:if>
    </C:if>
    <br>
    <div id="other">
        <C:if test="${item.pinDefinitionDiagram!=null}">
            <h4>引脚定义图：</h4>
            <div class="expImgDiv">
                <img class="expImg" src="img/${item.pinDefinitionDiagram}"/>
            </div>
        </C:if>
        <C:if test="${item.frequencyTable!=null}">
            <h4>频率表：</h4>
            <div class="expImgDiv">
                <img class="expImg" src="img/${item.frequencyTable}"/>
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
