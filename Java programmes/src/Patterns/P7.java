package Patterns;

public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++) {
			for(int j=i;j<4;j++) {
				System.out.print(" "+" ");
			}
			for(int k=1;k<i;k++) {
				System.out.print("*"+" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		for(int i=1;i<=4;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(" "+" ");
			}
			for(int k=i;k<4;k++) {
				System.out.print("*"+" ");
			}
			for(int k=i;k<=4;k++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}
