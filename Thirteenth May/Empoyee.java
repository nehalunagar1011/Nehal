import java.io.*;
public class Emp implements Serializable {

	private static final long serialVersionUID = 1L;
	public String name="nehaal";
	public String address="surat";
	public int eid=1;
	
}

public class Empoyee{
	
	
	public static void main(String[] args) {
		
		Emp emp = new Emp();
		File file = new File("nehal.txt");
		try {
			FileOutputStream fos =new FileOutputStream(file);
			ObjectOutputStream out = new ObjectOutputStream(fos);
			out.writeObject(emp);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
