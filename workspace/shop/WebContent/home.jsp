<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="Content-Style-Type" content="text/css" />
	<meta http-equiv="Content-Script-Type" content="text/javascript" />
	<meta http-equiv="imagetoolbar" content="no" />
	<meta name="description" content="" />
	<meta name="keywords" content="" />
	<title>Home画面</title>
	<style type="text/css">
		body {
		   margin:0;
		   padding:0;
		   line-height:1.6;
		   letter-spacing:1px;
		   font-family:Verdana, Helvetica, sans-serif;
		   font-size:12px;
		   color:#333;
  			background-size: cover;
		}

		table {
			text-align:center;
			margin:0 auto;
		}

		/* ========TEMPLATE LAYOUT======== */
		#top {
		   width:780px;
		   margin:30px auto;
		   border:1px solid #333;
		}

		#header {
		   width: 100%;
		   height: 80px;
		   background: linear-gradient(-45deg, rgba(246, 255, 0, .8), rgba(255, 0, 161, .8));
		}

		#main {
		   width: 100%;
		   height: 500px;
		   text-align: center;
		}

		#footer {
			width: 100%;
			height: 80px;
			background: linear-gradient(-45deg, rgba(246, 255, 0, .8), rgba(255, 0, 161, .8));
			clear:both;
		}

		#text-center {
			display: inline-block;
			text-align: center;
		}

		#hr{
			height: 1px;
  			border: none;
  			border-top: 1px #000000 dashed;
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
			<p>Home</p>
		</div>

		<div id="text-center">
		<h1>ようこそ！ 果物ショップへ！！</h1>
		<div id="text-center">
			<s:form action="HomeAction">
				<s:submit value="商品購入"/>
			</s:form>
			<s:if test="#session.idItem != null">
				<p>ログアウトする場合は<a href='<s:url action="LogoutAction" />'>こちら</a></p>
			</s:if>
		</div>
	</div>
</div>

<div id ="hr"></div>
		<s:form action="StaffAction">
				<s:textfield name="staffId" label="スタッフ名"/>
				<s:password name="staffPassword" label="スタッフ・パスワード"/>
				<s:submit value="スタッフ・ログイン" />
		</s:form>



	<div id="footer">
	 	<div id="pr">

		</div>
	</div>
</body>
</html>