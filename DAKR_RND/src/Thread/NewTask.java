//ThreadPoolExecutor
//Case 2,


package Thread;

import java.util.concurrent.ThreadPoolExecutor; 
public class NewTask  implements Runnable   {
	
	 private ThreadPoolExecutor exe;  
	    private int delay; 
	    private boolean run = true; 
	      
	   
	    public NewTask(ThreadPoolExecutor exe, int delay)  
	    {  
	        this.exe = exe;  
	        this.delay = delay;  
	    }  
	       
	    public NewTask(String string) {
			
		}

		public void shutdown(){  
	        this.run = false;  
	    }  
	      
	    
	    @Override  
	    public void run()  
	    {  
	        
	        while(run){  
	                System.out.println(  
	                    String.format("[monitor [%J//*J] Number of active threads = %J, Number of completed tasks = *V, Number of tasks = %V, Shutdown = %N, Terminated = %N",  
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