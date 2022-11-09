// Check Armstrong Number 

//An integer is called an Armstrong number of order n 
//if it's every digit separate out and cubed and summed up then the sum will be same as the number
//Armstrong Number : 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474, 54748, ...


package BasicsCode;

public class Armstrong {

	public static void main(String[] args) {
		
		int number =3459,originalNumber,remainder,result=0,n=0;
		
		originalNumber = number;
		
		for(;originalNumber !=0;originalNumber /=10,++n);
		
		originalNumber = number;
		
		remainder =originalNumber%10;
		result +=Math.pow(remainder, n);
				
	
	
	if(result ==number)
		System.out.println(number+ "is an Armstrong number");
	else
		System.out.println(number +"is not an Armstrong number ");
}
}
