<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	function blank(){
		var form = document.forms['form']
		if(form['name'].value.length < 1 || form['name'].value.length > 4){
			alert("이름을 정확히 기입해 주세요.");
			return false;
		}
		return true;
	}
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
</script>

</head>
<body>
	<h3>성적입력추가</h3>
	<form name="form" method="post" action="insert.jsp" onsubmit="return blank();">
		<%
			out.println("<table border=0 style=text-align:right;");
			out.println("<tr>");
			out.println("<td><input type=submit value='추가'></td>");
			out.println("</tr></table>");
			out.println("<table border=1 align=left>");
			out.println("<tr>");
			out.println("<td>이름:<input type='text' name='name' class='input' onkeypress='nonHangulSpecialKey()'></td>");
			out.println("<tr>");
			out.println("<td>학번:   자동입력</td>");
			out.println("<tr>");
			out.println("<td>국어:<input type=number min='0' max='100' name=kor></td>");
			out.println("<tr>");
			out.println("<td>영어:<input type=number min='0' max='100' name=eng></td>");
			out.println("<tr>");
			out.println("<td>수학:<input type=number min='0' max='100' name=math></td>");
			out.println("</tr>");
		%>
	</form>

</body>
</html>