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
        <button class="item" onclick="javascript:window.location.href='/moto.list';">
            <a href="/moto.list" >
                <p>电机</p>
            </a>
        </button>
        <button class="item" onclick="javascript:window.location.href='/esc.list';">
            <a href="/esc.list" >
                <p>电调</p>
            </a>
        </button>
        <button class="item" onclick="javascript:window.location.href='/fra.list';">
            <a href="/fra.list" >
                <p>机架</p>
            </a>
        </button>
        <button class="item" onclick="javascript:window.location.href='/it.list';">
            <a href="/it.list" >
                <p>图传</p>
            </a>
        </button>
        <button class="item" onclick="javascript:window.location.href='/cam.list';">
            <a href="/cam.list" >
                <p>摄像头</p>
            </a>
        </button>
        <button class="item" onclick="javascript:window.location.href='/fc.list';">
            <a href="/fc.list" >
                <p>飞控</p>
            </a>
        </button>
        <button class="item" onclick="javascript:window.location.href='/ant.list';">
            <a href="/ant.list" >
                <p>天线</p>
            </a>
        </button>
        <button class="item" onclick="javascript:window.location.href='/ph.list';">
            <a href="/ph.list" >
                <p>分电板</p>
            </a>
        </button>
        <button class="item" onclick="javascript:window.location.href='/prop.list';">
            <a href="/prop.list" >
                <p>桨叶</p>
            </a>
        </button>
        <button class="item" onclick="javascript:window.location.href='/bat.list';">
            <a href="/bat.list" >
                <p>电池</p>
            </a>
        </button>
        </form>
    </nav>
    <form id="searchBar" method="get" action="/search">
        <input id="search" type="text" name="searchModel" placeholder="  输入设备型号搜索..." value="${param.searchModel}">
        <input id="searchButton" type="submit" value="搜索">
    </form>
</header>
