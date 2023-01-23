package Collection_Frameworks;
import java.util.ArrayList;
import java.util.LinkedList;
public class Array_list {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		 
		System.out.println(a1.isEmpty());
		a1.add(10);//autoboxing 
		a1.add(20);
		a1.add("hi");
		a1.add('s');
		a1.add(true);
		a1.add(10.5);
		//System.out.println(a1);
		/*System.out.println(a1.isEmpty());
		ArrayList a2 = new ArrayList();
		a2.add(1);
		a2.add("hello");
		a2.add(a1);
		System.out.println(a2);
		ArrayList a3 = new ArrayList(a2);
		System.out.println(a3);
		a3.add(10);
		System.out.println(a3);
		a3.addAll(a2);
		System.out.println(a3);
		Object o1 = a1.get(0); 
		System.out.println(o1);
		System.out.println(a2.get(2));*/
		/*for(int i=0;i<a1.size();i++) {
			System.out.println(a1.get(i));
		}*/
		for(int i=0;i<a1.size();i++) {
			Object o2 = a1.get(i);
			System.out.println(o2);
		}
		a1.clear();//clear
		System.out.println(a1);
		LinkedList l1 = new LinkedList(a1);
		l1.addFirst(10);
		l1.add(11);
		l1.add(20);
		l1.addLast(11);
		System.out.println(l1);
	}
}