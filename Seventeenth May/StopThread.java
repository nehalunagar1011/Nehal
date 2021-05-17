package src;

public class StopThread implements Runnable {
	
	String msg;
	
	StopThread(String m){
		msg = m;
	}
	
	@Override
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
		StopThread tr1 = new StopThread("Thread 1");
		StopThread tr2 = new StopThread("Thread 2");
		Thread t1 = new Thread(tr1);
		Thread t2 = new Thread(tr2);
		t1.start();
        t2.start();
	}
}
