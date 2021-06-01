<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*,java.io.*"%>
<%
Class.forName("com.mysql.jdbc.Driver");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search</title>
</head>
<body>
	<%
	String pname = request.getParameter("pname");
	
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/society", "root", "root");
	Statement statement = connection.createStatement();
	ResultSet resultset = statement.executeQuery("select * from society.vehicle where per_name='"+pname+"'");
	%>
	<table border="1">
		<tr>
			<th>Person Name</th>
			<th>Flat No</th>
			<th>Block No</th>
			<th>Vehicle Type</th>
			<th>Registration No</th>
			<th>Color</th>
		</tr>
		<%
		while (resultset.next()) {
		%>
		<tr>
			<td><%=resultset.getString(1)%></td>
			<td><%=resultset.getString(2)%></td>
			<td><%=resultset.getString(3)%></td>
			<td><%=resultset.getString(4)%></td>
			<td><%=resultset.getString(5)%></td>
			<td><%=resultset.getString(6)%></td>
		</tr>
		<%
		PrintWriter out1 = response.getWriter();
		out1.print("<a href='/SocMan/VehicleMan.jsp'>Menu</a>");
		}
		%>
	</table>
</body>
</html>