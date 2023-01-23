package Patterns;
public class P17 {
	public static void main(String[] args) {
		int a = 1;
		for(int i=1;i<=5;i++) {
			if(i==1||i==5) {
				for(int j=1;j<=2;j++) {
					System.out.print("*"+" ");
				}
				System.out.println();
			}
			else {
				if(i==3) {
					for(int j=1;j<=5;j++) {
						System.out.print(a++ +" ");
					}
					System.out.println();
				}
				else {
					System.out.print("*"+" ");
					System.out.println();
				}
			}
		}
	}
}