<%--
  Created by IntelliJ IDEA.
  User: 邢少
  Date: 2019/5/24
  Time: 13:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"
         isELIgnored="false" errorPage="../errorPage.html"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta charset="UTF-8">
    <meta content="IE=edge" http-equiv="X-UA-Compatible">
    <meta content="width=device-width,initial-scale=1" name="viewport">
    <meta content="description" name="description">
    <meta name="google" content="notranslate" />
    <meta content="Mashup templates have been developped by Orson.io team" name="author">

    <!-- Disable tap highlight on IE -->
    <meta name="msapplication-tap-highlight" content="no">

    <link rel="apple-touch-icon" sizes="180x180" href="/index/assets/apple-icon-180x180.png">
    <link href="/index/assets/favicon.ico" rel="icon">

    <title>房价分析器</title>
    <%--<style type="text/css">
        button{
            background-color: #F195F8;
            width:120px;
            height:120px;
        }
    </style>--%>

    <link href="/index/main.3f6952e4.css" rel="stylesheet"></head>

<body class="minimal">
<div id="site-border-left"></div>
<div id="site-border-right"></div>
<div id="site-border-top"></div>
<div id="site-border-bottom"></div>
<!-- Add your content of header -->
<header>
    <nav class="navbar  navbar-fixed-top navbar-inverse">
        <div class="container">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar-collapse" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbar-collapse">
                <ul class="nav navbar-nav ">

                    <li><a href="/index/index.jsp" title="">01 : Home</a></li>
                    <li><a href="/index/works.html" title="">02 : Works</a></li>
                    <li><a href="/index/about.html" title="">03 : About me</a></li>
                    <li><a href="/index/contact.html" title="">04 : Contact</a></li>
                    <li><a href="/index/components.html" title="">05 : Components</a></li>
                </ul>


            </div>
        </div>
    </nav>
</header>
<!-- Add your site or app content here -->
<div class="hero-full-container background-image-container white-text-container" style="background-image: url('/index/assets/images/space.jpg')">
    <div class="container">
        <div class="row">
            <div class="col-xs-12">
                <div class="hero-full-wrapper">
                    <div class="text-content">
                        <h1>Hello,<br>
                            <span id="typed-strings">
                  <span>I'm Xing ShaoYa</span><br>
                  <span>安徽理工大学计算机学院</span><br>
                  <span>计科三班</span><br>
                <span>学号：2015302783</span><br>
                </span>
                            <span id="typed"></span>
                        </h1>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<script>
    document.addEventListener("DOMContentLoaded", function (event) {
        type();
        movingBackgroundImage();
    });
</script>


<script type="text/javascript" src="/index/main.70a66962.js"></script></body>

</html>