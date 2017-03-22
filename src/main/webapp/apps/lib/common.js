(function() {

	var origin = location.origin;
	var App = window.App = {};
	if (origin.indexOf("localhost") != -1) {
		App.baseUrl = "http://192.168.31.83:8082/webdemo";
	} else {
		App.baseUrl = origin + "/webdemo";
	}
	;

	// 判断是否登录
	App.isLogin = function(data) {
		$.ajax({
			url : App.baseUrl + "/beforeLogin.do?v=" + new Date().getTime(),
			type : 'post',
			data : data,
			dataType : "json",
			success : function(res) {
				if (res.freeLogin == "Y") {
					location.href = "answer_start.html" + location.search
							+ "&userName=" + res.userCode;
				}
			}
		});
	};
	App.isValidPhone = function(phone) {
		return (/^1[34578]\d{9}$/.test(phone));
	}
	App.getPayDetail = function(data, callback) {
		var url= App.baseUrl + "/payDetailController/showPayDetail.do?id=1";
		console.log(url);
		$.ajax({
			url :url,
			type : 'post',
			data : {},
			dataType : "json",
			contentType : 'application/json;charset=utf-8',
			error : function(err) {
				console.log('访问出错,请稍后重试!');
			},
			success : function(res) {
				callback(res);
			}
		});
	}
})();
