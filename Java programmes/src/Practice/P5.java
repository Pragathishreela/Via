package Practice;

public class P5 {
	public static void main(String[] args) {
		String a = "madam";
		String temp = a;
		int count = 0;
		String b = "";
		//System.out.println(a.length());
		//for(int i=(a.length()-1);i>=0;i--) {		reverse order
		/*for(int i=0;i<a.length();i++) {
			if(a.charAt(i)=='a'||a.charAt(i)=='A') {
				count++;
			}	
		}
		System.out.println(count);*/
		
		for(int i=(a.length()-1);i>=0;i--) {
			b = b + a.charAt(i);
		}
		System.out.println(b);
		if(b.equals(temp))
			System.out.println("Palindrome");
		else
			System.out.println("Not a palindrome");
		System.out.println(b.equals(temp));
	}
}
