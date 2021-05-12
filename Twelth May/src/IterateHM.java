package src;
import java.util.HashMap;
import java.util.Map;

public class IterateHM {

	public static void main(String[] args) {
		
		Map<Integer, String> hashmap = new HashMap<Integer, String>();
		
		hashmap.put(1,"Nehal");
		hashmap.put(2,"Pranav");
		hashmap.put(3,"Rahul");
		hashmap.put(4,"Smit");
		hashmap.put(5,"Bhargav");
		
		hashmap.forEach((key,value) -> System.out.println(key + " = " + value));
	}
}
