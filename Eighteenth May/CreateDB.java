import java.sql.*;

public class CreateDB {
	
	public static void main(String[] args) {		
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema","root","root");
			Statement st = con.createStatement();
			String sql = "CREATE TABLE STUDENT(id INTEGER NOT NULL, Name Varchar(20) NOT NULL, City Varchar(20) NOT NULL, PRIMARY KEY ( id ))";
			st.executeUpdate(sql);
			System.out.println("Table Created");
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
