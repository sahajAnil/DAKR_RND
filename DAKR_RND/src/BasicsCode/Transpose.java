//java program to find  Transpose of a Matrix

//columns to rows

package BasicsCode;

import java.util.Scanner;

public class Transpose {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter how many rows you want??");
		int r=sc.nextInt();
		System.out.println("Enter how many cols want??");
		 int c=sc.nextInt();
		 int [][] matA=new int[r][c];
		 System.out.println("Enter "+(r*c)+"values");
		 for(int i=0;i<r;i++) {
			 for (int j=0;j<c;j++)
				 matA[i][j]=sc.nextInt();
		 }
		 System.out.println("Original Matrix is:");
		 for (int i=0;i<r;i++) {
			 for (int j=0;j<c;j++) {
				 System.out.println(matA[i][j]+"\t");
			 }
			 System.out.println();
		 }
		 
		 System.out.println("Transpose Matrix is:");
		 for(int i=0;i<r;i++) {
			 for (int j=0;j<c;j++) {
				 System.out.println(matA[j][i]+"\t");
			 }
			 System.out.println();
		 }
	}
}
