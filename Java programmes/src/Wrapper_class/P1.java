package Wrapper_class;

public class P1 {
	public static void main(String[] args) {
		int a = 10;
		System.out.println(a);
		//before JDK 1.5; we use to do like this
		Integer b = Integer.valueOf(a);
		System.out.println(b);
		System.out.println(b.floatValue());
		System.out.println(b.byteValue());
		char c = 'a';
		Character d = Character.valueOf(c);
		System.out.println(d);
		System.out.println(d.toString());
		boolean e = true;
		Boolean f = Boolean.valueOf(e);
		System.out.println(f);
		b = Integer.valueOf(c);
		System.out.println(b);
		//after JDK 1.5 automatically it is going to add valueof() implicitly
		b=a;
		b=25;
		int g = 20;
		Integer h = g;
		h=50;
		System.out.println(b);
	}
}
