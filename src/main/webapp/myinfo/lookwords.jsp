<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" errorPage="errorPage.html"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>留言</title>
<style type="text/css">
	div{
			width: 500px;
		    height:400px;
		    padding: 13px;
		 
		    position: absolute;
		    left: 40%;
		    top: 50%;
		    margin-left: -200px;
		    margin-top: -200px;
		 
		    background-color: rgba(240, 255, 255, 0.5);
		 
		    border-radius: 10px;
		    text-align: center;
		}

</style>
</head>
<body bgcolor="#C4E9F5">
		<div>
				<table>
				<tr>
				<td>序号</td><td>&nbsp</td><td>留言内容</td><td>&nbsp</td><td>留言时间</td>
				</tr>
				<c:forEach items="${leavewords }" var="w" varStatus="words">
				<tr>
					<td>${w.id}</td>
					<td>&nbsp</td>
					<td>${w.leaveWords}</td>
					<td>&nbsp</td>
					<td>${w.leaveDate }</td>
				</tr>
			</c:forEach>
				</table>
		<a href="index.jsp" title="返回首页"><button type="button">返回首页</button></a>
		
		</div>
			
</body>
</html>