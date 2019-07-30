<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.sql.*,javax.sql.*,java.io.*,java.net.*"%>
<%@ page import="java.io.*, com.oreilly.servlet.MultipartRequest, com.oreilly.servlet.multipart.DefaultFileRenamePolicy" %>
<html>
<head>
<meta charset="UTF-8">
<title>상품등록DB</title>
</head>
<body>
	<%
		
		String encType="utf-8";
		int sizeLimit=10*1024*1024;
		
		ServletContext context = getServletContext();
		String saveforder = context.getRealPath("photo");
	
		MultipartRequest multi=new MultipartRequest(request, saveforder, sizeLimit, encType, new DefaultFileRenamePolicy());
		
		int stockID = Integer.parseInt(multi.getParameter("stockID"));
		String stockName = multi.getParameter("stockName");
		int stockCnt = Integer.parseInt(multi.getParameter("stockCnt"));
		String itemDescription = multi.getParameter("itemDescription");
		String fileName = multi.getOriginalFileName("image");
		

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.102/kopoctc?serverTimezone=UTC",
				"root", "asdf1234");

		Statement stmt = conn.createStatement();

		stmt.execute("insert into stock_list (stockID, stockName, stockCnt, checkDate, regDate, itemDescription, itemPhotoLocation)"+
		" values ('"+stockID+"','"+stockName+"','"+stockCnt+"',CURDATE(),CURDATE(),'"+itemDescription+"','"+fileName+"');");
	%>
	<h3 align="center">게시글 쓰기완료</h3>
	<form align="center">
	<input type="button" value="목록"  onclick="location.href='stock_list.jsp'">
	</form>
	<%
		stmt.close();
		conn.close();
	%>


</body>
</html>