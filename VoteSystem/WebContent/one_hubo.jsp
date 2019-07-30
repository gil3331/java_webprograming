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
	int ID=Integer.parseInt(request.getParameter("id"));
	String name=new String(request.getParameter("name").getBytes("8859_1"),"UTF-8");
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.102/kopoctc?serverTimezone=UTC",
			"root", "asdf1234");
	Statement stmt = conn.createStatement();
				
	ResultSet rset= stmt.executeQuery("select count(age) from Tupyo_table where hubo_id="+ID+";");
	rset.next();
		
	int allage_count = rset.getInt(1);
	out.println("<h3 align='center'>기호 "+ID+"번 "+name+" 득표성향 분석 </h3>");		
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
<%

Statement stmt1 = conn.createStatement();
ResultSet rset1 = null; 

for(int i=1;i<10;i++){

rset1=stmt.executeQuery("select count(age) from Tupyo_table where hubo_id="+ID+" and age="+i+";");
rset1.next();
String rate= df.format(((float)rset1.getInt(1)/allage_count)*100);

out.println("<tr><td>"+i+"0대</td><td><div class='graph'>");
out.println("<strong class='bar' style='width: "+rate+"%;'>"+rate+"%,"+rset1.getInt(1)+"(표)</strong>");
out.println("</div></td></tr>");

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