<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.Tester, model.TesterLogic"%>
<%
    String[] testerLogic = (String[])request.getAttribute("test");
    String oyako = (String)request.getAttribute("oyako");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1">
<!--<link href="css/style.css" rel="stylesheet" type="text/css"/>-->
<!-- BootstrapのCSS読み込み -->
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
<title>sample</title>
</head>
<body>
	<p class="text-primary" style="font-size: 30px;">
		合計<%= testerLogic[0] %>点<br>
		<%if(oyako.equals("1")){%>
			みんなから<%= testerLogic[1] %>点<br>
		<%}else{ %>
			親から<%= testerLogic[1] %>点<br> 子から<%= testerLogic[2] %>点
		<%} %>
	</p>
	<a href="/portfolioshibutani/index.jsp">TOPへ</a>
	<script src="//code.jquery.com/jquery-1.11.2.min.js"></script>
	<script	src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>