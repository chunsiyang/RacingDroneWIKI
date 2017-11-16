<%--
  Created by IntelliJ IDEA.
  User: asus-pc
  Date: 2017/9/14
  Time: 13:18
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en" xmlns:jsp="http://java.sun.com/jsf/facelets">
<head>
    <meta charset="UTF-8">
    <link type="text/css" rel="stylesheet" href="../headNav.css"/>
    <link type="text/css" rel="stylesheet" href="dataInput.css"/>
    <title>竞速无人机资料库</title>
</head>
<body>
<div id="main">
    <jsp:include page="../headNav.jsp">
        <jsp:param name="searchModel" value="${param.searchModel}"/>
    </jsp:include>
    <section>
        <h2>加入我们为竞速无人机资料库添砖添瓦</h2>
        <p>选择下列分类为数据库添加设备信息</p>
        <nav>
            <button class="inputItem" onclick="javascript:window.location.href='/itemInsert/insertMoto.jsp';" >
                <a href="/itemInsert/insertMoto.jsp" >
                    <p>电机</p>
                </a>
            </button>
            <button class="inputItem" onclick="javascript:window.location.href='/itemInsert/insertEsc.jsp';">
                <a href="/itemInsert/insertEsc.jsp" >
                    <p>电调</p>
                </a>
            </button>
            <button class="inputItem" onclick="javascript:window.location.href='/itemInsert/insertFra.jsp';">
                <a href="/itemInsert/insertFra.jsp" >
                    <p>机架</p>
                </a>
            </button>
            <button class="inputItem" onclick="javascript:window.location.href='/itemInsert/insertIt.jsp';">
                <a href="/itemInsert/insertIt.jsp" >
                    <p>图传</p>
                </a>
            </button>
            <button class="inputItem" onclick="javascript:window.location.href='/itemInsert/insertCam.jsp';">
                <a href="/itemInsert/insertCam.jsp" >
                    <p>摄像头</p>
                </a>
            </button>
            <br>
            <button class="inputItem" onclick="javascript:window.location.href='/itemInsert/insertFc.jsp';">
                <a href="/itemInsert/insertFc.jsp" >
                    <p>飞控</p>
                </a>
            </button>
            <button class="inputItem" onclick="javascript:window.location.href='/itemInsert/insertAnt.jsp';">
                <a href="/itemInsert/insertAnt.jsp" >
                    <p>天线</p>
                </a>
            </button>
            <button class="inputItem" onclick="javascript:window.location.href='/itemInsert/insertPh.jsp';">
                <a href="/itemInsert/insertPh.jsp" >
                    <p>分电板</p>
                </a>
            </button>
            <button class="inputItem" onclick="javascript:window.location.href='/itemInsert/insertProp.jsp';">
                <a href="/itemInsert/insertProp.jsp" >
                    <p>桨叶</p>
                </a>
            </button>
            <button class="inputItem" onclick="javascript:window.location.href='/itemInsert/insertBat.jsp';">
                <a href="/itemInsert/insertBat.jsp" >
                    <p>电池</p>
                </a>
            </button>
        </nav>
    </section>
</div>
<%@include file="../foot.html"%>
</body>
</html>
