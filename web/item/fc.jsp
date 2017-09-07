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
    <p>安装孔间距：${item.mountingHoleSpacing}mm</p>
    <p>SD卡支持：<bTs:BoolToString bool="${item.sdcard}"/></p>
    <p>BOOT按键：<bTs:BoolToString bool="${item.bootButton}"/></p>
    <p>内置OSD：<bTs:BoolToString bool="${item.osd}"/></p>
    <p>内置蜂鸣器：<bTs:BoolToString bool="${item.buzzer}"/></p>
    <C:if test="${item.mcu!=null}">
        <p>mcu：${item.mcu}</p>
    </C:if>
    <C:if test="${item.mpu!=null}">
        <p>mpu：${item.mpu}</p>
    </C:if>
    <C:if test="${item.maxPidLoopFrequancy!=0}">
        <p>最大PID刷新率：${item.maxPidLoopFrequancy}Khz</p>
    </C:if>
    <C:if test="${item.maxGyroUpdata!=0}">
        <p>最大陀螺仪刷新率：${item.maxGyroUpdata}Khz</p>
    </C:if>
    <!--内置分电板!-->
    <C:if test="${item.powerHub!=null}">
        <h4>内置分电板：</h4>
        <C:if test="${item.powerHub.weight!=0}">
            <p>重量：${item.powerHub.weight}g</p>
        </C:if>
        <C:if test="${item.powerHub.length!=0}">
            <p>长度：${item.powerHub.length}mm</p>
        </C:if>
        <C:if test="${item.powerHub.width!=0}">
            <p>宽度：${item.powerHub.width}mm</p>
        </C:if>
        <C:if test="${item.powerHub.thickness!=0}">
            <p>厚度：${item.powerHub.thickness}mm</p>
        </C:if>
        <C:if test="${item.powerHub.mountingHoleSpacing!=0}">
            <p>安装孔间距：${item.powerHub.mountingHoleSpacing}mm</p>
        </C:if>
        <C:if test="${item.powerHub.maxCurrent!=0}">
            <<p>最大电流：${item.powerHub.maxCurrent}A</p>
        </C:if>
        <C:if test="${item.powerHub.bec5v}">
            <p>5V BEC供电：<bTs:BoolToString bool="${item.powerHub.bec5v}"/></p>
        </C:if>
        <C:if test="${item.powerHub.bec9v}">
            <p>9V BEC供电：<bTs:BoolToString bool="${item.powerHub.bec9v}"/></p>
        </C:if>
        <C:if test="${item.powerHub.bec12v}">
            <p>12V BEC供电：<bTs:BoolToString bool="${item.powerHub.bec12v}"/></p>
        </C:if>
    </C:if>
    <!--内置电调!-->
    <C:if test="${item.esc!=null}">
        <h4>内置电调</h4>
        <C:if test="${item.esc.weight!=0}">
            <p>重量：${item.esc.weight}g</p>
        </C:if>
        <C:if test="${item.esc.length!=0}">
            <p>长度：${item.esc.length}mm</p>
        </C:if>
        <C:if test="${item.esc.width!=0}">
            <p>宽度：${item.esc.width}mm</p>
        </C:if>
        <C:if test="${item.esc.thickness!=0}">
            <p>厚度：${item.esc.thickness}mm</p>
        </C:if>
        <C:if test="${item.esc.noOfCells!=null}">
            <p>支持锂电池电芯片数：${item.esc.noOfCells}S</p>
        </C:if>
        <C:if test="${item.esc.persistentCurrent!=null}">
            <p>持续工作电流：${item.esc.persistentCurrent}A</p>
        </C:if>
        <C:if test="${item.esc.instantaneousCurrent!=null}">
            <p>瞬时工作电流：${item.esc.instantaneousCurrent}A</p>
        </C:if>
        <C:if test="${item.esc.firmware!=null}">
            <p>固件：${item.esc.firmware}</p>
        </C:if>
        <C:if test="${item.esc.controlChip!=null}">
            <p>主控制芯片：${item.esc.controlChip}</p>
        </C:if>
        <C:if test="${item.esc.fourInone!=null}">
            <p>四合一集成电调：<bTs:BoolToString bool="${item.esc.fourInone}"/></p>
        </C:if>
        <C:if test="${item.esc.pwmMode!=null}">
            <p>PWM输入模式：<bTs:BoolToString bool="${item.esc.pwmMode}"/></p>
        </C:if>
        <C:if test="${item.esc.oneshot125!=null}">
            <p>oneshot125输入模式：<bTs:BoolToString bool="${item.esc.oneshot125}"/></p>
        </C:if>
        <C:if test="${item.esc.oneshot42!=null}">
            <p>oneshot42输入模式：<bTs:BoolToString bool="${item.esc.oneshot42}"/></p>
        </C:if>
        <C:if test="${item.esc.mutishot!=null}">
            <p>mutishot输入模式：<bTs:BoolToString bool="${item.esc.mutishot}"/></p>
        </C:if>
        <C:if test="${item.esc.dshot!=null}">
            <p>dshot输入模式：<bTs:BoolToString bool="${item.esc.dshot}"/></p>
        </C:if>
    </C:if>
    <!--内置图传!-->
    <C:if test="${item.imageTransmission!=null}">
        <h4>内置图传</h4>
        <C:if test="${item.imageTransmission.weight!=0}">
            <p>重量：${item.imageTransmission.weight}g</p>
        </C:if>
        <C:if test="${item.imageTransmission.length!=0}">
            <p>长度：${item.imageTransmission.length}mm</p>
        </C:if>
        <C:if test="${item.imageTransmission.width!=0}">
            <p>宽度：${item.imageTransmission.width}mm</p>
        </C:if>
        <C:if test="${item.imageTransmission.thickness!=0}">
            <p>厚度：${item.imageTransmission.thickness}mm</p>
        </C:if>
        <C:if test="${item.imageTransmission.sbus!=null}">
            <p>SBUS支持：<bTs:BoolToString bool="${item.imageTransmission.sbus}"/></p>
        </C:if>
        <C:if test="${item.imageTransmission.audioSupport!=null}">
            <p>音频支持：<bTs:BoolToString bool="${item.imageTransmission.audioSupport}"/></p>
        </C:if>
        <C:if test="${item.imageTransmission.integratedMic!=null}">
            <p>内置收音器：<bTs:BoolToString bool="${item.imageTransmission.integratedMic}"/></p>
        </C:if>
        <C:if test="${item.imageTransmission.powerAdjustable!=null}">
            <p>功率可调：<bTs:BoolToString bool="${item.imageTransmission.powerAdjustable}"/></p>
        </C:if>
        <C:if test="${item.imageTransmission.frequencyQuantity!=null}">
            <p>频道数：${item.imageTransmission.frequencyQuantity}</p>
        </C:if>
        <C:if test="${item.imageTransmission.outputPower!=null}">
            <p>输出功率：${item.imageTransmission.outputPower}mW</p>
        </C:if>
        <C:if test="${item.imageTransmission.inputVoltage!=null}">
            <p>输入电压：${item.imageTransmission.inputVoltage}V</p>
        </C:if>
        <C:if test="${item.imageTransmission.outputVoltage!=null}">
            <p>输出电压：${item.imageTransmission.outputVoltage}V</p>
        </C:if>
        <C:if test="${item.imageTransmission.antennaConnectors!=null}">
            <p>天线接头：${item.imageTransmission.antennaConnectors}</p>
        </C:if>
        <C:if test="${item.imageTransmission.videoBandWidth!=null}">
            <p>视频带宽：${item.imageTransmission.videoBandWidth}MHz</p>
        </C:if>
        <C:if test="${item.imageTransmission.audioCarrierFrequency!=null}">
            <P>音频带宽：${item.imageTransmission.audioCarrierFrequency}MHz</P>
        </C:if>
        <C:if test="${item.imageTransmission.videoInputLevel!=null}">
            <p>视频输入电平：${item.imageTransmission.videoInputLevel} Vp-p</p>
        </C:if>
        <C:if test="${item.imageTransmission.audioInputLevel!=null}">
            <p>音频输入水平：${item.imageTransmission.audioInputLevel} Vp-p</p>
        </C:if>
        <C:if test="${item.imageTransmission.audioInputImpedance!=null}">
            <p>音频输入阻抗：${item.imageTransmission.audioInputImpedance} Ohm</p>
        </C:if>
    </C:if>
    <br>
    <section id="other">
        <C:if test="${item.pinDefintionDiagram!=null}">
            <h4>飞控针脚定义图：</h4>
            <div class="expImgDiv">
                <img class="expImg" src="img/${item.pinDefinitionDiagram}"/>
            </div>
        </C:if>
        <C:if test="${item.imageTransmission!=null}">
            <C:if test="${item.imageTransmission.pinDefinitionDiagram!=null}">
                <h4>图传针脚定义图：</h4>
                <div class="expImgDiv">
                    <img class="expImg" src="img/${item.imageTransmission.pinDefinitionDiagram}"/>
                </div>
            </C:if>
        </C:if>
        <p>${item.caption}</p>
        <p>${item.esc.caption}</p>
        <p>${item.imageTransmission.caption}</p>
        <C:if test="${item.extraPictures!=null}">
            <br>
            <C:forEach items="${item.extraPictures}" var="expic">
                <div class="expImgDiv">
                    <img class="expImg" src="img/${expic}"/>
                </div>
            </C:forEach>
        </C:if>
        <C:if test="${item.esc!=null}">
            <C:if test="${item.esc.extraPictures!=null}">
                <br>
                <C:forEach items="${item.esc.extraPictures}" var="expic">
                    <div class="expImgDiv">
                        <img class="expImg" src="img/${expic}"/>
                    </div>
                </C:forEach>
            </C:if>
        </C:if>
        <C:if test="${item.imageTransmission!=null}">
            <C:if test="${item.imageTransmission.extraPictures!=null}">
                <br>
                <C:forEach items="${item.imageTransmission.extraPictures}" var="expic">
                    <div class="expImgDiv">
                        <img class="expImg" src="img/${expic}"/>
                    </div>
                </C:forEach>
            </C:if>
        </C:if>
        <br>
    </section>
</section>
<%@include file="../foot.html" %>
</body>
</html>
