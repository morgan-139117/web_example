<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.sql.*"%>
<%@ page import="mysql.PiSlow"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	<center>

		<%
			PiSlow t = new PiSlow();
			t.doSQLnPi();
		%>


		Now time is:
		<%=new java.util.Date()%>
	</center>
</body>
</html>