package CollectionsAndBasics;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
//import java.util.ListIterator;

public class Iterate_Exmp2 {

	public static void main(String[] args) {
		List<String>city= Arrays.asList("Boston", "San Diego", "Las Vegas", "Houston", "Miami", "Austin"); 	
		/*ListIterator<String>listIterator=city.listIterator();
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}*/
		Iterator<String>cityIterator=city.iterator();
		while(cityIterator.hasNext()) {
			System.out.println(cityIterator.next());
		}
		

	}

}
