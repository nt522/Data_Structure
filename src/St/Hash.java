package St;

import java.util.Set;
import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {

		
		Set s = new HashSet();
		
		s.add("Hello");
		s.add(178);
		s.add("Student");
		
		Object[] o = s.toArray();
		
		for(int i=0; i<o.length; i++) {
			System.out.println("Hash Set Value " + o[i]);
		}
		
	}

}
