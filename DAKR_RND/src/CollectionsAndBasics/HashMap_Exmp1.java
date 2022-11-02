package CollectionsAndBasics;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HashMap_Exmp1 {

	public static void main(String[] args) {
		HashMap<Integer, String> languages = new HashMap<>();
	    languages.put(1, "Java");
	    languages.put(2, "Python");
	    languages.put(3, "JavaScript");
	    System.out.println("Original HashMap: " + languages);
	    
	 // return set view of keys
	    // using keySet()
	    System.out.println("Keys: " + languages.keySet());

	    // return set view of values
	    // using values()
	    System.out.println("Values: " + languages.values());

	    // return set view of key/value pairs
	    // using entrySet()
	    System.out.println("Key/Value mappings: " + languages.entrySet());
	    
	    // iterate through keys only
	    System.out.print("Keys: ");
	    for (Integer key : languages.keySet()) {
	      System.out.print(key);
	      System.out.print(", ");
	    }

	    // iterate through values only
	    System.out.print("\nValues: ");
	    for (String value : languages.values()) {
	      System.out.print(value);
	      System.out.print(", ");
	    }
	    
	    // iterate through key/value entries
	    System.out.print("\nEntries: ");
	    for (Entry<Integer, String> entry : languages.entrySet()) {
	      System.out.print(entry);
	      System.out.print(", ");
	    }

	    // change element with key 2
	    languages.replace(2, "C++");
	    System.out.println("\nHashMap using replace(): " + languages);
	    System.out.println("HashMap: " + languages);

	    // remove element associated with key 2
	    String value = languages.remove(2);
	    System.out.println("Removed value: " + value);

	    System.out.println("Updated HashMap: " + languages);
	    
	    // create a treemap
	    TreeMap<String, Integer> evenNumbers = new TreeMap<>();
	    evenNumbers.put("Two", 2);
	    evenNumbers.put("Four", 4);
	    System.out.println("TreeMap: " + evenNumbers);

	    // create hashmap from the treemap
	    HashMap<String, Integer> numbers = new HashMap<>(evenNumbers);
	    numbers.put("Three", 3);
	    System.out.println("HashMap: " + numbers);

	}

}
