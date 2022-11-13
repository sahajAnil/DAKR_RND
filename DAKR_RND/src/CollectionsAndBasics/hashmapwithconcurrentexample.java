package Collections;

import java.util.concurrent.ConcurrentHashMap;

public class hashmapwithconcurrentexample {

	public static void main(String[] args) {
		
		// Creating ConcurrentHashMap of even numbers
        ConcurrentHashMap<String, Integer> evenNumbers = new ConcurrentHashMap<>();

        // Using put()
        evenNumbers.put("Two", 2);
        evenNumbers.put("Four", 4);

        // Using putIfAbsent()
        evenNumbers.putIfAbsent("Six", 6);
        System.out.println("ConcurrentHashMap of even numbers: " + evenNumbers);

        //Creating ConcurrentHashMap of numbers
        ConcurrentHashMap<String, Integer> numbers = new ConcurrentHashMap<>();
        numbers.put("One", 1);

        // Using putAll()
        numbers.putAll(evenNumbers);
        System.out.println("ConcurrentHashMap of numbers: " + numbers);
    }
	}
