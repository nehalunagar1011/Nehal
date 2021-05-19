import java.sql.Connection;
import java.sql.*;

public class DelRec {
	ConnectDB cd = new ConnectDB();
	public void deleteRecord() {
		try {
			Connection con = cd.getConnection();
			String delete = "DELETE FROM STUDENT";
			Statement st = con.createStatement();
			int i = st.executeUpdate(delete);
			if(i>0) {
				System.out.println("Rows Deleted Successfully");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
	}
}
