package Abstarction;

public class Login1 extends Login{
	void login_link() {
		System.out.println("Link");
	}
	void submit_button() {
		System.out.println("submit");
	}
	public static void main(String[] args) {
		Login l1 = new Login1();
		l1.password();
	}

}
