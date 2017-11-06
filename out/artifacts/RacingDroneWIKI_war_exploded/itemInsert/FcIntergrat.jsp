<%--
  Created by IntelliJ IDEA.
  User: asus-pc
  Date: 2017/9/21
  Time: 21:15
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
        <form action="/itemInsert/insertEsc.jsp">
            <input type="submit"class="inputText" formmethod="post" value="添加集成电子调速器">
        </form>
        <form action="/itemInsert/insertIt.jsp">
            <input type="submit"class="inputText"formmethod="post" value="添加集成图传">
        </form>
        <form action="/itemInsert/insertPh.jsp">
            <input type="submit"class="inputText" formmethod="post"value="添加集成分电板">
        </form>
        <form action="/itemInsert/InsertFC">
            <input type="submit"class="inputText" value="完成，录入数据">
        </form>
    </section>
</div>
<%@include file="../foot.html"%>
</body>
</html>
