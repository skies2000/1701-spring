<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2><spring:message code="view.title2" arguments="12345"/></h2>
<ul>
	<li><spring:message code="view.userID"/> : ${memberVo.userid }</li>
	<li><spring:message code="view.userPwd" />: ${memberVo.userpwd }</li>
</ul>
</body>
</html>