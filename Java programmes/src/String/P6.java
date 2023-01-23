package String;

public class P6 {
	public static void main(String[] args) {
		String s = "Pragathi";
		s = s.substring(1,4);
		String rev = "";
		
		System.out.println(s);
		
		for(int i=s.length()-1;i>=0;i--){//for(i=0;i<s.length();i++)
			rev = rev+s.charAt(i);
		}
		System.out.println(rev);
		System.out.println(palindrome("Megh"));
		System.out.println(s.equals(palindrome("Megh")));
		if(s.equals(palindrome("Megh")))
			System.out.println("palindrome");
		else
			System.out.println();
	}
	
	public static String palindrome(String s) {
		String rev = "";
		for(int i=s.length()-1;i>=0;i--){
			rev = rev+s.charAt(i);//rev = s.charAt(i)+rev;
		}
		return rev;
	}
}
