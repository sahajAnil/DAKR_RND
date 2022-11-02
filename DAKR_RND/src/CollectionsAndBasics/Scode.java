package CollectionsAndBasics;

import java.util.Stack;
public class Scode {

	public static void main(String[] args) {
				Stack<String>names=new Stack<String>();
				names.push("Navi");
				names.push("Mahi");
				names.push("Anil");
				names.push("Sahaja");
				names.push("King");
				System.out.println("names: "+names);
				//element removal at peek or pop
				String element=names.pop();
				System.out.println("removed elements: "+element);
				//element at peek
				String pk=names.peek();
				System.out.println("element at top: "+pk);
				System.out.println("names: "+names);
				//search an element
				int position = names.search("Anil");
		        System.out.println("Position of Anil: " + position);
		        //if the stack is empty
		        boolean result = names.empty();
		        System.out.println("Is the stack empty? " + result);

			}

		}

	
