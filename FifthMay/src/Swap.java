import java.util.Scanner;  

public class Swap {

	public static void main(String args[]) {  
		
		int a, b;  
		Scanner sc = new Scanner(System.in);  
	
		System.out.print("Enter the first number: ");  
		a = sc.nextInt();  
	
		System.out.print("Enter the second number: ");  
		b = sc.nextInt();  
	
		System.out.println("Before swapping:");  
	
		System.out.println("a = " +a +", b = " +b);  
	
		a = a ^ b;  
		b = a ^ b;  
		a = a ^ b;  
		
		System.out.println("After swapping:");  
		System.out.print("a = " +a +", b = " +b);  
	}  
}

