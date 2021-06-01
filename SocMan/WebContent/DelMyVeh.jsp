<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*,java.util.*"%>
<%
Class.forName("com.mysql.jdbc.Driver");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete My Vehicle</title>
</head>
<body>
	<%
	String pname = request.getParameter("pname");

	try {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/society", "root", "root");
		Statement st = conn.createStatement();
		int i = st.executeUpdate("delete from society.vehicle where per_name='"+pname+"'");
		out.println("Successfully Deleted !!");
	} catch (Exception e) {
		out.println("Invalid name !!");
		e.printStackTrace();
	}
	%>
</body>
</html>