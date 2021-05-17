package src;
public class ThreadRI implements Runnable {

	String msg;
	
	ThreadRI(String m){
		msg = m;
	}
	
	public void run() {
		for(int count=0;count<=5;count++) {
			try {
				System.out.println("Run method: " + msg);
                Thread.sleep(25);
			}
			catch(InterruptedException ie) {
				System.out.println("Exception in thread: "+ie.getMessage());
			}
		}
	}
	
	public static void main(String[] args) {
		ThreadRI tr = new ThreadRI("Thread 1");
		Thread t = new Thread(tr);
		t.start();
	}	
}
