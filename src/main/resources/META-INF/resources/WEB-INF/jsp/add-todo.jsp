<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
<title>Welcome</title>

</head>
<body>
		<h1>Add-todo test</h1>
		
		
		<form:form method="post" modelAttribute="todo">
		<form:input type="text" path="description"/>
		<input type="text" path="startDate">
		<input type="text" path="EndDate">
		
		<input type="hidden" path="id">
		<input type="hidden" path="status">
		<input type="submit" value="Add" />
		</form:form>
</body>
</html>