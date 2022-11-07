package CollectionsAndBasics;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
public class cchashmap {

	public static void main(String[] args) {
		
		        // Creating ConcurrentHashMap
		        ConcurrentHashMap<String, String> my_cmmap
		            = new ConcurrentHashMap<String, String>();
		 
		        // Adding elements to the map
		        // using put() method
		        my_cmmap.put("1", "1");
		        my_cmmap.put("2", "1");
		        my_cmmap.put("3", "1");
		        my_cmmap.put("4", "1");
		        my_cmmap.put("5", "1");
		        my_cmmap.put("6", "1");
		 
		       
		        System.out.println("Mappings of my_cmmap : "
		                           + my_cmmap);
		 
		        
		        ConcurrentHashMap<String, String> new_chm
		            = new ConcurrentHashMap<>();
		 
		        
		        new_chm.putAll(my_cmmap);
		 
		        
		        System.out.println("New mappings are: " + new_chm);
		    }
		}
	


