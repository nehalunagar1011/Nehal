package src;
import java.util.*;

public class TempleD {

		public static void main(String[] args) {
			float total_amount=0,amt=2;
			
			Scanner in=new Scanner(System.in);
			System.out.println("Enter the number of visited temples: ");
			int no_of_temple = in.nextInt();
			System.out.println("Enter donation amount: ");
			int da=in.nextInt();
			in.close();
			
			for(int i=1;i<=no_of_temple;i++)
			{
				total_amount=(2*total_amount)+da;
				amt=amt*2;
				
			}
			
			float final_initial_amount= total_amount /(amt/2); 	
			System.out.println("The initial amount is "+final_initial_amount);

		}

	}
}
