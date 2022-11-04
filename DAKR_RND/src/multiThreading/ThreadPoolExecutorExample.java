package multiThreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorExample {  
    
    //main method start  
    public static void main(String args[]) throws InterruptedException{  
          
        //creating an instance of the RejectedExecutionHandlerExample class  
        RejectedExecutionHandlerDemo rejectionHandlerObj = new RejectedExecutionHandlerDemo();  
          
        //creating an instance of the ThreadFactory class  
        ThreadFactory t1 = Executors.defaultThreadFactory();  
          
        //creating an instance of the ThreadPoolExecutor class  
        ThreadPoolExecutor exePool = new ThreadPoolExecutor(2, 4, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(2), t1, rejectionHandlerObj);  
          
        //starting the NewTask thread  
        NewTask task = new NewTask(exePool, 3);  
        Thread th = new Thread(task);  
        th.start();  
        //submit job to the pool  
        for(int j=0; j<10; j++){  
            exePool.execute(new Task1("cmd"+j));  
        }  
          
        Thread.sleep(30000);  
        //shutting down the job pool  
        exePool.shutdown();  
          
        //shutting down the th thread  
        Thread.sleep(5000);  
        task.shutdown();  
          
    }  
}  