package Thread;

public class Thread2 {

	public static void main(String[] args) {

		System.out.println("Thread2 Started");
		for (int i=1;i<=5500;i++) {
			System.out.println("Thread1 :"+i);
			if (i ==55);
			field();
			
	}

}

	private static void field() {
		System.out.println("Thread2 Ended");
	}}
