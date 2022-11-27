//Tower Of Hanoi

package Algorithms_Recursion;

public class Hanoiproblem {
	
	static TOH(int n,int A,int B,int C) {
		if(n>0) {
			TOH(n-1,A,B,C);
			printf("Move a Disc from %d to %d",A,C);
			TOH (n-1,B,A,C);
			
		}
	}
	/* static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod)
	    {
	        if (n == 1)
	        {
	            System.out.println("Move disk 1 from rod " +  from_rod + " to rod " + to_rod);
	            return;
	        }
	        towerOfHanoi(n-1, from_rod, aux_rod, to_rod);
	        System.out.println("Move disk " + n + " from rod " +  from_rod + " to rod " + to_rod);
	        towerOfHanoi(n-1, aux_rod, to_rod, from_rod);
	    }
	     */
	
	public static void main(String[] args) {
		

		/*int n = 4; // Number of disks
		towerOfHanoi(n, \'A\', \'C\', \'B\');  // A, B and C are names of rods*/
		int n=4;
		TOH(n,\'A\',\'B\',\'C\');
	}
	}