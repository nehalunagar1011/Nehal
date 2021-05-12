package src;
import java.util.*;

public class ConvertALtoA {

	public static void main(String[] args) {
		
		List<String> l1 = new ArrayList<>();
		l1.add("Nehal");
		l1.add("Pranav");
		l1.add("Rahul");
		l1.add("Smit");
		
		System.out.println("Converting ArrayList to Array" ); 
		String[] name = l1.toArray(new String[l1.size()]); 
		for(String s : name){
			System.out.println(s);  
		}

		System.out.println("Converting Array to ArrayList" );  
        List<String>l2 = new ArrayList<>();  
        l2 =  Arrays.asList(name);  
        System.out.println(l2); 
	}

}
