//ThreadPoolExecutor
//Case 1,

package Thread;


import java.util.concurrent.RejectedExecutionHandler;  
import java.util.concurrent.ThreadPoolExecutor;  
  

public class Threadpool  implements RejectedExecutionHandler {

	
	 public void rejectedExecution(Runnable runnableObject, ThreadPoolExecutor executorObjet) {  

		 System.out.println(runnableObject.toString() + " is rejected");  
	    } 

}
