<%--
  Created by IntelliJ IDEA.
  User: asus-pc
  Date: 2017/9/21
  Time: 21:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en" xmlns:jsp="http://java.sun.com/jsf/facelets">
<head>
    <link type="text/css" rel="stylesheet" href="/headNav.css"/>
    <link type="text/css" rel="stylesheet" href="intergratAntSucessed.css"/>
    <title>竞速无人机资料库</title>
</head>
<body>
<div id="main">
    <jsp:include page="../headNav.jsp">
        <jsp:param name="searchModel" value="${param.searchModel}"/>
    </jsp:include>
    <section>
        <h4>录入成功，感谢您为竞速无人机在线资料库做出的贡献！</h4>
    </section>
</div>
<%@include file="../foot.html" %>
</body>
</html>
