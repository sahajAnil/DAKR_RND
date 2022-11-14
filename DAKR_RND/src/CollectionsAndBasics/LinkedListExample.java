package CollectionsAndBasics;

import java.util.Iterator;
import java.util.*;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> list= new LinkedList<>();
		
		list.add("hi");
		list.add("hello");
		list.add("bye");
		   //Iterating LinkedList
	     Iterator<String> iterator=list.iterator();
	     while(iterator.hasNext()){
		       System.out.println(iterator.next());
		     }
	}

}
