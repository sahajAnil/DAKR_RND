package multiThreading;

class Singleton1{
	private static Singleton1 single_instance=null;
	public String s;
	private Singleton1() {
		s="This is an string of the singleton class";
	}
	public static Singleton1 getInstance() {
		if(single_instance==null) {
			single_instance=new Singleton1();
		}
		return single_instance;
	}
}

public class Singleton_Exmp1 {

	public static void main(String[] args) {
		Singleton1 x = Singleton1.getInstance();
		Singleton1 y = Singleton1.getInstance();
		Singleton1 z = Singleton1.getInstance();
		/*System.out.println("Hash code of x is: "+x.hashCode());
		System.out.println("Hash code of y is: "+y.hashCode());
		System.out.println("Hash code of z is: "+z.hashCode());
		if(x==y && y==z) {
			System.out.println("the object posess same memory in the heap");
		}
		else {
			System.out.println("the object does not posess same memory in the heap");
		}*/
		x.s = (x.s).toUpperCase();
		  
        // Print and display commands
        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
        System.out.println("\n");
  
        // Now again changing variable of instance x
        z.s = (z.s).toLowerCase();
  
        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
    

	}

}
