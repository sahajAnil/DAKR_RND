package ExceptionHandlings;

public class NumberFormatException {

	public static void main(String[] args) {
		int i;
		try {
			String s="abc";  
			i=Integer.parseInt(s);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("rest of the code...");

	}

}
