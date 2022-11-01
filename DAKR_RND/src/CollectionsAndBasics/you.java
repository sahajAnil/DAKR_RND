package CollectionsAndBasics;
import java.util.LinkedList;
import java.util.*;


public class you {

	public static void main(String[] args) {
		
		
		    Queue<String> languages = new LinkedList<>();

		  
		    languages.add("Java");
		    languages.add("React");
		    languages.add("Aws");
		    System.out.println("LinkedList: " + languages);

		    String str1 = languages.peek();
		    System.out.println("Accessed Element: " + str1);

		    String str2 = languages.poll();
		    System.out.println("Removed Element: " + str2);
		    System.out.println("LinkedList after poll(): " + languages);

		    languages.offer("C++");
		    System.out.println("LinkedList after offer(): " + languages);
		  }
		}

	


