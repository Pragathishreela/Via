package Mynotes;

public class Swappingwithouttem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		System.out.println("before swapping " + a +" "+ b);
		a = a + b;
		a = a - b;
		b = a + a; 
		
		System.out.println(a);
		

	}

}
