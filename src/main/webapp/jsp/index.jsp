<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" errorPage="errorPage.html"%>
    <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<base href="<%=basePath%>">
<title>慕秋电子商务-首页</title>
<link rel="stylesheet" href="css/common.css"/>
<link rel="stylesheet" href="css/style.css" />
<link rel="stylesheet" href="css/icons.css" />
<link rel="stylesheet" href="css/table.css" />
</head>
<body>
	<%application.setAttribute("name", null); %>
	<!--顶部-->
		<div class="top">
    	<div class="top_center">
    <c:if test="${name==null }">
    		<ul class="top_lr">
            	<li><a href="jsp/login.jsp" style="color: red;">亲,请登入</a></li>
                <li><a href="jsp/register.jsp">免费注册</a></li>
            </ul>
            <ul class="top_bars">
                <li><a href="jsp/login.jsp">我的订单<span class="jt_down"></span></a>|</li>
                <li><a href="#">关注本站<span class="jt_down"></span></a>|</li>
                <li><a href="#">网站导航<span class="jt_down"></span></a></li>
            </ul>
    </c:if>
    <c:if test="${name!=null }">
    		<ul class="top_lr">
            	<li><a>欢迎  ${name}</a></li>
            </ul>
            <ul class="top_bars">
            	<li><a href="jsp/login.jsp">退出</a>|</li>
                <li><a href="goOtherPage?id=confirm">我的订单<span class="jt_down"></span></a>|</li>
                <li><a href="#">关注杰普<span class="jt_down"></span></a>|</li>
                <li><a href="#">网站导航<span class="jt_down"></span></a></li>
            </ul>
   	 </c:if>
     </div>
    </div>
    <!--头部-->
    <div class="header3">
    	<a href="jsp/index.jsp"><img src="images/LOG.JPG"></a>
    	<div class="h3_center">
        	<div class="search_box">
            	<input type="text"/>
                <span>搜索</span>
            </div>
            <p>
            	<a href="jsp/list.jsp">文学类</a>|
            	<a href="jsp/list.jsp">教育类</a>|
                <a href="jsp/list.jsp">计算机</a>|
                <a href="jsp/list.jsp">儿童类</a>|
                <a href="jsp/list.jsp">漫画类</a>|
            </p>
        </div>
        <div class="h3_right">
        	<div class="myyy">
            	<a href="jsp/login.jsp">登陆</a>
                <span class="sj_down"></span>
             </div>
            <div class="tsc">
           	  <a href="ListSer">逛逛书城</a>
              <span class="sj_right"> </span>
            </div>
         </div>
    </div>
    <!--头部导航-->
    <div class="nav_top">
    	<div class="nav_top_center">
            <div>
                全部图书分类
            </div>
            <ul>
                <li><a href="jsp/list.jsp">文学类</a></li>
                <li><a href="jsp/list.jsp">教育类</a></li>
                <li><a href="jsp/list.jsp">计算机</a></li>
                <li><a href="jsp/list.jsp">儿童类</a></li>
                <li><a href="jsp/list.jsp">漫画类</a></li>
            </ul>
        </div>
    </div>
    
	<div class="container3">
    	<div class="c3_b1">
        	<div class="c3_b1_left">
            	<dl>
               		<dd>
                    	<h1>文学类</h1>
                    	<p>
                        	<a href="ListSer">文学1</a>
                           	<a href="ListSer">文学2</a>
                            <a href="ListSer">文学3</a>
                            <a href="ListSer">文学4</a>
                      	</p>
                    </dd>
                    <dd>
                    	<h1>教育类</h1>
                    	<p>
                        	<a href="ListSer">教育1</a>
                           	<a href="ListSer">教育2</a>
                      	</p>
                    </dd>
                    <dd>
                    	<h1>计算机</h1>
                    	<p>
                           	<a href="ListSer">计算机1</a>
                            <a href="ListSer">计算机2</a>
                            <a href="ListSer">计算机3</a>
                      	</p>
                    </dd>
                    <dd>
                    	<h1>儿童类</h1>
                    	<p>
                        	<a href="ListSer">图书1</a>
                           	<a href="ListSer">图书2</a>
                            <a href="ListSer">图书3</a>
                      	</p>
                    </dd>
                    <dd>
                    	<h1>漫画类</h1>
                    	<p>
                        	<a href="ListSer">漫画1</a>
                      	</p>
                    </dd>
                    <dd>
                    	<h1>工具书</h1>
                    	<p>
                        	<a href="ListSer">工具书1</a>
                           	<a href="ListSer">工具书2</a>
                      	</p>
                    </dd>
                    <dd class="last">
                    	<h1>期刊</h1>
                    	<p>
                        	<a href="ListSer">期刊1</a>
                           	<a href="ListSer">期刊2</a>
                            <a href="ListSer">期刊3</a>
                      	</p>
                    </dd>
                </dl>
            </div>
            <div class="c3_b1_center">
            	<div>
                	<a href="viewBook.html"><img src="images/ad1.png"></a>
                </div>
                <div class="c3_b1_c_bottom">
                    <ul>
                        <li>
                           <a href="ViewBookSer"><img src="images/p011.png"/></a>
                           <a href="ViewBookSer">Java从入门到精通</a>  
                        </li>
                       <li>
                           <a href="ViewBookSer"><img src="images/p011.png"/></a> 
                           <a href="ViewBookSer">Java从入门到精通</a> 
                        </li>
                        <li>
                           <a href="ViewBookSer"><img src="images/p011.png"/></a> 
                           <a href="ViewBookSer">Java从入门到精通</a> 
                        </li>
                    </ul>
            	</div>
            </div>
            <div class="c3_b1_right">
            	<h1>本站快报</h1>
            	<ul>
                	<li><a href="goOtherPage?id=detail">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                	<li><a href="goOtherPage?id=detail">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                	<li><a href="goOtherPage?id=detail">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                	<li><a href="goOtherPage?id=detail">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                	<li><a href="goOtherPage?id=detail">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                	<li><a href="goOtherPage?id=detail">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                	<li><a href="goOtherPage?id=detail">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                	<li><a href="goOtherPage?id=detail">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                </ul>
            </div>
            <div style="clear:both"></div>
        </div>
     </div>
    <div class="c20"></div>
    <!--脚部-->
    <div class="footer3">
    	<div class="f3_top">
        	<div class="f3_center">
                <div class="ts1">品目繁多 愉悦购物</div>
                <div class="ts2">正品保障 天天低价</div>
                <div class="ts3">极速物流 特色定制</div>
                <div class="ts4">优质服务 以客为尊</div>
            </div>
        </div>
        <div class="f3_middle">
        	<ul class="f3_center">
            	<li class="f3_mi_li01">
                	<h1>购物指南</h1>
                    <p>常见问题</p>
                    <p>找回密码</p>
                    <p>会员介绍</p>
                    <p>购物演示</p>
                </li>
                <li class="f3_mi_li01">
                	<h1>配送方式</h1>
                    <p>常见问题</p>
                    <p>找回密码</p>
                    <p>会员介绍</p>
                    <p>购物演示</p>
                </li>
                <li class="f3_mi_li01">
                	<h1>支付方式</h1>
                    <p>常见问题</p>
                    <p>找回密码</p>
                    <p>会员介绍</p>
                    <p>购物演示</p>
                </li>
                <li class="f3_mi_li01">
                	<h1>售后服务</h1>
                    <p>常见问题</p>
                    <p>找回密码</p>
                    <p>会员介绍</p>
                    <p>购物演示</p>
                </li>
                <li class="f3_mi_li01">
                	<h1>服务保障</h1>
                    <p>常见问题</p>
                    <p>找回密码</p>
                    <p>会员介绍</p>
                    <p>购物演示</p>
                </li>
                <li class="f3_mi_li06">
                	<h1>客服中心</h1>
                    <img src="images/qrcode_jprj.jpg" width="80px" height="80px">
                    <p>抢红包、疑问咨询、优惠活动</p>
                </li>
            </ul>
        </div>
        <div class="f3_bottom">
        	<p class="f3_links">
                <a href="jsp/accessme.jsp">关于我们</a>|
                <a href="jsp/accessme.jsp">联系我们</a>|
                <a href="http://www.baidu.com">友情链接</a>|
                <a href="http://www.taobao.com">供货商入驻</a> 
           	</p>
            <p>沪ICP备14033591号-8 </p>
          	<img src="images/police.png">
        </div>
    </div>

</body>
</html>