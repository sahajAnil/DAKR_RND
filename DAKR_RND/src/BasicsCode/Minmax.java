package BasicsCode;

public class Minmax {

	public static void main(String[] args) {
		
int[] arr = {1,5,4,7,6,0,8,4,8,4,6,5,7,3,23,65,78,21,68,43};
		
		
		int min=arr[0];
		int max = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
	
			if(max<arr[i]) {
				max=arr[i];
			}
		
		}
		System.out.println("Minimum value is : "+min);
		System.out.println("Minimum value is : "+max);

	}

	}

