package Exception_handling;
import java.util.Scanner;
public class Driver_DL extends RuntimeException{
	Driver_DL(String msg){
		super(msg);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the age");
		int age = s.nextInt();
		if(age>18) {
			System.out.println("You can apply for DL");
		}
		else {
			Driver_DL a1 = new Driver_DL("Drive cycle only");
			throw a1;
		}
	}
}
