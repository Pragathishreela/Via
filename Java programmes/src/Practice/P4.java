package Practice;

public class P4 {
	public static void main(String[] args) {
		String a = "hi";
		System.out.println(a);
		System.out.println(a.concat(" hello"));
		System.out.println("hello "+a.concat(" hello"));
		a = a.concat(" hello");
		a = "hi ".concat(a);
		System.out.println(a);
	}
}
