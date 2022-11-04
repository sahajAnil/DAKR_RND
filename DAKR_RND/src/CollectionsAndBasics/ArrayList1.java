 package CollectionsAndBasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(55);
		al.add(00);
		al.add(55);
		al.add(11);
		al.add(55);
		al.add(22);
		Collections.sort(al);
		al.add(1,51);
		al.remove(2);
		
		for(Integer arr: al ) {
			System.out.println(arr);
		}
		System.out.println(al.indexOf(45));
		
		ArrayList<String>Name=new ArrayList<String>();
		Name.add("Navi");
		Name.add("Mahi");
		Name.add("Anil");
		System.out.println(Name);
		Iterator<String> itr=Name.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(Name.size());

	
		

	}

}
