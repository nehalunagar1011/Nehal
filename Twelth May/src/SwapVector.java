package src;
import java.util.Collections;
import java.util.Vector;

public class SwapVector {

	public static void main(String[] args) {
		 
		Vector<String> vector = new Vector<String>();
		vector.add("A");
        vector.add("B");
        
        System.out.println("Before Swapping = "+vector);
        Collections.swap(vector, 0, 1);
        System.out.println("After Swapping = "+vector);

	}

}
