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

<html>
<head>
<title>성적조회</title>
<%!
DefaultHttpClient client;

public DefaultHttpClient getThreadSafeClient(){
	if(client!=null)
		return client;
	client=new DefaultHttpClient();
	ClientConnectionManager mgr=client.getConnectionManager();
	HttpParams params=client.getParams();
	client=new DefaultHttpClient(new ThreadSafeClientConnManager(params,mgr.getSchemeRegistry()),params);
	return client;
}
public String goXML(String getURL){
	String Result=null;
	HttpClient client=getThreadSafeClient();
	HttpConnectionParams.setConnectionTimeout(client.getParams(),100000);
	HttpConnectionParams.setSoTimeout(client.getParams(),100000);
	HttpPost post=new HttpPost(getURL);
	
	List<NameValuePair> nameValuePairs=new ArrayList<NameValuePair>();
	if(false){
		nameValuePairs.add(new BasicNameValuePair("input1","kopoctc"));
	}
	
	try{
		post.setEntity(new UrlEncodedFormEntity(nameValuePairs));
		HttpResponse responsePost=null;
		HttpEntity resEntity=responsePost.getEntity();
		
		if(resEntity!=null){
			Result=EntityUtils.toString(resEntity).trim();
		}
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		
	}
	return Result;
}
%>
</head>
<body>
	<h1>성적 조회</h1>
<%

try{
	DocumentBuilder docBuilder=DocumentBuilderFactory.newInstance().newDocumentBuilder();
	
	Document doc = docBuilder.parse(new File("C:\\Users\\lee gil joon\\eclipse-workspace\\examtable\\WebContent\\testdata.xml"));
	
	Element root = doc.getDocumentElement();
	NodeList tag_name = doc.getElementsByTagName("name");
	NodeList tag_studentid = doc.getElementsByTagName("studentid");
	NodeList tag_kor = doc.getElementsByTagName("kor");
	NodeList tag_eng = doc.getElementsByTagName("eng");
	NodeList tag_mat = doc.getElementsByTagName("mat");
	
	out.println("<table cellspacing=1 width=500 border=1>");
	out.println("<tr>");
	out.println("<td width=100>이름</td>");
	out.println("<td width=100>학번</td>");
	out.println("<td width=100>국어</td>");
	out.println("<td width=100>영어</td>");
	out.println("<td width=100>수학</td>");
	out.println("</tr>");
	
	for(int i=0; i<tag_name.getLength();i++){
		out.println("<tr>");
		
		out.println("<td width=100>"+tag_name.item(i).getFirstChild().getNodeValue()+"</td>");
		out.println("<td width=100>"+tag_studentid.item(i).getFirstChild().getNodeValue()+"</td>");
		out.println("<td width=100>"+tag_kor.item(i).getFirstChild().getNodeValue()+"</td>");
		out.println("<td width=100>"+tag_eng.item(i).getFirstChild().getNodeValue()+"</td>");
		out.println("<td width=100>"+tag_mat.item(i).getFirstChild().getNodeValue()+"</td>");
		out.println("<tr>");
		
	}
}catch(Exception e){
	e.printStackTrace();
}

%>
</body>
</html>