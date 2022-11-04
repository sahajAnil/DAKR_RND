package multiThreading;
//no problem with either using extends or implements
public class MultiThread_start extends Thread/*Implements Runnable*/{
	public void run() {
		 System.out.println("thread is running...."); 
	}

	public static void main(String[] args) {
		MultiThread_start t1=new MultiThread_start();
		Thread t2=new Thread(t1);
		
		t1.start();
		t2.start();
		//t1.start(); -> this forms illegal thread exception

	}

}
