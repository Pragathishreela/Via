package Wrapper_class;

public class String_datatype {
	public static void main(String[] args) {
		String s = "100";
		System.out.println(s);
		Integer a = Integer.parseInt(s);
		System.out.println(a+100);
		System.out.println(a);
		//int b = s.indexOf(0);
		Integer b = s.indexOf(s);
	}
}
