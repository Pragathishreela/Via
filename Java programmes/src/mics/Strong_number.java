package mics;

public class Strong_number {
	public static void main(String[] args) {
		int a = 1;
		int sum = 0;
		int temp = a;
		while(a>0) {
			int rem = a%10;
			int fact = 1;
			for(int i=1;i<=rem;i++) {
				fact *= rem;
			}
			a = a/10;
			sum += fact;
		}
		if(temp==sum)
			System.out.println("strong number");
		else
			System.out.println("not a strong number");
	}
}
