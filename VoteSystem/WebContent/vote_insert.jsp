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
<%
		
		request.setCharacterEncoding("UTF-8");
		int hubo_id = Integer.parseInt(request.getParameter("hubo"));
		int age = Integer.parseInt(request.getParameter("age"));
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.102/kopoctc?serverTimezone=UTC",
				"root", "asdf1234");
		Statement stmt = conn.createStatement();
		stmt.execute("insert into Tupyo_table (hubo_id, age) values("+hubo_id+","+age+")");
		out.println("<h3 align='center'>투표결과 : 투표하였습니다.</h3>");
		
%>
</body>
</html>