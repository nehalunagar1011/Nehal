import java.sql.*;

public class DataOracle {
	try {
		DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
        Connection c = DriverManager.getConnection ("jdbc:oracle:thin:@127.0.0.0:1521:orcl","","l");
        PreparedStatement stmt = c.prepareStatement("insert into student(id,name,city) values (?,?,?)");
        
        for (int i=0 ; i < 10 ; i++) {
        	stmt.setInt(1,i);
            stmt.setString(2,generateRandomChars("01234567890ABCDEF",16));
            stmt.setString(3,generateRandomChars("01234567890ABCDEF",16));
            stmt.executeUpdate();
        }
        
        stmt.close();
        c.close();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	public static void main(String[] args) {
	}
}
