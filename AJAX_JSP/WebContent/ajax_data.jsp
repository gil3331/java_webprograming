<%@ page import="org.apache.http.client.methods.HttpPost"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page
	import="java.sql.*,javax.sql.*,java.io.*,java.net.*,javax.servlet.*,java.text.*,java.util.*"%>
<%@ page import="javax.xml.parsers.*,javax.naming.*,org.w3c.dom.*"%>

<%@ page import="org.apache.http.HttpEntity"%>
<%@ page import="org.apache.http.HttpResponse"%>
<%@ page import="org.apache.http.NameValuePair"%>
<%@ page import="org.apache.http.ParseException"%>
<%@ page import="org.apache.http.client.HttpClient"%>
<%@ page import="org.apache.http.client.entity.UrlEncodedFormEntity"%>
<%@ page import="org.apache.http.client.methods.HttpGet"%>
<%@ page import="org.apache.http.impl.client.DefaultHttpClient"%>
<%@ page import="org.apache.http.message.BasicNameValuePair"%>
<%@ page import="org.apache.http.params.HttpConnectionParams"%>
<%@ page import="org.apache.http.util.EntityUtils"%>
<%@ page import="org.apache.http.conn.ClientConnectionManager"%>
<%@ page import="org.apache.http.params.HttpParams"%>
<%@ page import="org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script>
$.ajax({
	url:"http://localhost:8090/AJAX_JSP/ajax_data.jsp",
	data:{name:"honggildong"},
	type:"GET",
	dataType:"json"
})
</script>
</head>
<body>
<% DocumentBuilder docBuilder=DocumentBuilderFactory.newInstance().newDocumentBuilder();
	
	Document doc = docBuilder.parse("testdata.xml");
	
	Element root = doc.getDocumentElement();
	NodeList tag_name = doc.getElementsByTagName("name");
	NodeList tag_studentid = doc.getElementsByTagName("studentid");
	NodeList tag_kor = doc.getElementsByTagName("kor");
	NodeList tag_eng = doc.getElementsByTagName("eng");
	NodeList tag_mat = doc.getElementsByTagName("mat");








%>
</body>
</html>