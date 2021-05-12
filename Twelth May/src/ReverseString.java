package src;
import java.io.*;
import java.util.*;

public class ReverseString {
	
	public static void reverse(StringBuffer str) {
		int n = str.length();
        Stack obj = new Stack(n);
        
        int i;
        for (i = 0; i < n; i++)
        obj.push(str.charAt(i));
        
        for (i = 0; i < n; i++)
        {
            char ch = (char) obj.pop();
            str.setCharAt(i,ch);
        }
	}

	public static void main(String[] args) {
		
		StringBuffer s= new StringBuffer("Nehaal");
		reverse(s);
		System.out.println("Reversed string is " + s);
	}
}
