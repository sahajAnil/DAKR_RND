package ExceptionHandlings;

public class NullPointerException {

	public static void main(String[] args) {
		try {
			String s=null;
			System.out.println(s.length());
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("rest of the code...");

	}

}
