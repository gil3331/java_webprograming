<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.sql.*,javax.sql.*,java.io.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index.jsp</title>
<h3>트와이스 성적표</h3>
</head>
<body>
<%
		
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.102/kopoctc?serverTimezone=UTC","root","asdf1234");
	
		Statement stmt = conn.createStatement();
		ResultSet rset = stmt.executeQuery("select count from WebpageAccessTable;");
		rset.next();
	StringBuffer sb = new StringBuffer();
	int ch = rset.getInt(1);
	if(ch!=-1){
		ch++;
	}
	
	rset.close();
	stmt.close();
		
	out.println("<br><br>현재 홈페이지 방문조회수는 ["+ch+"] 입니다</br>");
	
	Statement stmt1 = conn.createStatement();
	stmt1.execute("update WebpageAccessTable set count='"+ch+"' where countNum=1;");
	stmt1.close();
	conn.close();
%>
</body>
</html>