<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2017/9/23
  Time: 20:22
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

    <h4>力效表</h4>
    <table id="effcha" border="1px">
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
    </table>
    <form id="ec" action="InsertSuccessed.jsp" method="post"></form>

    <input type="button" onclick="addTr()" value="添加力效信息">
    <script type="text/javascript">
        var a = 0;
        function addTr() {
            a = a + 1;
            var str = '<table border="1px">' +
                '<tr> ' +
                '<td rowspan="2"><input type="text" name="prop' + a + '"></td>' +
                ' <td rowspan="2"><input type="text" name="voltages' + a + '"></td> ' +
                '<td>50%</td> <td><input type="text" name="halfLoadCurrency' + a + '"></td> ' +
                '<td><input type="text" name="halfPull' + a + '"></td> ' +
                '<td><input type="text" name="halfPower' + a + '"></td>' +
                ' <td><input type="text" name="halfEfficlency' + a + '"></td>' +
                ' <td rowspan="2"><input type="text" name="temperature' + a + '"></td> ' +
                '</tr> <tr> <td>100%</td> <td><input type="text" name="fullLoadCurrency' + a + '"></td> ' +
                '<td><input type="text" name="fullPull' + a + '"></td> <td><input type="text" name="fullPower' + a + '"></td>' +
                ' <td><input type="text" name="fullEfficlency' + a + '"></td> ' +
                '</tr>' +
                '</table>';

            document.getElementById('ec').innerHTML += str;
        }
    </script>
</div>
</body>
</html>
