<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2017/12/6
  Time: 13:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <link type="text/css" rel="stylesheet" href="/headNav.css">
    <link type="text/css" rel="stylesheet" href="/virtualAssembly/assembly.css"/>
    <script type="text/javascript" src="/javaScript/Post.js"></script>
    <title>竞速无人机资料库</title>
</head>
<body>
<div>
    <jsp:include page="/headNav.jsp">
        <jsp:param name="searchModel" value="${param.searchModel}"/>
    </jsp:include>
    <section>
        <h2>虚拟装机</h2>
        <p>选择设备进行虚拟装机</p>
        <section id="assemblyTable">
            <div assemblyTable class="tableRow" id="droneInfoTable">
                <div class="left">
                    <div class="droneInfo">
                            <h4>基本信息</h4>
                                <p>飞机自重：${sessionScope.drone.totalWeight} g</p>
                                <p>参考价格：￥${sessionScope.drone.totalPrice}</p>
                                <p>最大推力:${sessionScope.drone.maximumThrust} g</p>
                                <p>推重比:${sessionScope.drone.thrustWeightRatio}</p>
                    </div>
                </div>
                <div class="right">
                    <div class="droneInfo">
                        <h4>装机辅助信息</h4>
                        <textarea class="device" readonly><C:forEach items="${sessionScope.drone.notification}" var="item">${item.value}&#10; </C:forEach>
                        </textarea>
                    </div>
                </div>
            </div>
            <div assemblyTable class="tableRow">
                <div class="left">
                    <div class="class" id="frame">
                        <h4>机架相关</h4>
                        <div class="device" id="fra">
                            <p>机架</p>
                            <C:if test="${sessionScope.drone.frame!=null}">
                                <table>
                                    <tr>
                                        <td rowspan="2" class="imgTd">
                                            <img src="/img/${sessionScope.drone.frame.imgUrl}">
                                        </td>
                                        <td colspan="2">
                                            <p>${sessionScope.drone.frame.model}</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td class="deviceInfoBut"
                                            onclick="location.href='/detail/frame/'+encodeURIComponent('${sessionScope.drone.frame.model}.');">
                                            <p>详情</p>
                                        </td>
                                        <td class="deviceInfoBut"
                                            onclick="post('/virtualAssembly',{frame :'null',scrollTop:document.body.scrollTop});">
                                            <p>移除</p>
                                        </td>
                                    </tr>
                                </table>
                            </C:if>
                            <C:if test="${sessionScope.drone.frame==null}">
                                <a href="/virtualAssembly/frame_1?searchModel=">
                                    <div class="deviceInfo">
                                        <p>点击添加</p>
                                    </div>
                                </a>
                            </C:if>
                        </div>
                    </div>
                    <div class="class" id="dynamic">
                        <h4>动力系统</h4>
                        <div class="device" id="moto">
                            <p>无刷电机</p>
                            <C:if test="${sessionScope.drone.moto!=null}">
                                <table>
                                    <tr>
                                        <td rowspan="2" class="imgTd">
                                            <img src="/img/${sessionScope.drone.moto.imgUrl}">
                                        </td>
                                        <td colspan="2">
                                            <p>${sessionScope.drone.moto.model}</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td class="deviceInfoBut"
                                            onclick="location.href='/detail/moto/'+encodeURIComponent('${sessionScope.drone.moto.model}.');">
                                            <p>详情</p>
                                        </td>
                                        <td class="deviceInfoBut"
                                            onclick="post('/virtualAssembly',{moto :'null',scrollTop:document.body.scrollTop});">
                                            <p>移除</p>
                                        </td>
                                    </tr>
                                </table>
                            </C:if>
                            <C:if test="${sessionScope.drone.moto==null}">
                                <a href="/virtualAssembly/moto_1?searchModel=">
                                    <div class="deviceInfo">
                                        <p>点击添加</p>
                                    </div>
                                </a>
                            </C:if>
                        </div>
                        <div class="device" id="esc">
                            <p>电子调速器</p>
                            <C:if test="${sessionScope.drone.electroSpeedRegulator!=null}">
                                <table>
                                    <tr>
                                        <td rowspan="2" class="imgTd">
                                            <img src="/img/${sessionScope.drone.electroSpeedRegulator.imgUrl}">
                                        </td>
                                        <td colspan="2">
                                            <p>${sessionScope.drone.electroSpeedRegulator.model}</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td class="deviceInfoBut"
                                            onclick="location.href='/detail/esc/'+encodeURIComponent('${sessionScope.drone.electroSpeedRegulator.model}.');">
                                            <p>详情</p>
                                        </td>
                                        <td class="deviceInfoBut"
                                            onclick="post('/virtualAssembly',{electroSpeedRegulator :'null',scrollTop:document.body.scrollTop});">
                                            <p>移除</p>
                                        </td>
                                    </tr>
                                </table>
                            </C:if>
                            <C:if test="${sessionScope.drone.electroSpeedRegulator==null}">
                                <a href="/virtualAssembly/electroSpeedRegulator_1?searchModel=">
                                    <div class="deviceInfo">
                                        <p>点击添加</p>
                                    </div>
                                </a>
                            </C:if>
                        </div>
                        <div class="device" id="prop">
                            <p>桨叶</p>
                                <C:if test="${sessionScope.drone.prop!=null}">
                                    <table>
                                        <tr>
                                            <td rowspan="2" class="imgTd">
                                                <img src="/img/${sessionScope.drone.prop.imgUrl}">
                                            </td>
                                            <td colspan="2">
                                                <p>${sessionScope.drone.prop.model}</p>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td class="deviceInfoBut"
                                                onclick="location.href='/detail/prop/'+encodeURIComponent('${sessionScope.drone.prop.model}.');">
                                                <p>详情</p>
                                            </td>
                                            <td class="deviceInfoBut"
                                                onclick="post('/virtualAssembly',{prop :'null',scrollTop:document.body.scrollTop});">
                                                <p>移除</p>
                                            </td>
                                        </tr>
                                    </table>
                                </C:if>
                                <C:if test="${sessionScope.drone.prop==null}">
                                    <a href="/virtualAssembly/prop_1?searchModel=">
                                        <div class="deviceInfo">
                                            <p>点击添加</p>
                                        </div>
                                    </a>
                                </C:if>
                        </div>
                        <div class="device" id="bat">
                            <p>电池</p>
                            <C:if test="${sessionScope.drone.battery!=null}">
                                <table>
                                    <tr>
                                        <td rowspan="2" class="imgTd">
                                            <img src="/img/${sessionScope.drone.battery.imgUrl}">
                                        </td>
                                        <td colspan="2">
                                            <p>${sessionScope.drone.battery.model}</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td class="deviceInfoBut"
                                            onclick="location.href='/detail/battery/'+encodeURIComponent('${sessionScope.drone.battery.model}.');">
                                            <p>详情</p>
                                        </td>
                                        <td class="deviceInfoBut"
                                            onclick="post('/virtualAssembly',{battery :'null',scrollTop:document.body.scrollTop});">
                                            <p>移除</p>
                                        </td>
                                    </tr>
                                </table>
                            </C:if>
                            <C:if test="${sessionScope.drone.battery==null}">
                                <a href="/virtualAssembly/battery_1?searchModel=">
                                    <div class="deviceInfo">
                                        <p>点击添加</p>
                                    </div>
                                </a>
                            </C:if>
                        </div>
                    </div>
                </div>
                <div class="right">
                    <div class="class" id="controller">
                        <h4>控制系统</h4>
                        <div class="device" id="fc">
                            <p>飞控</p>
                            <C:if test="${sessionScope.drone.flightControl!=null}">
                                <table>
                                    <tr>
                                        <td rowspan="2" class="imgTd">
                                            <img src="/img/${sessionScope.drone.flightControl.imgUrl}">
                                        </td>
                                        <td colspan="2">
                                            <p>${sessionScope.drone.flightControl.model}</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td class="deviceInfoBut"
                                            onclick="location.href='/detail/fc/'+encodeURIComponent('${sessionScope.drone.flightControl.model}.');">
                                            <p>详情</p>
                                        </td>
                                        <td class="deviceInfoBut"
                                            onclick="post('/virtualAssembly',{flightControl :'null',scrollTop:document.body.scrollTop});">
                                            <p>移除</p>
                                        </td>
                                    </tr>
                                </table>
                            </C:if>
                            <C:if test="${sessionScope.drone.flightControl==null}">
                                <a href="/virtualAssembly/flightControl_1?searchModel=">
                                    <div class="deviceInfo">
                                        <p>点击添加</p>
                                    </div>
                                </a>
                            </C:if>
                        </div>
                        <div class="device" id="ph">
                            <p>分电板</p>
                            <C:if test="${sessionScope.drone.powerHub!=null}">
                                <table>
                                    <tr>
                                        <td rowspan="2" class="imgTd">
                                            <img src="/img/${sessionScope.drone.powerHub.imgUrl}">
                                        </td>
                                        <td colspan="2">
                                            <p>${sessionScope.drone.powerHub.model}</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td class="deviceInfoBut"
                                            onclick="location.href='/detail/powerHub/'+encodeURIComponent('${sessionScope.drone.powerHub.model}.');">
                                            <p>详情</p>
                                        </td>
                                        <td class="deviceInfoBut"
                                            onclick="post('/virtualAssembly',{powerHub :'null',scrollTop:document.body.scrollTop});">
                                            <p>移除</p>
                                        </td>
                                    </tr>
                                </table>
                            </C:if>
                            <C:if test="${sessionScope.drone.powerHub==null}">
                                <a href="/virtualAssembly/powerHub_1?searchModel=">
                                    <div class="deviceInfo">
                                        <p>点击添加</p>
                                    </div>
                                </a>
                            </C:if>
                        </div>
                    </div>
                    <div class="class" id="imageSys">
                        <h4>图像系统</h4>
                        <div class="device" id="cam">
                            <p>摄像头</p>
                            <C:if test="${sessionScope.drone.cam!=null}">
                                <table>
                                    <tr>
                                        <td rowspan="2" class="imgTd">
                                            <img src="/img/${sessionScope.drone.cam.imgUrl}">
                                        </td>
                                        <td colspan="2">
                                            <p>${sessionScope.drone.cam.model}</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td class="deviceInfoBut"
                                            onclick="location.href='/detail/cam/'+encodeURIComponent('${sessionScope.drone.cam.model}.');">
                                            <p>详情</p>
                                        </td>
                                        <td class="deviceInfoBut"
                                            onclick="post('/virtualAssembly',{cam :'null',scrollTop:document.body.scrollTop});">
                                            <p>移除</p>
                                        </td>
                                    </tr>
                                </table>
                            </C:if>
                            <C:if test="${sessionScope.drone.cam==null}">
                                <a href="/virtualAssembly/cam_1?searchModel=">
                                    <div class="deviceInfo">
                                        <p>点击添加</p>
                                    </div>
                                </a>
                            </C:if>
                        </div>
                        <div class="device" id="it">
                            <p>图传</p>
                            <C:if test="${sessionScope.drone.imageTransmission!=null}">
                                <table>
                                    <tr>
                                        <td rowspan="2" class="imgTd">
                                            <img src="/img/${sessionScope.drone.imageTransmission.imgUrl}">
                                        </td>
                                        <td colspan="2">
                                            <p>${sessionScope.drone.imageTransmission.model}</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td class="deviceInfoBut"
                                            onclick="location.href='/detail/it/'+encodeURIComponent('${sessionScope.drone.imageTransmission.model}.');">
                                            <p>详情</p>
                                        </td>
                                        <td class="deviceInfoBut"
                                            onclick="post('/virtualAssembly',{imageTransmission :'null',scrollTop:document.body.scrollTop});">
                                            <p>移除</p>
                                        </td>
                                    </tr>
                                </table>
                            </C:if>
                            <C:if test="${sessionScope.drone.imageTransmission==null}">
                                <a href="/virtualAssembly/imageTransmission_1?searchModel=">
                                    <div class="deviceInfo">
                                        <p>点击添加</p>
                                    </div>
                                </a>
                            </C:if>
                        </div>
                        <div class="device" id="ant">
                            <p>天线</p>
                            <C:if test="${sessionScope.drone.antenna!=null}">
                                <table>
                                    <tr>
                                        <td rowspan="2" class="imgTd">
                                            <img src="/img/${sessionScope.drone.antenna.imgUrl}">
                                        </td>
                                        <td colspan="2">
                                            <p>${sessionScope.drone.antenna.model}</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td class="deviceInfoBut"
                                            onclick="location.href='/detail/antenna/'+encodeURIComponent('${sessionScope.drone.antenna.model}.');">
                                            <p>详情</p>
                                        </td>
                                        <td class="deviceInfoBut"
                                            onclick="post('/virtualAssembly',{antenna :'null',scrollTop:document.body.scrollTop});">
                                            <p>移除</p>
                                        </td>
                                    </tr>
                                </table>
                            </C:if>
                            <C:if test="${sessionScope.drone.antenna==null}">
                                <a href="/virtualAssembly/antenna_1?searchModel=">
                                    <div class="deviceInfo">
                                        <p>点击添加</p>
                                    </div>
                                </a>
                            </C:if>
                        </div>
                    </div>

                </div>
            </div>
        </section>
    </section>
    <%@include file="/foot.html"%>
    <script type="text/javascript">
        window.onload=function() {
            document.body.scrollTop=${scrollTop};
        }
    </script>
</div>
</body>
</html>
