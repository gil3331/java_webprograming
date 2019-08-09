<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.sql.*,javax.sql.*,java.io.*,java.net.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>새 글 입력</title>
<script>
	function blank(){
		var form = document.forms['listform']
		if(listform['stockName'].value.length < 1 || listform['stockName'].value.length > 20){
			alert("상품명에 공란을 사용할 수 없습니다.");
			return false;
		}else{
		return true;
		}
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
	<h3>재고 현황-상품등록</h3>

	<table border=1 align="center">
		<%
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.102/kopoctc?serverTimezone=UTC",
						"root", "asdf1234");
				Statement stmt = conn.createStatement();
				ResultSet rset = stmt.executeQuery("SELECT MAX(stockID) FROM stock_list;");
				rset.next();
				int stockID = rset.getInt(1) + 1;
			%>
		<form method="post" name="listform" enctype="multipart/form-data" onsubmit="return blank()">
		<td>상품번호</td>
		<td width="500px"><input type="number" name="stockID"
			maxlength="20" value="<%=stockID%>"></td>
		<tr>
			<td>상품명</td>
			<td width="500px"><input type="text" minlength=1 name="stockName" class="input"
				onkeypress="nonHangulSpecialKey()" ></td>
		<tr>
			<td>재고현황</td>
			<td width="500px"><input type="number" name="stockCnt" min=0
				max=9999></td>
		<tr>
			<td>상품등록일</td>
			<td><script>
					document.write(today);
				</script></td>
		<tr>
			<td>재고파악일</td>
			<td><script>
					document.write(today);
				</script></td>
		<tr>
			<td>상품설명</td>
			<td><input type="text" name="itemDescription" maxlength="50"></td>
		<tr>
			<td>상품사진</td>
			<td><input type="file" id="files" name="image"
				onchange="imagePreview()">

				<div style="height: 300px" id="holder"></div></td>
	</table>
	<table border=3 align="center" rules=rows bordercolor=#FFFFFF width=548px>

		<td align="right"><input type="submit" formaction="stock_list.jsp" value="취소">
		<input type="submit" formaction="stock_insert.jsp" value="쓰기"></td>
		</form>
	</table>
</body>
</html>