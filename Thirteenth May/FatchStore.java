
public class FatchStore<T> {
	
	private T t;

	public void store(T t) {
	      this.t = t;
	}
	
	public T fatch() {
	      return t;
	}

	public static void main(String[] args) {
		
		FatchStore<Integer> f1 = new FatchStore<Integer>();
		FatchStore<String> f2 = new FatchStore<String>();
		
		f1.store(new Integer(11));
		f2.store(new String("Nehaal"));
		
		System.out.println("Integer :"+f1.fatch());
	    System.out.println("String :" +f2.fatch());
		

	}

}
