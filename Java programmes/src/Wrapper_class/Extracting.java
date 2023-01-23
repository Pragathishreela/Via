package Wrapper_class;

public class Extracting {
	public static void main(String[] args) {
		String s = "ab1ndg25";
		int a1 = 0;
		for(int i=0;i<s.length();i++) {
			String s1 = "";
			if(s.charAt(i)>'0'&&s.charAt(i)<'9') {
				s1 = s1 + s.charAt(i);
				 a1= a1+Integer.parseInt(s1);
			}
		}
		System.out.println(a1);
	}
}