package sample20programs;
        ///////11. Program to reverse the order of elements in a string, integer or character array////////////
public class Reversetheorderofelementsinastringintegerorcharacterarray {

	public static void main(String[] args) {
		// String using CharcterArray.


		// declaring variable

		String stringinput = "Independent";

		        // convert String to character array

		        // by using toCharArray

		        char[] resultarray = stringinput.toCharArray();

		        //iteration

		        for (int i = resultarray.length - 1; i >= 0; i--)

		         // print reversed String

		            System.out.print(resultarray[i]);
		        
		        ///////////reverse string ////////////
		        
		        String stringInput = "My String Output";   

		        //Get the String length

		        int iStrLength=stringInput.length();    

		        //Using While loop

		    while(iStrLength >0)

		    {

		    System.out.print(stringInput.charAt(iStrLength -1)); 

		    iStrLength--;

		    }
	}
		}

	


