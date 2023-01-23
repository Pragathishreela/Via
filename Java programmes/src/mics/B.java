package mics;

public class B {
	public static void main(String[] args) {
		int num = 153;
		int count = 0;
		int temp = num;
		int a = num;
		int sum = 0;
		int rem;
		while (num >0) {
			count++;
			num = num / 10;
		}
		while (temp > 0) {
			rem = temp % 10;
			sum = sum + power(rem,count);
			temp = temp / 10;
		}
		System.out.println(count);
		System.out.println(sum);

		if (sum == a) {
			System.out.println("It is a amstrong number");
		} else {
			System.out.println("It is not a amstrong number");
		}
	}
	public static int power(int number,int pow) {
		int result = 1;
		for(int i=1;i<=pow;i++) {
			result = result * number;
		}
		return result;
	}
}
