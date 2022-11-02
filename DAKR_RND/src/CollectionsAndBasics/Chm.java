package CollectionsAndBasics;

import java.util.concurrent.*;   
import java.util.*;   

public class Chm {

	public static void main(String[] args) {
		
		HashMap<String,Integer> Anil =new HashMap<>();
		
		Anil.put("N1", 5500);
		Anil.put("M1", 5501);
		Anil.put("K3", 5504);
		Anil.put("S4", 5508);
		 System.out.println("HashMap values :\n " + Anil.toString());    
        
		  Anil.computeIfAbsent("N5", k -> 200 + 300);   
	        Anil.computeIfAbsent("M6", k -> 60 * 10);  
	        System.out.println("is 5508  present? ::  "  + Anil.containsValue(5504));  
	        System.out.println("New HashMap after computeIfAbsent :\n "+ Anil);   
	}

}
