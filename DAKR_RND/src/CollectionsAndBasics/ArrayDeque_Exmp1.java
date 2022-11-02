package CollectionsAndBasics;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDeque_Exmp1 {

	public static void main(String[] args) {
		ArrayDeque<String> animals= new ArrayDeque<>();

        // Using add()
        animals.add("Dog");

        // Using addFirst()
        animals.addFirst("Cat");

        // Using addLast()
        animals.addLast("Horse");
        System.out.println("ArrayDeque: " + animals);
        //if the array deque is full then 
        // Using offer()
        animals.offer("mouse");

        // Using offerFirst()
        animals.offerFirst("Cat");

        // Using offerLast()
        animals.offerLast("lion");
        System.out.println("ArrayDeque: " + animals);
        
        System.out.print("\nArrayDeque in order: ");
        // Using iterator()
        Iterator<String> iterate = animals.iterator();
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }

        System.out.print("\nArrayDeque in reverse order: ");
        // Using descendingIterator()
        Iterator<String> desIterate = animals.descendingIterator();
        while(desIterate.hasNext()) {
            System.out.print(desIterate.next());
            System.out.print(", ");
        }
        System.out.println();
        // Get the first element
        String firstElement = animals.getFirst();
        System.out.println("First Element: " + firstElement);

        // Get the last element
        String lastElement = animals.getLast();
        System.out.println("Last Element: " + lastElement);
        
        // Using peek()
        String element = animals.peek();
        System.out.println("Head Element: " + element);

        // Using peekFirst()
        String firstElement1 = animals.peekFirst();
        System.out.println("First Element: " + firstElement1);

        // Using peekLast
        String lastElement1 = animals.peekLast();
        System.out.println("Last Element: " + lastElement1);
        
        // Using remove()
        String element1 = animals.remove();
        System.out.println("Removed Element: " + element1);

        System.out.println("New ArrayDeque: " + animals);

        // Using removeFirst()
        String firstElement2 = animals.removeFirst();
        System.out.println("Removed First Element: " + firstElement2);

        // Using removeLast()
        String lastElement2 = animals.removeLast();
        System.out.println("Removed Last Element: " + lastElement2);
        
        // Using poll()
        String element3 = animals.poll();
        System.out.println("Removed Element: " + element3);
        System.out.println("New ArrayDeque: " + animals);

        // Using pollFirst()
        String firstElement3 = animals.pollFirst();
        System.out.println("Removed First Element: " + firstElement3);

        // Using pollLast()
        String lastElement3 = animals.pollLast();
        System.out.println("Removed Last Element: " + lastElement3);
        
        

	}

}
