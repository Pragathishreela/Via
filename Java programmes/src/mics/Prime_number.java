package mics;
import java.util.Scanner;
public class Prime_number {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		boolean key = true;
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				key=false;
				break;
			}
		}
		if(key==true)
			System.out.println("It is prime");
		else
			System.out.println("It is not prime");
		}
}
