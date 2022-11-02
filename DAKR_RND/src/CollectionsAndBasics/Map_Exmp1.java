package CollectionsAndBasics;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Map_Exmp1 {

	static void insertAndPrint(AbstractMap<Integer, String> map) {
		int []arr= {-1,1,0,-2,2};
		for(int x : arr) {
			map.put(x, Integer.toString(x));
		}
		for(int k:map.keySet()) {
			System.out.print(k+", ");
		}
	}
	public static void main(String[] args) {
		System.out.println("Given set values as : -1,1,0,-2,2");
		System.out.println("Hash Map reault: (ordering of keys is arbitary)");
		HashMap<Integer, String> map1=new HashMap<Integer, String>();
		insertAndPrint(map1);
		System.out.println();
		System.out.println("Linked Hash Map: (keys ordered in insertion order)");
		LinkedHashMap<Integer, String> map2=new LinkedHashMap<Integer, String>();
		insertAndPrint(map2);
		System.out.println();
		System.out.println("Tree Map: (keys are in sorted order)");
		TreeMap<Integer, String> map3=new TreeMap<Integer, String>();
		insertAndPrint(map3);
	}

}
