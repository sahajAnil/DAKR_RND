package CollectionsAndBasics;

public class Factorial {
	public static long bal(int n) {
	    long fact = 1;
	    for (int i = 2; i <= n; i++) {
	        fact = fact * i;
	    }
	    return fact;
	}
	public static void main(String[] args) {
		System.out.println(bal(20));
	}
}
