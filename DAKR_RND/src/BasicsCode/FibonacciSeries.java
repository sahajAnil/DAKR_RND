//Fibonacci Series using For Loop

//The Fibonacci series is a series where the next term is the sum of the 
//previous two terms. The first two terms of the Fibonacci sequence are 0 
//followed by 1. Fibonacci Series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34.

package BasicsCode;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int n=10,
				FirstTerm=0,
				           SecondTerm=1;
		
		System.out.println("Fibonacci Series till"+n+"terms");
		
		for (int i=1;i<=n;++i) {
			System.out.println(FirstTerm +" ");
			int nextTerm= FirstTerm + SecondTerm;
			FirstTerm = SecondTerm ;
			SecondTerm = nextTerm;
		}

	}

}
