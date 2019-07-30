<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.sql.*,javax.sql.*,java.io.*,java.net.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 수정 삭제</title>
</head>
<script>
function keyup()
	{
	if(document.getElementById("textarea").value.length>=1000){
		alert("내용이 너무 많습니다.");
		return false;
	}
}

</script>
<body>
<%
			request.setCharacterEncoding("UTF-8");
			int ID = Integer.parseInt(request.getParameter("key"));
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.102/kopoctc?serverTimezone=UTC",
					"root", "asdf1234");
			Statement stmt = conn.createStatement();
			ResultSet rset = stmt.executeQuery("SELECT * FROM gongji where id="+ID+";");
			
			rset.next();
%>			
<script>
function checkID(){
	if(document.getElementById("ID").value != ID){
		alert("글 번호가 다릅니다.")
		return false;
	}
}
</script>
<%			
out.println("<form method='post'><table border=1 align='center'>");
out.println("<td>번호</td><td width='500px'><input type=text id=ID name=id value='"+rset.getInt(1)+"' onkeyUp='checkID()'></td><tr>");
out.println("<td>제목</td><td width='500px'><input type=text name=title value='"+rset.getString(2)+"' maxlength='70'></td><tr>");
out.println("<td>일자</td><td>"+rset.getDate(3)+"</td><tr>");
out.println("<td>내용</td><td><div style='overflow:auto; width:500px; height:500px;'>");
out.println("<textarea id='textarea' name='content' style='width:500px; height:500px;'onkeyUp='keyup()'>"+rset.getString(4)+"</textarea></div></td>");
out.println("</table>");
%>
<table border=3 align="center" rules=rows bordercolor=#FFFFFF width=548px>

	<td align="right"><input type="button" value="취소"  onclick="location.href='gongji_list.jsp'"><input type="submit" value="쓰기"  formaction="gongji_updateDB.jsp">
	<input type="submit" value="삭제"  formaction="gongji_delete.jsp"></td>
</form>
</table>
</body>
</html>