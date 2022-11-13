package CollectionsAndBasics;

import java.util.Map;
import java.util.Map.Entry;


      /////////HashMap to store key and value pair./////////
public class HashMap {

	public static void main(String[] args) {
		
		HashMap map=new HashMap();//Creating HashMap    
		   map.put(1,"Mango");  //Put elements in Map  
		   map.put(2,"Apple");    
		   map.put(3,"Banana");   
		   map.put(4,"Grapes");   
		       
		   System.out.println("Iterating Hashmap...");  
		   for(Map.Entry m : map.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		   }  
		}

	private Entry[] entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

	private void put(int i, String string) {
		
		
	}  
		}  

	


