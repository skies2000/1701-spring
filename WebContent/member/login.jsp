<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>로그인</h2>
<form name='frm' method='post' action='loginR.do'>
<label>회원 아이디</label>
<input type='text' name='userid'>
<span class='error'>${userid}</span><!--userid는 필드명이 아니라 에러 코드에 키값에 해당한다.  --><br/>

<label>회원 암호</label>
<input type='password' name='userpwd'>
<span class='error'>${userpwd}</span><!--usepwd는 필드명이 아니라 에러 코드에 키값에 해당한다.  --><p/>
<input type='submit' value='로그인'/>&nbsp;&nbsp;&nbsp;<input type='button' value='취소' id='btnlist'>
</form>
</body>
</html>