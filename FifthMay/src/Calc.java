import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		
		char Op;
	    int res;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number1:");
		int n1=sc.nextInt();
		
		System.out.println("Enter number2:");
		int n2=sc.nextInt();
		
		System.out.println("Choose an operator: +, -, *, or /");
	    Op = sc.next().charAt(0);
	    
	    switch (Op) {

	      case '+':
	        res = n1 + n2;
	        System.out.println(n1 + " + " + n2 + " = " + res);
	        break;

	      case '-':
	        res = n1 - n2;
	        System.out.println(n1 + " - " + n2 + " = " + res);
	        break;

	      case '*':
	        res = n1 * n2;
	        System.out.println(n1 + " * " + n2 + " = " + res);
	        break;
	        
	      case '/':
	        res = n1 / n2;
	        System.out.println(n1 + " / " + n2 + " = " + res);
	        break;

	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }

	    sc.close();
	  }
}
