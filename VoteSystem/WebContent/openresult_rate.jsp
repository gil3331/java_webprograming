<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.sql.*,javax.sql.*,java.io.*,java.net.*,java.text.*"%>
<% DecimalFormat df = new DecimalFormat("0.##");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.102/kopoctc?serverTimezone=UTC",
			"root", "asdf1234");
	Statement stmt = conn.createStatement();
	ResultSet rset= stmt.executeQuery("select count(hubo_id) from Tupyo_table;");
	rset.next();
	int hubo_count = rset.getInt(1);
%>
<style>
    .graph { 
        position: relative; /* IE is dumb */
        width: 200px; 
        border: 1px solid #B1D632; 
        padding: 2px; 
		font-size:11px;
		font-family:tahoma;
		margin-bottom:3px;
    }
    .graph .bar { 
        display: block;
        position: relative;
        background: #B1D632; 
        text-align: center; 
        color: #333; 
        height: 2em; 
        line-height: 2em;            
    }
    .graph .bar span { position: absolute; left: 1em; }
</style>
<table border= "width=400px" bordercolor="#000000" rules="rows" align="center">
<h3 align="center">후보별 득표율</h3>
<%

Statement stmt1 = conn.createStatement();
ResultSet rset1= stmt1.executeQuery("select * from hubo_table;");

while(rset1.next()){
rset=stmt.executeQuery("select count(hubo_id) from Tupyo_table where hubo_id="+rset1.getInt(1)+";");
rset.next();
String rate= df.format(((float)rset.getInt(1)/hubo_count)*100);

out.println("<td><a href=one_hubo.jsp?id="+rset1.getInt(1)+"&name="+rset1.getString(2)+">기호"+rset1.getInt(1)+"번"+rset1.getString(2)+"</a></td><td><div class='graph'>");
out.println("<strong class='bar' style='width: "+rate+"%;'>"+rate+"%,"+rset.getInt(1)+"(표)</strong><tr>");
out.println("</div></td>");
}



rset.close();
rset1.close();
stmt1.close();
stmt.close();
conn.close();

%>
</table>
</body>
</html>