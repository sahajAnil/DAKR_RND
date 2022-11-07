package Thread;

public class Thread1 extends Thread {

	public static void main(String[] args) {
		  
		System.out.println("Thread1 Started");
		for (int i=1;i<=20;i++) {
			System.out.println("Thread1 :"+i);
			if (i ==5);
			Stop();
			
		}
	}

	private static void Stop() {
		System.out.println("Thread1 Ended");		
	}

}
