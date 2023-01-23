package Inheritance;

public class Modify extends Login_page {
	void password() {
		System.out.println("Password-1");
	}
	public static void main(String[] args) {
		/*Login_page a1 = new Login_page();
		Modify a2 = new Modify();
		a1 = a2;
		a1.password();*/
		/*Modify a1 = new Modify();
		a1.password();*/
		Login_page a1 = new Modify();
		a1.password();
	}
}
