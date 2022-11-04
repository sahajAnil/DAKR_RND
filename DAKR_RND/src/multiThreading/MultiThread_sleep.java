package multiThreading;

public class MultiThread_sleep extends Thread {
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(500);//negative values in sleep are not processed
			}catch(Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		MultiThread_sleep t1= new MultiThread_sleep();
		Thread t2= new Thread(t1);
		t1.start();
		t2.start();

	}

}
