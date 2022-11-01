package CollectionsAndBasics;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_exmp2 {

	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<String>();
		System.out.println(al.isEmpty());
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ajay");  
		  ArrayList<String> al2=new ArrayList<String>();  
		  al2.add("Ravi");  
		  al2.add("Hanumat");
		  al.addAll(al2);
		  System.out.println(al);
		  al.removeAll(al2);
		  //al.retainAll(al2);  
		  System.out.println(al.isEmpty());
		  System.out.println("iterating the elements after retaining the elements of al2");  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next()); 
		  }
		  

	}

}
