<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>새 글 입력</title>
<script>
function check_key() {
		var char_ASCII = event.keyCode;
		//숫자
		if (char_ASCII >= 48 && char_ASCII <= 57)
			return 1;
		//영어
		else if ((char_ASCII >= 65 && char_ASCII <= 90)
				|| (char_ASCII >= 97 && char_ASCII <= 122))
			return 2;
		//특수기호 및 공백
		else if ((char_ASCII >= 32 && char_ASCII <= 48)
				|| (char_ASCII >= 58 && char_ASCII <= 64)
				|| (char_ASCII >= 91 && char_ASCII <= 96)
				|| (char_ASCII >= 123 && char_ASCII <= 127))
			return 4;
		//한글
		else if ((char_ASCII >= 12592) || (char_ASCII <= 12687))
			return 3;
		
		else
			return 0;
	}

	function nonHangulSpecialKey() {
		if (check_key() != 3) {
			event.returnValue = false;
			alert("한글만 입력하세요!");
			return;
		}
	}
	
var d=new Date();
var year=d.getFullYear();
var month=(d.getMonth() + 1);
var date=d.getDate();
var today=year +"-"+ month +"-"+ date;

function keyup()
{
if(document.getElementById("textarea").value.length>=1000){
	alert("내용이 너무 많습니다.");
	return false;
	}
return ture;
}

</script>
</head>
<body>
<form method="post" action="gongji_write.jsp">
<table border=1 align="center">
<td>번호</td><td width="500px">신규(insert)</td><tr>
<td>제목</td><td width="500px"><input type="text" name="title" class="input" maxlength="70"></td><tr>
<td>일자</td><td><script>document.write(today);</script></td><tr>
<td>내용</td><td><div style="overflow:scroll; width:500px; height:500px;"><textarea id="textarea" name="content" style="width:500px; height:500px;" onkeyUp="keyup()"></textarea></div></td>
</table>
<table border=3 align="center" rules=rows bordercolor=#FFFFFF width=548px>
<form>
	<td align="right"><input type="button" value="취소"  onclick="location.href='gongji_list.jsp'"><input type="submit" value="쓰기"  formaction="gongji_write.jsp"></td>
</form>
</table>
</body>
</html>