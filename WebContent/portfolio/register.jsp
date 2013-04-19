<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Portfolio Register</title>
</head>
<body>
	<div class="doc">
		<h3>Purpose</h3>
		<p>This page using several features of struts 2. First the back end action using
		model dirven design. It encapsulate the data in javabean and implement the
		ModelDriven interface to expose the method to get the javabean. The bean
		must be initialized before getModel method being called. And in the view the
		 name attribute in the input has the same value of corresponding Javabean field.</p>
		<p>Secondly, the action using validate method to validate the input data. And a
		properties file which has the same name as the action class save the error message.
		The action which extends ActionSupport class can use getText method to retrieval 
		the error message from properties file.</p>
	</div>
	<s:form action="register" namespace="/portfolio">
		<s:textfield name="username" label="Username"></s:textfield>
		<s:password name="password" label="Password"></s:password>
		<s:textfield name="portfolioName" label="Portfolio Name"></s:textfield>
		<s:submit value="register"></s:submit>
	</s:form>
</body>
</html>