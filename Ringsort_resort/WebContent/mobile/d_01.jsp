<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.sql.*,javax.sql.*,java.io.*,java.net.*,java.util.*,java.text.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>30일간의 예약리스트</title>
</head>
<style>
#list{
overflow=auto;
}
</style>
<body>

<div class="list">

<table border=1 style="width:100%; text-align:center;">
<td>날짜</td><td>VIP룸</td><td>일반룸</td><td>합리적인룸</td><tr>
<%
Calendar cal = Calendar.getInstance();
SimpleDateFormat dformat = new SimpleDateFormat("yyyy-MM-dd");

for (int i=0; i<30; i++){
   out.println("<tr><td>" + dformat.format(cal.getTime())+"</td><td><a href='d_02.html'>예약가능</a></td><td><a href='d_02.html'>예약가능</a></td><td><a href='d_02.html'>예약가능</a></td></tr>");
   cal.add(cal.DATE,1);	
}
%>
</table>
</div>

</body>
</html>