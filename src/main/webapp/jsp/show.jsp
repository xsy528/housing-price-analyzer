<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"
 isELIgnored="false" errorPage="../errorPage.html"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>爬取结果</title>
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
		<h2>爬取结果</h2>
		
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
		
</body>
</html>
