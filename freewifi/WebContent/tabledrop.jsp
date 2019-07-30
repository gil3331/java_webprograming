<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.sql.*,javax.sql.*,java.io.*,java.net.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TBL삭제</title>
</head>
<body>
<%
try{
Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.102/kopoctc?serverTimezone=UTC","root","asdf1234");
		
			Statement stmt = conn.createStatement();
			
			
			stmt.execute("drop table examtable1;");
			
			stmt.close();
			conn.close();
			out.println("테이블 삭제");
}catch(Exception e){
	out.println("지울 테이블이 존재하지 않습니다.");
}
%>	
</body>
</html>