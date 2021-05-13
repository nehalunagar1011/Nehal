import java.io.*;

class Emp implements Serializable {
	 
	private static final long serialVersionUID = 1L;
	public String name;
	   public String address;
	   public int eid;
}

public class EmpDS {

	public static void main(String[] args) {
		
		try {
			ObjectInputStream in=new ObjectInputStream(new FileInputStream("nehal.txt"));  
			Emp  e=(Emp)in.readObject();  
			System.out.println(e.eid+" "+e.name+" "+e.address);    
			in.close();  
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
