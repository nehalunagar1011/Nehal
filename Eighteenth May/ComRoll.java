import java.sql.*;

public class ComRoll {

	public static void main(String[] args) throws SQLException {
		ConnectDB cd = new ConnectDB();
		Connection con = cd.getConnection();
		con.setAutoCommit(false);
		
		try {
			Statement stmt=con.createStatement();
		    String query="INSERT INTO student(id,name,city) VALUES(1,'Mayur','Rajkot')";
		    stmt.executeUpdate(query);
		    con.commit();
		    System.out.println("Row Inserted");
		}
		catch(SQLException e) {
			con.rollback();
		    e.printStackTrace();
		    con.close();
		}
	}
}
