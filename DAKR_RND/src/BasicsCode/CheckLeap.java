//java program to check a leap year 

//A year divisible by 400 or a year divisible by 4 and not divisible by 100
//366 days in year is called LEAP YEAR

// if (Y % 400)==0 && if (Y % 4==0) and (Y % 100 !=0)

package BasicsCode;

import java.util.Scanner;

public class CheckLeap {

	public static void main(String[] args) { 
     Scanner sc=new Scanner (System.in);
     System.out.println("This is  year ");
     
     int year=sc.nextInt();
     
     if(( year % 400==0)|| ((year % 4 ==0) && ((year % 100 !=0)))) {
    	 
    	 System.out.println(year+" is a leap year");
     }
     
     else {
    	 System.out.println(year+" is not a leap year");
     }
		
		
	}

}
