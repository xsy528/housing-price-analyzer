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
    <style type="text/css">
        table.gridtable {
            width: 100%;
            font-family: verdana,arial,sans-serif;
            font-size:11px;
            color:#333333;
            border-width: 1px;
            border-color: #666666;
            border-collapse: collapse;
                                  }
        table.gridtable th {
            border-width: 1px;
            padding: 8px;
            border-style: solid;
            border-color: #666666;
            background-color: #dedede;
        }
        table.gridtable td {
            border-width: 1px;
            padding: 8px;
            border-style: solid;
            border-color: #666666;
            background-color: #ffffff;
        }
    </style>


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



            <%--<div class="col-md-8 col-md-offset-2 section-container-spacer">--%>
                <%--<div class="row">
                    <div class="col-xs-12 col-md-6">
                        <img src="./assets/images/work001-02.jpg" class="img-responsive" alt="">
                        <p>Menphis skyline</p>
                    </div>
                    <div class="col-xs-12 col-md-6">
                        <img src="./assets/images/work001-03.jpg" class="img-responsive" alt="">
                        <p>Menphis skyline</p>
                    </div>
                </div>--%>
                    <table class="gridtable">
                        <tr>
                            <th>ID</th><th>2区域</th><th>3房源名称</th>
                            <th>4月租金/元</th><th>5版式</th><th>6面积/平米</th>
                            <th>7描述</th><th>8具体位置</th><th>9来源网站</th><th></th>
                        </tr>
                        <tr>
                            <td>0001</td><td>江干区</td><td>蓝桥名苑 新江花园清爽干净0房出租 房间朝南 周</td>
                            <td>3400</td><td>2室2厅1卫</td><td>90</td>
                            <td>无</td><td>九堡科技园</td><td>58同城</td>
                            <td><a href="show-delete1.jsp">删除</a> </td>
                        </tr>
                        <tr>
                            <td>0002</td><td>江干区</td><td>（可整租)三房一厅四季青浙一浙二市三庆春路</td>
                            <td>1800</td><td>主卧3室</td><td>85</td>
                            <td>距一号线客运中心地铁站744米</td><td>潮鸣</td><td>58同城</td>
                            <td><a href="show2.jsp">删除</a> </td>
                        </tr>
                        <tr>
                            <td>0003</td><td>江干区</td><td>肖邦2房家电齐全，可合租可做宿舍，有钥匙可看房</td>
                            <td>3400</td><td>2室2厅1卫</td><td>90</td>
                            <td>无</td><td>九堡客运站</td><td>58同城</td>
                            <td><a href="show2.jsp">删除</a> </td>
                        </tr>
                        <tr>
                            <td>0004</td><td>滨江区</td><td> 彭埠地铁站明月嘉苑 笕东嘉苑 龒麣万自住婚房装修，房</td>
                            <td>4300</td><td>3室1厅1卫</td><td>90</td>
                            <td>距四号线彭埠站639米</td><td>城东新城</td><td>58同城</td>
                            <td><a href="show2.jsp">删除</a> </td>
                        </tr>
                        <tr>
                            <td>0005</td><td>江干区</td><td>伊萨卡国际城，包物业费，下沙江滨地铁口旁，一线江景房</td>
                            <td>3700</td><td>2室2厅1卫</td><td>110</td>
                            <td>距离一号线下沙江滨站139米</td><td>下沙沿江</td><td>58同城</td>
                            <td><a href="show2.jsp">删除</a> </td>
                        </tr>
                        <tr>
                            <td>0006</td><td>江干区</td><td>西城纪蓝钻天城城西银泰橡树园芳满庭拱苑小区同人广场地</td>
                            <td>3600</td><td>2室1厅1卫</td><td>45</td>
                            <td>距离2号线丰潭路站1233米</td><td>申花</td><td>58同城</td>
                            <td><a href="show2.jsp">删除</a> </td>
                        </tr>
                        <tr>
                            <td>0007</td><td>江干区</td><td>楼下有公交 对面是菜市场 房东诚心出租 都是朝南带阳</td>
                            <td>2700</td><td>2室1厅1卫</td><td>75</td>
                            <td>无</td><td>新街</td><td>58同城</td>
                            <td><a href="show2.jsp">删除</a> </td>
                        </tr>
                        <tr>
                            <td>0008</td><td>临平区</td><td>临平理想银泰城，美的不要不要的，现场实拍，拎包入住</td>
                            <td>2500</td><td>1室1厅1卫</td><td>51</td>
                            <td>无</td><td>临平</td><td>58同城</td>
                            <td><a href="show2.jsp">删除</a> </td>
                        </tr>
                        <tr>
                            <td>0009</td><td>江干区</td><td> 天仙新苑 闸弄口地铁，单间出租，可做饭，随时看房无中</td>
                            <td>1180</td><td>主卧（3室）</td><td>20</td>
                            <td>无</td><td>城东新城</td><td>58同城</td>
                            <td><a href="show2.jsp">删除</a> </td>
                        </tr>
                        <tr>
                            <td>0010</td><td>余杭区</td><td>龙湖冠寓独立卫浴，家电齐全可做饭，拎包入住，AI小镇</td>
                            <td>1953</td><td>1室1厅1卫</td><td>35</td>
                            <td>无</td><td>老余杭</td><td>58同城</td>
                            <td><a href="show2.jsp">删除</a> </td>
                        </tr>
                        <tr>
                            <td>0011</td><td>江干区</td><td>客运中心 乔司南 九堡四季青 整租配套齐全 月付 首</td>
                            <td>2999</td><td>3室1厅1卫</td><td>76</td>
                            <td>距一号线乔司南站756米</td><td>乔司</td><td>58同城</td>
                            <td><a href="show2.jsp">删除</a> </td>
                        </tr>
                        <tr>
                            <td>0012</td><td>江干区</td><td>丁桥丁兰广场旁 冠宇隽园 年轻时尚自住精装修两房</td>
                            <td>2300</td><td>2室2厅1卫</td><td>80</td>
                            <td>无</td><td>丁桥</td><td>58同城</td>
                            <td><a href="show2.jsp">删除</a> </td>
                        </tr>
                        <tr>
                            <td>0013</td><td>江干区</td><td>肖邦2房家电齐全，可合租可做宿舍，有钥匙可看房</td>
                            <td>3400</td><td>2室2厅1卫</td><td>90</td>
                            <td>无</td><td>2室2厅1卫</td><td>90</td>
                            <td><a href="show2.jsp">删除</a> </td>
                        </tr>
                        <tr>
                            <td>0014</td><td>西湖区</td><td>西溪璞园 华东园翡翠城 华立 云立方 阿里 盛世嘉园</td>
                            <td>2100</td><td>2室2厅1卫</td><td>89</td>
                            <td>无</td><td>五常</td><td>58同城</td>
                            <td><a href="show2.jsp">删除</a> </td>
                        </tr>
                        <tr>
                            <td>0015</td><td>萧山区</td><td> 振宁路地铁口 LOFT单身公寓整租 客厅可放床可做两</td>
                            <td>5000</td><td>2室1厅2卫</td><td>70</td>
                            <td>距二号线振宁路站169米</td><td>钱江世纪城</td><td>58同城</td>
                            <td><a href="show2.jsp">删除</a> </td>
                        </tr>
                        <tr>
                            <td>0016</td><td>江干区</td><td>七堡地铁口800米 雍华府 押一付一 交通晓时代 电</td>
                            <td>1900</td><td>主卧（1室）</td><td>25</td>
                            <td>无</td><td>九堡科技园</td><td>58同城</td>
                            <td><a href="show2.jsp">删除</a> </td>
                        </tr>
                        <tr>
                            <td>0017</td><td>西湖区</td><td>西溪璞园，近印象城，楼层好，视野开阔，采光好，设计合</td>
                            <td>2550</td><td>3室2厅2卫</td><td>110</td>
                            <td>无</td><td>五常</td><td>58同城</td>
                            <td><a href="show2.jsp">删除</a> </td>
                        </tr>
                        <tr>
                            <td>0018</td><td>江干区</td><td>九和路地铁口附近 普升福邸精装三房两厅两卫 适合</td>
                            <td>4000</td><td>3室2厅2卫</td><td>89</td>
                            <td>距一号线九和路站884米</td><td>九堡科技园</td><td>58同城</td>
                            <td><a href="show2.jsp">删除</a> </td>
                        </tr>
                        <tr>
                            <td>0019</td><td>富阳区</td><td>单间。无中介。可月付。水印康庭。西联广场。人力资源。</td>
                            <td>800</td><td>次卧（4室）</td><td>10</td>
                            <td>无</td><td>三塘</td><td>58同城</td>
                            <td><a href="show2.jsp">删除</a> </td>
                        </tr>
                        <tr>
                            <td>0020</td><td>江干区</td><td>魅力之城 海棠公寓 多立方 精装龒房出租 配套物美新</td>
                            <td>3600</td><td>2室2厅1卫</td><td>90</td>
                            <td>无</td><td>九堡科技园</td><td>安居客</td>
                            <td><a href="show2.jsp">删除</a> </td>
                        </tr>
                    </table>
            <%--</div>--%>

            <br>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 共 30 页          &nbsp;&nbsp;  当前 第 01 页
            <c:choose>
                <c:when test="${page>1 }">
                    <a href="GetViews？page=${page-1 }"><input type="button" value="上一页"></a>
                </c:when>
                <c:otherwise>
                    <input type="button" value="上一页" disabled="disabled"/>
                </c:otherwise>
            </c:choose>
            &nbsp;&nbsp;&nbsp;&nbsp;
            <c:choose>
                <c:when test="${page!=pagenum }">
                    <a href="GetViews  ？page=${page+1 }"><input type="button" value="下一页"></a>
                </c:when>
                <c:otherwise>
                    <input type="button" value="下一页" disabled="disabled"/>
                </c:otherwise>
            </c:choose>

            &nbsp;
            <a href="ResultToExcel" title="导出结果"><button type="button"><font size="4">导出结果</font></button></a>
            &nbsp;
            <a href="/index/screen.jsp" title="筛选结果"><button type="button"><font size="4">筛选结果</font></button></a>

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
