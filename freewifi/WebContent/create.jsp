<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.sql.*,javax.sql.*,java.io.*,java.net.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TBL생성</title>
</head>
<body>
<%
try{
Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.102/kopoctc?serverTimezone=UTC","root","asdf1234");
		
			Statement stmt = conn.createStatement();
			
			stmt.execute("create table examtable1("+//examtable1 테이블을 생성
					"name varchar(20),"+//이름에는 바차로 20
					"studentid int not null primary key,"+//학생번호에는 pk를 지정하며 not null을 선정
					"kor int,"+//국어점수
					"eng int,"+//영어점수
					"mat int)"+//수학점수
					"DEFAULT CHARSET = utf8;");
			
			stmt.close();
			conn.close();
			out.println("테이블 생성");
}catch(Exception e){
	out.println("이미 테이블이 존재합니다.");
}
%>	
</body>
</html>