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
<h1 align="center">전국와이파이 조회</h1>
<%	//파싱을 위한 도큐먼트 빌더
	DocumentBuilder docBuilder=DocumentBuilderFactory.newInstance().newDocumentBuilder();
	//실제 파싱 하는 도큐먼트 및 해당 데이터 xml의 주소
	Document doc = docBuilder.parse(new File("C:\\Users\\lee gil joon\\eclipse-workspace\\examtable\\WebContent\\wifi.xml"));
	
	NodeList tag_address = doc.getElementsByTagName("소재지지번주소");//노드리스트를 통해서 지정된 데이터를 저장
	NodeList tag_roadaddress = doc.getElementsByTagName("소재지도로명주소");//노드리스트를 통해서 지정된 데이터를 저장
	NodeList tag_Latitude = doc.getElementsByTagName("위도");//노드리스트를 통해서 지정된 데이터를 저장
	NodeList tag_longitude = doc.getElementsByTagName("경도");//노드리스트를 통해서 지정된 데이터를 저장
	
	out.println("<table cellspacing=1 width=500 border=1 align='center'>");
	//이 부분은 가져올 데이터를 위한 테이블 형태
	out.println("<td width=100>순번</td>");
	out.println("<td width=100>소재지지번주소</td>");
	out.println("<td width=100>위도</td>");
	out.println("<td width=100>경도</td>");
	out.println("<tr>");
	
	for(int i=0; i<tag_address.getLength();i++){//가져올 데이터의 주소 내용을 기준으로 내용이 없을때까지 for문으로 반복해서 읽어옴
		out.println("<td width=100>"+i+"</td>");
		if(tag_address.item(i).getFirstChild()==null){//단 지번주소가 빈 경우가 있어서 그럴경우는 도로명으로 가져옴
			out.println("<td width=100>"+tag_roadaddress.item(i).getFirstChild().getNodeValue()+"</td>");
		}else{//그 외의 경우는 정상적으로 데이터를 가져옴
		out.println("<td width=100>"+tag_address.item(i).getFirstChild().getNodeValue()+"</td>");
		}
		out.println("<td width=100>"+tag_Latitude.item(i).getFirstChild().getNodeValue()+"</td>");
		out.println("<td width=100>"+tag_longitude.item(i).getFirstChild().getNodeValue()+"</td>");
		out.println("<tr>");
		
	}
%>
</body>
</html>