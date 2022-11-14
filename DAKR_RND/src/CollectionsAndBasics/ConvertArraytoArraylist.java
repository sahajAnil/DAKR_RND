package CollectionsAndBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertArraytoArraylist {

	public static void main(String[] args) {
//Approach-1
		Integer[]arr= {1,2,3,4,5};
		List<Integer> arrayList=new ArrayList<> ();
		for (int value: arr) {
			arrayList.add(value);
		}
		System.out.println("ArrayList= "+arrayList);
//Approach-2
		Integer[]arr1= {10,20,30,40,50};
		List<Integer>arrayList1=new ArrayList<>();
		Collections.addAll(arrayList1, arr1);
		System.out.println("ArrayList1= " +arrayList1);
//Approach-3
		Integer[]arr2= {100,200,300,400,500};
		List<Integer>arrayList2=Arrays.asList(arr2);
		System.out.println("ArrayList2= "+arrayList2);
//Approach-4
		Integer[]arr3= {1000,2000,3000,4000,5000};
		List<Integer>arrayList3= Arrays.stream(arr3).collect(Collectors.toList());
		System.out.println("ArrayList3= "+arrayList3);
		}
		
	}


