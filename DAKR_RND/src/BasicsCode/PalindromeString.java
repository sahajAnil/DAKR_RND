//Check Palindrome String

//A string is called a palindrome string if the reverse of that string
//is the same as the original string.
//Example::radar , level  {Ex no:3553, 12321}

package BasicsCode;

public class PalindromeString {

	public static void main(String[] args) {
		
		String s= " Naveen Navi 5500 ",reverses=" ";
		int sLength =s.length();
		
		for(int i=(sLength=1);i>0;--i) {
			
			reverses=reverses +s.charAt(i);
			
		}
		if(s.toLowerCase().equals(reverses.toLowerCase())) {
			System.out.println(s+" This is Palindrime String");
			
		}
		else {
			System.out.println(s+"This is not a Palindrime String");
		}

	}

}
