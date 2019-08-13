<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.sql.*,javax.sql.*,java.io.*,java.net.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TBL값넣기</title>
</head>
<body>

	<%
		request.setCharacterEncoding("UTF-8");
		String title = request.getParameter("title");
		String content = request.getParameter("content");

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.102/kopoctc?serverTimezone=UTC",
				"root", "asdf1234");

		Statement stmt = conn.createStatement();

		stmt.execute("insert into gongji (title, DATE, content) values ('"+title+"',CURDATE(),'"+content+"');");
	%>
	<h3 align="center">게시글 쓰기완료</h3>
	<form align="center">
	<input type="button" value="목록"  onclick="location.href='e_01.jsp'">
	</form>
	<%
		stmt.close();
		conn.close();
	%>

</body>
</html>