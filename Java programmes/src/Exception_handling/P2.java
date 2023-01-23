package Exception_handling;

public class P2 {
	public static void main(String[] args) {
		try {
		System.out.println(1);
		System.out.println(1/0);
		System.out.println(5/0);
		int a[]= {1,2,3,4};
		System.out.println(a[a.length]);
		}
		catch(Exception ab) {
			//ab.fillInStackTrace());
			
		}
		System.out.println(2);
	}
}
