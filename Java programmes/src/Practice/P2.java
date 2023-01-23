package Practice;

public class P2 {
	public static void main(String[] args) {
		int a = 1234;
		while(a>0) {
			int fact = 1;
			int rem = a%10;
			for(int i=1;i<=rem;i++) {
				fact = fact*i;
			}
			System.out.println(fact);
			a=a/10;
		}
	}
}
/*
int factorial = 1;
for(int i=1;i<=5;i++){
	factorial = factorial* i;
}
System.out.print(factorial+" ");*/