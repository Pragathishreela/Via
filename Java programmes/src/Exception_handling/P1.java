package Exception_handling;

public class P1 {
	public static void main(String[] args) {
		try {
			System.out.println(1);
			System.out.println(1/0);
			System.out.println(2);
		}
		/*catch(Exception e) {
			System.out.println("Exception handled");
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}*/
		catch(Throwable e) {
			System.out.println(e.toString());
			//System.out.println(e.toString());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println(3);
	}
}
