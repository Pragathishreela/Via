package String;

public class P5 {
	public static void main(String[] args) {
		String s = "   Pragathi  Meghana  Charan ";
		//System.out.println(s);
		//System.out.println(s.trim());
		String s1 = "Pragathi";
		/*System.out.println(s1);
		System.out.println(s1.substring(1));
		s1 = s1.substring(2);
		System.out.println(s1);*/
		for(int i=0;i<s1.length();i++) {
			System.out.println(s1.substring(i));
		}
		//System.out.println(s1.substring(1, 3));
	}
}
