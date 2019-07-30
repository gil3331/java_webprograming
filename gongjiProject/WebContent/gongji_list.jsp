<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.sql.*,javax.sql.*,java.io.*,java.net.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항 리스트</title>
<h3 align="center">공지사항 리스트</h3>
</head>
<body>
<table border=1 align="center">
<td width=50px align="center">번호</td><td width=500px align="center">제목</td><td width=100px align="center">등록일</td><tr>
	<%
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.102/kopoctc?serverTimezone=UTC",
					"root", "asdf1234");
			
			Statement stmt1 = conn.createStatement();
			ResultSet rset1 = stmt1.executeQuery("SELECT count(*) from gongji;");
			rset1.next();
			
			String Page = request.getParameter("Page");
			String list = request.getParameter("countList");
			int countList = 0;
			int correntPage = 0;//현재 페이지
			if(Page == null & list == null){
				correntPage = 0;
				countList = 5;	
			}else{
				correntPage = Integer.parseInt(Page) - 1;
				countList = Integer.parseInt(list);
			}
			int totalCount = rset1.getInt(1);//총 리스트의 갯수
			
			
			int countPage = 10;//1~10페이지 단위
			int totalPage = totalCount / countList;//총 페이지 수
			
			if(totalCount % countList > 0){
				totalPage++;
			}
			
			if(totalCount < correntPage){
				correntPage = totalPage;
			}
			
			
			int startPage = ((correntPage-1)/10)*10+1;
			int endPage = startPage + countPage -1;
			
			if(endPage > totalPage){
				endPage = totalPage;
			}
			
			
			Statement stmt = conn.createStatement();
			ResultSet rset = stmt.executeQuery("SELECT id, title, DATE FROM gongji ORDER BY id DESC limit "+((correntPage) * 5)+","+countList+";");

			

			while (rset.next()) {
				out.println("<td align='center'>" + rset.getInt(1) + "</td>");
				out.println("<td><a href=gongji_view.jsp?key=" + rset.getInt(1) + ">" + rset.getString(2)
						+ "</a></td>");
				out.println("<td align='center'>" + rset.getDate(3) + "</td><tr>");
			}
			out.println("</table>");
			rset.close();
			stmt.close();
			conn.close();

		
	%>
<table border=3 align="center" rules=rows bordercolor=#FFFFFF width=672px>
<form>
	<td align="right"><input type="button" value="신규"  onclick="location.href='gongji_insert.jsp'"></td>
</form>
</table>
<div align="center">
<%
if(startPage > 1){
	out.println("<a href='gongji_list.jsp?Page=1&countList=5'>&lt;</a>");
}
			
if(correntPage > 0){
	out.println("<a href='gongji_list.jsp?Page=1&countList=5'>&lt;</a>");
}

for(int iCount = startPage; iCount <= endPage; iCount++){
	if(iCount == correntPage){
		out.println("<a href='gongji_list.jsp?Page="+iCount+"&countList=5'>"+iCount+"</a>");
	}else{
		out.println("<a href='gongji_list.jsp?Page="+iCount+"&countList=5'>"+iCount+"</a>");
	}
}

if((correntPage+1) < totalPage){
	out.println("<a href='gongji_list.jsp?Page="+((correntPage+1)+1)+"&countList=5'>&gt;</a>");
}

if(endPage < totalPage){
	out.println("<a href='gongji_list.jsp?Page="+totalPage+"&countList=5'>&gt;&gt;</a>");
}
%>
</div>
</body>
</html>