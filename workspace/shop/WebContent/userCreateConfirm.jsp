
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
	<title>UserCreateConfirm画面</title>
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

		#box {
			border: 1px solid #000000;
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
			<p>UserCreateConfirm</p>
		</div>
		<div>
			<h3>登録する内容は以下でよろしいですか。</h3>
			<table>
				<s:form action="UserCreateCompleteAction">
					<tr>
						<td>
							<label>ユーザー名</label>
						</td>
						<td>
							<s:property value="userName" escape="false" />
						</td>
					</tr>
					<tr>
						<td>
							<label>パスワード</label>
						</td>
						<td>
							<s:property value="userPassword" escape="false" />
						</td>
					</tr>
					<tr>
						<td>
							<label>メールアドレス</label>
						</td>
						<td>
							<s:property value="userMail" escape="false" />
						</td>
					</tr>
					<tr>
						<td>
							<label>住所</label>
						</td>
						<td>
							<s:property value="userAddress" escape="false" />
						</td>
					</tr>
					<tr>
						<td>
							<label>性別</label>
						</td>
						<td>
							<s:property value="gender" escape="false" />
						</td>
					</tr>
					<tr>
						<td>
							<label>生まれ年</label>
						</td>
						<td>
							<s:if test='birth=="1920"'>
							<td>1920年代</td>
							</s:if>
							<s:if test='birth=="1930"'>
							<td>1930年代</td>
							</s:if>
							<s:if test='birth=="1940"'>
							<td>1940年代</td>
							</s:if>
							<s:if test='birth=="1950"'>
							<td>1950年代</td>
							</s:if>
							<s:if test='birth=="1960"'>
							<td>1960年代</td>
							</s:if>
							<s:if test='birth=="1970"'>
							<td>1970年代</td>
							</s:if>
							<s:if test='birth=="19280"'>
							<td>1980年代</td>
							</s:if>
							<s:if test='birth=="1990"'>
							<td>1990年代</td>
							</s:if>
							<s:if test='birth=="2000"'>
							<td>2000年代</td>
							</s:if>
							<s:if test='birth=="2010"'>
							<td>2010年代</td>
							</s:if>
						</td>
					</tr>
					<tr>
						<td>
							<s:submit value="完了" />
							<input type="button" onclick="history.back()" value="戻る">
						</td>
					</tr>
				</s:form>
			</table>
		</div>
	</div>
	<div id="footer">
	 	<div id="pr">
		</div>
	</div>
</body>
</html>