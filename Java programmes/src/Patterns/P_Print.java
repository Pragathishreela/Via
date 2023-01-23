package Patterns;

public class P_Print {
	public static void main(String[] args) {
		int a=5;
		int b=a/2+1;
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=b;j++) {
				if((i==1&&i<=b)||j==1||(j==b&&i<=b)||(i==b&&j<=b)) {
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
