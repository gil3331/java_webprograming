<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.sql.*,javax.sql.*,java.io.*,java.net.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 수정</title>
</head>
<style>
#nav{
align:center;
text_align:center;
}
#main-menu{
	margin: 0;
	padding: 0;
	list-style-type: none;
	margin-left : auto;
	margin-right : auto;
	text-align : center;
	
}
#menu-bar{
width:100%;
}


#main-menu>li {
	float: left;
	border: 1px solid black;
	background: #35477d;
	align:center;
	text-align : center;
	display:inline-block;
	width:19.71%;
}

#main-menu>li:hover #sub-menu {
	opacity: 1;
	visibility: visible;
}

#main-menu>li>a {
	font-size: 0.85em;
	color: rgba(255, 255, 255, 0.85);
	text-align: center;
	text-decoration: none;
	display: block;
	letter-spacing: 0.05em;
	padding: 12px 36px;
}

#sub-menu {
	position: absolute;
	background: #182952;
	opacity: 0;
	visibility: hidden;
	width : 19.5%;
	padding-inline-start:0px;
}

#sub-menu>li {
	padding:0px;
	border-bottom: 1px solid rgba(0, 0, 0, 0.15);
	list-style : none;
	text-align : center;
}

#sub-menu>li>a {
	color: rgba(255, 255, 255, 0.6);
	text-decoration:none;
}

#nav> ul > li{
list-style : none;
text-align : center;
pading-left : 0px;
}

</style>


<body>
	<div style=background:#faf4e8; style=text-align:center>
	<h1 align="center"><font face=Serif>링(Ring)조트에 오신걸 환영합니다</font></h1>
	</div>
	<div id="menu-bar">
	<nav role="navigation">
		<ul id="main-menu">
			<li><a>리조트소개</a>
				<ul id="sub-menu">
					<li><a href="main.html" >링조트</a></li>
					<li><a href="a_01.html">VIP룸</a></li>
					<li><a href="a_02.html">일반룸</a></li>
					<li><a href="a_03.html">합리적인 룸</a></li>
				</ul></li>
			<li><a>찾아오기</a>
				<ul id="sub-menu">
					<li><a href="b_01.html">찾아오는길</a></li>
					<li><a href="b_02.html">대중교통이용</a></li>
					<li><a href="b_03.html">자가용이용</a></li>
				</ul></li>
			<li><a>주변여행지</a>
				<ul id="sub-menu">
					<li><a href="c_01.html">외로운 산</a></li>
					<li><a href="c_02.html">호수 마을</a></li>
					<li><a href="c_03.html">리븐델</a></li>
				</ul></li>
			<li><a>예약하기</a>
				<ul id="sub-menu">
					<li><a href="d_01.jsp">예약상황</a></li>
					<li><a href="d_02.html">예약하기</a></li>
					<li><a href="adm_allview.jsp">관리자페이지</a></li>
					<li><a href="adm_logout.jsp">관리자로그아웃</a></li>
				</ul></li>
			<li><a>리조트소식</a>
				<ul id="sub-menu">
					<li><a href="e_01.jsp">리조트소식</a></li>
					<li><a href="e_02.jsp">이용후기</a></li>
				</ul></li>
		</ul>
	</nav>
	</div>
	<div style="margin-top:10%">
<%
	request.setCharacterEncoding("UTF-8");
	int ID = Integer.parseInt(request.getParameter("id"));
	String title = new String(request.getParameter("title").getBytes("8859_1"), "UTF-8");
	String content = new String(request.getParameter("content").getBytes("8859_1"), "UTF-8");

	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.102/kopoctc?serverTimezone=UTC",
			"root", "asdf1234");

	Statement stmt = conn.createStatement();

	stmt.execute("delete from gongji where id="+ID+";");
	stmt.close();
	conn.close();
%>
			<h3 align="center">글 삭제 성공</h3>
			<form align="center">
			<input type="button" value="목록으로 돌아가기"  onclick="location.href='e_01.jsp'">
			</form>
		</div>
<div style="background:#faf4e8" align="center">
	<ul style=list-style:none>
		<li>링(Ring)조트 | 서울특별시 강남구 도곡동 도곡1로 23길 70 | TEL : 02-731-2850</li>
		<li>사업자등록번호 : 229-81-20586 | 통신판매신고번호 : 도곡0426호 | 대표 : 사우론</li>
	</ul>
</div>
</body>
</html>