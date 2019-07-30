<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.sql.*,javax.sql.*,java.io.*,java.net.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TBL값넣기</title>
</head>
<body>
<%
try{
Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.102/kopoctc?serverTimezone=UTC","root","asdf1234");
		
			Statement stmt = conn.createStatement();
			
			stmt.execute("insert into examtable1 (name, studentid, kor, eng, mat) values ('나연', 209901, 95, 100, 95);");//클래스 속성양식에 맞춰 해당 정보를 insert
			stmt.execute("insert into examtable1 (name, studentid, kor, eng, mat) values ('정연', 209902, 95, 95, 95);");//클래스 속성양식에 맞춰 해당 정보를 insert
			stmt.execute("insert into examtable1 (name, studentid, kor, eng, mat) values ('모모', 209903, 100, 100, 100);");//클래스 속성양식에 맞춰 해당 정보를 insert
			stmt.execute("insert into examtable1 (name, studentid, kor, eng, mat) values ('사나', 209904, 100, 95, 90);");//클래스 속성양식에 맞춰 해당 정보를 insert
			stmt.execute("insert into examtable1 (name, studentid, kor, eng, mat) values ('지효', 209905, 80, 100, 70);");//클래스 속성양식에 맞춰 해당 정보를 insert
			stmt.execute("insert into examtable1 (name, studentid, kor, eng, mat) values ('미나', 209906, 100, 100, 70);");//클래스 속성양식에 맞춰 해당 정보를 insert
			stmt.execute("insert into examtable1 (name, studentid, kor, eng, mat) values ('다현', 209907, 70, 70, 70);");//클래스 속성양식에 맞춰 해당 정보를 insert
			stmt.execute("insert into examtable1 (name, studentid, kor, eng, mat) values ('채영', 209908, 80, 75, 72);");//클래스 속성양식에 맞춰 해당 정보를 insert
			stmt.execute("insert into examtable1 (name, studentid, kor, eng, mat) values ('쯔위', 209909, 78, 79, 82);");//클래스 속성양식에 맞춰 해당 정보를 insert
			
			stmt.close();
			conn.close();
			out.println("데이터 삽입");
}catch(Exception e){
	out.println("테이블이 없습니다.테이블을 생성해주세요.");
}
%>
</body>
</html>