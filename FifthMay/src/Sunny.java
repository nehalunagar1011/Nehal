import java.io.*;
import java.util.*;

public class Sunny {
	
	public static void main(String args[])
    {
		int i , a , c=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number:");
		int n=sc.nextInt();
		
		for(i=1;i<=n;i++)
        {
            a= (i*i)-1; 
            if(a==n)
            {
                c=1; 
            }
        }
        if(c==1)
        {
            System.out.println("Sunny Number");
        }
        else
        {
            System.out.println("Not Sunny Number");
        }
    }
}
