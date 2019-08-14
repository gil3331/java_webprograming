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
	String Result=null;//세션유지를 위한 체크
	HttpClient client=getThreadSafeClient();
	HttpConnectionParams.setConnectionTimeout(client.getParams(),100000);
	HttpConnectionParams.setSoTimeout(client.getParams(),100000);
	HttpPost post=new HttpPost(getURL);
	
	List<NameValuePair> nameValuePairs=new ArrayList<NameValuePair>();
	if(false){//여기가 파라미터를 넘기는 곳
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

try{//파싱을 위한 도큐먼트 빌더이다.(파싱을 하고자 한다면 우선적으로 도규먼트 만들기)
	DocumentBuilder docBuilder=DocumentBuilderFactory.newInstance().newDocumentBuilder();
	//도큐먼트 빌더를 통해서 실제로 xml을 읽기 위한 도큐먼트를 만들고 그 도큐먼트에 빌더를 통해서 파싱을 한다.
	Document doc = docBuilder.parse(new File("C:\\Users\\lee gil joon\\eclipse-workspace\\examtable\\WebContent\\testdata.xml"));
	
	Element root = doc.getDocumentElement();//여기선 특별히 필요 없다.
	NodeList tag_name = doc.getElementsByTagName("name");//도큐먼트로 파싱된 xml 데이터를 노드리스트로 지정 값들을 각각 저장한다.
	NodeList tag_studentid = doc.getElementsByTagName("studentid");//도큐먼트로 파싱된 xml 데이터를 노드리스트로 지정 값들을 각각 저장한다.
	NodeList tag_kor = doc.getElementsByTagName("kor");//도큐먼트로 파싱된 xml 데이터를 노드리스트로 지정 값들을 각각 저장한다.
	NodeList tag_eng = doc.getElementsByTagName("eng");//도큐먼트로 파싱된 xml 데이터를 노드리스트로 지정 값들을 각각 저장한다.
	NodeList tag_mat = doc.getElementsByTagName("mat");//도큐먼트로 파싱된 xml 데이터를 노드리스트로 지정 값들을 각각 저장한다.
	
	out.println("<table cellspacing=1 width=500 border=1>");
	out.println("<tr>");//이 부분은 그냥 테이블 기본 형태 구조 잡는 부분
	out.println("<td width=100>이름</td>");
	out.println("<td width=100>학번</td>");
	out.println("<td width=100>국어</td>");
	out.println("<td width=100>영어</td>");
	out.println("<td width=100>수학</td>");
	out.println("</tr>");
	
	for(int i=0; i<tag_name.getLength();i++){//for문을 통해서 읽은 내용을 getLength를 통해 더이상 읽을게 없을때까지 반복
		out.println("<tr>");
		
		out.println("<td width=100>"+tag_name.item(i).getFirstChild().getNodeValue()+"</td>");//데이터의 이름
		out.println("<td width=100>"+tag_studentid.item(i).getFirstChild().getNodeValue()+"</td>");//데이터의 학번
		out.println("<td width=100>"+tag_kor.item(i).getFirstChild().getNodeValue()+"</td>");//데이터의 국어 점수
		out.println("<td width=100>"+tag_eng.item(i).getFirstChild().getNodeValue()+"</td>");//데이터의 영어 점수
		out.println("<td width=100>"+tag_mat.item(i).getFirstChild().getNodeValue()+"</td>");//데이터의 수학 점수를 출력해준다.(양식에 맞춰)
		out.println("<tr>");
		
	}
}catch(Exception e){
	e.printStackTrace();
}

%>
</body>
</html>