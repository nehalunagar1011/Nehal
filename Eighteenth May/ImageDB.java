import java.sql.*;
import java.io.*;

public class ImageDB {
	ConnectDB cd = new ConnectDB();
	
	public void insertImg() {
		try {
			Connection con = cd.getConnection();
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO img VALUES(?,?)");
		    pstmt.setString(1, "Nature");
		    InputStream in = new FileInputStream("D:\\nature.jpg");
		    pstmt.setBlob(2, in);
		    pstmt.execute();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void readImg() {
		try {
			Connection con = cd.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from images");  
			ResultSet rs=ps.executeQuery();  
			if(rs.next()) {
				Blob b=rs.getBlob(2);  
				byte barr[]=b.getBytes(1,(int)b.length());        
				FileOutputStream fout=new FileOutputStream("D:\\");  
				fout.write(barr);    
				fout.close();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		ImageDB id = new ImageDB();
		id.insertImg();
		id.readImg();
	}
}
