import java.util.Arrays;

public class CopyArray {
	
	public static void main(String args[]) {
		
		int[] value1 = {10, 20, 30};
		
		int[] value2 = Arrays.copyOf(value1, value1.length);
		
		System.out.println("original array: " + Arrays.toString(value1));
		
		System.out.println("copy of array: " + Arrays.toString(value2));
	}	
}
