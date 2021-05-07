import java.io.*;
public class WriteFileBW {

	public static void main(String[] args) {
		
		File file = new File("file3.txt");
		BufferedWriter bw = null;
		String str = "I currently live in surat";
		
		try {
			
			if (!file.exists()) {
			     file.createNewFile();
			  }
			
			FileWriter fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write(str);
			System.out.println("File write successfully");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
