package src;
import java.io.*;

public class Running extends Thread {
	public void run() {
		System.out.println("Overriden Run Method");
	}
}
	
public class RunningThread {
	public static void main(String[] args) {
		Running r1 = new Running();
		Running r2 = new Running();
		
		ThreadGroup tg = Thread.currentThread().getThreadGroup();
		int tc = tg.activeCount();
		tg.enumerate(threadList);
		System.out.println("Active threads are:");
		for (int i = 0; i < tc; i++)
			System.out.println(threadList[i].getName());
	}
}
