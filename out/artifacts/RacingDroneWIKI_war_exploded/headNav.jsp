<%--
  Created by IntelliJ IDEA.
  User: asus-pc
  Date: 2017/8/28
  Time: 21:22
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<header>
    <button id="back" onclick="javascript:history.back(-1);" title="返回">
        <P>&nbsp;&lt;&nbsp;</P>
    </button>
    <button id="home" title="返回首页" onclick="javascript:window.location.href='/index.jsp';">
        <a href="/index.jsp">
            <P>首页</P>
        </a>
    </button>
    <nav >
        <button class="item" onclick="javascript:window.location.href='/moto';">
            <a href="/moto" >
                <p>电机</p>
            </a>
        </button>
        <button class="item" onclick="javascript:window.location.href='/electroSpeedRegulator';">
            <a href="/electroSpeedRegulator" >
                <p>电调</p>
            </a>
        </button>
        <button class="item" onclick="javascript:window.location.href='/frame';">
            <a href="/frame" >
                <p>机架</p>
            </a>
        </button>
        <button class="item" onclick="javascript:window.location.href='/imageTransmission';">
            <a href="/imageTransmission" >
                <p>图传</p>
            </a>
        </button>
        <button class="item" onclick="javascript:window.location.href='/cam';">
            <a href="/cam" >
                <p>摄像头</p>
            </a>
        </button>
        <button class="item" onclick="javascript:window.location.href='/flightControl';">
            <a href="/flightControl" >
                <p>飞控</p>
            </a>
        </button>
        <button class="item" onclick="javascript:window.location.href='/antenna';">
            <a href="/antenna" >
                <p>天线</p>
            </a>
        </button>
        <button class="item" onclick="javascript:window.location.href='/powerHub';">
            <a href="/powerHub" >
                <p>分电板</p>
            </a>
        </button>
        <button class="item" onclick="javascript:window.location.href='/prop';">
            <a href="/prop" >
                <p>桨叶</p>
            </a>
        </button>
        <button class="item" onclick="javascript:window.location.href='/battery';">
            <a href="/battery" >
                <p>电池</p>
            </a>
        </button>
    </nav>
    <form id="searchBar" method="get" action="/search">
        <input id="search" type="text" name="searchModel" placeholder="  输入设备型号搜索..." value="${param.searchModel}">
        <input id="searchButton" type="submit" value="搜索">
    </form>
</header>
