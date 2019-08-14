<?xml version="1.0" encoding="UTF-8"?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*,javax.sql.*,java.io.*,java.net.*" %>
<%@ page import="javax.xml.parsers.*,org.w3c.dom.*" %>

<%
Class.forName("com.mysql.cj.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.102/kopoctc?serverTimezone=UTC","root","asdf1234");

Statement stmt = conn.createStatement();
ResultSet rset= stmt.executeQuery("select * from examtable1;");
out.println("<table border=1>");//데이터 베이스의 경우 기본 형태와 완전히 동일하며
out.println("<datas>");
while(rset.next()){
	out.println("<tr><data>");
	out.println("<td><name>"+rset.getString(1)+"</name></td>");
	out.println("<td><studentid>"+Integer.toString(rset.getInt(2))+"</studentid></td>");
	out.println("<td><kor>"+Integer.toString(rset.getInt(3))+"</kor></td>");
	out.println("<td><eng>"+Integer.toString(rset.getInt(4))+"</eng></td>");
	out.println("<td><mat>"+Integer.toString(rset.getInt(5))+"</mat></td>");
	out.println("</data></tr>");
}//차이점으론 xml타입의 태그를 통해서 데이터를 분류하고 지정함.
out.println("</datas></table>");
rset.close();
stmt.close();
conn.close();
%>