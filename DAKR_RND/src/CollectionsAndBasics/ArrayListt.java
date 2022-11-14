package javacode;

public class ArrayListt {

	public static void main(String[] args) {
int [] arr = {10,20,30,40,50,60};
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println(arr[5]);
		//System.out.println(arr[6]);
		//System.out.println(arr[-1]);
		System.out.println("Size of array = "+arr.length);
		
		System.out.println("///////////for///////////////");
		
		for  (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("/////////for each /////////////////");
	
		for (int value :arr) {
			System.out.println(value);
		}
		
		System.out.println("/////////While  /////////////////");
		
		int i = 0;
		while(i<arr.length) {
			System.out.println(arr[i]);
			i++;
		}
	
		
		System.out.println("///////// do While  /////////////////");
		
		int j =0;
		do {
			System.out.println(arr[j]);
			j++;
			}
		while (j<arr.length);
	}




	
		// TODO Auto-generated method stub

	}

