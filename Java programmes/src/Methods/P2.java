package Methods;
public class P2 {
	int a;
	public boolean equals(Object o) {//o=a2
		P2 a3 = (P2)o;			//down casting
		return this.a==a3.a;
	}
	public static void main(String[] args) {
		P2 a1 = new P2();
		a1.a = 10;
		P2 a2 = new P2();
		a2.a = 10;
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a1.equals(a2));
	}
}
