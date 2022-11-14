package CollectionsAndBasics;

import java.util.LinkedList;
import java.util.List;

public class ConvertListtoArray {

	public static void main(String[] args) {
//By get() Method
	List<String> list= new LinkedList<String>( );
	list.add("Hi,");
	list.add("Iam");
	list.add("Balu");
	list.add("Reddy");
	
	String[]arr=new String[list.size( )];
	for(int i=0;i<list.size();i++)
		arr[i]=list.get(i);
	for(String x: arr)
		System.out.println(x + " ");

//By Array() Method
	String[] arr1=list.toArray(new String[0]);
	for(String x:arr1)
		System.out.println(x + " ");

//By Using Stream
		int n=list.size();
		String[]arr2=list.stream().toArray(String[]::new);
		for(String x:arr2)
			System.out.println(x + " ");
	
	
	
	}

}