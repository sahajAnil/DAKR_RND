package multiThreading;

public class JavaSetDaemonExp1 extends Thread  
{    
    public void run()  
    {    
        //checking for daemon thread    
        if(Thread.currentThread().isDaemon())  
        {  
            System.out.println("daemon thread work");    
        }    
        else  
        {    
            System.out.println("user thread work");    
        }    
    }    
    public static void main(String[] args)  
    {    
        // creating three threads  
        JavaSetDaemonExp1 t1=new JavaSetDaemonExp1();   
        JavaSetDaemonExp1 t2=new JavaSetDaemonExp1();    
        JavaSetDaemonExp1 t3=new JavaSetDaemonExp1();    
        // set user thread t1 to daemon thread    
        t1.setDaemon(true);  
        //call run() method  
        t1.start();   
        // set user thread t2 to daemon thread    
        t2.setDaemon(true);  
        // start of threads   
        t2.start();    
        t3.start();    
    }    
}    

