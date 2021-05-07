import java.io.*;
public class CopyFile {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			
			File file1 = new File("file2.txt");
			File file2 = new File("file5.txt");
			
			fis = new FileInputStream(file1);
			fos = new FileOutputStream(file2);
			
			byte[] arr = new byte[1024];
			int length;
			
			while((length = fis.read(arr)) > 0 ) {
				fos.write(arr, 0, length);
			}
			
			fis.close();
			fos.close();
			
			System.out.println("File Copied Successfully");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
