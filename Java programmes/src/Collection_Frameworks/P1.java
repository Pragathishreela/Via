package Collection_Frameworks;
import java.util.ArrayList;
public class P1 {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList(4);
		a1.add(10);
		a1.add(20);
		//a1.add("null");
		a1.add(2);
		a1.add(10);
		a1.add(4);
		a1.add('a');
		a1.add('f');
		a1.add("hello");
		/*for(Object i:a1) {  //important its object
			System.out.println(i);
		}*/
		//a1.clear();
		/*System.out.println(a1);
		System.out.println(a1.indexOf(10));
		System.out.println(a1.indexOf(4));
		System.out.println(a1.lastIndexOf(10));
		System.out.println(a1.lastIndexOf(10));*/
		//System.out.println(a1.remove(0));
		/*System.out.println(a1);
		System.out.println(a1.remove(new Integer(20)));
		System.out.println(a1);
		System.out.println(a1.remove(new Character('a')));
		//to remove character another way
		Integer a = new Integer('f');
		System.out.println(a1.remove(a));
		System.out.println(a1);*/
		ArrayList a2 = new ArrayList();
		a2.add(a1);
		a2.add(10);
		a2.add("me");
		System.out.println(a2.removeAll(a1));
		a2.removeAll(a1);
		System.out.println(a2);
		System.out.println();
		
		
		System.out.println();
		
	}
}
