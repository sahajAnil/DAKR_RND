package CollectionsAndBasics;

import java.util.Arrays;
import java.util.List;

public class Iterate_exmp1 {

	public static void main(String[] args) {
		List<String> city=Arrays.asList("Boston", "San Diego", "Las Vegas", "Houston", "Miami", "Austin");
		/*for(int i=0;i<city.size();i++) {
			System.out.println(city.get(i));
		}*/
		for(String cities : city) {
			System.out.println(cities);
		}

	}

}
