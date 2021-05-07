import java.io.*;
public class DeleteFile {

	public static void main(String[] args) { 
		
		File file = new File("file5.txt");
		try {
			if(!file.exists()) {
				file.createNewFile();
			}
			
			if(file.delete()) {
				System.out.println("Delete file " + file.getName());
			}
			else {
				System.out.println("Failed");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
