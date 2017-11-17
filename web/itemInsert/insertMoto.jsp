<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/20
  Time: 18:43
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
  <h2>电机信息录入</h2>
  <section id="infoTable">
    <div class="infoTableRow">
      <div class="name">
        <p>型号：</p>
        <p>主图片：</p>
        <p>参考价格：</p>
        <p>品牌：</p>
        <p>重量：</p>
        <P>长度：</P>
        <p>定子长度：</p>
        <p>轴径：</p>
        <p>空载电流：</p>
        <p>直径：</p>
        <p>支持锂电池节数：</p>
        <p>最大推力：</p>
        <p>KV值：</p>
        <p>支持螺旋桨：</p>
        <p>定子直径：</p>
        <p>内阻：</p>
        <p id="capP">文字描述：</p>
        <p>辅助图片：</p>
        <p>力效表：</p>
      </div>
      <div class="value">
        <form id="itemInfo" method="post" action="/itemInsert/InsertMoto"  enctype="multipart/form-data">
          <input type="text" name="model" placeholder="电机型号"class="inputText"><br>
          <input type="file" name="mainImg"class="inputText"><br>
          <input type="text" name="referencePrice" class="inputText"placeholder="电机参考价格"><br>
          <input type="text" name="anufacturer" class="inputText"placeholder="电机制造商、品牌"><br>
          <input type="text" name="weight" class="inputText"placeholder="电机净重，单位：g"><br>
          <input type="text" name="length" class="inputText"placeholder="电机长度，单位：mm"><br>
          <input type="text" name="statorLength" class="inputText"placeholder="电机定子长度，单位：mm"><br>
          <input type="text" name="shaftDiameter" class="inputText"placeholder="电机轴径，单位：mm"><br>
          <input type="text" name="idleCurrent" class="inputText"placeholder="电机空载电流，单位：A"><br>
          <input type="text" name="diameter" class="inputText"placeholder="电机直径，单位：mm"><br>
          <input type="text" name="noOfCells" class="inputText"placeholder="电机支持锂电池节数，单位：S"><br>
          <input type="text" name="maxThrust" class="inputText"placeholder="电机最大推力，单位：g"><br>
          <input type="text" name="kv" class="inputText"placeholder="电机KV值，单位：kv"><br>
          <input type="text" name="propeller" class="inputText"placeholder="电机支持螺旋桨，单位：寸"><br>
          <input type="text" name="statorDiameter" class="inputText"placeholder="电机定子直径，单位：mm"><br>
          <input type="text" name="internalReslstance" class="inputText"placeholder="电机内阻，单位：Ω"><br>
          <textarea name="caption" class="inputText"placeholder="电机相关文字描述、配置、备注等信息"></textarea>
          <input type="file" name="files" multiple class="inputText"/><br/>
          <table id="effcha" border="1px">
            <tr>
              <th class="ecTableTd">桨叶（寸）</th>
              <th class="ecTableTd">电压（V）</th>
              <th class="ecTableTd">油门（%）</th>
              <th class="ecTableTd">负载电流（A）</th>
              <th class="ecTableTd">推力（g）</th>
              <th class="ecTableTd">功率（W）</th>
              <th class="ecTableTd">力效（g/W）</th>
              <th class="ecTableTd">温度（℃）</th>
            </tr>
          </table>
          <div id="ec1" ></div>

          <input type="button" class="inputText"onclick="addTr()" value="添加力效信息"><br>
          <input type="submit" value="   提交   "class="inputText">
          <script type="text/javascript">
              var a = 0;
              function addTr() {
                  a = a + 1;
                  var str = '<table border="1px">' +
                      '<tr> ' +
                      '<td class="ecTableTd" rowspan="2"><input type="text" name="efficacyChart[' + (a-1) +'].prop"></td>' +
                      ' <td class="ecTableTd" rowspan="2"><input type="text" name="efficacyChart[' + (a-1) +'].voltages"></td> ' +
                      '<td class="ecTableTd"><p>50%</P></td> ' +
                      '<td class="ecTableTd"><input type="text" name="efficacyChart[' + (a-1) +'].halfLoadCurrency"></td> ' +
                      '<td class="ecTableTd"><input type="text" name="efficacyChart[' + (a-1) +'].halfPull"></td> ' +
                      '<td class="ecTableTd"><input type="text" name="efficacyChart[' + (a-1) +'].halfPower"></td>' +
                      ' <td class="ecTableTd"><input type="text" name="efficacyChart[' + (a-1) +'].halfEfficlency"></td>' +
                      ' <td class="ecTableTd" rowspan="2"><input type="text" name="temperature' + (a-1) + '"></td> ' +
                      '</tr>' +
                      ' <tr> ' +
                      '<td class="ecTableTd"><p>100%</p></td> ' +
                      '<td  class="ecTableTd"><input type="text" name="efficacyChart[' + (a-1) +'].fullLoadCurrency"></td> ' +
                      '<td class="ecTableTd"><input type="text" name="efficacyChart[' + (a-1) +'].fullPull"></td> ' +
                      '<td class="ecTableTd"><input type="text" name="efficacyChart[' + (a-1) +'].fullPower"></td>' +
                      ' <td class="ecTableTd"><input type="text" name="efficacyChart[' + (a-1) +'].fullEfficlency"></td> ' +
                      '</tr>' +
                      '</table><div id="ec'+(a+1)+'"></div>';

                  document.getElementById('ec'+a).innerHTML += str;
              }
          </script>
        </form>
      </div>
    </div>

  </section>
</div>
<%@include file="../foot.html"%>
</body>
</html>
