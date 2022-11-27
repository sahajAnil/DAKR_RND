//Number of Paths

package Algorithms_Recursion;

import java.util.Scanner;

public class MatrixFromUser {
	  public static void readMatrixByUser()
	    {
	        int m, n, i, j;
	        Scanner sc = new Scanner(System.in);
	       
	            
	            try {
	            System.out.println("Enter the number "
	                               + "of rows of the matrix");
	            m = sc.nextInt();
	            System.out.println("Enter the number "
	                               + "of columns of the matrix");
	            n = sc.nextInt();
	  
	            // Declare the matrix
	            int first[][] = new int[m][n];
	  
	            // Read the matrix values
	            System.out.println("Enter the elements of the matrix");
	            for (i = 0; i < m; i++)
	                for (j = 0; j < n; j++)
	                    first[i][j] = sc.nextInt();
	  
	            // Display the elements of the matrix
	            System.out.println("Elements of the matrix are");
	            for (i = 0; i < m; i++) {
	                for (j = 0; j < n; j++)
	                    System.out.print(first[i][j] + "  ");
	                System.out.println();
	            }
	        }
	        catch (Exception e) {
	        }
	        finally {
	            sc.close();
	        }
	    }
	  


	public static void main(String[] args) {

		readMatrixByUser();

	}

}
