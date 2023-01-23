package basics;

import org.openqa.selenium.opera.OperaDriver;

public class LanchEmptyOperaBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		System.setProperty("webdriver.opera.driver","./drivers/operadriver.exe");
	OperaDriver driver = new OperaDriver();
	}

}
