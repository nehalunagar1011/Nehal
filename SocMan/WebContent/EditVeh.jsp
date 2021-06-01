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
<title>Edit Vehicle</title>
</head>
<body>
	<%
	String pname = request.getParameter("pname");
	String type = request.getParameter("type");
	String color = request.getParameter("color");
	String regno = request.getParameter("regno");

	try {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/society", "root", "root");
		Statement st = conn.createStatement();
		int i = st.executeUpdate("update society.vehicle set type='"+type+"' , color='"+color+"' , registration_no='"+regno+"' where per_name='"+pname+"'");
		out.println("Data is successfully updated !!");
	} catch (Exception e) {
		out.println("Data is not updated , please check the person name !!");
		e.printStackTrace();
	}
	%>
</body>
</html>