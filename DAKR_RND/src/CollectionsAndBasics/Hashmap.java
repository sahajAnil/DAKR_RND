package CollectionsAndBasics;
import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashMap<Integer, String> m = new HashMap<Integer, String>();
        
        m.put(1301, "Rajesh");
        m.put(1302, "Prajeeth");
        m.put(1303, "Srikaran");
        m.put(1304, "Abhi");
        m.put(1305, "Naveen");
        m.put(1306, "sri");
        
        System.out.println(m);    //Out put{1301=Rajesh, 1302=Prajeeth, 1303=Srikaran, 1304=Abhi, 1305=Naveen, 1306=sri}

        System.out.println(m.get(1303));  //Out put = Srikaran
        System.out.println(m.remove(1306));  //Output  = sri

        System.out.println(m.containsKey(1305));  //true
        System.out.println(m.containsValue("sri")); //false
        System.out.println(m.isEmpty()); //false
        System.out.println(m.keySet()); // Retuens all the keys as Set [1301, 1302, 1303, 1304, 1305]
        System.out.println(m.values());  //returns all the Values as collection [Rajesh, Prajeeth, Srikaran, Abhi, Naveen]
        System.out.println(m.entrySet());  //returns all the pair of sets [1301=Rajesh, 1302=Prajeeth, 1303=Srikaran, 1304=Abhi, 1305=Naveen]
        
        for(Object i:m.keySet()) {
        System.out.println(i);
        }
        
        for(Object i:m.values()) {
        System.out.println(i);
        }
        
        for(Object i:m.keySet()) {
        	System.out.println(i+"  "+m.get(i));
        }
        
        for(Object i:m.entrySet()) {
        	System.out.println(i);
        }
     } 
}


