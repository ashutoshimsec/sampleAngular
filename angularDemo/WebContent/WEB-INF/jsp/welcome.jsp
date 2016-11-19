<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="myModule">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<spring:url value="/resources/js/angular.js" var="angular" />
<spring:url value="/resources/js/script.js" var="script" />
<script src="${angular}"></script>
<script src="${script}"></script>

</head>
<body>

	<div ng-controller="myController">
		${pageContext.request.contextPath} {{message}} 30+40 = {{30+40}}</div>

</body>
</html>