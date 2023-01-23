package String;

public class P3 {
	public static void main(String[] args) {
		String s = "Hi";
		String s1 = "hi";
		String s2 = "Hi";
		System.out.println(s==s2);
		System.out.println(s.equals(s2));
		System.out.println(s.equalsIgnoreCase(s));
	}
}
