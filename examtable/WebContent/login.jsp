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
<%
	String username = request.getParameter("username");
	String userpasswd = request.getParameter("userpasswd");
	String rtn_url = request.getParameter("rtn_url");
	String logincnt = request.getParameter("logincnt");
	if (logincnt == null)
		logincnt = "0";
	if (username == null)
		username = "";
	if (userpasswd == null)
		userpasswd = "";
	if (rtn_url == null)
		rtn_url = "";

	if (username.equals("kopoctc") && userpasswd.equals("kopoctc")) {//login ok
		session.setAttribute("loginOK", "YES");
		response.sendRedirect(rtn_url);
	} else {//login Err
		logincnt = Integer.toString(Integer.parseInt(logincnt) + 1);
	}
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