package Patterns;

public class P13 {

	public static void main(String[] args) {
		char ch = 'A';
		/*for(int i=1;i<=7;i++) {
			for(int j=1;j<=5;j++) {
				if(i%2==0) {
					if(j==1||j==5)
						System.out.print(ch+++" ");
					else
						System.out.print(" "+" ");
				}
				else
				System.out.print(ch+++" ");
			}
			System.out.println();
		}
	}

}*/
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=5;j++) {
				if(i==1||i==3||i==5||j==1||j==5) {
					System.out.print(ch+++" ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
	}
}