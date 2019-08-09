<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*,javax.sql.*,java.io.*,java.net.*" %>
<%@ page import="javax.xml.parsers.*,org.w3c.dom.*" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>전국와이파이 조회</title>
</head>
<body>
<h1>전국와이파이 조회</h1>
<%
	DocumentBuilder docBuilder=DocumentBuilderFactory.newInstance().newDocumentBuilder();
	
	Document doc = docBuilder.parse(new File("C:\\Users\\lee gil joon\\eclipse-workspace\\examtable\\WebContent\\wifi.xml"));
	
	Element root = doc.getDocumentElement();
	NodeList tag_address = doc.getElementsByTagName("소재지지번주소");
	NodeList tag_Latitude = doc.getElementsByTagName("위도");
	NodeList tag_longitude = doc.getElementsByTagName("경도");
	
	
	
	out.println("<table cellspacing=1 width=500 border=1>");
	out.println("<tr>");
	out.println("<td width=100>순번</td>");
	out.println("<td width=100>소재지지번주소</td>");
	out.println("<td width=100>위도</td>");
	out.println("<td width=100>경도</td>");
	out.println("</tr>");
	
	for(int i=0; i<tag_address.getLength();i++){
		out.println("<tr>");
		out.println("<td width=100>"+i+"</td>");
		out.println("<td width=100>"+tag_address.item(i).getFirstChild().getNodeValue()+"</td>");
		out.println("<td width=100>"+tag_Latitude.item(i).getFirstChild().getNodeValue()+"</td>");
		out.println("<td width=100>"+tag_longitude.item(i).getFirstChild().getNodeValue()+"</td>");
		out.println("<tr>");
		
	}
%>
</body>
</html>