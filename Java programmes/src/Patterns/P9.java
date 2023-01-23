package Patterns;
import java.util.Scanner;
public class P9 {

	public static void main(String[] args) {
		int a=1;
		char b='A';
		Scanner s = new Scanner(System.in);
		System.out.println("Enter row length");
		int row_length = s.nextInt();
		System.out.println("Enter stars required");
		int stars = s.nextInt();
		for(int i=1;i<=row_length;i++){
			if(i%2==0){
				System.out.print(a++ +" " );
				for(int j=stars;j>=i;j--){
					System.out.print("*"+" " );
				}
				System.out.print(a++);
			}
			else{
				System.out.print(b++ +" " );
				for(int j=stars;j>=i;j--){
					System.out.print("* " );
				}
				if(i!=row_length)
					System.out.print(b++);
			}
			System.out.println();
		}
}

}
