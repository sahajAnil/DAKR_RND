//java program to find all duplicate characters in a string 


package BasicsCode;

public class Findallduplicate {

	public static void main(String[] args) {
		
		String s="Navi&Anil&Dakr";
		char[]carray=s.toCharArray();
		System.out.println("The string is:"+ s);
		System.out.println("Duplicate Char in above string are: ");
		
		for (int i=0;i<s.length();i++) {
			for (int j= i+1;j<s.length();j++) {
				if (carray[i]==carray[j]) {
					System.out.println(carray[j]+"");
					break;
				}
			}
		}

	}

}
