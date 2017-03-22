<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" id="view" content="width=device-width, initial-scale=1, minimum-scale=1, user-scalable=no">
    <script src="lib/screenAdapter.js"></script>
    <link rel="stylesheet" type="text/css" href="css/reset.css">
    <link rel="stylesheet" type="text/css" href="css/salary.css">
    <title>达博威</title>
</head>
<body>
<section class="content">
    <p>出勤明细</p>
    <p><span class="title">应出勤天数:</span><span id="ATTENDANCE_DAYS"></span></p>
    <p><span class="title">实际出勤天数:</span><span id="ACTUAL_DAYS"></span></p>
    <p>工资明细</p>
    <p><span class="title">基本工资:</span><span id="BASE_SALARY"></span></p>
    <p><span class="title">补贴:</span><span id="SUBSIDY"></span></p>
    <p><span class="title">奖金:</span><span id="PRIZE"></span></p>
    <p><span class="title">应发工资:</span><span id="SHOULD_PAY"></span></p>
    <p><span class="title">扣税:</span><span id="TAX_DEDUCTION"></span></p>
    <p><span class="title">五险一金:</span><span id="SOCIAL_SECURITY"></span></p>
    <p><span class="title">实发工资:</span><span id="REAL_PAY"></span></p>
    <p><span class="title">发放日期:</span><span id="PROVIDE_DATE"></span></p>
</section>
<script src="lib/zepto.min.js"></script>
<script src="lib/common.js"></script>
<script>

	var data = ''
    App.getPayDetail(data, function(res) {
        $('#ATTENDANCE_DAYS').html(res.DETAILE.attendanceDays + '天');
        $('#ACTUAL_DAYS').html(res.DETAILE.actualDays + '天');
        $('#BASE_SALARY').html(res.DETAILE.baseSalary + '元'); 
        $('#SUBSIDY').html(res.DETAILE.subsidy + '天');
        $('#PRIZE').html(res.DETAILE.prize + '元');
        $('#SOCIAL_SECURITY').html(res.DETAILE.shouldPay + '元'); 
        $('#TAX_DEDUCTION').html(res.DETAILE.taxDeduction + '天');
        $('#SOCIAL_SECURITY').html(res.DETAILE.socialSecurity + '元');
        $('#REAL_PAY').html(res.DETAILE.realPay + '元'); 
        $('#PROVIDE_DATE').html(res.DETAILE.pertainMonth);
    });


</script>
</body>
</html>
