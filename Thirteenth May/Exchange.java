import java.util.*;
public class Exchange<T> {
	
	public static <T> void swap(T[] arr, int a, int b) {
        T temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    } 

	public static void main(String[] args) {
		
		String[] a={"1","2","3"};
		System.out.println("before: "+Arrays.toString(a));
		swap(a,0,2);
		System.out.println("after: "+Arrays.toString(a));
	}
}
