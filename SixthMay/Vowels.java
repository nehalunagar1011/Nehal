package src;

import java.util.Scanner;

public class Vowels {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.nextLine();
	    int vowels = 0, consonants = 0;
	    
	    str=str.toLowerCase();
	    for (int i = 0; i < str.length(); ++i) {
	    	char ch = str.charAt(i);
	    	
	    	if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	            ++vowels;
	        }
	    	
	    	else if ((ch >= 'a' && ch <= 'z')) {
	            ++consonants;
	        }
	    }
	    
	    System.out.println("Vowels: " + vowels);
	    System.out.println("Consonants: " + consonants);	    
	}
}
