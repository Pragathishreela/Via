package Collection_Frameworks;

import java.util.ArrayList;
import java.util.TreeSet;

public class Tree_Set {
	public static void main(String[] args) {
		TreeSet t1 = new TreeSet();
		t1.add(10);
		t1.add(20);
		t1.add(30);
		t1.add(50);
		t1.add(11);//if we add heterogenous it will give class cast exception.
		System.out.println(t1);
		ArrayList a1 = new ArrayList(t1);
		ArrayList a2 = new ArrayList(t1);
		for(int i=t1.size()-1;i>=0;i--) {//descending order
			//System.out.println(a1.get(i));
			a2.add(a1.get(i));
		}
		/*for(Object i : a2) {
			System.out.println(i);
		}*/
		System.out.println(a2);
	}
}