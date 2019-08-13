<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.sql.*,javax.sql.*,java.io.*,java.net.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 수정</title>
</head>

<body>
<div style="margin-top:10%">
<%
	request.setCharacterEncoding("UTF-8");
	int ID = Integer.parseInt(request.getParameter("id"));
	String title = new String(request.getParameter("title").getBytes("8859_1"), "UTF-8");
	String content = new String(request.getParameter("content").getBytes("8859_1"), "UTF-8");

	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.102/kopoctc?serverTimezone=UTC",
			"root", "asdf1234");

	Statement stmt = conn.createStatement();

	stmt.execute("delete from gongji where id="+ID+";");
	stmt.close();
	conn.close();
%>
			<h3 align="center">글 삭제 성공</h3>
			<form align="center">
			<input type="button" value="목록으로 돌아가기"  onclick="location.href='e_01.jsp'">
			</form>
		</div>

</body>
</html>