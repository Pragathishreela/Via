package Inheritance;

public class A8 {
	public static void main(String[] args) {
		A7 a1 = new A7();
		A4 a4 = new A4();
		a1.sub(a4);
		A4 a2 = new A5();
		a1.sub(a2);//internal upcasting
	}
}
