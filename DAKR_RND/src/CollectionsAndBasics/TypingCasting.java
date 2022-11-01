package CollectionsAndBasics;

public class TypingCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myInt=8;
		double myDouble=myInt;
		
		//Widening
		System.out.println("Widening type casting ");
		System.out.println(myInt);
		System.out.println(myDouble);
		
		float myFloat=74.52f;
		int Int=(int)myFloat;
		char c=(char)Int;
		
		//Narrowing
	    System.out.println("Narrowing type casting");
		System.out.println(myFloat);
		System.out.println(Int);
        System.out.println(c);
		

	}

}
