import java.io.*;
public class ReadOnly {

	public static void main(String[] args) {
			
		File file = new File("file2.txt");
		
		boolean set = file.setReadOnly();
		
		if(set == true) {
			System.out.println("Read File only");
		}
		else {
			System.out.println("Failed");
		}
	}

}
