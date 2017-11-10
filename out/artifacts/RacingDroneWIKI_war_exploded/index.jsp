<!DOCTYPE html>
<html lang="en" xmlns:jsp="http://java.sun.com/jsf/facelets">
<head>
    <meta charset="UTF-8">
    <title>竞速无人机资料库</title>
    <link type="text/css" rel="stylesheet" href="mainHorizontal.css">
</head>
<body>
<section id="main" >
    <a id="dataInput" href="itemInsert/dataInput.jsp">数据录入</a>
    <h1>竞速无人机资料库</h1>
    <form id="searchBar" method="get" action="/search">
        <input id="search" type="text" name="searchModel" placeholder="  输入设备型号搜索...">
        <input id="searchButton" type="submit" value="搜索">
    </form>
    <nav>
        <button class="item" onclick="javascript:window.location.href='/moto';" >
            <a href="/moto" >
                <img src="img/moto.png" class="itemImg"/>
                <p>电机</p>
            </a>
        </button>
        <button class="item" onclick="javascript:window.location.href='/electroSpeedRegulator';">
            <a href="/electroSpeedRegulator" >
                <img src="img/esc.jpg" class="itemImg"/>
                <p>电调</p>
            </a>
        </button>
        <button class="item" onclick="javascript:window.location.href='/frame';">
            <a href="/frame" >
                <img src="img/fra.jpg" class="itemImg"/>
                <p>机架</p>
            </a>
        </button>
        <button class="item" onclick="javascript:window.location.href='/imageTransmission';">
            <a href="/imageTransmission" >
                <img src="img/it.jpg" class="itemImg"/>
                <p>图传</p>
            </a>
        </button>
        <button class="item" onclick="javascript:window.location.href='/cam';">
            <a href="/cam" >
                <img src="img/cam.jpg" class="itemImg"/>
                <p>摄像头</p>
            </a>
        </button>
        <br>
        <button class="item" onclick="javascript:window.location.href='/flightControl';">
            <a href="/flightControl" >
                <img src="img/fc.jpg" class="itemImg"/>
                <p>飞控</p>
            </a>
        </button>
        <button class="item" onclick="javascript:window.location.href='/antenna';">
            <a href="/antenna" >
                <img src="img/ant.jpg" class="itemImg"/>
                <p>天线</p>
            </a>
        </button>
        <button class="item" onclick="javascript:window.location.href='/powerHub';">
            <a href="/powerHub" >
                <img src="img/ph.jpg" class="itemImg"/>
                <p>分电板</p>
            </a>
        </button>
        <button class="item" onclick="javascript:window.location.href='/prop';">
            <a href="/prop" >
                <img src="img/prop.png" class="itemImg"/>
                <p>桨叶</p>
            </a>
        </button>
        <button class="item" onclick="javascript:window.location.href='/battery';">
            <a href="/battery" >
                <img src="img/bat.jpg" class="itemImg"/>
                <p>电池</p>
            </a>
        </button>
    </nav>
    <%@include file="foot.html"%>
</section>
</body>
</html>