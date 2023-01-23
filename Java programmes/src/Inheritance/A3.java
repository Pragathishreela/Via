package Inheritance;

public class A3 extends A2{
	static int a = 10;
		int e = 10;
		int f = 20;
		int g = 30;
		public static void main(String[] args) {
			A2 a2 = new A2();
			System.out.println(a2.b);
			A3 a3 = new A3();
			System.out.println(a3.g);
			a2 = a3;	
			A2 a4 = (A2)a3;
			a4 = a2;
			System.out.println(a2 instanceof A3);
			System.out.println(a4 instanceof A2);
			System.out.println(a3 instanceof A3);
			System.out.println(a4 instanceof A2);
		}
	}


