package CollectionsAndBasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;



public class ArrayList_exmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(96);
		al.add(45);
		al.add(11);
		al.add(84);
		al.add(25);
		al.add(32);
		Collections.sort(al);
		al.add(1,52);
		al.remove(2);
		
		for(Integer arr: al ) {
			System.out.println(arr);
		}
		System.out.println(al.indexOf(45));
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
		
		ArrayList<String>fruit=new ArrayList<String>();
		fruit.add("Mango");
		fruit.add("Apple");
		fruit.add("watermelon");
		System.out.println(fruit);
		Iterator<String> itr=fruit.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(fruit.size());
		ListIterator<String> list1=fruit.listIterator(fruit.size());  
        while(list1.hasPrevious())  
        {  
            String str=list1.previous();  
            System.out.println(str);  
        }  
        
		
		
		
		

	}

}
