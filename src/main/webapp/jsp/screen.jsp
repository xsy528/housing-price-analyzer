<%--
  Created by IntelliJ IDEA.
  User: 邢少
  Date: 2019/5/23
  Time: 23:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>筛选数据</title>
    <style type="text/css">
        div{
            width: 80%;
            height:80%;
            padding: 13px;

            position: absolute;
            left: 28%;
            top: 40%;
            margin-left: -200px;
            margin-top: -200px;

            background-color: rgba(240, 255, 255, 0.5);

            border-radius: 10px;
            text-align: center;
        }
        #left{
            width:130px;
            height:140px;
            padding: 13px;

            position: absolute;
            left: 16%;
            top: 35%;

            background-color: rgba(240, 255, 255, 0.5);

            border-radius: 10px;
            text-align: center;
        }
        a{
            float: left;
            margin-left: 50px;
        }

        button{
            background-color: #F195F8;
            width:120px;
            height:120px;
        }
        font{
            color: #CC3333;
        }
    </style>
</head>
<body background="images/1113228.jpg">
<marquee>
    <h1 style="color:red">抱歉不是专业前端哈，页面并不是太美观</h1>
</marquee>
<div id="left">
    <img src="images/myimage.JPG" height="125px" width="120px">
    <br>
    <font size="3" color="red">计科3班-邢少亚</font>
</div>
<div>
    <h2>筛选条件</h2>




    <a href="Screen" title="筛选"><button type="button"><font size="4">筛选</font></button></a>


</div>

</body>
</html>