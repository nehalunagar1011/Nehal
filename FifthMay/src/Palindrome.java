import java.util.Scanner;

public class Palindrome {

	public static void main(String args[]) {
		
		int rem , temp , sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number:");
		int num=sc.nextInt();
		
		temp=num;    
		while(num>0){    
		   rem=num % 10;
		   sum=(sum * 10) + rem;    
		   num=num / 10;    
		}    
		if(temp==sum)    
			System.out.println("palindrome");    
		else    
			System.out.println("not palindrome");    
	}
}
