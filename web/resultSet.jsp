<%--
  Created by IntelliJ IDEA.
  User: asus-pc
  Date: 2017/8/27
  Time: 18:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <link type="text/css" rel="stylesheet" href="headNav.css">
    <link type="text/css" rel="stylesheet" href="resultSet.css">
    <title>竞速无人机资料库</title>
</head>
<body>
<div>
    <jsp:include page="headNav.jsp">
        <jsp:param name="searchModel" value="${param.searchModel}"/>
    </jsp:include>
    <%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="changKW" uri="http://RacingDroneWIKI.com" %>
    <C:if test="${motoList==null&&electroSpeedRegulatorList==null&&
                frameList==null&&imageTransmissionList==null&&
                camList==null&&flightControlList==null&&
                antennaList==null&&powerHubList==null&&
                propList==null&&batteryList==null}">
        <p id="noInfo">暂无搜索结果</p>
    </C:if>
    <!--无刷电机-->
    <section>
        <C:if test="${motoList!=null}">
            <table BORDER="1" cellspacing="0" class="list">
                <th><h2>无刷电机</h2></th>
                <C:forEach items="${motoList}" var="item">
                    <tr>
                        <td>
                            <a href="javascript:location.href='detail?item=moto&model='+encodeURIComponent('${item.getModel()}');" title="点击查看详情">
                                <table BORDER="1" cellspacing="0" class="listItem">
                                    <tr>
                                        <td rowspan="4" class="tdImg">
                                            <img src="img/${item.getImgUrl()}" class="mainImg"/>
                                        </td>
                                        <td colspan="3">
                                            <h4><changKW:KeywordDiscoloration keyWord="${param.searchModel}" title="${item.model}"/></h4>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <p>品牌：${item.anufacturer}</p>
                                        </td>
                                        <td>
                                            <p>参考价格：${item.getReferencePrice()}</p>
                                        </td>
                                        <td>
                                            <p>重量：${item.getWeight()}g</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <p>定子长度：${item.getStatorLength()}</p>
                                        </td>
                                        <td>
                                            <P>定子直径：${item.getStatorDiameter()}</P>
                                        </td>
                                        <td>
                                            <p>KV值：${item.getKv()}</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <p>支持锂电池节数：${item.getNoOfCells()}S</p>
                                        </td>
                                        <td>
                                            <p>支持桨叶：${item.getPropeller()}寸</p>
                                        </td>
                                        <td>
                                            <P>最大推力：${item.getMaxThrust()}g</P>
                                        </td>
                                    </tr>
                                </table>
                            </a>

                        </td>
                    </tr>
                    <tr>
                        <td>
                            <br>
                        </td>
                    </tr>
                </C:forEach>

            </table>
        </C:if>
    </section>
    <!--电子调速器-->
    <section>
        <C:if test="${electroSpeedRegulatorList!=null}">
            <table BORDER="1" cellspacing="0" class="list">
                <th><h2>电子调速器</h2></th>
                <C:forEach items="${electroSpeedRegulatorList}" var="item">
                    <tr>
                        <td>
                            <a href="javascript:location.href='detail?item=esc&model='+encodeURIComponent('${item.getModel()}');" title="点击查看详情" >
                                <table BORDER="1" cellspacing="0" class="listItem">
                                    <tr>
                                        <td rowspan="4" class="tdImg">
                                            <img src="img/${item.getImgUrl()}" class="mainImg"/>
                                        </td>
                                        <td colspan="3">
                                            <h4><changKW:KeywordDiscoloration keyWord="${param.searchModel}" title="${item.model}"/></h4>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <p>品牌：${item.getAnufacturer()}</p>
                                        </td>
                                        <td>
                                            <p>参考价格：${item.getReferencePrice()}</p>
                                        </td>
                                        <td>
                                            <p>重量：${item.getWeight()}g</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <p>持续工作电流：${item.getPersistentCurrent()}A</p>
                                        </td>
                                        <td>
                                            <P>瞬时工作电流：${item.getInstantaneousCurrent()}A</P>
                                        </td>
                                        <td>
                                            <p>固件：${item.getFirmware()}</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <p>支持锂电池节数：${item.getNoOfCells()}S</p>
                                        </td>
                                        <td>
                                            <p>主控制芯片：${item.getControlChip()}</p>
                                        </td>
                                        <td>

                                        </td>
                                    </tr>
                                </table>
                            </a>

                        </td>
                    </tr>
                    <tr>
                        <td>
                            <br>
                        </td>
                    </tr>
                </C:forEach>
            </table>
        </C:if>
    </section>
    <!--机架-->
    <section>
        <C:if test="${frameList!=null}">
            <table BORDER="1" cellspacing="0" class="list">
                <th><h2>机架</h2></th>
                <C:forEach items="${frameList}" var="item">
                    <tr>
                        <td>
                            <a href="javascript:location.href='detail?item=fra&model='+encodeURIComponent('${item.getModel()}');" title="点击查看详情">
                                <table BORDER="1" cellspacing="0" class="listItem">
                                    <tr>
                                        <td rowspan="4" class="tdImg">
                                            <img src="img/${item.getImgUrl()}" class="mainImg"/>
                                        </td>
                                        <td colspan="3">
                                            <h4><changKW:KeywordDiscoloration keyWord="${param.searchModel}" title="${item.model}"/></h4>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <p>品牌：${item.getAnufacturer()}</p>
                                        </td>
                                        <td>
                                            <p>参考价格：${item.getReferencePrice()}</p>
                                        </td>
                                        <td>
                                            <p>重量：${item.getWeight()}g</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <p>轴距：${item.getWheekbase()}mm</p>
                                        </td>
                                        <td>
                                            <P>主要材料：${item.getMaterial()}</P>
                                        </td>
                                        <td>
                                            <p>最大可用桨叶：${item.getMaximumSupportProp()}寸</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <p>下板厚度：${item.getBottomThickness()}mm</p>
                                        </td>
                                        <td>
                                            <p>顶板厚度：${item.getRoofThickness()}mm</p>
                                        </td>
                                        <td>
                                            <p>机臂厚度：${item.getArmThikness()}mm</p>
                                        </td>
                                    </tr>
                                </table>
                            </a>

                        </td>
                    </tr>
                    <tr>
                        <td>
                            <br>
                        </td>
                    </tr>
                </C:forEach>

            </table>
        </C:if>
    </section>
    <!--图传-->
    <section>
        <C:if test="${imageTransmissionList!=null}">
            <table BORDER="1" cellspacing="0" class="list">
                <th><h2>图传</h2></th>
                <C:forEach items="${imageTransmissionList}" var="item">
                    <tr>
                        <td>
                            <a href="javascript:location.href='detail?item=it&model='+encodeURIComponent('${item.getModel()}');" title="点击查看详情">
                                <table BORDER="1" cellspacing="0" class="listItem">
                                    <tr>
                                        <td rowspan="4" class="tdImg">
                                            <img src="img/${item.getImgUrl()}" class="mainImg"/>
                                        </td>
                                        <td colspan="3">
                                            <h4><changKW:KeywordDiscoloration keyWord="${param.searchModel}" title="${item.model}"/></h4>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <p>品牌：${item.getAnufacturer()}</p>
                                        </td>
                                        <td>
                                            <p>参考价格：${item.getReferencePrice()}</p>
                                        </td>
                                        <td>
                                            <p>重量：${item.getWeight()}g</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <p>频道数：${item.getFrequencyQuantity()}</p>
                                        </td>
                                        <td>
                                            <P>输出功率：${item.getOutputPower()}mW</P>
                                        </td>
                                        <td>
                                            <p>天线接口：${item.getAntennaConnectors()}</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <p>输入电压：${item.getInputVoltage()}V</p>
                                        </td>
                                        <td>
                                            <p>输出电压：${item.getOutputVoltage()}V</p>
                                        </td>
                                        <td>

                                        </td>
                                    </tr>
                                </table>
                            </a>

                        </td>
                    </tr>
                    <tr>
                        <td>
                            <br>
                        </td>
                    </tr>
                </C:forEach>

            </table>
        </C:if>
    </section>
    <!--摄像头-->
    <section>
        <C:if test="${camList!=null}">
            <table BORDER="1" cellspacing="0" class="list">
                <th><h2>摄像头</h2></th>
                <C:forEach items="${camList}" var="item">
                    <tr>
                        <td>
                            <a href="javascript:location.href='detail?item=cam&model='+encodeURIComponent('${item.getModel()}');" title="点击查看详情">
                                <table BORDER="1" cellspacing="0" class="listItem">
                                    <tr>
                                        <td rowspan="4" class="tdImg">
                                            <img src="img/${item.getImgUrl()}" class="mainImg"/>
                                        </td>
                                        <td colspan="3">
                                            <h4><changKW:KeywordDiscoloration keyWord="${param.searchModel}" title="${item.model}"/></h4>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <p>品牌：${item.getAnufacturer()}</p>
                                        </td>
                                        <td>
                                            <p>参考价格：${item.getReferencePrice()}</p>
                                        </td>
                                        <td>
                                            <p>重量：${item.getWeight()}g</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <p>图像传感器：${item.getImageSensor()}</p>
                                        </td>
                                        <td>
                                            <P>水平分辨率：${item.getHorizontalResolustion()}TVL</P>
                                        </td>
                                        <td>
                                            <p>镜头视场：${item.getLensFov()}°</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <p>信号制式：${item.getSignalSystem()}</p>
                                        </td>
                                        <td>
                                            <p>信噪比：${item.getSnRatio()}</p>
                                        </td>
                                        <td>
                                            <p>最低照度：${item.getMinIllumination()}</p>
                                        </td>
                                    </tr>
                                </table>
                            </a>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <br>
                        </td>
                    </tr>
                </C:forEach>

            </table>
        </C:if>
    </section>
    <!--飞控-->
    <section>
        <C:if test="${flightControlList!=null}">
            <table BORDER="1" cellspacing="0" class="list">
                <th><h2>飞控</h2></th>
                <C:forEach items="${flightControlList}" var="item">
                    <tr>
                        <td>
                            <a href="javascript:location.href='detail?item=fc&model='+encodeURIComponent('${item.getModel()}');" title="点击查看详情">
                                <table BORDER="1" cellspacing="0" class="listItem">
                                    <tr>
                                        <td rowspan="4" class="tdImg">
                                            <img src="img/${item.getImgUrl()}" class="mainImg"/>
                                        </td>
                                        <td colspan="3">
                                            <h4><changKW:KeywordDiscoloration keyWord="${param.searchModel}" title="${item.model}"/></h4>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <p>品牌：${item.getAnufacturer()}</p>
                                        </td>
                                        <td>
                                            <p>参考价格：${item.getReferencePrice()}</p>
                                        </td>
                                        <td>
                                            <p>重量：${item.getWeight()}g</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <p>安装孔距：${item.getMountingHoleSpacing()}</p>
                                        </td>
                                        <td>
                                            <P>MCU芯片：${item.getMcu()}</P>
                                        </td>
                                        <td>
                                            <p>MPU芯片：${item.getMpu()}</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <p>最大PID刷新率：${item.getMaxPidLoopFrequancy()}kHz</p>
                                        </td>
                                        <td>
                                            <p>最大陀螺仪刷新率：${item.getMaxGyroUpdata()}kHz</p>
                                        </td>
                                        <td>

                                        </td>
                                    </tr>
                                </table>
                            </a>

                        </td>
                    </tr>
                    <tr>
                        <td>
                            <br>
                        </td>
                    </tr>
                </C:forEach>

            </table>
        </C:if>
    </section>
    <!--天线-->
    <section>
        <C:if test="${antennaList!=null}">
            <table BORDER="1" cellspacing="0" class="list">
                <th><h2>天线</h2></th>
                <C:forEach items="${antennaList}" var="item">
                    <tr>
                        <td>
                            <a href="javascript:location.href='detail?item=ant&model='+encodeURIComponent('${item.getModel()}');" title="点击查看详情">
                                <table BORDER="1" cellspacing="0" class="listItem">
                                    <tr>
                                        <td rowspan="4" class="tdImg">
                                            <img src="img/${item.getImgUrl()}" class="mainImg"/>
                                        </td>
                                        <td colspan="3">
                                            <h4><changKW:KeywordDiscoloration keyWord="${param.searchModel}" title="${item.model}"/></h4>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <p>品牌：${item.getAnufacturer()}</p>
                                        </td>
                                        <td>
                                            <p>参考价格：${item.getReferencePrice()}</p>
                                        </td>
                                        <td>
                                            <p>重量：${item.getWeight()}g</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <p>天线接头：${item.getConnectors()}</p>
                                        </td>
                                        <td>
                                            <P>天线频率：${item.getFrequency()}</P>
                                        </td>
                                        <td>
                                            <p>增益：${item.getGain()}</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <p>轴比：${item.getAxialRatic()}</p>
                                        </td>
                                        <td>
                                            <p>极化方式：${item.getPolarization()}</p>
                                        </td>
                                        <td>

                                        </td>
                                    </tr>
                                </table>
                            </a>

                        </td>
                    </tr>
                    <tr>
                        <td>
                            <br>
                        </td>
                    </tr>
                </C:forEach>

            </table>
        </C:if>
    </section>
    <!--分电板-->
    <section>
        <C:if test="${powerHubList!=null}">
            <table BORDER="1" cellspacing="0" class="list">
                <th><h2>分电板</h2></th>
                <C:forEach items="${powerHubList}" var="item">
                    <tr>
                        <td>
                            <a href="javascript:location.href='detail?item=ph&model='+encodeURIComponent('${item.getModel()}');" title="点击查看详情">
                                <table BORDER="1" cellspacing="0" class="listItem">
                                    <tr>
                                        <td rowspan="3" class="tdImg">
                                            <img src="img/${item.getImgUrl()}" class="mainImg"/>
                                        </td>
                                        <td colspan="3">
                                            <h4><changKW:KeywordDiscoloration keyWord="${param.searchModel}" title="${item.model}"/></h4>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <p>品牌：${item.getAnufacturer()}</p>
                                        </td>
                                        <td>
                                            <p>参考价格：${item.getReferencePrice()}</p>
                                        </td>
                                        <td>
                                            <p>重量：${item.getWeight()}g</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <p>最大耐流：${item.getMaxCurrent()}A</p>
                                        </td>
                                        <td>
                                            <P>安装孔距：${item.getMountingHoleSpacing()}A</P>
                                        </td>
                                        <td>

                                        </td>
                                    </tr>
                                </table>
                            </a>

                        </td>
                    </tr>
                    <tr>
                        <td>
                            <br>
                        </td>
                    </tr>
                </C:forEach>

            </table>
        </C:if>
    </section>
    <!--桨叶-->
    <section>
        <C:if test="${propList!=null}">
            <table BORDER="1" cellspacing="0" class="list">
                <th><h2>桨叶</h2></th>
                <C:forEach items="${propList}" var="item">
                    <tr>
                        <td>
                            <a href="javascript:location.href='detail?item=prop&model='+encodeURIComponent('${item.getModel()}');" title="点击查看详情">
                                <table BORDER="1" cellspacing="0" class="listItem">
                                    <tr>
                                        <td rowspan="3" class="tdImg">
                                            <img src="img/${item.getImgUrl()}" class="mainImg"/>
                                        </td>
                                        <td colspan="3">
                                            <h4><changKW:KeywordDiscoloration keyWord="${param.searchModel}" title="${item.model}"/></h4>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <p>品牌：${item.getAnufacturer()}</p>
                                        </td>
                                        <td>
                                            <p>参考价格：${item.getReferencePrice()}</p>
                                        </td>
                                        <td>
                                            <p>重量：${item.getWeight()}g</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <p>叶片数：${item.getBladeNumber()}</p>
                                        </td>
                                        <td>
                                            <P>尺寸：${item.getSize()}</P>
                                        </td>
                                        <td>
                                            <p>材料：${item.getMaterial()}</p>
                                        </td>
                                    </tr>
                                </table>
                            </a>

                        </td>
                    </tr>
                    <tr>
                        <td>
                            <br>
                        </td>
                    </tr>
                </C:forEach>

            </table>
        </C:if>
    </section>
    <!--电池-->
    <section>
        <C:if test="${batteryList!=null}">
            <table BORDER="1" cellspacing="0" class="list">
                <th><h2>电池</h2></th>
                <C:forEach items="${batteryList}" var="item">
                    <tr>
                        <td>
                            <a href="javascript:location.href='detail?item=bat&model='+encodeURIComponent('${item.getModel()}');" title="点击查看详情">
                                <table BORDER="1" cellspacing="0" class="listItem">
                                    <tr>
                                        <td rowspan="3" class="tdImg">
                                            <img src="img/${item.getImgUrl()}" class="mainImg"/>
                                        </td>
                                        <td colspan="3">
                                            <h4><changKW:KeywordDiscoloration keyWord="${param.searchModel}" title="${item.model}"/></h4>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <p>品牌：${item.getAnufacturer()}</p>
                                        </td>
                                        <td>
                                            <p>参考价格：${item.getReferencePrice()}</p>
                                        </td>
                                        <td>
                                            <p>重量：${item.getWeight()}g</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <p>容量：${item.getCapacity()}mah</p>
                                        </td>
                                        <td>
                                            <P>放电倍率：${item.getDischargeRate()}C</P>
                                        </td>
                                        <td>
                                            <p>电压：${item.getVoltage()}V</p>
                                        </td>
                                    </tr>
                                </table>
                            </a>

                        </td>
                    </tr>
                    <tr>
                        <td>
                            <br>
                        </td>
                    </tr>
                </C:forEach>

            </table>
        </C:if>
    </section>
</div>
<%@include file="foot.html"%>
</body>
</html>
