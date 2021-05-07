import java.io.*;
public class AppendData {

	public static void main(String[] args) {
		
		try {
			String str="My name is nehal";
			File file = new File("file3.txt");
			
			if(!file.exists()) {
				file.createNewFile();
			}
			
			FileWriter fw = new FileWriter(file.getName(),true);
			BufferedWriter bw = new BufferedWriter(fw);
	        bw.write(str);
	        bw.close();
	        System.out.println("Append Done");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
