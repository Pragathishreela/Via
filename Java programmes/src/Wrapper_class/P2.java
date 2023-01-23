package Wrapper_class;

public class P2 {
	public static void main(String[] args) {
		/*int a = 10;
		Integer b = a;
		//int c = b.intValue();
		int c = b;//auto unboxing
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);*/
		int a = 10;
		Integer b = a;
		int c = b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		Integer d = new Integer(5);//boxing
	}
}
