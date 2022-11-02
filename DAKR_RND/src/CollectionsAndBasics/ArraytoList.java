package CollectionsAndBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraytoList {

	public static void main(String[] args) {
		//Creating Array
		String[] array={"Java","Python","PHP","C++"};  
		System.out.println("Printing Array: "+Arrays.toString(array));  
		//Converting Array to List  
		List<String> list=new ArrayList<String>();  
		for(String lang:array){  
		list.add(lang);  
		}  
		System.out.println("Printing List: "+list); 
		
		System.out.println("---------------------------------------------");
		
		List<String> fruitList = new ArrayList<>();    
		 fruitList.add("Mango");    
		 fruitList.add("Banana");    
		 fruitList.add("Apple");    
		 fruitList.add("Strawberry"); 
		 fruitList.add(1,"Grapes");
		 //Converting ArrayList to Array  
		 String[] array1 = fruitList.toArray(new String[fruitList.size()]);    
		 System.out.println("Printing Array: "+Arrays.toString(array1));  
		 System.out.println("Printing List: "+fruitList);  

	}

}
