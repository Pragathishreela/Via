package Mynotes;

public class reverse10numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for loop for reversing
		int a = 5;
		for(int i=10;i>=1;i--)
			System.out.println(i);
		//while loop 
		int b=10;
		while(b>10)
			System.out.println(b--);
		//sum of first 10 numbers
		int c=1;
		int sum=0;
		while (c<=10) {
			sum=sum+c;
			c++;
			
		}
		System.out.println(sum);
		
	}

}
