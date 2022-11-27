package Algorithms_Recursion;

import java.io.*;

class GfG_RecursionPath { 
    
	public static void main (String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
			String inputLine[]=br.readLine().trim().split(" ");
			int m=Integer.parseInt(inputLine[0]);
			int n=Integer.parseInt(inputLine[1]);
			GfG_RecursionPath ob= new GfG_RecursionPath();
			System.out.println(ob.numberOfPaths(m,n));
			
		}

		

	}
	
/*	long numberOfPaths(int m, int n) {
        if(m==1 && n==1){
            return 1;
        }
        if(m<1||n<1){
            return 0;
        }
        return numberOfPaths(m-1,n)+numberOfPaths(m,n-1); */

	long   numberOfPaths(int m, int n) {
		 if(m == 1 || n == 1)return 1;
		    return  numberOfPaths(m-1, n) + numberOfPaths(m, n-1);
    }
	
    
}
