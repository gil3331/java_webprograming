<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html style="height:100%">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="user-scalable=no, width=device-width" />
<meta name=”apple-mobile-web-app-capable” content=”yes” />
<meta name=”apple-mobile-web-app-status-bar-style” content=”black” />

<title>모바일화면</title>
</head>
<script type='text/javascript'>
	var orientationEvent;
	var uAgent = navigator.userAgent.toLowerCase();
	var mobilePhones = 'android';
	if (uAgent.indexOf(mobilePhones) != -1) {
		orientationEvent = "resize"; //안드로이드는 resize로 들어옴
	} else
		orientationEvent = "orientationchange";//아이폰은 이렇게 들어옴
	window.addEventListener(orientationEvent, function() {
		//	alert("회전했어요");
		location.href('#');
	}, false);

	//서브메뉴를 선택(하단 버튼을 누름)했을 때 함수
	var muCnt = 5;//서브메뉴
	var scCnt = 15;//화면
	function fncShow(pos) {
		var i = 0;
		//모든 일반화면은 막는다.
		for (i = 0; i< scCnt; i++) {
			var obj = document.getElementById("s" + i);
			obj.style.display = 'none';
		}
		//메뉴선택에 따라 중간메뉴div는 보여주고, 누른 버튼의 배경을 바꿔준다.
		for (i = 0; i < muCnt; i++) {
			var obj = document.getElementById("menu" + i);
			var obj2 = document.getElementById("m" + i);

			if (i == pos) {
				obj.style.display = '';
				obj2.style.background = "#ff0000";
			} else {
				obj.style.display = 'none';
				obj2.style.background = "#FFFF00";

			}
		}
	}
	//총 화면은 15개이고, 화면이 선택된 번호에 따라 화면을 보여주는 함수
	var scCnt = 15;
	function ScreenShow(pos) {
		var i = 0;
		//모든 메뉴페이지는 막는다.
		for (i = 0; i < muCnt; i++) {
			var obj = document.getElementById("menu" + i);
			obj.style.display = 'none';
		}
		//선택된 화면번호의 화면만 보여준다.
		for (i = 0; i < scCnt; i++) {
			var obj = document.getElementById("s" + i);

			if (i == pos) {
				obj.style.display = '';
			} else {
				obj.style.display = 'none';
			}
		}
	}
</script>
<body onload='ScreenShow(0);'>
	<div id="container"
		style="width: deviece-width; height: device-height;">
		<div id="header1"
			style="height: 35px; width: 10%; float: left; vertical-align: middle;" onclick='preview();'>
			<img src="photo/back.png">
		</div>
		<div id="header2"
			style="height: 35px; width: 80%; float: left; vertical-align: middle; text-align: center"><h3>모바일
			리조트(링조트)</h3></div>
		<div id="header3"
			style="height: 35px; width: 10%; float: left; vertical-align: middle;" onclick='ScreenShow(0)'>
			<img src="photo/home.png">
		</div>

		<div id="menu0" style="background-color: #EEEEEE; display: none;">
			리조트소개
			<ul>
				<li onclick='ScreenShow(0);'>링조트</li>
				<li onclick='ScreenShow(1);'>VIP룸</li>
				<li onclick='ScreenShow(2);'>일반룸</li>
				<li onclick='ScreenShow(3);'>합리적인 룸</li>
			</ul>
		</div>
		<div id="menu1" style="background-color: #EEEEEE; display: none;">
			찾아오기
			<ul>
				<li onclick='ScreenShow(4);'>찾아오는길</li>
				<li onclick='ScreenShow(5);'>대중교통이용</li>
				<li onclick='ScreenShow(6);'>자가용이용</li>
			</ul>
		</div>
		<div id="menu2" style="background-color: #EEEEEE; display: none;">
			주변여행지
			<ul>
				<li onclick='ScreenShow(7);'>외로운 산</li>
				<li onclick='ScreenShow(8);'>호수 마을</li>
				<li onclick='ScreenShow(9);'>리븐델</li>
			</ul>
		</div>
		<div id="menu3" style="background-color: #EEEEEE; display: none;">
			예약하기
			<ul>
				<li onclick='ScreenShow(10);'>예약상황</li>
				<li onclick='ScreenShow(11);'>예약하기</li>
				<li onclick='ScreenShow(12);'>관리자페이지</li>
				<li onclick='ScreenShow(13);'>관리자로그아웃</li>
			</ul>
		</div>
		<div id="menu4" style="background-color: #EEEEEE; display: none;">
			리조트소식
			<ul>
				<li onclick='ScreenShow(14);'>리조트소식</li>
			</ul>
		</div>
	</div>
	<div style="height: 200px;">
		<div id="s0"
			style="height: 200px; background-color: #5f5f5f; display: none;"><jsp:include page="main.html"/></div>
		<div id="s1"
			style="height: 200px; background-color: #5f5f5f; display: none;"><jsp:include page="a_01.html"/></div>
		<div id="s2"
			style="height: 200px; background-color: #5f5f5f; display: none;"><jsp:include page="a_02.html"/></div>
		<div id="s3"
			style="height: 200px; background-color: #5f5f5f; display: none;"><jsp:include page="a_03.html"/></div>
		<div id="s4"
			style="height: 200px; background-color: #5f5f5f; display: none;">찾아오는길</div>
		<div id="s5"
			style="height: 200px; background-color: #5f5f5f; display: none;">대중교통이용</div>
		<div id="s6"
			style="height: 200px; background-color: #5f5f5f; display: none;">자가용이용</div>
		<div id="s7"
			style="height: 200px; background-color: #5f5f5f; display: none;">외로운	산</div>
		<div id="s8"
			style="height: 200px; background-color: #5f5f5f; display: none;">호수 마을</div>
		<div id="s9"
			style="height: 200px; background-color: #5f5f5f; display: none;">리븐델</div>
		<div id="s10"
			style="height: 200px; background-color: #5f5f5f; display: none;">예약상황</div>
		<div id="s11"
			style="height: 200px; background-color: #5f5f5f; display: none;">예약하기</div>
		<div id="s12"
			style="height: 200px; background-color: #5f5f5f; display: none;">관리자페이지</div>
		<div id="s13"
			style="height: 200px; background-color: #5f5f5f; display: none;">관리자로그아웃</div>
		<div id="s14"
			style="height: 200px; background-color: #5f5f5f; display: none;">리조트소식</div>


		<div id="m0" onclick='fncShow(0);'
			style="position: absolute; bottom: 3px; position: absolute; left: 1%; background-color: #FF0000; height: 80px; width: 18%; float: left; text-align: center">리조트<br>소개<br><img src="photo/home.png"></div>
		<div id="m1" onclick='fncShow(1);'
			style="position: absolute; bottom: 3px; position: absolute; left: 21%; background-color: #FF0000; height: 80px; width: 18%; float: left; text-align: center">찾아<br>오기<br><img src="photo/location.png"></div>
		<div id="m2" onclick='fncShow(2);'
			style="position: absolute; bottom: 3px; position: absolute; left: 41%; background-color: #FF0000; height: 80px; width: 18%; float: left; text-align: center">주변<br>여행지<br><img src="photo/travel.png"></div>
		<div id="m3" onclick='fncShow(3);'
			style="position: absolute; bottom: 3px; position: absolute; left: 61%; background-color: #FF0000; height: 80px; width: 18%; float: left; text-align: center">예약<br>하기<br><img src="photo/booking.png"></div>
		<div id="m4" onclick='fncShow(4);'
			style="position: absolute; bottom: 3px; position: absolute; left: 81%; background-color: #FF0000; height: 80px; width: 18%; float: left; text-align: center">리조트<br>소식<br><img src="photo/notice.png"></div>

	</div>
</body>
</html>