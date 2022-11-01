package CollectionsAndBasics;

class Car{  
	  void run(){System.out.println("running");}  
	}  

public class Polymorphism  extends Bike {

	 void run(){System.out.println("running safely with 60km");}  
	 
	public static void main(String[] args) {
		
	    Bike b = new Polymorphism();
	    b.run();  
		
		
	}

} 
