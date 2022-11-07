package Thread;

//{1}In Java, a thread's priority is an integer in the range 1 to 10.
//{2}The larger the integer, the higher the priority


public class Priority  extends Thread{
	
	public void run() {
	
	System.out.println("Navi Solo 5500 Thread");
	System.out.println("Welcome To My World");
	}
	public static void main(String[] args) {
		
		Priority S1=new Priority();
		Priority S2=new Priority();
		
		S1.setPriority(MIN_PRIORITY);
		S2.setPriority(MAX_PRIORITY);
		
		S1.start();
		S2.start();
	}

}
