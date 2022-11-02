package CollectionsAndBasics;

import java.util.HashMap;

public class kv {

	public static void main(String[] args) {
		// TODO Auto-generatedInteger stub
HashMap<String,Integer> empIds=new HashMap<>();
empIds.put("jhon", 1234);
empIds.put("karan",5678);
System.out.println(empIds);
System.out.println(empIds.get("jhon"));
System.out.println(empIds.remove("karan"));
System.out.println(empIds.containsValue(2222));
empIds.put("jhon", 1000);
System.out.println(empIds);
empIds.put("karan",9000);
System.out.println(empIds);
	}
}