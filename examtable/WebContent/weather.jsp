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
<meta charset="UTF-8">
<title>동네예보</title>
</head>
<body>
<h1 align="center">분당구 일기예보</h1>
<%//파싱을 위한 준비과정
DocumentBuilder docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
Document doc = docBuilder.parse("http://www.kma.go.kr/wid/queryDFS.jsp?gridx=61&gridy=123");
//실제로 해당 내용을 파싱해오는 부분(가져오고자 하는 전체 xml의 url을 가져온다.)-ex.유사상품으론 new File을 통한 로컬 파일을 읽어오는 경우도 있음(or new URL)
NodeList tag_001 = doc.getElementsByTagName("data");
//가져오는 xml 데이터에 name테그를 걸어준다.
out.println("<table border=1; align='center' style='text-align:center'>");//여기서부턴 가져올 데이터에 대한 테이블 작성
out.println("<tr>");
out.println("<td>시간</td>");
out.println("<td>오늘~모레</td>");
out.println("<td>현재 온도</td>");
out.println("<td>최고온도</td>");
out.println("<td>최저온도</td>");
out.println("<td>하늘 상태</td>");
out.println("<td>강수 상태</td>");
out.println("<td>날씨(kor)</td>");
out.println("<td>날씨(eng)</td>");
out.println("<td>강수확률(%)</td>");
out.println("<td>예상 강수량(12시간)</td>");
out.println("<td>예상 적설량(12시간)</td>");
out.println("<td>풍속(m/s)</td>");
out.println("<td>풍향</td>");
out.println("<td>풍향(kor)</td>");
out.println("<td>풍향(eng)</td>");
out.println("<td>습도(%)</td>");
out.println("<td>예상 강수량(6시간)</td>");
out.println("<td>예상 적설량(6시간)</td>");
out.println("</tr>");

for(int i=0; i<tag_001.getLength();i++){//테그 네임을 for문을 통해 가져오면서 더이상 테그 내용이 존재하지 않을때 까지 지속(끝날때 까지)
	Element elmt=(Element)tag_001.item(i);
	//각각의 예외 케이스와 데이터 값에 해당하는 이미지 파일을 넣기 위한 if문이 아래부터 사용됨
	String hour=elmt.getElementsByTagName("hour").item(0).getFirstChild().getNodeValue();//3시간 단위 예보
		String day=elmt.getElementsByTagName("day").item(0).getFirstChild().getNodeValue();//몇 번째 날(0:오늘/1:내일/2:모레)
	if(Integer.parseInt(day)==0){
		day="오늘";
	}else if(Integer.parseInt(day)==1){
		day="내일";
	}else if(Integer.parseInt(day)==2){
		day="모레";
	}//오늘~모레까지의 날짜를 글자로 구현(본래는 값이 0~2까지로 되어 있음)
	String temp=elmt.getElementsByTagName("temp").item(0).getFirstChild().getNodeValue();//현재 시간 온도
	String tmx=elmt.getElementsByTagName("tmx").item(0).getFirstChild().getNodeValue();//최고온도
	
	String tmn=elmt.getElementsByTagName("tmn").item(0).getFirstChild().getNodeValue();//최저온도
	
	String sky=elmt.getElementsByTagName("sky").item(0).getFirstChild().getNodeValue();//하늘 상태코드(1:맑음/2:구름조금/3:구름많음/4:흐림)
	String pty=elmt.getElementsByTagName("pty").item(0).getFirstChild().getNodeValue();//강수 상태코드(0:없음/1:비/2:비/눈/3:눈/비/4:눈)
	String wfKor=elmt.getElementsByTagName("wfKor").item(0).getFirstChild().getNodeValue();//날씨 한국어
	String wfEn=elmt.getElementsByTagName("wfEn").item(0).getFirstChild().getNodeValue();//날씨 영어
	String pop=elmt.getElementsByTagName("pop").item(0).getFirstChild().getNodeValue();//강수 확률%
	String r12=elmt.getElementsByTagName("r12").item(0).getFirstChild().getNodeValue();//12시간 예상 강수량
	String s12=elmt.getElementsByTagName("s12").item(0).getFirstChild().getNodeValue();//12시간 예상 적설량
	String ws=elmt.getElementsByTagName("ws").item(0).getFirstChild().getNodeValue();//풍속(m/s)
	String wd=elmt.getElementsByTagName("wd").item(0).getFirstChild().getNodeValue();//풍향(0~7:북,북동,동,남동,남,남서,서,북서)
	String wdKor=elmt.getElementsByTagName("wdKor").item(0).getFirstChild().getNodeValue();//풍향 한국어
	String wdEn=elmt.getElementsByTagName("wdEn").item(0).getFirstChild().getNodeValue();//풍향 영어
	String reh=elmt.getElementsByTagName("reh").item(0).getFirstChild().getNodeValue();//습도%
	String r06=elmt.getElementsByTagName("r06").item(0).getFirstChild().getNodeValue();//6시간 예상 강수량
	String s06=elmt.getElementsByTagName("s06").item(0).getFirstChild().getNodeValue();//6시간 예상 적설량
	
	out.println("<tr>");//시간이 24시간 기준으로 되어있어 if문을 통해서 오전/오후로 정리
	if(Integer.parseInt(hour)>12&&Integer.parseInt(hour)<24){//점심 이후부터 새벽12시 전까지의 경우에 pm으로 시간구현
	out.println("<td>"+(Integer.parseInt(hour)-12)+"pm</td>");
	}else if(Integer.parseInt(hour)==24){//다만 24시의 경우 12am으로 구현
		out.println("<td>"+(Integer.parseInt(hour)-12)+"am</td>");
	}else if(Integer.parseInt(hour)==12){
		out.println("<td>"+hour+"pm</td>");//오후 12시는 12pm으로 구현
	}else{
		out.println("<td>"+hour+"am</td>");
	}//그외에는 am으로 시간 구현
	out.println("<td>"+day+"</td>");
	out.println("<td>"+temp+"</td>");
	if(tmx.equals("-999.0")){//미지수 값으로 판단되기에 미측정으로 구현
		out.println("<td>미측정</td>");
	}else{
		out.println("<td>"+tmx+"</td>");	
	}
	if(tmn.equals("-999.0")){//미지수 값으로 판단되기에 미측정으로 구현
		out.println("<td>미측정</td>");
	}else{
		out.println("<td>"+tmn+"</td>");	
	}
	
	if(sky.equals("1")){//날씨에 대한 구현(1~4까지 태양,구름조금,구름많음,흐림으로 구성)
		out.println("<td><img src='weatherPicture/sun.png' style='width:30' height='28'></td>");
	}else if(sky.equals("2")){
		out.println("<td><img src='weatherPicture/sunofcloud.png' style='width:30' height='28'></td>");
	}else if(sky.equals("3")){
		out.println("<td><img src='weatherPicture/cloudofsun.png' style='width:30' height='28'></td>");
	}else if(sky.equals("4")){
		out.println("<td><img src='weatherPicture/cloud.png' style='width:30' height='28'></td>");
	}else{
		out.println("<td>"+sky+"</td>");//예외사항은 숫자로 구현
	}
	
	if(pty.equals("0")){//강수 상태에 대한 구현(0~3까지 없음(해),비,비나 눈, 눈이나 비,눈)
		out.println("<td><img src='weatherPicture/sun.png' style='width:30' height='28'></td>");
	}else if(pty.equals("1")){
		out.println("<td><img src='weatherPicture/rain.png' style='width:30' height='28'></td>");
	}else if(pty.equals("2")){
		out.println("<td><img src='weatherPicture/rainOrSnow.png' style='width:30' height='28'></td>");
	}else if(pty.equals("3")){
		out.println("<td><img src='weatherPicture/snowOrRain.png' style='width:30' height='28'></td>");
	}else if(pty.equals("4")){
		out.println("<td><img src='weatherPicture/snow.png' style='width:30' height='28'></td>");
	}else{
		out.println("<td>"+pty+"</td>");//예외사항은 숫자로 구현
	}
	out.println("<td>"+wfKor+"</td>");
	out.println("<td>"+wfEn+"</td>");
	out.println("<td>"+pop+"%</td>");
	out.println("<td>"+r12+"</td>");
	out.println("<td>"+s12+"</td>");
	out.println("<td>"+String.format("%.1f", Double.parseDouble(ws))+"(m/s)</td>");
	
	if(wd.equals("0")){//풍향을 팔방위로 나눠 구현(0~7까지 북,북동,동,동남,남,남서,서,북서)
		out.println("<td><strong>↓</strong></td>");
	}else if(wd.equals("1")){
		out.println("<td><strong>↙</strong></td>");
	}else if(wd.equals("2")){
		out.println("<td><strong>←</strong></td>");
	}else if(wd.equals("3")){
		out.println("<td><strong>↖</strong></td>");
	}else if(wd.equals("4")){
		out.println("<td><strong>↑</strong></td>");
	}else if(wd.equals("5")){
		out.println("<td><strong>↗</strong></td>");
	}else if(wd.equals("6")){
		out.println("<td><strong>→</strong></td>");
	}else if(wd.equals("7")){
		out.println("<td><strong>↘</strong></td>");
	}else{
		out.println("<td>"+wd+"</td>");
	}
	
	out.println("<td>"+wdKor+"</td>");
	out.println("<td>"+wdEn+"</td>");
	out.println("<td>"+reh+"%</td>");
	out.println("<td>"+r06+"</td>");
	out.println("<td>"+s06+"</td>");
	out.println("</tr>");//각각의 데이터를 구현 후 테이블 작성 종료
}
out.println("</table>");

%>
</body>
</html>