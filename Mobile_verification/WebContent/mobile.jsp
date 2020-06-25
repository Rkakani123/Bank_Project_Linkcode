<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="Sendsms">
Mobile Number:<br>
<input type="text" name="phone">
<br>
<br><br>
<input type="submit" name="save" value="Send OTP">&nbsp&nbsp&nbsp<input type="reset" name="reset" value="reset">

</form>
<form action="thank.jsp" method="post">
<input type="text" name="otpvalue"/>
<input type="submit" value="submit" />
</form>

</body>
</html>