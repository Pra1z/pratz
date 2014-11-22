<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>

<title>Login</title>
</head>
<body>


	<form class="login-form" action="j_spring_security_check" method="post">
		<fieldset>
			<legend>Login Here</legend>
		
			<c:if test="${not empty param.error}">
				<div class="error">Invalid username or password</div>
			</c:if>
			<c:if test="${not empty param.logout}">
				<div class="msg">Logout successful!!</div>
			</c:if>

			<p>
				<label for="j_username">Username</label>: <input id="j_username"
					name="j_username" size="20" maxlength="50" type="text" />
			</p>
			<p>
				<label for="j_password">Password</label>: <input id="j_password"
					name="j_password" size="20" maxlength="50" type="password" />
			</p>

			<p>
				<input type="submit" value="Login" />
			</p>
		</fieldset>
		<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
	</form>
	<p class="message">${message}</p>
</body>
</html>
