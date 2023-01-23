package Patterns;

public class R_Print {
	public static void main(String[] args) {
		int a = 5;
		int b = a/2+1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=b;j++) {
				if(j==1||(i==1&&j<=b)||(i==b&&j<=b)||(j==b&&i<=b)) {
					System.out.print("*"+" ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
	}
}
