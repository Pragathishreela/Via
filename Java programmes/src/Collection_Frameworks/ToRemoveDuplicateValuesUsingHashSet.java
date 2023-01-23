package Collection_Frameworks;

import java.util.ArrayList;
import java.util.HashSet;

public class ToRemoveDuplicateValuesUsingHashSet {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add("hi");
		a1.add("HI");
		a1.add(50);
		a1.add(40);
		a1.add(true);
		a1.add(false);
		a1.add(true);
		//a1.remove(10);it thinks that we are passing index value of an array 
		a1.remove(new Integer(10));//This is how we do remove in arrayList(unboxing)
		HashSet h1 = new HashSet(a1);
		h1.remove(10);//no need to perform unboxing
		h1.remove("hi");
		System.out.println(h1);
		for(Object i : h1) {
			System.out.println(i);
		}
	}
}