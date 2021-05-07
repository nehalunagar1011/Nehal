import java.io.*;
public class WriteFileFIS {

	public static void main(String[] args) {
		
		File file = new File("file2.txt");
		FileOutputStream fos = null;
		String str = "I currently live in surat";
		
		try {
			fos = new FileOutputStream(file);
			
			byte[] ar = str.getBytes();
			fos.write(ar);
			System.out.println("Write in file successfully");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
