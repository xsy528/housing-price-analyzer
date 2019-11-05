<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"
 isELIgnored="false" errorPage="/errorPage.html"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>房价分析器</title>
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
<body background="../images/1113228.jpg">
		<marquee>
			<h3 style="color:yellow">000000000000000</h3>
		</marquee>
		<div id="left">
			<img src="../images/myimage.JPG" height="125px" width="120px">
			<br>
			<font size="3" color="red">计科3班-邢少亚</font>	
		</div>
		<div>
		<h2>杭州房价分析器</h2>
		<a href="StartRHPCrawing" title="租房爬取分析"><button type="button"><font size="4">租房爬取分析</font></button></a>
		
		<a href="StartBHPCrawing" title="买房爬取分析"><button type="button"><font color="green" size="4">买房房爬取分析</font></button></a>
		
		<a href="Jsp/history.jsp" title="查看历史纪录"><button type="button"><font size="3">查看历史纪录</font></button></a>
		
		<a href="Jsp/managerweb.jsp" title="添加或删除爬取网站"><button type="button"><font size="3">添加或删除爬取网站</font></button></a>
		
		
		<a href="../myinfo/info.jsp" title="个人简历"><button type="button"><font size="4">个人简历</font></button></a>
		<br><br>
		
		
		</div>
		
</body>
</html>
