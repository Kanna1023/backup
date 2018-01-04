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
	<meta charset="utf-8">
	<title>UserCreate画面</title>
	<style type="text/css">
		/* ========TAG LAYOUT======== */
		body {
		   margin:0;
		   padding:0;
		   line-height:1.6;
		   letter-spacing:1px;
		   font-family:Verdana, Helvetica, sans-serif;
		   font-size:12px;
		   color:#333;
		   background:#fff;
		}

		table {
			text-align:center;
			margin:0 auto;
		}

		/* ========ID LAYOUT======== */
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
	</style>
</head>
<body>
	<div id="header">
	 	<div id="pr">
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>UserCreate</p>
		</div>
		<div>
			<s:if test="errorMassage != ''">
				<s:property value="errorMassage" escape="false" />
			</s:if>

		<table>
			<s:form action="UserCreateConfirmAction">
				<tr>
					<td>
						<label>ユーザー名</label>
					</td>
					<td>
						<input type="text" name="userName">
					</td>
				</tr>
				<tr>
					<td>
						<label>パスワード</label>
					</td>
					<td>
						<input type="text" name="userPassword">
					</td>
				</tr>
				<tr>
					<td>
						<label>メールアドレス</label>
					</td>
					<td>
						<input type="text" name="userMail">
					</td>
				</tr>
				<tr>
					<td>
						<label>住所</label>
					</td>
					<td>
						<input type="text" name="userAddress">
					</td>
				</tr>
				<tr>
					<td>
						<label>性別</label>
					</td>
					<td>
						<select name="gender">
							<option value="male">男性</option>
							<option value="female">女性</option>
						</select>
					</td>
				</tr>
				<tr>
					<td>
						<label>生まれ年</label>
					</td>
					<td>
						<select name="birth">
							<option value="1920">1920年代</option>
							<option value="1930">1930年代</option>
							<option value="1940">1940年代</option>
							<option value="1950">1950年代</option>
							<option value="1960">1960年代</option>
							<option value="1970">1970年代</option>
							<option value="1980">1980年代</option>
							<option value="1990" selected>1990年代</option>
							<option value="2000">2000年代</option>
							<option value="2010">2010年代</option>
						</select>
					</td>
				</tr>
				<s:submit value="登録"/>
			</s:form>
		</table>


			<div>
				<span>前画面に戻る場合は</span><a href='<s:url action="HomeAction" />'>こちら</a>
			</div>
		</div>
	</div>
		<div id="footer">
	 	<div id="pr">
		</div>
	</div>
</body>
</html>