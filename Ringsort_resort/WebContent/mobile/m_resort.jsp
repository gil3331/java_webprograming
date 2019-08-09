<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>모바일화면</title>
</head>
<script language='javascript' type='text/javascript'>
var orientationEvent;
var uAgent=navigator.userAgent.toLowerCase();
var mobilePhones='android';
if(uAgent.indexOf(mobilePhones)!=-1){
	orientationEvent="resize";	//안드로이드는 resize로 들어옴
}
else orientationEvent="orientationchange";//아이폰은 이렇게 들어옴
window.addEventListener(orientationEvent, function())
{
//	alert("회전했어요");
	location.href('#');
	},false);
	
//서브메뉴를 선택(하단 버튼을 누름)했을 때 함수
var muCnt=5;//서브메뉴
var scCnt=15;//화면
function fncShow(pos)
{
	var i=0;
	//모든 일반화면은 막는다.
	for(i=0;i,scCnt;i++)
	{
		var obj=document.getElementById("s"+i);
		obj.style.display='none';
	}
	//메뉴선택에 따라 중간메뉴div는 보여주고, 누른 버튼의 배경을 바꿔준다.
	for(i=0;i<muCnt;i++)
	{
		var obj=document.getElementById("menu"+i);
		var obj2=document.getElementById("m"+i);
		
		if(i==pos){
			obj.style.display='';
			obj2.style.background="#ff0000";	
		}else{
			obj.style.display='none';
			obj2.style.background="#FFFF00";
			
			}
		}
	}
//총 화면은 15개이고, 화면이 선택된 번호에 따라 화면을 보여주는 함수
var scCnt=15;
function ScreenShow(pos)
{
	var i=0;
	//모든 메뉴페이지는 막는다.
	for(i=0;i<muCnt;i++){
		var obj=document.getElementById("menu"+i);
		obj.style.display='none';
	}
	//선택된 화면번호의 화면만 보여준다.
	for(i=0;i<scCnt;i++){
		var obj=document.getElementById("s"+i);
		
		if(i==pos){
			obj.style.display='';
		}else{
			obj.style.display='none';
		}
	}
}

</script>
<body>
<div id="container" style="width:deviece-width;height:device-height;">
	<div id="header1" style="height:35px;width:10%;float:left;vertical-align:middle;"><center>[이전]</center></div>
	<div id="header2" style="height:35px;width:80%;float:left;vertical-align:middle;"><center>폰페이지입니다</center></div>
	<div id="header3" style="height:35px;width:10%;float:left;vertical-align:middle;"><center>[홈]</center></div>
	
	<div id="menu0" sytle="background-color:#EEEEEE;display:none;">
	메뉴1
		<li onclick='ScreenShow(0);'>메뉴1_1</li>
		<li onclick='ScreenShow(1);'>메뉴1_2</li>
		<li onclick='ScreenShow(2);'>메뉴1_3</li>
	</div>
	<div id="menu0" sytle="background-color:#EEEEEE;display:none;">
	메뉴2
		<li onclick='ScreenShow(3);'>메뉴2_1</li>
		<li onclick='ScreenShow(4);'>메뉴2_2</li>
		<li onclick='ScreenShow(5);'>메뉴2_3</li>
	</div>
	<div id="menu0" sytle="background-color:#EEEEEE;display:none;">
	메뉴3
		<li onclick='ScreenShow(6);'>메뉴3_1</li>
		<li onclick='ScreenShow(7);'>메뉴3_2</li>
		<li onclick='ScreenShow(8);'>메뉴3_3</li>
	</div>
	<div id="menu0" sytle="background-color:#EEEEEE;display:none;">
	메뉴4
		<li onclick='ScreenShow(9);'>메뉴4_1</li>
		<li onclick='ScreenShow(10);'>메뉴4_2</li>
		<li onclick='ScreenShow(11);'>메뉴4_3</li>
	</div>
	<div id="menu0" sytle="background-color:#EEEEEE;display:none;">
	메뉴5
		<li onclick='ScreenShow(12);'>메뉴5_1</li>
		<li onclick='ScreenShow(13);'>메뉴5_2</li>
		<li onclick='ScreenShow(14);'>메뉴5_3</li>
	</div>
	<div id="s0" style="height:200px;">메뉴1_1에 대한 화면</div>
	<div id="s1" style="height:200px; style="height:200px;"">메뉴1_1에 대한 화면</div>
	<div id="s2" style="height:200px;">메뉴1_1에 대한 화면</div>
	<div id="s3" style="height:200px;">메뉴1_1에 대한 화면</div>
	<div id="s4" style="height:200px;">메뉴1_1에 대한 화면</div>
</div>
</body>
</html>