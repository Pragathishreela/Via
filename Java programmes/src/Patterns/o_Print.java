package Patterns;

public class o_Print {
	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				if(i==1||i==j||j==1||j==i) {
					System.out.print("*"+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
