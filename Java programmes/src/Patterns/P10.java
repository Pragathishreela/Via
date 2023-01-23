package Patterns;

public class P10 {

	public static void main(String[] args) {
			for(int i=1;i<=6;i++) {
			int a = 1;
			for(int j=1;j<i;j++) {
				System.out.print(a++ +" ");
			}
			System.out.print("@"+" ");
			char b = 'A';
			for(int k=i;k<6;k++) {
				System.out.print(b++ +" ");
			}
			System.out.println();
		}
		
	}

}
