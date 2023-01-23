package Collection_Frameworks;
import java.util.Vector;
public class Vector_list {
	public static void main(String[] args) {
		Vector v1 = new Vector();
		v1.addElement(10);
		v1.add(20);
		v1.add(0, "Zero");
		v1.add(30);
		v1.add('a');
		v1.add(true);
		System.out.println(v1);
		v1.remove(0);
		System.out.println(v1);
		v1.remove("zero");
		System.out.println(v1);
		System.out.println(v1.remove(new Character('a')));
		System.out.println(v1);
		//v1.removeAllElements();
		//System.out.println(v1);
		v1.removeElement(10);
		System.out.println(v1);
		v1.remove(0);
		System.out.println(v1);
		//v1.removeAllElements();
		//System.out.println(v1);
		System.out.println(v1.get(0));
	}
}
