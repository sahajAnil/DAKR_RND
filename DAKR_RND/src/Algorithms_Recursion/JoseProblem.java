//joseproblem

package Algorithms_Recursion;


//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class JoseProblem {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();//testcases
		while(T-->0)
		{
			JoseProblem obj=new JoseProblem();
		    
		    int n,k;
		    //taking input n and k
		    n=sc.nextInt();
		    k=sc.nextInt();
		    
		    //calling josephus() function
		    System.out.println(obj.josephus(n,k));
		    }		
	}
 public int josephus(int n, int k)
  {
      //Your code here
      return josephus1(n, k) + 1;
  }
  public int josephus1(int n, int k){
      if(n==1){
          return 0;
      }
      return (josephus1(n-1, k) + k)%n;
  }
  }







