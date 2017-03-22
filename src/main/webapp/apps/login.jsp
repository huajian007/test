<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" id="view"
	content="width=device-width, initial-scale=1, minimum-scale=1, user-scalable=no">
<script src="apps/lib/screenAdapter.js"></script>
<link rel="stylesheet" type="text/css" href="apps/css/reset.css">
<link rel="stylesheet" type="text/css" href="apps/css/login.css">
<title>达博威</title>
</head>
<body>
	<section class="content">
		<Image class="logo" src='./apps/images/app_logo.png' />
		<div class="text">
			<p>
				<span style="font-weight: bold; font-size: 0.6rem">登录公司系统</span>
			</p>

			<form action="userLogin.do" method="POST"
				onSubmit="return checkInput(this)">
				<p>
					<input type="text" name="mobile" placeholder="请输入您的手机号" id="mobile" />
				</p>
				<p>
					<input type="text" name="password" placeholder="请输入密码(默认手机号后6位)"
						id="password" />
				</p>
				<input type="submit" value="绑定账号" class="confirm-btn" />
			</form>
		</div>
	</section>
	<!-- <script src="lib/zepto.min.js"></script> -->
	<script src="apps/lib/common.js"></script>
	<script>
		document.getElementById("mobile").focus();

		function checkInput() {
			var mobile = document.getElementById("mobile").value.trim();
			var password = document.getElementById("password").value.trim();
			if (mobile === null || mobile === '' || mobile === undefined) {
				document.getElementById("mobile").focus();
				return false;
			} else if (password === null || password === ''
					|| password === undefined) {
				document.getElementById("password").focus();
				return false;
			} else if (!App.isValidPhone(mobile)) {
				alert('请输入正确格式的手机号码!');
				document.getElementById("mobile").focus();
				return false;
			}
			return true;
		}
	</script>
</body>
</html>

