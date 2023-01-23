package Practice;
public class P3 {
	public static void main(String[] args) {
		int number = 12;
		boolean key = true;
		for(int i=2;i<number;i++) {
			if(i%number==0) {
				key = false;
			}
		}
		if(key == true)
			System.out.println("Prime number");
		else
			System.out.println("not  prime number");
	}

}
