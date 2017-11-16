<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/20
  Time: 17:57
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
    <h2>图传信息录入</h2>
    <section id="infoTable">
        <div class="infoTableRow">
            <div class="name">
                <p>型号：</p>
                <p>主图片：</p>
                <p>参考价格：</p>
                <p>品牌：</p>
                <p>重量：</p>
                <P>长度：</P>
                <p>宽度：</p>
                <p>厚度：</p>
                <p>频道数：</p>
                <p>SBUS支持：</p>
                <p>音频支持：</p>
                <p>内置收音器：</p>
                <p>功率可调：</p>
                <p>输出功率：</p>
                <p>输入电压：</p>
                <p>输出电压：</p>
                <p>天线接头：</p>
                <p>视频带宽：</p>
                <p>音频带宽：</p>
                <p>视频输入电平：</p>
                <p>音频输入水平：</p>
                <p>音频输入阻抗：</p>
                <p>引脚定义图：</p>
                <p>频率表：</p>
                <p id="capP">文字描述：</p>
                <p>辅助图片：</p>
            </div>
            <div class="value">
                <form id="itemInfo" method="post" action="putIntoDB" enctype="multipart/form-data">
                    <input type="text" name="model" placeholder="图传型号" class="inputText"><br>
                    <input type="file" name="mainImg" class="inputText"><br>
                    <input type="text" name="referencePrice" class="inputText" placeholder="图传参考价格"><br>
                    <input type="text" name="anufacturer" class="inputText" placeholder="图传制造商、品牌"><br>
                    <input type="text" name="weight" class="inputText" placeholder="图传净重，单位：g"><br>
                    <input type="text" name="length" class="inputText" placeholder="图传长度，单位：mm"><br>
                    <input type="text" name="width" class="inputText" placeholder="图传宽度，单位：mm"><br>
                    <input type="text" name="thickness" class="inputText" placeholder="图传厚度，单位：mm"><br>
                    <input type="text" name="frequencyQuantity" class="inputText" placeholder="图传频道数，单位：CH"><br>
                    <input type="radio" name="sbus" class="inputRadio" value="yes">支持
                    <input type="radio" name="sbus" class="inputRadio" value="no">不支持<br>
                    <input type="radio" name="audioSupport" class="inputRadio" value="yes">支持
                    <input type="radio" name="audioSupport" class="inputRadio" value="no">不支持<br>
                    <input type="radio" name="integratedMic" class="inputRadio" value="yes">支持
                    <input type="radio" name="integratedMic" class="inputRadio" value="no">不支持<br>
                    <input type="radio" name="powerAdjustable" class="inputRadio" value="yes">支持
                    <input type="radio" name="powerAdjustable" class="inputRadio" value="no">不支持<br>
                    <input type="text" name="outputPower" class="inputText" placeholder="图传输出功率，单位：mW"><br>
                    <input type="text" name="inputVoltage" class="inputText" placeholder="图传入电压，单位：V"><br>
                    <input type="text" name="outputVoltage" class="inputText" placeholder="图传出电压，单位：V"><br>
                    <input type="text" name="antennaConnectors" class="inputText" placeholder="图传天线接头"><br>
                    <input type="text" name="videoBandWidth" class="inputText" placeholder="图传视频带宽，单位：MHz"><br>
                    <input type="text" name="audioCarrierFrequency" class="inputText" placeholder="图传音频带宽，单位：MHz"><br>
                    <input type="text" name="videoInputLevel" class="inputText" placeholder="图传视频输入电平，单位：Vp-p"><br>
                    <input type="text" name="audioInputLevel" class="inputText" placeholder="图传音频输入电平，单位：Vp-p"><br>
                    <input type="text" name="audioInputImpedance" class="inputText" placeholder="图传音频输入阻抗，单位：Ohm"><br>
                    <input type="file" name="pinDefinitionDiagram" multiple class="inputText"/><br/>
                    <input type="file" name="frequencyTable" multiple class="inputText"/><br/>
                    <textarea name="caption" class="inputText" placeholder="图传相关文字描述、配置、备注等信息"></textarea>
                    <input type="file" name="files" multiple class="inputText"/><br/>
                    <input type="submit" value="   提交   " class="inputText">
                </form>
            </div>
        </div>

    </section>
</div>
<%@include file="../foot.html" %>
</body>
</html>
