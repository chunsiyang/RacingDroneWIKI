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
        body {
            padding: 0px;
            margin: 0px;
        }
        section{
            padding-left: 20px;
            width: 80%;
            margin: auto;
            background-color: lightgray;
        }
        img{
            position: relative;
            float: right;
            width: 30%;
            clear: right;
        }
        h2{
            padding: 20px;
        }
        footer{
            clear: right;
        }
    </style>
    <title>竞速无人机资料库</title>
</head>
<body>
<jsp:include page="/headNav.jsp">
    <jsp:param name="model" value="${param.model}"/>
</jsp:include>
<section>
    <img src="img/${item.imgUrl}"/>
    <h2>${item.model}</h2>
    <p>品牌：${item.anufacturer}</p>
    <p>参考价格：${item.referencePrice}</p>
    <p>KV值：${item.kv}</p>
    <p>定子长度:${item.statorLength}mm</p>
    <p>定子直径:${item.statorDiameter}</p>
    <p>轴径:${item.shaftDiameter}mm</p>
    <p>重量：${item.weight}g</p>
    <p>直径：${item.diameter}mm</p>
    <p>长度：${item.diameter}mm</p>
    <p>空载电流：${item.idleCurrent}A</p>
    <P>内阻：${item.internalRestance}Ω</P>
    <p>支持锂电池节数：${item.noOfCells}s</p>
    <p>最大推力：${item.maxThrust}g</p>
    <p>可装桨叶尺寸：${item.propeller}寸</p>
    <br>
    <footer>
        <C:if test="${item.efficacyChart!=null}">
            <h4>力效表</h4>
            <table>
                <tr>
                    <th>桨叶</th>
                    <th>电压</th>
                    <th>油门</th>
                    <th>负载电流</th>
                    <th>推力</th>
                    <th>功率</th>
                    <th>力效</th>
                    <th>温度</th>
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
        </C:if>
        <p>${item.caption}</p>
        <C:if test="${item.extraPictures!=null}">
            <C:forEach items="${item.extraPictures}" var="expic">
                <img id="expImg" src="img/${expic}"/>
            </C:forEach>
        </C:if>
    </footer>
</section>
</body>
</html>
