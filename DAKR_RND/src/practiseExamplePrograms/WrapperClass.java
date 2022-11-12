package practiseExamplePrograms;

import java.util.Scanner;

public class WrapperClass {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter First Number");

	//int 	a= in.nextInt();//5;
	Integer a= in.nextInt();//5;
	System.out.println("Enter Second Number");

	//int 	b= in.nextInt();//10;
	Integer b= in.nextInt();//10;
	
	
	Integer  c = a + b;
	System.out.print("add="+c);

	}

	}


