package CollectionsAndBasics;
abstract class Bike{  
	  abstract void run();  
	}  

public class Abstraction  extends Bike{

	
		void run(){System.out.println("running safely");}
		public static void main(String[] args) {
			 Bike obj = new Abstraction();  
			 obj.run();  
	}

}
