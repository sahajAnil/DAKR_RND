package javacode;

public class ConcurrentHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create an instance of
		// ConcurrentHashMap
				ConcurrentHashMap m = new ConcurrentHashMap();

		// Insert mappings using
		// put method
		m.put(100, "Hello");
		m.put(101, "Prutor");
		m.put(102, "Prutor");

		// Here we cant add Hello because 101 key
		// is already present in ConcurrentHashMap object
		m.putIfAbsent(101, "Hello");

		// We can remove entry because 101 key
		// is associated with For value
		m.remove(101, "Prutor");

		// Now we can add Hello
		m.putIfAbsent(103, "Hello");

		// We cant replace Hello with For
		m.replace(101, "Hello", "Ai");
		System.out.println(m);
		       }

			private void replace(int i, String string, String string2) {
				// TODO Auto-generated method stub
				
			}

			private void remove(int i, String string) {
				// TODO Auto-generated method stub
				
			}

			private void putIfAbsent(int i, String string) {
				// TODO Auto-generated method stub
				
			}

			private void put(int i, String string) {
				// TODO Auto-generated method stub
				
			}


			
	}


