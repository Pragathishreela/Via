package Patterns;

public class P11 {

	public static void main(String[] args) {
		int a = 1;
		char b = 'A';
		for(int i=1;i<=5;i++) {
			for(int j=i;j<5;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				if(i%2==0) 
					System.out.print(a++ +" " );
				else
					System.out.print(b++ +" ");
			}
			System.out.println();
		}

	}

}
