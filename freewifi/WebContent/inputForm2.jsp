<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.sql.*,javax.sql.*,java.io.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3 align="center">성적조회 후 정정/삭제</h3>
    <form method="post" action="showREC.jsp" align="center">
    조회할 학번:<input type=number name="studentid">
    			<input type=submit value="조회">

<%
try{
out.println("<table border=1 align=center>");
out.println("<tr>");
out.println("<td>"+"이름"+"<td><input type=text></td></td>");
out.println("<tr>");
out.println("<td>"+"학번"+"<td><input type=text></td></td>");
out.println("<tr>");
out.println("<td>"+"국어"+"<td><input type=text></td></td>");
out.println("<tr>");
out.println("<td>"+"영어"+"<td><input type=text></td></td>");
out.println("<tr>");
out.println("<td>"+"수학"+"<td><input type=text></td></td>");
out.println("<tr>");
out.println("</tr>");
}catch(Exception e){
	out.println("학번을 넣어주세요.");
}
%>
</form>	
</body>
</html>