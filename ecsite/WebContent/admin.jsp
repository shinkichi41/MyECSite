<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css"/>
<meta http-equiv="Content-Script-Type" content="text/javascript"/>
<meta http-equiv="imagetoolbar" content="no"/>
<meta name="description" content=""/>
<meta name="keywords" content=""/>
<title>Admin画面</title>

<style type="text/css">
	body{
	margin:0;
	padding:0;
	line-height:1.6;
	letter-spacing:1px;
	font-family:Verdana, Helvetica,sans-serif;
	font-size:12px;
	color:#333;
	background:#fff;
	}

	table{
	text-align:center;
	margin:0 auto;
	}

	/* ========ecsite LAYOUT======= */
	#top{
	width:780px;
	margin:30px auto;
	border:1px solid #333;
	}

	#header{
	width:100%;
	height:80px;
	background-color:black;
	}

	#main{
	width:100%;
	height:500px;
	text-align:center;
	}

	#footer{
	width:100%;
	height:80px;
	background-color:black;
	clear:both;
	}

	#text-center{
	display:inline-block;
	text-align:center;
	}

	#left{
	display:inline-block;
	margin-right:30px;
	}

	#right{
	display:inline-block;
	margin-left:30px;
	}

	fieldset{
	padding:50px;
	border: 1px solid black;
	font-size: 20px;
	}

	#button{
	padding-top:50px;
	}
	</style>
</head>
<body>
	<div id="header">
		<div id="pr">
		</div>
	</div>

	<div id="main">
		<div id="top">
			<p>管理者画面</p>
		</div>
		<div id="left">
			<fieldset>
				<legend>商品</legend>
				<div id="text-center">
					<s:form action="ItemCreateAction">
						<s:submit value="新規登録"/>
					</s:form>
				</div>
				<br>
				<div id="text-center">
					<s:form action="ItemListAction">
						<s:submit value="一覧"/>
					</s:form>
				</div>
			</fieldset>
		</div>
		<div id="right">
			<fieldset>
				<legend>ユーザー</legend>
				<div id="text-center">
					<s:form action="UserCreateAction">
						<s:submit value="新規登録"/>
					</s:form>
				</div>
				<br>
				<div id="text-center">
					<s:form action="UserListAction">
						<s:submit value="一覧"/>
					</s:form>
				</div>
			</fieldset>
		</div>
		<div id="button">
			<a href='<s:url action="LogoutAction"/>'>ログアウト</a>
		</div>
	</div>

	<div id="footer">
		<div id="pr">
		</div>
	</div>
</body>
</html>