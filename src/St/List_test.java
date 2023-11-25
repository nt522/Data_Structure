package St;

import java.util.ArrayList;
import java.util.List;


public class List_test {

	public static void main(String[] args) {

		List l = new ArrayList();
		
		for (int i=1; i<10; i++) {
			l.add(i);
		}
		for (int i=0; i<9; i++) {
			System.out.println(l.get(i));
		}

	}
}
