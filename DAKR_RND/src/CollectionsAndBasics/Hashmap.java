package CollectionsAndBasics;
import java.util.HashMap;
import java.util.Map;
public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated methStringb
		
   HashMap<Integer,String> m= new HashMap <Integer,String>  ();
    
   m.put(11, "Virat");
   m.put(12, "Kohli");
   m.put(13, "Rohit");
   m.put(14, "Rahul");
   m.put(15, "Warner");
   m.put(16, "Rishab");
   
   System.out.println(m);
   System.out.println(m.get(14));  
   System.out.println(m.remove(12)); 
   System.out.println(m.containsKey(11));
   System.out.println(m.containsValue("Rahul")); 
   System.out.println(m.isEmpty ()); // false
   System.out.println(m.size());
  
   for (Object i:m.keySet())
   {
	   System.out.println(i+" "+m.get(i));
	   
   }
   for (Object i:m.values())
   {
	   System.out.println(i); // Rishab Virat Rohit Rahul Warner
   }
    for (Object i:m.entrySet())
    {
    	System.out.println(i);
    }
    	
    
    		}

}
 