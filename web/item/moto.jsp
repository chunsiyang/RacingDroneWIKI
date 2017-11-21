<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: asus-pc
  Date: 2017/9/4
  Time: 16:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <link type="text/css" rel="stylesheet" href="/headNav.css">
    <link type="text/css" rel="stylesheet" href="/item/item.css">
    <style>

        #effcha tr:nth-child(odd) {
            background-color: darkgray;
        }

        #effcha th {
            background-color: lightgray;
        }

        #effcha {
            margin: auto;
            width: 80%;
            text-align: center;

        }
    </style>
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
    <C:if test="${item.kv!=0}">
        <p>KV值：${item.kv} KV</p>
    </C:if>
    <C:if test="${item.statorLength!=0}">
        <p>定子长度:${item.statorLength} mm</p>
    </C:if>
    <C:if test="${item.statorDiameter!=0}">
        <p>定子直径:${item.statorDiameter} mm</p>
    </C:if>
    <C:if test="${item.shaftDiameter!=0}">
        <p>轴径:${item.shaftDiameter} mm</p>
    </C:if>
    <C:if test="${item.diameter!=0}">
        <p>直径：${item.diameter} mm</p>
    </C:if>
    <C:if test="${item.idleCurrent!=0}">
        <p>长度：${item.idleCurrent} mm</p>
    </C:if>
    <C:if test="${item.idleCurrent!=null&&item.idleCurrent!=''}">
        <p>空载电流：${item.idleCurrent} A</p>
    </C:if>
    <C:if test="${item.internalReslstance!=null&&item.internalReslstance!=''}">
        <P>内阻：${item.internalReslstance} Ω</P>
    </C:if>
    <C:if test="${item.noOfCells!=null&&item.noOfCells!=''}">
        <p>支持锂电池节数：${item.noOfCells} S</p>
    </C:if>
    <C:if test="${item.maxThrust!=0}">
        <p>最大推力：${item.maxThrust} g</p>
    </C:if>
    <C:if test="${item.propeller!=null&&item.propeller!=''}">
        <p>可装桨叶尺寸：${item.propeller} 寸</p>
    </C:if>
    <br>
    <div id="other">
        <C:if test="${item.efficacyChart!=null}">
            <h4>力效表</h4>
            <table id="effcha" border="5px">
                <tr>
                    <th>桨叶（寸）</th>
                    <th>电压（V）</th>
                    <th>油门（%）</th>
                    <th>负载电流（A）</th>
                    <th>推力（g）</th>
                    <th>功率（W）</th>
                    <th>力效（g/W）</th>
                    <th>温度（℃）</th>
                </tr>
                <C:forEach items="${item.efficacyChart}" var="ec">
                    <tr>
                        <td rowspan="2">${ec.prop}</td>
                        <td rowspan="2">${ec.voltages}</td>
                        <td>50%</td>
                        <td>${ec.halfLoadCurrency}</td>
                        <td>${ec.halfPull}</td>
                        <td>${ec.halfPower}</td>
                        <td>${ec.halfEfficlency}</td>
                        <td rowspan="2">${ec.temperature}</td>
                    </tr>
                    <tr>
                        <td>100%</td>
                        <td>${ec.fullLoadCurrency}</td>
                        <td>${ec.fullPull}</td>
                        <td>${ec.fullPower}</td>
                        <td>${ec.fullEfficlency}</td>
                    </tr>
                </C:forEach>
            </table>
            <br>
        </C:if>
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
