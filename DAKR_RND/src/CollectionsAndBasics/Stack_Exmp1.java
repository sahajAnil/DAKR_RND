package CollectionsAndBasics;

import java.util.Stack;

public class Stack_Exmp1 {

	public static void main(String[] args) {
		Stack<String>animals=new Stack<String>();
		animals.push("cat");
		animals.push("dog");
		animals.push("mouse");
		animals.push("elephant");
		animals.push("lion");
		System.out.println("animals: "+animals);
		//element removal at peek or pop
		String element=animals.pop();
		System.out.println("removed elements: "+element);
		//element at peek
		String pk=animals.peek();
		System.out.println("element at top: "+pk);
		System.out.println("animals: "+animals);
		//search an element
		int position = animals.search("cat");
        System.out.println("Position of cat: " + position);
        //if the stack is empty
        boolean result = animals.empty();
        System.out.println("Is the stack empty? " + result);

	}

}
