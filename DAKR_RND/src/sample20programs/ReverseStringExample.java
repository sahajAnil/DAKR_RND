package sample20programs;
 

        ////////7. Program to reverse the order of characters in any given string///////////

public class ReverseStringExample {

	public static void main(String[] args) {
		
		// declaring variable
		String stringinput = "Independent";
		        // convert String to character array
		        // by using toCharArray
		        char[] resultarray = stringinput.toCharArray();
		        //iteration
		        for (int i = resultarray.length - 1; i >= 0; i--)
		         // print reversed String
		            System.out.print(resultarray[i]);
		}
	}
