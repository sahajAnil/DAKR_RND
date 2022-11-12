package com.ifelseexample;

public class SwitchcaseExample {

	public static void main(String[] args) {

        int abc = 2;
        
		switch(abc){
		
		case 1:{
			System.out.println("Monday");
		}
		break;
		
		case 2:{
			System.out.println("Tuesday");
		}
		//break;
		
		case 3:{
			System.out.println("Wednesday");
		}
		//break;
		case 4:{
			System.out.println("Thrusday");
		}
		break;
		
		default:{
			System.out.println("Match not Found, please enterbetween1 to 4");
		}

	}
	}

}
