package com.example1;

public class DivCalculator {

	public static void main(String[] args) {
		
		int a = 5; // statement1 

		int b = 5; // statement2
        
		int c=0;
		try {
			
		     c = a/b; // statement3 // our programme is getting terminated                                                          
	
		}catch (Exception e) {
			
			System.out.println("Error message"+e.getMessage());
		}
		
		System.out.println("Div="+c); //statement4


		int d = 10+c; //statement5

		System.out.println("Total="+d); //statement6

	}

}
