package Collection_Frameworks;
import java.util.LinkedList;
public class Linked_list {
	public static void main(String[] args) {
		LinkedList a1 = new LinkedList();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		//System.out.println(a1);
		a1.addFirst(5);
		//System.out.println(a1);
		a1.add(0,"first");
		a1.addLast("last");
		System.out.println(a1);
		System.out.println(a1.getFirst());
		System.out.println(a1.getLast());
		a1.removeFirst();
		a1.removeLast();
		System.out.println(a1);
		
	}
}
