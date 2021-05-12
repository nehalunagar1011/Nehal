package src;
import java.util.*;  
public class CompareAL {

	public static void main(String[] args) {
		
		ArrayList<String> a1=new ArrayList<String>();  
		a1.add("Nehal");
		a1.add("Pranav");
		a1.add("Rahul");
		a1.add("Smit");
		System.out.println(a1); 
		
		ArrayList<String> a2=new ArrayList<String>();  
		a2.add("Nehal");
		a2.add("Pranav");
		a2.add("Rahul");
		a2.add("Smit");
		System.out.println(a2);

		boolean b = a1.equals(a2);
		System.out.println(b); 
	}

}
