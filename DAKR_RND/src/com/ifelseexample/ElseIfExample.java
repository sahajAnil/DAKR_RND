package com.ifelseexample;

public class ElseIfExample {

	public static void main(String[] args) {
		
		String abc = "Mon";
		
		if(abc=="Mon") {
			System.out.println("Monday");
		} 
		else if(abc == "Tue") {
			System.out.println("Tuesday");
		}
		else if(abc == "Wed") {
			System.out.println("Wednesday");	
		}
		else {
			System.out.println("No Match found");
		}

	}

}
