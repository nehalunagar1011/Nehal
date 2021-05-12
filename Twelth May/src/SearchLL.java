package src;
import java.util.*;
public class SearchLL {

	public static void main(String[] args) {
		
		LinkedList <Integer> l1 = new LinkedList <Integer> ();
		l1.add(11);
		l1.add(22);
		l1.add(33);
		l1.add(44);
		l1.add(55);
		l1.add(66);
		
		int found=0;
		boolean flag = false;
		int search = 44;
		
		for(int i=0;i<l1.size();i++)
		{
			if(l1.get(i)==search)
			{
				found += l1.indexOf(search);
				flag=true;
			}
			
		}
		if(flag==true)
		{
			System.out.print("Saerch Node At Index: "+found);
		}
		else {
			System.out.print("Search Not Found");
		}

	}

}
