package Collection_Frameworks;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListProgram {
	public static void main(String[] args) {
		//ArrayList<Integer> a1 = new ArrayList<Integer>();
		ArrayList a1 = new ArrayList();//it becomes object
		/*a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		int sum = 0;
		for(Object i : a1) {
			sum += (int)i;
		}
		System.out.println(sum);*/
		a1.add(1);
		a1.add(2);
		a1.add(true);
		a1.add(4);
		a1.add(5);
		int sum = 0;
		//for(Object i : a1) {
		/*for(int i=0;i<a1.size();i++) {
			try {
			//Integer j = (Integer)i;
			//System.out.println(j);
			sum += (int)a1.get(i);
			}
			catch(Exception e) {
				continue;
			}
		}
		System.out.println(sum);*/
		Iterator a2 = a1.iterator();
		/*System.out.println(a2.next());
		System.out.println();
		while(a2.hasNext()) {
			System.out.println(a2.next());
		}*/
		while(a2.hasNext()) {
			try {
				Integer j = (Integer)a2.next();
				sum += j;
			}
			catch(Exception e) {
				continue;
			}
		}
		System.out.println(sum + " is the sum");
	}
}
