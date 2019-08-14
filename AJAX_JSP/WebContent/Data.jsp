<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.sql.*,javax.sql.*,java.io.*,java.net.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
Class.forName("com.mysql.cj.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.102/kopoctc?serverTimezone=UTC","root","asdf1234");
Statement stmt = conn.createStatement();
ResultSet rset = stmt.executeQuery("select * from examtable1;");		
		
while(rset.next()){
out.println(rset.getString(1));
out.println(rset.getInt(2));
out.println(rset.getInt(3));
out.println(rset.getInt(4));
out.println(rset.getInt(5));
}
rset.close();
stmt.close();
conn.close();
%>		
</body>
</html>