import java.sql.*;

public class ExeBatch {
	ConnectDB cd = new ConnectDB();
	public void addBatch() {
		try {
			Connection con = cd.getConnection();
			con.setAutoCommit(false);
			Statement st = con.createStatement();
			st.addBatch("insert into student(name,city) value ('rahul','surat')");
			st.addBatch("insert into student(name,city) value ('parth','rajkot')");
			st.addBatch("insert into student(name,city) value ('jay','jamnagar')");
			st.executeBatch();
			con.commit();  
			con.close(); 
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		ExeBatch eb = new ExeBatch();
		eb.addBatch();
		System.out.print("Records Added");	
	}
}
