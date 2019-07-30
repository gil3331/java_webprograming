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
try{
	  request.setCharacterEncoding("UTF-8");
	  String name=new String(request.getParameter("name1").getBytes("8859_1"),"UTF-8");
	  int ID = Integer.parseInt(request.getParameter("studentid"));
	  int kor = Integer.parseInt(request.getParameter("kor"));
	  int eng = Integer.parseInt(request.getParameter("eng"));
	  int math = Integer.parseInt(request.getParameter("math"));
	  
		
Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.102/kopoctc?serverTimezone=UTC","root","asdf1234");
		
			Statement stmt = conn.createStatement();
								
			stmt.execute("delete from examtable1 where studentid="+ID+";");		
			%>
			<h3 align="center">레코드 삭제</h3>
			<%
			ResultSet rset = stmt.executeQuery("select * from examtable1;");//쿼리문을 통해서 examtable의 정보를 모두 읽음
			out.println("<table border=1 align=center>");
			out.println("<form method=post action=inputForm2.jsp>");
		    out.println("<td align=center><input type=submit value=돌아가기><form></td>");
			out.println("<tr>");
			out.println("<td>"+"이름"+"</td>");
		    out.println("<td>"+"학번"+"</td>");
		    out.println("<td>"+"국어"+"</td>");
		    out.println("<td>"+"영어"+"</td>");
		    out.println("<td>"+"수학"+"</td>");
			out.println("</tr>");
			while(rset.next()) {
				  out.println("<tr>");
			      out.println("<td align=center>"+rset.getString(1)+"</td>");
			      out.println("<td>"+rset.getInt(2)+"</td>");
			      out.println("<td>"+rset.getInt(3)+"</td>");
			      out.println("<td>"+rset.getInt(4)+"</td>");
			      out.println("<td>"+rset.getInt(5)+"</td>");
			      out.println("</tr>");
			      
			}
			
			rset.close();
			stmt.close();
			conn.close();
			
			
						
}catch(Exception e){
	out.println("데이터가 없습니다. 정확한 학번을 기입해주세요.");
}
%>

		
</body>
</html>