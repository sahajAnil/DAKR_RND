//reverse the order of elements in a string ,Integer & character array


package BasicsCode;

public class reverseOrder {
	
	static  void reverse(int a[],int n) {
		int []b=new int [n];
		int j=n;
		
		for (int i=0;i<n;i++) {
			b[j-1]=a[i];
			j=j-1;
		}
		System.out.println("This is Reversed array :\n");
		
		for(int k=0;k<n;k++) {
			System.out.println(b[k]);
		}
		
	}

	public static void main(String[] args) {
		 
		int[]arr = {5509,55001,5560,5534,5500};
		reverse(arr,arr.length);
		}

}
