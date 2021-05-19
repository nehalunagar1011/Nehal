import java.sql.*;

public class ConnectDB {
	
	public Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema","root","root");
			System.out.println("Connection success");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public static void main(String[] args) {
		ConnectDB cb = new ConnectDB();
		cb.getConnection();
	}
}