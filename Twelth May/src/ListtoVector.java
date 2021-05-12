package src;
import java.util.*;
public class ListtoVector {

	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String>();
		v.add("11");
		v.add("22");
		v.add("33");
		v.add("44");
		v.add("55");
		v.add("66");
		v.add("77");
		v.add("88");
		System.out.println("Vector : " + v);
		
		List<String>l1 = new ArrayList<String>(v);
		System.out.println("List : " + l1);

	}

}
