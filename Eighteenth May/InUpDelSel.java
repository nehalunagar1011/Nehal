import java.sql.*;
import java.util.*;

public class InUpDelSel {

	ConnectDB cd = new ConnectDB();
	
	public void insert() {
		try {
			Connection con = cd.getConnection();
			String insert = "INSERT INTO STUDENT(Name, City) VALUES ('Nehal','Surat'),('Pranav','Jetpur'),('Jay','Una')";
			Statement st = con.createStatement();
			int i = st.executeUpdate(insert);
			if(i>0) {
				System.out.println(i+" Rows Added");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void update(int id,String name,String city) {
		try {
			Connection con = cd.getConnection();
			String update = "UPDATE STUDENT SET Name=?, City=? WHERE id=?";
			PreparedStatement pt = con.prepareStatement(update);
			pt.setString(1, name);
			pt.setString(2, city);
			pt.setInt(3, id);
			int i = pt.executeUpdate();
			if(i>0) {
				System.out.println("Record Updated Successfully");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void delete(int id1) {
		try {
			Connection con = cd.getConnection();
			String delete = "DELETE FROM STUDENT Where id=?";
			PreparedStatement ps = con.prepareStatement(delete);
			ps.setInt(1, id1);
			int i = ps.executeUpdate();
			if(i>0) {
				System.out.println("Row Deleted Successfully");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void select() {
		try {
			Connection con = cd.getConnection();
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
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("\n1 : Insert");
			System.out.println("2 : Update");
			System.out.println("3 : Delete");
			System.out.println("4 : Select");
			System.out.print("Enter Your Choice : ");
			int ch = sc.nextInt();
			InUpDelSel i = new InUpDelSel();
			
			switch(ch) {
			case 1:
				i.insert();
				break;
				
			case 2:
				i.select();
				System.out.print("Please Enter id of the record which you want to update: ");
				int id = sc.nextInt();
				System.out.print("\nPlease Enter New City: ");
				String city = sc.next();
				System.out.print("\nPlease Enter New Name: ");
				String name = sc.next();
				i.update(id, name, city);
				break;
				
			case 3:
				i.select();
				System.out.print("Please Enter id of the record which you want to delete: ");
				int id1 = sc.nextInt();
				i.delete(id1);
				break;
				
			case 4:
				i.select();
				break;
				
			default:
				System.out.print("Please Enter Valid Choice");
				break;
			}
		}
	}
}
