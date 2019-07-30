<%@page import="java.text.SimpleDateFormat"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.sql.*,javax.sql.*,java.io.*,java.net.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 내역 수정</title>
</head>
<body>
<%
	request.setCharacterEncoding("UTF-8");
	int stockID = Integer.parseInt(request.getParameter("stockID"));
	
	int stockCnt = Integer.parseInt(request.getParameter("stockCnt"));
	
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.102/kopoctc?serverTimezone=UTC",
			"root", "asdf1234");

	Statement stmt = conn.createStatement();

	stmt.execute("update stock_list set stockCnt='"+stockCnt+"', checkDate=CURDATE() where stockID="+stockID+";");
	stmt.close();
	conn.close();
%>
			<h3 align="center">상품내역 수정 성공</h3>
			<form align="center">
			<input type="button" value="목록"  onclick="location.href='stock_list.jsp'">
			</form>
				
</body>
</html>