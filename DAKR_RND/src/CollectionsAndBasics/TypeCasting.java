package CollectionsAndBasics;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myInt=9;
		double myDouble=myInt;
		//Widening Casting
		System.out.println("Widening Type Casting");
		System.out.println(myInt);
		System.out.println(myDouble);
		
		float myFloat=66.58f;
		int Int=(int)myFloat;
		char c=(char)Int;
		//Narrowing casting
		System.out.println("Narrowing Type Casting");
		System.out.println(myFloat);
		System.out.println(Int);
		System.out.println(c);

	}

}
