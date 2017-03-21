(function () {

  var origin = location.origin;
  var App = window.App = {};
  if (origin.indexOf("localhost")!=-1) {
      App.baseUrl = "http://192.168.31.252:8080/webdemo/userController";
  } else {
      App.baseUrl = origin+"/webdemo/userController";
  };

  // 判断是否登录
  // App.isLogin = function (data) {
  //     $.ajax({
  //         url:App.baseUrl+"/beforeLogin.do?v="+new Date().getTime(),
  //         type: 'post',
  //         data:data,
  //         dataType: "json",
  //         success: function (res) {
  //             if(res.freeLogin=="Y"){
  //                 location.href = "answer_start.html"+location.search+"&userName="+res.userCode;
  //             }
  //         }
  //     });
  // };

})();
