<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.sql.*,javax.sql.*,java.io.*" %>


<html>
<head>
<title>TBL(one) 조회</title>

</head>
<body>

<%
try{
//request.setCharacterEncoding("UTF-8");
//response.setContentType("text/html;charset=UTF-8");
String ID=new String(request.getParameter("studentid").getBytes("8859_1"),"UTF-8");
Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.102/kopoctc?serverTimezone=UTC","root","asdf1234");
		Statement stmt = conn.createStatement();
		ResultSet rset = stmt.executeQuery("select * from examtable1 where studentid='"+ID+"';");//쿼리문을 통해서 examtable의 정보를 모두 읽음
		
		out.println("<table border=1 align=center>");
		out.println("<tr>");
		out.println("<td>"+"이름"+"</td>");
	    out.println("<td>"+"학번"+"</td>");
	    out.println("<td>"+"국어"+"</td>");
	    out.println("<td>"+"영어"+"</td>");
	    out.println("<td>"+"수학"+"</td>");
		out.println("</tr>");
		while(rset.next()) {//select로 받아온 정보를 아래의 print양식에 맞춰서 출력
			%>
			<h3 align="center"><%out.println("["+rset.getString(1)+"]");%> 조회</h3>
			<%
			  out.println("<tr>");
		      out.println("<td align=center>"+rset.getString(1)+"</td>");//몇 번째 항목인지를 씀
		      out.println("<td>"+rset.getInt(2)+"</td>");
		      out.println("<td>"+rset.getInt(3)+"</td>");
		      out.println("<td>"+rset.getInt(4)+"</td>");
		      out.println("<td>"+rset.getInt(5)+"</td>");//그런 차이를 기록
		      out.println("</tr>");
		}

			rset.close();
			stmt.close();
			conn.close();
}catch(Exception e){
	out.println("데이터가 없습니다.");
}

%>
</body>
</html>