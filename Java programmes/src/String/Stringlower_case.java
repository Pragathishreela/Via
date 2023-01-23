package String;

public class Stringlower_case {
	public static void main(String[] args) {
		String s = "I LIVE IN BANGLORE KARNATAKA";
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='A'||s.charAt(i)=='I') {
				String s1 = "";
				s1 = s1 + s.charAt(i);
				System.out.print(s1.toLowerCase());
			}
			else {
				System.out.print(s.charAt(i));
			}
		}
	}
}
