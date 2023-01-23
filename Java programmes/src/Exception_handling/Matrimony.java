package Exception_handling;
import java.util.Scanner;
public class Matrimony extends RuntimeException {
	Matrimony(String a1)  {
		super(a1);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the age");
		int a = s.nextInt();
		if(a>18) {
			System.out.println("You are eligible to do anything");
		}
		else {
			Matrimony a1 = new Matrimony("Dont be so hurry");
			throw a1;
		}
	}
}
