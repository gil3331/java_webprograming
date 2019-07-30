<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.sql.*,javax.sql.*,java.io.*,java.net.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3 align="center">성적조회 후 정정/삭제</h3>

<script>
	function blank(){
		var form = document.forms['studentstatusForm']
		if(studentstatusForm['name1'].value.length < 1 || studentstatusForm['name1'].value.length > 4){
			alert("이름을 정확히 기입해 주세요.");
			return false;
		}
		return true;
	}
	function check_key() {
		var char_ASCII = event.keyCode;
		//숫자
		if (char_ASCII >= 48 && char_ASCII <= 57)
			return 1;
		//영어
		else if ((char_ASCII >= 65 && char_ASCII <= 90)
				|| (char_ASCII >= 97 && char_ASCII <= 122))
			return 2;
		//특수기호
		else if ((char_ASCII >= 33 && char_ASCII <= 47)
				|| (char_ASCII >= 58 && char_ASCII <= 64)
				|| (char_ASCII >= 91 && char_ASCII <= 96)
				|| (char_ASCII >= 123 && char_ASCII <= 126))
			return 4;
		//한글
		else if ((char_ASCII >= 12592) || (char_ASCII <= 12687))
			return 3;
		else
			return 0;
	}

	function nonHangulSpecialKey() {

		if (check_key() != 2 && check_key() != 3) {
			event.returnValue = false;
			alert("한글이나 영문자만 입력하세요!");
			return;
		}
	}
</script>

<%
try{
    int ID=Integer.parseInt(request.getParameter("studentid"));
    out.println("<form name='studentstatusForm' align='center' onsubmit='return blank()'>조회한 학번:<input type='number' value="+ID+"><input type='submit' value='조회'>");
    Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.102/kopoctc?serverTimezone=UTC","root","asdf1234");
		Statement stmt = conn.createStatement();
		ResultSet rset = stmt.executeQuery("select * from examtable1 where studentid="+ID+";");//쿼리문을 통해서 examtable의 정보를 모두 읽음
		while(rset.next()) {//select로 받아온 정보를 아래의 print양식에 맞춰서 출력
			
		out.println("<table border=1 align=center>");
		out.println("<tr>");
		out.println("<td>이름<td align=center><input type=text name=name1 class='input' onkeypress='nonHangulSpecialKey()' value='"+rset.getString(1)+"'</td></td>");
		out.println("<tr>");
	    out.println("<td>학번<td><input type=number name=studentid value='"+rset.getInt(2)+"'</td></td>");
	    out.println("<tr>");
	    out.println("<td>국어<td><input type=number name=kor min='0' max='100' value='"+rset.getInt(3)+"'</td></td>");
	    out.println("<tr>");
	    out.println("<td>영어<td><input type=number name=eng min='0' max='100' value='"+rset.getInt(4)+"'</td></td>");
	    out.println("<tr>");
	    out.println("<td>수학<td><input type=number name=math min='0' max='100' value='"+rset.getInt(5)+"'</td></td>");
	    out.println("</tr></table>");
	    
		}
		out.println("<table border=0 align=center>");
	    out.println("<td><input type='submit' formaction='update.jsp' value='수정'><input type='submit' formaction='delete.jsp' value='삭제'></form></td>");
	    out.println("</tr></form>");
			rset.close();
			stmt.close();
			conn.close();

}catch(Exception e){
	out.println("알맞는 데이터를 넣어주세요.");
}
%>

</body>
</html>