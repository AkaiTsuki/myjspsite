<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to my JSP site.</h1>
	<p>This is hello world experiment send the input username to welcome page.</p>
	<s:form action="login" namespace="/helloworld">
		<s:textfield name="username" label="Username"></s:textfield>
		<s:password name="password" label="Password"></s:password>
		<s:submit></s:submit>
	</s:form>
</body>
</html>