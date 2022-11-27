package Algorithms_Recursion;

public class GreedyAlgoLargestSumDigit {
	
	public static void main(String[] args) {
		System.out.println(findLargest(2, 9));
		System.out.println(findLargest(3, 20));
		System.out.println(findLargest(3, 29));
	}
	
	
	 static String findLargest(int N, int Sum){
	        // code here
	        
	        if(9*N<Sum)
	            return "-1";
	        
	        String result="";     
	        for(int i=0;i<N;i++)
	        {
	            if(Sum >= 9)
	            {
	                result= result+ '9';
	                Sum = Sum - 9;
	            }
	            else
	            {
	                result=result+Sum;
	                Sum = 0;
	            }
	        }
	        
	        if(Sum>0)
	            return "-1";
	        return result;
	        
	    }
	}
