<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>个人简历</title>
<style type="text/css">
		div{
			 width: 90%;
		    height:170%;
		    padding: 13px;
		 
		    position: absolute;
		    left: 19%;
		    top: 30%;
		    margin-left: -200px;
		    margin-top: -200px;
		 
		    background-color: rgba(240, 255, 255, 0.5);
		 
		    border-radius: 10px;
		    text-align: center;
		}
		a{
			position: fixed;
			top:20%;
			left:82%;
		}
</style>
</head>
<body bgcolor="black">
	<div>
		<a href="DownloadSer" title="下载简历" target="_blank"><button type="button">简历下载</button></a>
		<img  src="myinfo/info.png">
	</div>
	
</body>
</html>