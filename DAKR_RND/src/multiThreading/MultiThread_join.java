package multiThreading;

public class MultiThread_join extends Thread{
	public void run()  
    {    
        for(int i=1; i<=4; i++)  
        {    
            try  
            {    
                Thread.sleep(500);    
            }catch(Exception e){System.out.println(e);}    
            System.out.println(i);    
        } 	
    }

	public static void main(String[] args) {
		// creating three threads  
		MultiThread_join t1 = new MultiThread_join ();    
		MultiThread_join t2 = new MultiThread_join ();    
		MultiThread_join t3 = new MultiThread_join ();    
        // thread t1 starts  
        t1.start();   
        // starts second thread when first thread t1 is died.  
        try  
        {    
            t1.join();    
        }catch(Exception e){System.out.println(e);}    
        // start t2 and t3 thread   
        t2.start();   
        t3.start();    
    

	}

}
