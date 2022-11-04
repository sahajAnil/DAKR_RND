package multiThreading;

public class MultiThread_AliveId extends Thread {
	public void run() {
		  try   
	        {  
	            Thread.sleep(300);  
	            System.out.println("is run() method isAlive "+Thread.currentThread().isAlive());  
	        }  
	        catch (InterruptedException ie) {  
	        }  
	}

	public static void main(String[] args) {
		 MultiThread_AliveId t1 = new MultiThread_AliveId();
		 System.out.println("Name of t1: "+t1.getName());  
	     System.out.println("Id of t1: "+t1.getId());
		 System.out.println("before starting thread isAlive: "+t1.isAlive());  
	     t1.start();  
	     System.out.println("after starting thread isAlive: "+t1.isAlive());  

	}

}
