import java.io.File;
public class CreateFile {

	public static void main(String[] args) {
		
		File file = new File("file1.txt");
		
		try {
			if(file.createNewFile()) {
				System.out.println("File is created");
			}
			else {
				System.out.println("File is already existed");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
