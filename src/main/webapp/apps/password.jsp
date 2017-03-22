<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" id="view"
	content="width=device-width, initial-scale=1, minimum-scale=1, user-scalable=no">
<script src="lib/screenAdapter.js"></script>
<link rel="stylesheet" type="text/css" href="apps/css/reset.css">
<link rel="stylesheet" type="text/css" href="apps/css/login.css">
<title>达博威</title>
</head>
<body>
	<section class="content">
		<Image class="logo" src='./apps/images/app_logo.png' />
		<div class="text">
			<p>
				<span style="font-weight: bold; font-size: 0.6rem">修改登录密码</span>
			</p>

			<form action="modify.do" method="POST"
				onSubmit="return checkInput(this)">
				<p>
					<input type="text" name="mobile" placeholder="请输入您的手机号" id="phone" />
				</p>
				<p>
					<input type="text" name="password" placeholder="请输入密码"
						id="password" />
				</p>
				<p>
					<input type="text" name="passwordAgain" placeholder="请再次输入密码"
						id="passwordAgain" />
				</p>
				<input type="submit" value="确认修改" class="confirm-btn" />
			</form>
		</div>
	</section>
	<script src="apps/lib/common.js"></script>
	<script>
		document.getElementById("phone").focus();

		function checkInput() {
			var phoneValue = document.getElementById("phone").value.trim();
			var passwordValue = document.getElementById("password").value
					.trim();
			var passwordAgainValue = document.getElementById("passwordAgain").value
					.trim();
			if (phoneValue === null || phoneValue === ''
					|| phoneValue === undefined) {
				document.getElementById("phone").focus();
				return false;
			} else if (passwordValue === null || passwordValue === ''
					|| passwordValue === undefined) {
				document.getElementById("password").focus();
				return false;
			} else if (passwordAgainValue === null || passwordAgainValue === ''
					|| passwordAgainValue === undefined) {
				document.getElementById("passwordAgain").focus();
				return false;
			} else if (passwordValue !== passwordAgainValue) {
				document.getElementById("password").innerHTML = "abc222222";
				document.getElementById("passwordAgain").innerHTML = "abc";
				document.getElementById("passwordAgain").focus();
				return false;
			} else if (!App.isValidPhone(phoneValue)) {
				alert('请输入正确格式的手机号码!');
				document.getElementById("phone").focus();
				return false;
			}
			return true;
		}
	</script>
</body>
</html>
