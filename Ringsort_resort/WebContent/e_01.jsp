<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.sql.*,javax.sql.*,java.io.*,java.net.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>리조트 소식</title>

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
	<div style="background: #faf4e8" id="a1">
		<h1 align="center">
			<font face=Serif>링(Ring)조트에 오신걸 환영합니다</font>
		</h1>
	</div>
	<div style="width: 100%" style="z-index:10" id="a2">
		<nav role="navigation">
			<ul id="main-menu">
				<li><a>리조트소개</a>
					<ul id="sub-menu">
						<li><a href="main.html">링조트</a></li>
						<li><a href="a_01.html">VIP룸</a></li>
						<li><a href="a_02.html">일반룸</a></li>
						<li><a href="a_03.html">합리적인 룸</a></li>
					</ul>
				</li>
				<li><a>찾아오기</a>
					<ul id="sub-menu">
						<li><a href="b_01.html">찾아오는길</a></li>
						<li><a href="b_02.html">대중교통이용</a></li>
						<li><a href="b_03.html">자가용이용</a></li>
					</ul>
				</li>
				<li><a>주변여행지</a>
					<ul id="sub-menu">
						<li><a href="c_01.html">외로운 산</a></li>
						<li><a href="c_02.html">호수 마을</a></li>
						<li><a href="c_03.html">리븐델</a></li>
					</ul>
				</li>
				<li><a>예약하기</a>
					<ul id="sub-menu">
						<li><a href="d_01.jsp">예약상황</a></li>
						<li><a href="d_02.jsp">예약하기</a></li>
						<li><a href="adm_allview">관리자페이지</a></li>
						<li><a href="adm_logout">관리자로그아웃</a></li>
					</ul>
				</li>
				<li><a>리조트소식</a>
					<ul id="sub-menu">
						<li><a href="e_01.jsp">리조트소식</a></li>
						<li><a href="e_02.jsp">이용후기</a></li>
					</ul>
				</li>
			</ul>
		</nav>
	</div>

	<div id="a3" style="width:100%; height:75%">
	<h3 style="text-align:center; margin-top:7%">공지사항 리스트</h3>
		<table border=1 align="center">
			<td width=50px align="center">번호</td>
			<td width=500px align="center">제목</td>
			<td width=100px align="center">등록일</td>
			<td width=50px align="center">조회수</td>
			<tr>
				<%
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.102/kopoctc?serverTimezone=UTC",
							"root", "asdf1234");

					Statement stmt1 = conn.createStatement();
					ResultSet rset1 = stmt1.executeQuery("SELECT count(*) from gongji;");
					rset1.next();

					String Page = request.getParameter("Page");
					String list = request.getParameter("countList");
					int countList = 0;
					int correntPage = 0;//현재 페이지
					if (Page == null & list == null) {
						correntPage = 0;
						countList = 5;
					} else {
						correntPage = Integer.parseInt(Page) - 1;
						countList = Integer.parseInt(list);
					}
					int totalCount = rset1.getInt(1);//총 리스트의 갯수

					int countPage = 10;//1~10페이지 단위
					int totalPage = totalCount / countList;//총 페이지 수

					if (totalCount % countList > 0) {
						totalPage++;
					}

					if (totalCount < correntPage) {
						correntPage = totalPage;
					}

					int startPage = ((correntPage - 1) / 10) * 10 + 1;
					int endPage = startPage + countPage - 1;

					if (endPage > totalPage) {
						endPage = totalPage;
					}

					Statement stmt = conn.createStatement();
					ResultSet rset = stmt.executeQuery("SELECT id, title, DATE, viewcnt FROM gongji ORDER BY id DESC limit "
							+ ((correntPage) * 5) + "," + countList + ";");

					while (rset.next()) {
						out.println("<td align='center'>" + rset.getInt(1) + "</td>");
						out.println("<td><a href=gongji_view.jsp?key=" + rset.getInt(1) + "&viewcnt=" + rset.getInt(4) + ">"
								+ rset.getString(2) + "</a></td>");
						out.println("<td align='center'>" + rset.getDate(3) + "</td>");
						out.println("<td align='center'>" + rset.getInt(4) + "</td><tr>");
					}
					out.println("</table>");
					rset.close();
					stmt.close();
					conn.close();
				%>
	
				<table border=3 align="center" rules=rows bordercolor=#FFFFFF
					width=672px>
					<form>
						<td align="right"><input type="button" value="신규"
							onclick="location.href='gongji_insert.jsp'"></td>
					</form>
				</table>
	</div>
				<div align="center">
					<%
						if (startPage > 1) {
							out.println("<a href='gongji_list.jsp?Page=1&countList=5'>&lt;</a>");
						}

						if (correntPage > 0) {
							out.println("<a href='gongji_list.jsp?Page=1&countList=5'>&lt;</a>");
						}

						for (int iCount = startPage; iCount <= endPage; iCount++) {
							if (iCount == correntPage) {
								out.println("<a href='gongji_list.jsp?Page=" + iCount + "&countList=5'>" + iCount + "</a>");
							} else {
								out.println("<a href='gongji_list.jsp?Page=" + iCount + "&countList=5'>" + iCount + "</a>");
							}
						}

						if ((correntPage + 1) < totalPage) {
							out.println("<a href='gongji_list.jsp?Page=" + ((correntPage + 1) + 1) + "&countList=5'>&gt;</a>");
						}

						if (endPage < totalPage) {
							out.println("<a href='gongji_list.jsp?Page=" + totalPage + "&countList=5'>&gt;&gt;</a>");
						}
					%>
				</div>
				<div style="background: #faf4e8" align="center">
					<ul style="list-style: none">
						<li>링(Ring)조트 | 서울특별시 강남구 도곡동 도곡1로 23길 70 | TEL : 02-731-2850</li>
						<li>사업자등록번호 : 229-81-20586 | 통신판매신고번호 : 도곡0426호 | 대표 : 사우론</li>
					</ul>
				</div>
</body>
</html>