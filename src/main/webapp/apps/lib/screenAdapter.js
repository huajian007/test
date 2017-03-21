(function () {
  function setPxPerRem() { // 把viewport分成10份的rem，html标签的font-size设置为1rem的大小;
      var pxPerRem = document.getElementsByTagName("html")[0].offsetWidth / 10;
      document.getElementsByTagName("html")[0].setAttribute("style", "font-size:" + pxPerRem + "px !important");
  }
  setPxPerRem();
})();
