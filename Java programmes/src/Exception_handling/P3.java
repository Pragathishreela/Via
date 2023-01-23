package Exception_handling;

public class P3 {
	public static void main(String[] args) {
		try {
			System.out.println(1);
			System.out.println(1/0);
			System.out.println(2);
		}
		catch(Exception a) {
			System.out.println(a.getMessage());
		}
		finally {
			System.out.println("Finally me");
			int b[] = {1,2,3};
			try {
				System.out.println(b[2]);
				System.out.println(b[b.length]);
				System.out.println(2);
			}
			catch(Exception a) {
				a.printStackTrace();
			}
			finally {
				System.out.println("finally 1");
				String  c[] = {};
				try {
					System.out.println(c[0]);
				}
				catch(Exception a) {
					a.printStackTrace();
				}
				finally {
					System.out.println("Finally 3");
				}
			}
			System.out.println("Its me");
		}
	}
}
