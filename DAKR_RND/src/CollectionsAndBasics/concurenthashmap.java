package CollectionsAndBasics;

import java.util.HashMap;

public class concurenthashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String>empdata=new HashMap<>();
		empdata.put(1,"rajesh");
		empdata.put(2,"raju");
		empdata.put(3,"ramya");
		System.out.println(empdata);
		 for (Integer r : empdata.keySet()) {
		      System.out.println(r);
		
	}

}
}
