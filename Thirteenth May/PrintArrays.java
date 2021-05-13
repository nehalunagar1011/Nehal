import java.util.*;
public class PrintArrays {

	public static <T> void show(T[] arr) {
		
		for(T t: arr){
			System.out.print(t+" ");
		}
	}
	
	public static <T> void Fatch(){
		int arr[] = null;
 		Scanner sc=new Scanner(System.in);
 		System.out.println( "Enter 10 Number");
 		
 		for(int i=0;i<=10;i++) {
 			arr[i]=sc.nextInt();
 		}
 		
 		show((T)arr);
	}
	
	public static void main(String[] args) {
	}

}
