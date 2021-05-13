import java.lang.*;
import java.util.*;
public class LargestValue {

	public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
		T max = x; 
	    if (y.compareTo(max) > 0)
	      max = y;

	    if (z.compareTo(max) > 0)
	      max = z; 
	    return max; 
	}
	
	public static void main(String[] args) {
		
		System.out.printf("Maximum of %d, %d and %d is %d\n", 11, 22, 33, maximum(11, 22, 33));
		System.out.printf("Maximum of %s, %s and %s is %s\n", "nehal", "pranav", "rahul", maximum("nehal", "pranav", "rahul"));

	}

}
