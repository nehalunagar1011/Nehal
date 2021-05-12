package src;
import java.io.*;
import java.util.Vector;

public class CopyVector {

	public static void main(String[] args) {
		
		Vector<Integer> v1=new Vector<>();
		v1.add(11);
		v1.add(22);
		v1.add(33);
		v1.add(44);
		v1.add(55);
		v1.add(66);

		Vector<Integer> v2=new Vector<>(v1);
		
		System.out.println("Vector 1 : "+v1);
		System.out.println("Vector 2 : "+v1);

	}

}
