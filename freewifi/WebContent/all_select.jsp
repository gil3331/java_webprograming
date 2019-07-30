<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.sql.*,javax.sql.*,java.io.*,java.net.*" %>
<html>
<head>
<title>TBL전체 조회</title>
<h3 align="center">TBL전체 조회</h3>
</head>
<body>
<%
try{
response.setContentType("text/html;charset=UTF-8");
request.setCharacterEncoding("UTF-8");
Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.102/kopoctc?serverTimezone=UTC","root","asdf1234");
		
		Statement stmt1 = conn.createStatement();
		ResultSet rset1 = stmt1.executeQuery("SELECT count(*) from examtable1;");
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
		ResultSet rset = stmt.executeQuery("select a.name, a.studentid, a.kor, a.eng, a.mat, a.total, a.avg, count(*) from (select name, studentid, kor, eng, mat, (kor+eng+mat) as total, ((kor+eng+mat)/3)as avg from examtable1) as a, (select name, studentid, kor, eng, mat, (kor+eng+mat)as total from examtable1)as b where a.total <= b.total group by a.studentid order by a.total desc limit "+((correntPage) * 5)+","+countList+";");
		out.println("<table border=1 align=center>");
		out.println("<tr>");
		out.println("<td>"+"이름"+"</td>");
	    out.println("<td>"+"학번"+"</td>");
	    out.println("<td>"+"국어"+"</td>");
	    out.println("<td>"+"영어"+"</td>");
	    out.println("<td>"+"수학"+"</td>");
	    out.println("<td>"+"총점"+"</td>");
	    out.println("<td>"+"평균"+"</td>");
	    out.println("<td>"+"등수"+"</td>");
		out.println("</tr>");
		while(rset.next()) {//select로 받아온 정보를 아래의 print양식에 맞춰서 출력
			  out.println("<tr>");
		      out.println("<td align=center><a href=one_select.jsp?studentid="+rset.getInt(2)+">"+rset.getString(1)+"</a></td>");//몇 번째 항목인지를 씀
		      out.println("<td>"+rset.getInt(2)+"</td>");
		      out.println("<td>"+rset.getInt(3)+"</td>");
		      out.println("<td>"+rset.getInt(4)+"</td>");
		      out.println("<td>"+rset.getInt(5)+"</td>");//그런 차이를 기록
		      out.println("<td>"+rset.getInt(6)+"</td>");
		      out.println("<td>"+rset.getInt(7)+"</td>");
		      out.println("<td>"+rset.getInt(8)+"</td>");
		      out.println("</tr>");
		}
			out.println("</table>");
			rset.close();
			stmt.close();
			rset1.close();
			stmt1.close();
			conn.close();
		out.println("<div align='center'>");
if(startPage > 1){
	out.println("<a href='all_select.jsp?Page=1&countList=5'>&lt;</a>");
}
			
if(correntPage > 0){
	out.println("<a href='all_select.jsp?Page=1&countList=5'>&lt;</a>");
}

for(int iCount = startPage; iCount <= endPage; iCount++){
	if(iCount == correntPage){
		out.println("<a href='all_select.jsp?Page="+iCount+"&countList=5'>"+iCount+"</a>");
	}else{
		out.println("<a href='all_select.jsp?Page="+iCount+"&countList=5'>"+iCount+"</a>");
	}
}

if((correntPage+1) < totalPage){
	out.println("<a href='all_select.jsp?Page="+((correntPage+1)+1)+"&countList=5'>&gt;</a>");
}

if(endPage < totalPage){
	out.println("<a href='all_select.jsp?Page="+totalPage+"&countList=5'>&gt;&gt;</a>");
}
		out.println("</div>");
}catch(Exception e){
	out.println("테이블이 없습니다.");
}
%>
</body>
</html>