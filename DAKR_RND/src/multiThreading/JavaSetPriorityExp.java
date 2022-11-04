package multiThreading;

public class JavaSetPriorityExp extends Thread {
	public void run() {
		System.out.println("Priority Thread is: "+Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		JavaSetPriorityExp t1=new JavaSetPriorityExp();
		JavaSetPriorityExp t2=new JavaSetPriorityExp();
		JavaSetPriorityExp t3=new JavaSetPriorityExp();
		JavaSetPriorityExp t4=new JavaSetPriorityExp();
        // print the maximum priority of this thread  
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        t4.setPriority(7);//if the value is about 10 than it is not possible
        System.out.println("Priority of t4 is: "+t4.getPriority());
        // call the run() method  
        t1.start();
        t2.start();
        t3.start();

	}

}
