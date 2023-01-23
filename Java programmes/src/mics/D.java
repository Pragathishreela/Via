package mics;

public class D {
	int a;
	String b;
	public static void main(String[] args) {
		D a1 = new D();
		a1.a = 1;
		a1.b = "hi";
		D a2 = new D();
		a2.b = "Hello";
		D a3 = new D();
		a3.a = 01;
		D a[] = new D[3];
		a[0] = a1;
		a[1] = a2;
		a[2] = a3;
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i].a+"\n"+a[i].b);
			System.out.println();
		}
	}
}
