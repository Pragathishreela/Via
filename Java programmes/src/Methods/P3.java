package Methods;

import Inheritance.A2;

public class P3 {
	int a;
	int b;
	public boolean equals(Object o ) {
		P3 a3 = (P3)o;
		return this.a==a3.a;
	}
	public int hashCode() {
		return this.a+10;
	}
	public static void main(String[] args) {
		P3 a1 = new P3();
		a1.a = 10;
		a1.b = 20;
		P3 a2 = new P3();
		a2.a = 30;
		a2.a = 40;
		a1 = a2;
		System.out.println(a2);
		System.out.println(a1);
		System.out.println(a1.equals(a2));
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		
	}
}
