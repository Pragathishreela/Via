package String;

public class P9 {
	public static void main(String[] args) {
		String s = "Pragathi";
		char s1[] = s.toCharArray();
		String rev = "" ;
		for(int i=s1.length-1;i>=0;i--) {
			rev = rev + s1[i];
		}
		System.out.println(rev);
	}
}                                                               
