import java.io.*;
public class ReadFileBIS {
	
	public static void main(String args[]) throws IOException {

		File file = new File("file1.txt");
		BufferedInputStream bis = null;
	    FileInputStream  fis = null;
	    
	    try {
	    	fis = new FileInputStream(file);
	    	bis = new BufferedInputStream(fis);
	    	
	    	while(bis.available()>0) {
	    		System.out.println((char)bis.read());
	    	}
	    }
	    catch(Exception e) {
	    	e.printStackTrace();
	    }
	    
	    bis.close();
	    fis.close();
	    
	}
}
