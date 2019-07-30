<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.sql.*,javax.sql.*,java.io.*,java.net.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TBL값넣기</title>
</head>
<body>
<%
//try{
	  String name=new String(request.getParameter("name").getBytes("8859_1"),"UTF-8");
			  	
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.102/kopoctc?serverTimezone=UTC","root","asdf1234");
		
			Statement stmt = conn.createStatement();
			int ID;
			ResultSet rset = stmt.executeQuery("select * from hubo_table where id=1;");
            if (rset.next()) {
               rset = stmt
                     .executeQuery("select min(id+1) from hubo_table where (id+1) not in (select id from hubo_table);");
               rset.next();
               ID = rset.getInt(1);
            } else {
               ID = 1;
            }
            stmt.execute("insert into hubo_table values (" + ID + ",'" + name + "')");	
			out.println("후보등록 결과:후보가 추가(삭제) 되었습니다.");
			stmt.close();
			rset.close();
			stmt.close();
			conn.close();
							
/* }catch(Exception e){
		out.println("<h3>정확한 이름을 입력해주세요.</h3>");
} */
%>		
</body>
</html>