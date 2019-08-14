<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*,javax.sql.*,java.io.*,java.net.*" %>
<%@ page import="javax.xml.parsers.*,org.w3c.dom.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<html>
<head>
<%//실질적인 기능자체는 loginxml.jsp에서 구현되며, 
//성적표를 조회하기에 앞서 로그인 세션 기능을 구현하기 위하여 해당 jsp를 만든다.
	String username = request.getParameter("username");//loginxml.jsp에서 사용자 이름과
	String userpasswd = request.getParameter("userpasswd");//사용자 비밀번호
	String rtn_url = request.getParameter("rtn_url");//url
	String logincnt = request.getParameter("logincnt");//로그인 횟수를 받는다.
	if (logincnt == null)
		logincnt = "0";
	if (username == null)
		username = "";//이 부분들은 각각의 상황에 대한 예외처리
	if (userpasswd == null)
		userpasswd = "";
	if (rtn_url == null)
		rtn_url = "";

	if (username.equals("kopoctc") && userpasswd.equals("kopoctc")) {//login ok
		session.setAttribute("loginOK", "YES");//로그인 성공시에
		response.sendRedirect(rtn_url);//해당 url로 응답을 준다.
	} else {//login Err
		logincnt = Integer.toString(Integer.parseInt(logincnt) + 1);
	}//실패한 경우는 그냥 로그인 시도횟수 1회증가
%>
</head>
<BODY>
	<form method="post" action="login.jsp">
		이름:<input type="text" name="username"><br>
		비밀번호:<input	type="password" name="userpasswd"><br>
		<input type="hidden" name="logincnt" value=<%=logincnt%>><br>
		<input type="hidden" name="rtn_url" value=<%=rtn_url%>><br>
		<input type="submit" value="전송">
	</form>
	로그인 시도횟수	<%=logincnt%>회 입니다.<br>
	rtn_url	<%=rtn_url%> 입니다.<br>
</BODY>
</html>
</body>
</html>