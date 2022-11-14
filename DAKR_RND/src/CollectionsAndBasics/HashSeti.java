package CollectionsAndBasics;

import java.util.HashSet;

// Java program to demonstrate
	// internal working of HashSet

	

	public class HashSeti {
		
		public static void main(String args[])
		{
			// creating a HashSet
			HashSet hs = new HashSet();
			
			// adding elements to hashset
			// using add() method
			boolean b1 = hs.add("Balu");
			boolean b2 = hs.add("Balu Reddy");
			
			// adding duplicate element
			boolean b3 = hs.add("Balu");
			
			// printing b1, b2, b3
			System.out.println("b1 = "+b1);
			System.out.println("b2 = "+b2);
			System.out.println("b3 = "+b3);
			
			// printing all elements of hashset
			System.out.println(hs);
				
		}
	}

