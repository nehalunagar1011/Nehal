import java.io.*;
public class RenameFile {
	
	public static void main(String args[]) {
		
		File file1 = new File("file1.txt");
		File file2 = new File("file4.txt");
		
		boolean status = file1.renameTo(file2);
		
		if(status == true) {
			System.out.println("rename successfully");
		}
		else {
			System.out.println("failed");
		}
		
	}
}
