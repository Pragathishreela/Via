package Abstarction;

abstract public class Login {
	void username() {
		System.out.println("Username");
	}
	void password() {
		System.out.println("Password");
	}
	void forgot_password() {
		System.out.println("Username");
	}
	abstract void login_link();	
	abstract void submit_button();
}
