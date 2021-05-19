import java.sql.*;

public class SQLSel {
	ConnectDB db = new ConnectDB();
	public void select() {
		try {
			Connection con = db.getConnection();
			String select = "SELECT * FROM STUDENT";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(select);
			while(rs.next()) {
				System.out.println("id: "+rs.getInt("id")+" Name: "+rs.getString("Name")+" And City: "+rs.getString("City"));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		SQLSel sq = new SQLSel();
		sq.select();
	}
}
