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
	  request.setCharacterEncoding("UTF-8");
	  String name=request.getParameter("name");
	  int kor = Integer.parseInt(request.getParameter("kor"));
	  int eng = Integer.parseInt(request.getParameter("eng"));
	  int math = Integer.parseInt(request.getParameter("math"));
	  
		
Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.102/kopoctc?serverTimezone=UTC","root","asdf1234");
		
			Statement stmt = conn.createStatement();
			
			int autostudentid;
			ResultSet rset = stmt.executeQuery("select * from examtable1 where studentid=209901;");
            if (rset.next()) {
               rset = stmt
                     .executeQuery("select min(studentid+1) from examtable1 where (studentid+1) not in (select studentid from examtable1);");
               rset.next();
               autostudentid = rset.getInt(1);
            } else {
            	autostudentid = 209901;
            }
            stmt.execute("insert into examtable1  (name, studentid, kor, eng, mat) values ('"+name+"'," +autostudentid+","+kor+", "+eng+", "+math+");");	
								
			%>
			<h3 align="center">성적입력추가완료</h3>
			<%
			
			out.println("<table border=1 align=center>");
			out.println("<tr>");
			out.println("<td>"+"이름"+"</td><td align=center>"+name+"</td>");
			out.println("<tr>");
		    out.println("<td>"+"학번"+"</td><td>"+autostudentid+"</td>");
		    out.println("<tr>");
		    out.println("<td>"+"국어"+"</td><td>"+kor+"</td>");
		    out.println("<tr>");
		    out.println("<td>"+"영어"+"</td><td>"+eng+"</td>");
		    out.println("<tr>");
		    out.println("<td>"+"수학"+"</td><td>"+math+"</td>");
		    out.println("</tr>");
							
			rset.close();
			stmt.close();
			conn.close();
			out.println("데이터 삽입");
			
						
//}catch(Exception e){
	//out.println("<h3>정확한 정보를 입력해주세요.</h3>");
//}
%>
		
		
</body>
</html>