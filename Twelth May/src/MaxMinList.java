package src;
import java.util.*;

public class MaxMinList {

	public static void main(String[] args) {
		
		List list = Arrays.asList("11 23 45 67 43 29".split(" "));
		System.out.println(list);
		
		System.out.println("max: " + Collections.max(list));
	    System.out.println("min: " + Collections.min(list));
	}

}
