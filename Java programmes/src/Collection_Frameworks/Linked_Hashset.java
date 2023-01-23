package Collection_Frameworks;

import java.util.LinkedHashSet;

public class Linked_Hashset {
	public static void main(String[] args) {
		LinkedHashSet l1 = new LinkedHashSet<>();
		l1.add(10);
		l1.add("Hi");
		l1.add('a');
		l1.add(true);
		l1.add(false);
		l1.add("Hi");
		l1.add(10);
		LinkedHashSet l2 = new LinkedHashSet<>(l1);
		l2.add("hi");
		System.out.println(l1);
		/*for(Object i : l1) {
			l1.add(i);
		}*/
		System.out.println(l2);
	}
}
