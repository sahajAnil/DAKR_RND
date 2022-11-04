package multiThreading;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public class RejectedExecutionHandlerDemo implements RejectedExecutionHandler {  
	  
    //defining abstract method of RejectedExecutionHandler class  
    @Override  
    public void rejectedExecution(Runnable runnableObject, ThreadPoolExecutor executorObjet) {  
        //printing the rejected thread  
        System.out.println(runnableObject.toString() + " is rejected");  
    }  
  
}  