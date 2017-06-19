<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원가입 폼</title>
<script>
function init(){
	var btn = document.getElementById('btnlist');
	btn.onclick = function(){
		location.href = 'list.jsp';
	}
}

</script>


</head>
<body>

<h2>회원 가입 폼</h2>
<!-- input.do는 spring-mvc가 처리해달라..   -->
 <!-- input.jsp의 name값은(userid,userpwd) MemberVo의 변수명과 같아야 함. -->
<form name='frm' method='post' action='input.do'>
<label>회원 아이디</label>
<input type='text' name='userid'><br/>
<label>회원 암호</label>
<input type='password' name='userpwd'><p/>

<input type='submit' value='회원가입'/>&nbsp;&nbsp;&nbsp;<input type='button' value='취소' id='btnlist'>
</form>
<script>init()</script>
</body>
</html>