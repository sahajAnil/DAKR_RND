package Thread;

public class minggoal {

	public static void main(String[] args) {
		
		int i,j,k=1;
		//inner loop    
		for (i=1;i<=7;i++) {
			
			//outer loop
			for(j=1;j<i+1;j++) {
				System.out.println(k++ +"");// vl of k
			}
			System.out.println();//throws next line
		}
	}

}
