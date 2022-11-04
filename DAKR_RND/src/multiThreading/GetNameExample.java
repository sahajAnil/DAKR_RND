package multiThreading;

public class GetNameExample extends Thread{
	public void run() {
		System.out.println("Thread is running...");
	}

	public static void main(String[] args) {
		 // creating two threads   
        GetNameExample t1=new GetNameExample();    
        GetNameExample t2=new GetNameExample();    
        // return the name of threads  
        System.out.println("Name of t1: "+ t1.getName());    
        System.out.println("Name of t2: "+t2.getName());    
        // start t1  and t2 threads   
        t1.start();    
        t2.start(); 
        // change the thread name   
        t1.setName("Sonoo Jaiswal");    
        t2.setName("javatpoint");  
        // print the thread after changing   
        System.out.println("After changing name of t1: "+t1.getName());  
        System.out.println("After changing name of t2: "+t2.getName());

	}

}
