<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.*, com.oreilly.servlet.MultipartRequest, com.oreilly.servlet.multipart.DefaultFileRenamePolicy" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>이미지 업로드</title>
</head>
<body>
<%
String imgName=request.getParameter("image");

String encType="utf-8";
int sizeLimit=10*1024*1024;

String saveFolder="./photo";
String savePath1=imgName;
ServletContext context = getServletContext();
savePath1 = context.getRealPath(saveFolder);

MultipartRequest multi=new MultipartRequest(request, savePath1, sizeLimit, "utf-8", new DefaultFileRenamePolicy());

String originalFileName = multi.getOriginalFileName("image");

String fileName = multi.getFilesystemName("image");
if(fileName == null){
%>

	<h2>파일이 업로드 되지 않았습니다.</h2><br>
	<a href = "javascript:history:back()">다시 업로드 하기</a>
<%
}else{
	File file1 = multi.getFile("image");
	out.println("<h2>파일 업로드가 정상적으로 완료되었습니다.</h2>");
	out.println("<input type='button' value='뒤로가기' onclick='history.back(-1);'>");
}
%>


</body>
</html>