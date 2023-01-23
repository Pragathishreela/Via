package mics;

public class A {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			int result = (int) Math.pow(i, 2);
			sum = sum + result;
		}
		System.out.println(sum);
	}

}
