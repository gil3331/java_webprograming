<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/xml; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*, javax.sql.*,java.io.*,java.net.*" %>
<%//로그인 체크
	String thispage="loginxml.jsp";
	String login_url="login.jsp?rtn_url="+thispage;
	
	String loginVal=(String) session.getAttribute("loginOK");
	if(loginVal==null||!loginVal.equals("YES"))//loginVal가 널이거나, yes가 아닐때,
		response.sendRedirect(login_url);//login_url을 다시 응답 시킨다.(사실상 현 페이지)
%>
<%
Class.forName("com.mysql.cj.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.102/kopoctc?serverTimezone=UTC","root","asdf1234");

Statement stmt = conn.createStatement();
ResultSet rset= stmt.executeQuery("select * from examtable1;");

out.println("<datas>");
while(rset.next()){
	out.println("<data>");
	out.println("<name>"+rset.getString(1)+"</name>");
	out.println("<studentid>"+Integer.toString(rset.getInt(2))+"</studentid>");
	out.println("<kor>"+Integer.toString(rset.getInt(3))+"</kor>");
	out.println("<eng>"+Integer.toString(rset.getInt(4))+"</eng>");
	out.println("<mat>"+Integer.toString(rset.getInt(5))+"</mat>");
	out.println("</data>");
}
out.println("</datas>");
rset.close();
stmt.close();
conn.close();
%>