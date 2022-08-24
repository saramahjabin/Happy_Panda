<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ page isELIgnored="false" %>

<html>

<head>
	<title>Home Page</title>
</head>

<body>
	<h2>Home Page</h2>
	<hr>
	
	<p>
	Welcome to the home page!
	</p>
	
	<hr>
	
	<!-- display user name and role -->
	
	<p>
		User: <security:authentication property="principal.username" />
		<br><br>
		Role(s): <security:authentication property="principal.authorities" />
	</p>
	<a href="Cart" class="btn">Your Cart</a><br><br>
<form method="post" action="FoodList" >
	<input
			type="text" name="foodName" id="foodName" placeholder="Search food" />
	<input type="submit" value="search" />
</form>
	<hr>
	
	
	<!-- Add a logout button -->
	<form:form action="${pageContext.request.contextPath}/logout" 
			   method="POST">

		<input type="submit" value="Logout" />
	
	</form:form>
	
</body>

</html>









