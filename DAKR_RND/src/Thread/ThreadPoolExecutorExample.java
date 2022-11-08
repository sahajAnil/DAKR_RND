//ThreadPoolExecutor
//Case 3,

package Thread;

import java.util.concurrent.ArrayBlockingQueue;  
import java.util.concurrent.Executors;  
import java.util.concurrent.ThreadFactory;  
import java.util.concurrent.ThreadPoolExecutor;  
import java.util.concurrent.TimeUnit;  

public class ThreadPoolExecutorExample {

	public static void main(String[] args)  throws InterruptedException {
		
		Threadpool rejectionHandlerObj = new Threadpool();  
	          
	       
	        ThreadFactory t1 = Executors.defaultThreadFactory();  
	        
	        ThreadPoolExecutor exePool = new ThreadPoolExecutor(2, 4, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(2), t1, rejectionHandlerObj);  
	          
	       
	        NewTask task = new NewTask(exePool, 3);  
	        Thread th = new Thread(task);  
	        th.start();  
	       
	        for(int j=0; j<10; j++){  
	            exePool.execute(new NewTask("run"+j));  
	        }  
	          
	        Thread.sleep(20000);  
	        exePool.shutdown();  
	          
	       
	        Thread.sleep(1000);  
	        task.shutdown();  
	          

	}

}


//ThreadPoolExecutor  3 case in one out put
