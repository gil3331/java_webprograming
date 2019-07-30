<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.sql.*,javax.sql.*,java.io.*,java.net.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<script>
		function blank(){
			var form = document.forms['regForm']
			if(regForm['name'].value.length < 1 || regForm['name'].value.length > 4){
				alert("후보명을 정확히 기입해 주세요.");
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
			//특수기호
			else if ((char_ASCII >= 32 && char_ASCII <= 47)
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



	<%
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.102/kopoctc?serverTimezone=UTC",
				"root", "asdf1234");
		Statement stmt = conn.createStatement();
		ResultSet rset = stmt.executeQuery("select * from hubo_table;");

		out.println("<table border= width=600px bordercolor=#000000 rules=rows align='center'>");
		while (rset.next()) {
			out.println("<form method=post>");
			out.println("<tr>");
			out.println("<td align=left width=200px>기호번호:" + rset.getInt(1)
					+ "</td><td align=center width=200px> 후보명:" + rset.getString(2)
					+ "</td><td align=right width=200px><button type='button'><a href=delete.jsp?id="
					+ rset.getInt(1) + "&name=" + rset.getString(2) + ">삭제</a></button></form></td>");
			out.println("<tr>");
		}
		out.println("<tr><form name='regForm' method='post' action='insert.jsp' onsubmit='return blank()'>");
		out.println("<td align=left width=200px>기호번호:자동입력</td>");
		out.println("<td align=center width=200px>");
		out.println("후보명:<input type='text' name='name' class='input' onkeypress='nonHangulSpecialKey()' style='width:50px'></td>");
		out.println("<td align=right width=200px><form method='post' action='insert.jsp'>");
		out.println("<input type='submit' value='추가'></form></td>");
		

		rset.close();
		stmt.close();
		conn.close();
	%>

</body>
</html>


<!-- <script>
	
	function validate() {
		console.log('validate');
		const add_input = document.getElementById('add_input');
		console.log(add_input.value);
		if (add_input.value === '') {
			alert('후보명을 작성해주세요.');
		} else {
			const add_form = document.getElementById('add_form');
			add_form.submit();
		}
	}
</script> -->
