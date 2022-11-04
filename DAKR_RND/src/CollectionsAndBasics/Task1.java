package CollectionsAndBasics;

public class Task1 implements Runnable {  

			      
		    // tnv   
		    private String threadNo;  
		      
		    // to set value to the threadNo variable  
		    public Task1(String no){  
		        this.threadNo = no;  
		    }  
		      
		    //or
		    @Override  
		    public void run() {  
		        
		        System.out.println(Thread.currentThread().getName()+" start execution. Thread No = "+threadNo);  
		        
		        processThread();  
		          
		       //e of t
		        System.out.println(Thread.currentThread().getName()+" stop execution.");  
		    }  
		      
		    
		    private void processThread() {  
		        try {  
		            Thread.sleep(4000);  
		        } catch (InterruptedException e) {  
		            e.printStackTrace();  
		        }  
		    }  
		      
		    //or the string m
		    @Override  
		    public String toString(){  
		        return this.threadNo;  
		    }  
		}  

	
