<%@taglib uri="http://www.springframework.org/tags" prefix="spr" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<link rel="styleSheet" href="<spr:theme code='styleSheet'/>" type="text/css"/>

<p> <a href="/Admission/Admission.html?siteTheme=green">Green </a>

<p> <a href="/Admission/Admission.html?siteTheme=red">Red </a>

 <p> <a href="/Admission/Admission.html?siteLanguage=en">english </a>
<p> <a href="/Admission/Admission.html?siteLanguage=fr">french </a> 
 
 <h3>${head}</h3>
 
 
<form action="/Admission/Admin.html" method="post">
<spr:message code="label.sn"/> 
<input type="text" name="name"><br>
<spr:message code="label.sa"/> 

<input type="text" name="age"><br>
<spr:message code="label.s" var="s"/>

<input type="submit" value="${s}">
</form>

</body>
</html>