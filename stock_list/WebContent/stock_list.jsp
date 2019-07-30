<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.sql.*,javax.sql.*,java.io.*,java.net.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>재고 현황 구현</title>
<h3 align="center">재고 현황-전체 현황</h3>
</head>
<body align="center">
<table border=1 align="center">
<td align="center">상품번호</td><td align="center" width=200px>상품명</td><td align="center">현재 수량</td><td align="center">재고 파악일</td><td align="center">상품등록일</td><tr><form>
	<%		
			
		//try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.102/kopoctc?serverTimezone=UTC",
					"root", "asdf1234");
			
			Statement stmt1 = conn.createStatement();
			ResultSet rset1 = stmt1.executeQuery("SELECT count(*) from stock_list;");
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
			ResultSet rset = stmt.executeQuery("SELECT stockID, stockName, stockCnt, checkDate, regDate FROM stock_list order by checkDate DESC, stockID DESC limit "+((correntPage) * 5)+","+countList+";");

			//int LineCnt=0;

			while (rset.next()) {
				/* LineCnt++;	
				if(LineCnt < correntPage) continue;
				if(LineCnt > correntPage + countList -1) break; */
				out.println("<td align='center'>" + rset.getInt(1) + "</td>");
				out.println("<td><a href=stock_oneview.jsp?stockID=" + rset.getInt(1) + ">" + rset.getString(2)
						+ "</a></td>");
				out.println("<td align='center'>" + rset.getInt(3) + "</td>");
				out.println("<td align='center'>" + rset.getDate(4) + "</td>");
				out.println("<td align='center'>" + rset.getDate(5) + "</td><tr>");
			}
			
			out.println("</table>");
			
			rset.close();
			stmt.close();
			rset1.close();
			stmt1.close();
			conn.close();

		/* } catch (Exception e) {
			out.println("오류입니다.");
		} */
	%>
<table border=3 align="center" rules=rows bordercolor=#FFFFFF width=538px>

	<td align="right"><input type="button" value="신규등록"  onclick="location.href='itemRegistration.jsp'"></td>
</form>

</table>
<%
if(startPage > 1){
	out.println("<a href='stock_list.jsp?Page=1&countList=5'>&lt;</a>");
}
			
if(correntPage > 0){
	out.println("<a href='stock_list.jsp?Page=1&countList=5'>&lt;</a>");
}

for(int iCount = startPage; iCount <= endPage; iCount++){
	if(iCount == correntPage){
		out.println("<a href='stock_list.jsp?Page="+iCount+"&countList=5'>"+iCount+"</a>");
	}else{
		out.println("<a href='stock_list.jsp?Page="+iCount+"&countList=5'>"+iCount+"</a>");
	}
}

if((correntPage+1) < totalPage){
	out.println("<a href='stock_list.jsp?Page="+((correntPage+1)+1)+"&countList=5'>&gt;</a>");
}

if(endPage < totalPage){
	out.println("<a href='stock_list.jsp?Page="+totalPage+"&countList=5'>&gt;&gt;</a>");
}
%>
</body>
</html>