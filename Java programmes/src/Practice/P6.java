package Practice;
import java.util.Scanner;
public class P6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a = s.next();
		String temp = a;
		int count = 0;
		String b = "";		
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
