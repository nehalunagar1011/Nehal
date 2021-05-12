package src;
import java.util.*;

public class BinarySearch {

	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<>();
		v.add(24);
        v.add(29);
        v.add(87);
        v.add(13);
        v.add(55);
        
        Collections.sort(v);
        
        int index = Collections.binarySearch(v, 87);
        
        System.out.println("Element is found at index : " + index);

	}

}
