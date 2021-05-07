import java.io.*;
import java.util.zip.*;

public class ZipFile {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("file.zip");
		ZipOutputStream zos = new ZipOutputStream(fos);
		
		File file = new File("file4.txt");
		FileInputStream fis = new FileInputStream(file);
		
		ZipEntry ze = new ZipEntry(file.getName());
		zos.putNextEntry(ze);
		
		byte[] bytes = new byte[1024];
		int length;
		
		while ((length = fis.read(bytes)) >= 0) {
			   zos.write(bytes, 0, length);
		}
		zos.close();
		fis.close();
		fos.close();
		System.out.println("Zip file successfully");

	}

}
