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
<style>
.err_logo {
	color: white;
	width: 60vw;
	margin: 35vw 20vw 5vw;
	text-align: center;
}

.box {
	color: white;
	width: 50vw;
	margin: 0 25vw;
	text-align: center;
}

#errMsg {
	font-weight: bold;
	font-size: 0.5rem;
	color: red;
}
</style>
</head>
<body>
	<section class="content">
		<Image class="err_logo" src='./apps/images/app_logo.png' />
		<p class="box">
			<span id="errMsg">${message}</span>
		</p>
	</section>
	<script src="apps/lib/zepto.min.js"></script>
	<script src="apps/lib/common.js"></script>
	<script>
		// ${message}
	</script>
</body>
</html>
