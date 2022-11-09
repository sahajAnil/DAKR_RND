//Prime Number using a for loop

//Prime number is a number that is greater than 1 and
//divided by 1 or itself only.

package BasicsCode;

public class PrimeNumber {

	public static void main(String[] args) {
		   
		int num=5500;
		boolean flag =false;
		
		for (int i=2;i<=num/2;++i) {
			 
			if(num%i==0) {
				flag =true;
				break;
			}
		}
		if(!flag)
			System.out.println(num +" This is a prime number");
		else
			System.out.println(num +" This is not a prime number");

	}

}
