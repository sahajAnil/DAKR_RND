package CollectionsAndBasics;


import java.util.HashMap;

public class ConcurrentHashMap_Exmp1 {

	public static void main(String[] args) {
		HashMap<String, Integer> chmp= new HashMap<String, Integer>();
		chmp.put("k1", 100);
		chmp.put("k2", 200);
		chmp.put("k3", 300);
		chmp.put("k4", 400);
		System.out.println("Concurrent Hash Map vaues: "+chmp.toString());
		chmp.computeIfAbsent("k5", k->300+200);
		chmp.computeIfAbsent("k6", k->20*30);
		System.out.println("Concurrent Hash Map vaues: "+chmp.toString());
		System.out.println("if 300 exists: "+chmp.containsValue(300));
		System.out.println("if k1 exists: "+chmp.containsKey("k1"));
		chmp.compute("k2", (key,val)->val+10);
		chmp.computeIfPresent("k6", (key,val)->val+100);
		System.out.println("Concurrent Hash Map vaues: "+chmp.toString());
		HashMap<Integer, String> cnmp = new HashMap<>();
	    cnmp.put(1, "Java");
	    cnmp.put(2, "Python");
	    cnmp.put(3, "JavaScript");
	    System.out.println("ConcurrentHashMap value detail: "+ cnmp.toString());
	    cnmp.compute(2, (key, val)-> val.concat(" (Angular)"));
	    cnmp.compute(3, (key, val)-> val.concat(" (java Script)"));
	    System.out.println("ConcurrentHashMap value detail: "+ cnmp.toString());
	    cnmp.put(4,"c++");
	    cnmp.put(3, "HTML");
	    System.out.println("The Map is: " +cnmp);
	     
	       
        
	}

}
