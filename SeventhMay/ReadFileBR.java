import java.io.*;
public class ReadFileBR {

	public static void main(String[] args) {
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("file1.txt"));
			
			int num=0;
			char ch;
			while((num=br.read()) != -1){	
		               ch=(char)num;
			       System.out.print(ch);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
