<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>로그인 결과</h2>
<li>user id = ${userid}
<li>user pwd = ${userpwd}
<%out.print("세션에 등록된 아이디 : "+session.getAttribute("sessionId"));
%>

</body>
</html>