package mics;
public class C {
	public static void main(String[] args) {
		System.out.println(power(2,4));
	}
	public static int power(int number,int pow) {
		int result = 1;
		for(int i=1;i<=pow;i++) {
			result = result * number;
		}
		return result;
	}
}
