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
	function blank() {
	    var voteForm = document.forms['voteForm'];
	    if( voteForm['hubo'].value.length < 1) {
	        alert( '후보자를 선택해주세요.');
	        return false;
	    }
	    if( voteForm['age'].value.length < 1) {
	        alert( '나이를 선택해주세요.');
	        return false;
	    }
	    return true;
	}
	</script>
	<%
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.102/kopoctc?serverTimezone=UTC",
				"root", "asdf1234");
		Statement stmt = conn.createStatement();
		ResultSet rset = stmt.executeQuery("select * from hubo_table;");
	%>
		<form name="voteForm" method="post" action="vote_insert.jsp" align="center" onsubmit='return blank()'>
		<select name="hubo">
		<option value="">후보선택</option>
			<%
				while (rset.next()) {
					
					out.println("<td><option value=" + rset.getInt(1)
					+ ">기호" + rset.getInt(1) + "번" + rset.getString(2)
					+ "</option></td>");
										
				}
							
				rset.close();
				stmt.close();
				conn.close();
			%>
		</select>
		<select name="age">
		<option value="">나이선택</option>
		<option value="1">10대</option>
		<option value="2">20대</option>
		<option value="3">30대</option>
		<option value="4">40대</option>
		<option value="5">50대</option>
		<option value="6">60대</option>
		<option value="7">70대</option>
		<option value="8">80대</option>
		<option value="9">90대</option>
		</select>
		
		<input type="submit"  value="투표하기" ></form>
		
</body>
</html>