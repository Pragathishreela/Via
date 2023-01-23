package String;

public class P7 {
	public static void main(String[] args) {
		/*String s = "Pragathi";
		System.out.println(s.indexOf('a',3));
		String s1 = "";
		//System.out.println(s1.indexOf('a'));  o/p = -1*/
		String s = "AABBCCDD";
		String s1 = "";
		for(int i=0;i<s.length();i++) {
			if(s1.indexOf(s.charAt(i))==-1) {
				s1 = s1 + s.charAt(i);
			}
				
		}
		System.out.println(s1);
		
	}
}
