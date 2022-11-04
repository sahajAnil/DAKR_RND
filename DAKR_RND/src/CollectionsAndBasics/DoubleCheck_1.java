package CollectionsAndBasics;

class Singleton{
	private volatile static Singleton instance;
	private Singleton() {}
	public static Singleton getInstance1() {
		if(instance==null) {
			instance=new Singleton();
		}
		return instance;
	}
	public static synchronized Singleton getInstance2() {
		if(instance==null) {
			instance=new Singleton();
		}
		return instance;
	}
	public static Singleton getInstace3() {
		if(instance == null) {
			synchronized (Singleton.class)
            {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
		}
		return instance;
	}
	
}


public class DoubleCheck_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Singleton x = Singleton.getInstance1();
				Singleton y = Singleton.getInstance2();
				Singleton z = Singleton.getInstance2();
				System.out.println("Hash code of x is: "+x.hashCode());
				System.out.println("Hash code of y is: "+y.hashCode());
				System.out.println("Hash code of z is: "+z.hashCode());
				if(x==y && y==z) {
					System.out.println("the object posess same memory in the heap");
				}
				else {
					System.out.println("the object does not posess same memory in the heap");
				}

	}

}
