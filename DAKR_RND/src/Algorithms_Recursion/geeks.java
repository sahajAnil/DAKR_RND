//Pascal Triangle 

package Algorithms_Recursion;

import java.util.ArrayList;

public class geeks {
	 public static ArrayList<Integer> getRow(
		        int rowIndex)
		    {
		        ArrayList<Integer> currow
		            = new ArrayList<Integer>();
		        // 1st element of every row is 1
		        currow.add(1);
		 
		        // Check if the row that has to
		        // be returned is the first row
		        if (rowIndex == 0) {
		            return currow;
		        }
		        // Generate the previous row
		        ArrayList<Integer> prev = getRow(rowIndex
		                                         - 1);
		 
		        for (int i = 1; i < prev.size(); i++) {
		            // Generate the elements
		            // of the current row
		            // by the help of the
		            // previous row
		            int curr = prev.get(i - 1)
		                       + prev.get(i);
		            currow.add(curr);
		        }
		        currow.add(1);
		 
		        // Return the row
		        return currow;
		    }

	public static void main(String[] args) {
		  int n = 3;
	        ArrayList<Integer> arr = getRow(n);
	 
	        for (int i = 0; i < arr.size(); i++) {
	            if (i == arr.size() - 1)
	                System.out.print(arr.get(i));
	            else
	                System.out.print(arr.get(i)
	                                 + ", ");
	        }


	}

}
