package Patterns;

public class P15 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<5;j++) {
				System.out.print(((j+i)%2)+" ");
			}
			System.out.println();
		}
	}
}