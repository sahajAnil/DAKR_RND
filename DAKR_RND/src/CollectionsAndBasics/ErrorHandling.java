package CollectionsAndBasics;

//using 
public class ErrorHandling {

	public static void main(String[] args) {
		int a=10;
		int b=5;
		int c=5;
		
		try {
			int x=a/(b-c);
		}
		catch(Exception e) {
			System.out.println("Division by Zero");
		}
		int y=a/(b+c);
		System.out.println("y="+y);

	}

}
