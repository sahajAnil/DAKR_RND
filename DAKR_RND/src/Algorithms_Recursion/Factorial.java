package Algorithms_Recursion;

public class Factorial {
	
	int fact(int n) {
		if (n==1)
			return 1;
		int x=n*fact(n-1);
		return x;
	}

	public static void main(String[] args) {
		
		Factorial f =new Factorial ();
		int result =f.fact(	5);
		System.out.println(result);
	}

}
