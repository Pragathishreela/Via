package Collection_Frameworks;
import java.util.ArrayList;
public class P2 {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(11);
		a1.add(12);
		a1.add(13);
		a1.add(14);
		a1.add(15);
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		for(Integer i=0;i<a1.size();i++) {
			if(a1.get(i)%2==0){
				a2.add(a1.get(i));
			}
		}
		System.out.println(a2);
		/*for(Integer i:a1) {
			if(i%2==0) {
				a2.add(i);
			}
		}
		System.out.println(a2);*/
		ArrayList<String> a3 = new ArrayList<String>();
		a3.add("pragathi");
		a3.add("meghana");
		a3.add("charan");
		a3.add("praveen");
		a3.add("mujeeb");
		for(String i:a3) {
			if(i.startsWith("m")) {
				String s = i;
//				if(s.charAt(0))
				
			}
		}
	}
}
