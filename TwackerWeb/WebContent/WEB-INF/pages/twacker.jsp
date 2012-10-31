<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Twacker Home</title>
</head>
<body>
<p>Enter a search term.</p>
	<c:url var="url" value="/twacker.do"/>
    <form:form action="${url}" commandName="twackerBean" method="post">
        <form:input path="query" />
        <input name="submit" type="submit" value="Search"/>
    </form:form>
    To learn more, take a look at our <a href="http://ugrad.cs.jhu.edu/~group4/"> project page </a>.
</body>
</html>