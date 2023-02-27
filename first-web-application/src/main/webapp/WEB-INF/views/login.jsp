<%@page import="java.util.Date"%>
<html>
<head>
<title>FINAL</title>
</head>
<body>
<form action="/login" method="post">
<p><font color="red">${errorMessage}</font></p>
Name: <input type="text" name="name"/> Password: <input type="password" name="password"/> <input type="submit" value="Login"/>
</form>
</body>
</html>