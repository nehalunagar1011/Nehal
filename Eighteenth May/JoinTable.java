import java.sql.*;

public class JoinTable {
	ConnectDB cd = new ConnectDB();
	public void innerJoin() {
		try {
			Connection con = cd.getConnection();
            String select = "SELECT student.b_id, student.name, branch.branch_name from student inner join branch on student.b_id=branch.b_id";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(select);
            while(rs.next()) {
            	
            }
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		JoinTable jt = new JoinTable();
		jt.innerJoin();
	}
}
