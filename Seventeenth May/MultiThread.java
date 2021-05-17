package src;
public class MultiThread implements Runnable {
	
	String msg;
	
	MultiThread(String m){
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
		MultiThread tr1 = new MultiThread("Thread 1");
		MultiThread tr2 = new MultiThread("Thread 2");
		Thread t1 = new Thread(tr1);
		Thread t2 = new Thread(tr2);
		t1.start();
        t2.start();
	}

}
