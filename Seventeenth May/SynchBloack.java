package src;
import java.io.*;

class Multithread {
    private int i = 0;
    public void increment() {
        i++;
    }
  
    public int getValue() {
        return i;
    }
}

public class SynchBloack {

	public static void main(String[] args) {
		Multithread t = new Multithread();
        t.increment();
        System.out.println(t.getValue());
	}
}
