package src;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableInterface {

	public static void main(String[] args) {
		
		System.out.print("Sorted List: ");
		List l1 = new ArrayList();
	     l1.add("Orange");
	     l1.add("Banana");
	     l1.add("Apple");
	     l1.add("Guava");
	     l1.add("Grapes");
	     Collections.sort(l1);
	     
	     System.out.println(l1);

	}

}
