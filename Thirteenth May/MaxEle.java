import java.util.*;
public class MaxEle {

	public static <T extends Comparable<T>> T maximalelement (List<T> list, int from, int to) {
        T max = list.get(from);
        for (int i = from + 1; i < to; i++) {
            T el = list.get(i);
            if (el.compareTo(max) > 0) {
                max = el;
            }
        }
        return max;
    }
	
	public static void main(String[] args) {
		
		ArrayList <Integer> al = new ArrayList <Integer> ();
		al.add(11);
		al.add(22);
		al.add(33);
		al.add(44);
		al.add(55);
		System.out.print("Maximum :"+maximalelement(al,0,5));

	}

}
