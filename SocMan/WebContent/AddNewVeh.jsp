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
<title>Add New Vehicle</title>
</head>
<body>
	<%
	String pname = request.getParameter("pname");
	String email = request.getParameter("email");
	String flatno = request.getParameter("flatno");
	String block = request.getParameter("block");
	String type = request.getParameter("type");
	String regno = request.getParameter("regno");
	String color = request.getParameter("color");

	try {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/society", "root", "root");
		Statement st = conn.createStatement();
		int i = st.executeUpdate("insert into society.vehicle values('" + pname + "','" + email + "','" + flatno + "','" + block + "','"
		+ type + "','" + regno + "','" + color + "')");
		response.sendRedirect(request.getContextPath() + "/VehicleMan.jsp");
		
	} catch (Exception e) {
		out.println("Data is not inserted , please check the details !!");
		e.printStackTrace();
	}
	%>
</body>
</html>