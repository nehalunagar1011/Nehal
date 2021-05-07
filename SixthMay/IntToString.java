import java.util.Scanner;

public class IntToString {

	public static void main(String args[]) {
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number:");
		int num=sc.nextInt();
		String str = String.valueOf(num);
		System.out.println("String is: "+str);
	}
}
