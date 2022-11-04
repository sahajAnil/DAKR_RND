package multiThreading;

import java.util.concurrent.ThreadPoolExecutor;

public class NewTask implements Runnable  
{  
    private ThreadPoolExecutor exe;//creating a private variable of type ThreadPoolExecutor  
    private int delay; //creating a private variable of type integer for delay  
    private boolean run = true; //creating a private boolean variable to determine whether   
      
    //using constructor to set the value to the exe and delay variable  
    public NewTask(ThreadPoolExecutor exe, int delay)  
    {  
        this.exe = exe;  
        this.delay = delay;  
    }  
      
    //creating shutdown() method to update the value of the boolean variable run   
    public void shutdown(){  
        this.run = false;  
    }  
      
    //overriding the run() method of the Runnable interface  
    @Override  
    public void run()  
    {  
        //running task  
        while(run){  
                System.out.println(  
                    String.format("[monitor [%d/%d] Number of active threads = %d, Number of completed tasks = %d, Number of tasks = %d, Shutdown = %s, Terminated = %s",  
                        this.exe.getPoolSize(),  
                        this.exe.getCorePoolSize(),  
                        this.exe.getActiveCount(),  
                        this.exe.getCompletedTaskCount(),  
                        this.exe.getTaskCount(),  
                        this.exe.isShutdown(),  
                        this.exe.isTerminated()));  
                try {  
                    Thread.sleep(this.delay*1000);  
                } catch (InterruptedException e) {  
                    e.printStackTrace();  
                }  
        }  
              
    }  
}  