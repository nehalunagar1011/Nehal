import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Database {
	private String dburl = "jdbc:mysql://localhost:3306/society";
	private String dbname = "root";
	private String dbpass = "root";
	private String dbdriver = "com.mysql.jdbc.Driver";

	public void loadDriver(String dbDriver) {
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(dburl, dbname, dbpass);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

	public String insert(User user) {
		loadDriver(dbdriver);
		Connection con = getConnection();
		String result = "Registration Successfully";
		String sql = "insert into society.user values(?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user.getFname());
			ps.setString(2, user.getLname());
			ps.setString(3, user.getEmail());
			ps.setString(4, user.getPassword());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = "Error";
		}

		return result;

	}

	public String retrive(User user) {
		loadDriver(dbdriver);
		Connection con = getConnection();
		String result = null;
		try {
			String sql = "select * from user where email=? and password=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user.getEmail());
			ps.setString(2, user.getPassword());

			ps.executeQuery();
			if (ps.executeQuery().next()) {
				result = "Login Successfully";
			} else {
				result = "Login failed !!";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = "user not found";
		}
		return result;
	}

	public String update(User user) {
		loadDriver(dbdriver);
		Connection con = getConnection();
		String result = null;
		String sql = "update society.user set password=? where email=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user.getPassword());
			ps.setString(2, user.getEmail());
			int i = ps.executeUpdate();
			if (i > 0) {
				result = "Password Change Successfully";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = "user not found";
		}
		return result;
	}
}
