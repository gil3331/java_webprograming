<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.sql.*,javax.sql.*,java.io.*,java.net.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>재고 현황-상품 상세내역</title>
<script>
	function blank(){
		var form = document.forms['form']
		if(form['stockName'].value.length < 1 || form['stockName'].value.length > 20){
			alert("상품명을 정확히 기입해 주세요.");
			return false;
		}
		return true;
	}
	function check_key() {
		var char_ASCII = event.keyCode;
		//숫자
		if (char_ASCII >= 48 && char_ASCII <= 57)
			return 1;
		//영어
		else if ((char_ASCII >= 65 && char_ASCII <= 90)
				|| (char_ASCII >= 97 && char_ASCII <= 122))
			return 2;
		//특수기호 및 공백
		else if ((char_ASCII >= 32 && char_ASCII <= 48)
				|| (char_ASCII >= 58 && char_ASCII <= 64)
				|| (char_ASCII >= 91 && char_ASCII <= 96)
				|| (char_ASCII >= 123 && char_ASCII <= 127))
			return 4;
		//한글
		else if ((char_ASCII >= 12592) || (char_ASCII <= 12687))
			return 3;

		else
			return 0;
	}

	function nonHangulSpecialKey() {
		if (check_key() != 3) {
			event.returnValue = false;
			alert("한글만 입력하세요!");
			return;
		}
	}

	var d = new Date();
	var year = d.getFullYear();
	var month = (d.getMonth() + 1);
	var date = d.getDate();
	var today = year + "-" + month + "-" + date;

	function keyup() {
		if (document.getElementById("textarea").value.length >= 1000) {
			alert("내용이 너무 많습니다.");
			return false;
		}
		return ture;
	}
	function imagePreview() {
		var upload = document.getElementById('files'), holder = document
				.getElementById('holder');

		var file = upload.files[0], reader = new FileReader();
		reader.onload = function(event) {
			var img = new Image();
			img.src = event.target.result;

			if (img.width > 560) { // holder width
				img.width = 560;
			}
			holder.innerHTML = '';
			holder.appendChild(img);
		};
		reader.readAsDataURL(file);

	}
</script>
</head>
<body>
	<h3>재고현황-상품 상세내용</h3>
	<form method="post" name="form">
		<table border=1 align="center">
			<%	
			
				int stockID=Integer.parseInt(request.getParameter("stockID"));
							
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.102/kopoctc?serverTimezone=UTC",
						"root", "asdf1234");
				Statement stmt = conn.createStatement();
				ResultSet rset = stmt.executeQuery("SELECT * FROM stock_list where stockID="+stockID+";");
				rset.next();
				
			%>
			<td>상품번호</td>
			<td width="500px" name="stockID"><input type="text" name="stockID" style='border:0' value="<%=rset.getInt(1)%>"></td>
			<tr>
				<td>상품명</td>
				<td width="500px"><%=rset.getString(2)%></td>
			<tr>
				<td>재고현황</td>
				<td width="500px"><input type="number" name="stockCnt" min="0" max="9999" value="<%=rset.getInt(3)%>"></td>
			<tr>
				<td>상품등록일</td>
				<td><%=rset.getDate(5)%></td>
			<tr>
				<td>재고파악일</td>
				<td><%=rset.getDate(4)%></td>
			<tr>
				<td>상품설명</td>
				<td><%=rset.getString(6)%></td>
			<tr>
				<td>상품사진</td>
				<td><img src="photo/<%=rset.getString(7)%>"></td>
		</table>
		<table border=3 align="center" rules=rows bordercolor=#FFFFFF
			width=548px>

			<td align="right"><input type="submit" value="상품삭제" formaction="stock_delete.jsp">
			<input type="submit" value="재고 수정" formaction="stock_update.jsp"></td>
			</form>
			<%
			rset.close();
			stmt.close();
			conn.close();
			%>
		</table>
</body>
</html>