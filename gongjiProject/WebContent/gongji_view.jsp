<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.sql.*,javax.sql.*,java.io.*,java.net.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 보기</title>
</head>
<body>
<%
	request.setCharacterEncoding("UTF-8");
	int id = Integer.parseInt(request.getParameter("key"));
	int viewcnt = Integer.parseInt(request.getParameter("viewcnt"));
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.102/kopoctc?serverTimezone=UTC",
			"root", "asdf1234");
	Statement stmt1 = conn.createStatement();
	stmt1.execute("update gongji set viewcnt="+viewcnt+"+1 where id="+id+";");
	
	
	Statement stmt = conn.createStatement();
	ResultSet rset = stmt.executeQuery("SELECT * FROM gongji where id="+id+";");
	
	rset.next();
		
	out.println("<form method='post'><table border=1 align='center'>");
	out.println("<td>번호</td><td width='500px'><input type=text name='key' style=border:0; value='"
			+ rset.getInt(1) + "'></td><tr>");
	out.println("<td>제목</td><td width='500px'>" + rset.getString(2) + "</td><tr>");
	out.println("<td>일자</td><td>" + rset.getDate(3) + "</td><tr>");
	out.println("<td>조회수</td><td width='50px'>"+rset.getInt(8)+"</td><tr>");
	out.println("<td>내용</td><td><div style='overflow:auto; width:500px; height:500px;'>" + rset.getString(4)
			+ "</div></td>");

	
	
		
	rset.close();
	stmt.close();
	conn.close();
%>
<table border=3 align="center" rules=rows bordercolor=#FFFFFF width=548px>
<td align="right"><input type="button" value="목록"  onclick="location.href='gongji_list.jsp'">
<input type="submit" value="수정"  formaction="gongji_update.jsp"></td></form>
</table>
</table>
</body>
</html>