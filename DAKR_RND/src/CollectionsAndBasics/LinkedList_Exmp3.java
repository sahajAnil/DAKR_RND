package CollectionsAndBasics;

public class LinkedList_Exmp3 {

	public static void main(String[] args) {
		int i[]= {10,20,30,40,50,60};
		int sum=0;
		for(int j=0;j<i.length;j++) {
			sum=sum+i[j];
		}
		dummy();
		System.out.println("telugu "+i[0]);
		System.out.println("hindi "+i[1]);
		System.out.println("english "+i[2]);
		System.out.println("maths "+i[3]);
		System.out.println("science "+i[4]);
		System.out.println("sosial "+i[5]);
		
		System.out.println("total "+sum);

	}
	static void dummy() //should use static for calling directly the method to main class
	{
		System.out.println("hi");
	}

}
