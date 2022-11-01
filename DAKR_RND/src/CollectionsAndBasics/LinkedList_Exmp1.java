package CollectionsAndBasics;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Exmp1 {

	public static void main(String[] args) {
		LinkedList<String>al=new LinkedList<String>();
		al.add("Ravi");
		al.add("Teja");
		al.add("abhi");
		al.addFirst("akhil");
		al.addLast("Pokuri");
		al.add(2,"raju");
		LinkedList<String>al1=new LinkedList<String>();
		al1.add("Gaurav");
		al1.add("srinu");
		al.addAll(al1);
		al.remove("Ravi");
		al.remove(3);
		al.removeFirst();
		al.removeLast();
		al.removeLastOccurrence("Gaurav");
		Iterator<String>itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
