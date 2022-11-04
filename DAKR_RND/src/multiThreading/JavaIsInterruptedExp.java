package multiThreading;

public class JavaIsInterruptedExp extends Thread   
{   
    public void run()   
    {   
        for(int i=1;i<=3;i++)   
        {   
            System.out.println("doing task....: "+i);   
        }   
    }   
    public static void main(String args[])throws InterruptedException   
    {   
        JavaIsInterruptedExp t1=new JavaIsInterruptedExp();   
        JavaIsInterruptedExp t2=new JavaIsInterruptedExp();   
        // call run() method   
        t1.start();   
        t2.start();  
        System.out.println("is thread t1 interrupted..: "+t1.isInterrupted());  
        System.out.println("is thread t2 interrupted..: "+t2.interrupted());  
        // interrupt thread t1   
        t1.interrupt();   
        System.out.println("is thread t1 interrupted..: " +t1.isInterrupted());   
        System.out.println("is thread t2 interrupted..: "+t2.isInterrupted()); 
        t2.interrupt();
        System.out.println("is thread t1 interrupted..: " +t1.interrupted());   
        System.out.println("is thread t2 interrupted..: "+t2.interrupted());
        
    }  
}  