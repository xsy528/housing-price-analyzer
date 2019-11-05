<%--
  Created by IntelliJ IDEA.
  User: 邢少
  Date: 2019/5/24
  Time: 14:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta content="IE=edge" http-equiv="X-UA-Compatible">
    <meta content="width=device-width,initial-scale=1" name="viewport">
    <meta content="description" name="description">
    <meta name="google" content="notranslate" />
    <meta content="Mashup templates have been developped by Orson.io team" name="author">

    <!-- Disable tap highlight on IE -->
    <meta name="msapplication-tap-highlight" content="no">

    <link rel="apple-touch-icon" sizes="180x180" href="./assets/apple-icon-180x180.png">
    <link href="./assets/favicon.ico" rel="icon">

    <title>房价爬取系统</title>

    <link href="./main.3f6952e4.css" rel="stylesheet"></head>

<body class="">
<div id="site-border-left"></div>
<div id="site-border-right"></div>
<div id="site-border-top"></div>
<div id="site-border-bottom"></div>
<!-- Add your content of header -->
<header>
    <nav class="navbar  navbar-fixed-top navbar-default">
        <div class="container">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar-collapse" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbar-collapse">
                <ul class="nav navbar-nav ">
                    <li><a href="./index.jsp" title="">01 : Home</a></li>
                    <li><a href="./works.html" title="">02 : Works</a></li>
                    <li><a href="./about.html" title="">03 : About me</a></li>
                    <li><a href="./contact.html" title="">04 : Contact</a></li>
                    <li><a href="./components.html" title="">05 : Components</a></li>
                </ul>


                <ul class="nav navbar-nav navbar-right navbar-small visible-md visible-lg">
                    <li><a href="./index.html" title="" class="active">001</a></li>
                    <li><a href="./index.html" title="">002</a></li>
                    <li><a href="./index.html" title="">003</a></li>
                    <li><a href="./index.html" title="">004</a></li>
                    <li><a href="./index.html" title="">005</a></li>
                    <li><a href="./index.html" title="">006</a></li>
                </ul>


            </div>
        </div>
    </nav>
</header>
<div class="section-container">
    <div class="container">
        <div class="row">
            <div class="col-xs-12">
                <img src="./assets/images/work001-01.jpg" class="img-responsive" alt="">
                <div class="card-container">
                    <div class="text-center">
                        <h1 class="h2">爬取结果</h1>
                    </div>


                </div>
            </div>



            <%--<div class="col-md-8 col-md-offset-2 section-container-spacer">
                <div class="row">
                    <div class="col-xs-12 col-md-6">
                        <img src="./assets/images/work001-02.jpg" class="img-responsive" alt="">
                        <p>Menphis skyline</p>
                    </div>
                    <div class="col-xs-12 col-md-6">
                        <img src="./assets/images/work001-03.jpg" class="img-responsive" alt="">
                        <p>Menphis skyline</p>
                    </div>
                </div>
            </div>--%>

            <table id="show" border="1" cellspacing="0">
                <thead>
                <tr>
                    <th>id</th>
                    <th>2</th>
                    <th>3</th>
                    <th>4</th>
                    <th>5</th>
                    <th>6</th>
                    <th>7</th>
                    <th>8</th>
                </tr>
                </thead>
                <c:forEach items="${models}" var="item">
                    <tr>
                        <td>${item.getM1()}</td>
                        <td>${item.getM2()}</td>
                        <td>${item.getM3()}</td>
                        <td>${item.getM4()}</td>
                        <td>${item.getM5()}</td>
                        <td>${item.getM6()}</td>
                        <td>${item.getM7()}</td>
                        <td>${item.getM8()}</td>

                    </tr>
                </c:forEach>

            </table>
            <br>
            共${pagenum } 页            当前 第${page }页
            <c:choose>
                <c:when test="${page>1 }">
                    <a href="GetViews？page=${page-1 }"><input type="button" value="上一页"></a>
                </c:when>
                <c:otherwise>
                    <input type="button" value="上一页" disabled="disabled"/>
                </c:otherwise>
            </c:choose>

            <c:choose>
                <c:when test="${page!=pagenum }">
                    <a href="GetViews  ？page=${page+1 }"><input type="button" value="下一页"></a>
                </c:when>
                <c:otherwise>
                    <input type="button" value="下一页" disabled="disabled"/>
                </c:otherwise>
            </c:choose>


            <a href="ResultToExcel" title="导出结果"><button type="button"><font size="4">导出结果</font></button></a>

            <a href="screen.jsp" title="筛选结果"><button type="button"><font size="4">筛选结果</font></button></a>

        </div>

            <div class="col-xs-12">
                <img src="./assets/images/work001-04.jpg" class="img-responsive" alt="">
            </div>

        </div>
    </div>
</div>


<footer class="footer-container text-center">
    <div class="container">
        <div class="row">
            <div class="col-xs-12">
                <p>© UNTITLED | Website created with Mashup Template / Unsplash - More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></p>
            </div>
        </div>
    </div>
</footer>

<script>
    document.addEventListener("DOMContentLoaded", function (event) {
        navActivePage();
    });
</script>

<script type="text/javascript" src="./main.70a66962.js"></script></body>

</html>
