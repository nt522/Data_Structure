package St;

import java.util.HashMap;
import java.util.Map;

public class HashM {

	public static void main(String[] args) {

		Map m = new HashMap();
		
		m.put("a", "b");
		m.put("1", "c");
		m.put(1, "f");
		
		System.out.println(m.get(1));
	}

}
