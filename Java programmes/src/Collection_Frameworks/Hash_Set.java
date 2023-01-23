package Collection_Frameworks;

import java.util.ArrayList;
import java.util.HashSet;

public class Hash_Set {
	public static void main(String[] args) {
		HashSet h1 = new HashSet();
		/*h1.add(10);
		h1.add(20);
		h1.add(10);
		h1.add("hi");
		h1.add('a');
		h1.add(1);
		System.out.println(h1);*/
		int a[] = {10,20,10,20,30};
		for(int i=0;i<a.length;i++) {
			h1.add(a[i]);
		}
		System.out.println(h1);
		/*for(int i=0;i<h1.size();i++) {
			System.out.println(h1[i]);
		}*/
		for(Object i:h1) {
			System.out.println(i);
		}
		ArrayList a1 =  new ArrayList(h1);
		//System.out.println(a1);
		for(Object i : a1) {
			System.out.println(i);
		}
	}
}
