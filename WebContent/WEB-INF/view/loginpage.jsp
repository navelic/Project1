<!DOCTYPE html>
<html>
<head>
<title>LOGIN PAGE</title></head>
<link type="text/css"
		rel="stylesheet"
		href="${pageContext.request.contextPath}/resources/css/login.css">
<body>
<form class="regform" action=/Project1/login method="post">  
<br>
Email:<br><br><input type="text" name="email" pattern="[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]{1,50}" title="xyz@example.com" required/><br/><br/>  
Password:<br><br><input type="password" name="password" required/><br/><br/>  
<input type="submit" value="LOG IN"/>
<br><br>  
${message}
</form>
</body>
</html>