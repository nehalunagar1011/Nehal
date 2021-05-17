package src;

public class ThreadPrio extends Thread {
	
	public void run(){
		 System.out.println("Thread Name : "+Thread.currentThread().getName());  
		 System.out.println("Thread Priority : "+Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		ThreadPrio tp1 = new ThreadPrio();
		ThreadPrio tp2 = new ThreadPrio();
		tp1.setPriority(Thread.MIN_PRIORITY); 
		tp2.setPriority(Thread.MAX_PRIORITY);
		tp1.start();
		tp2.start();
	}

}
