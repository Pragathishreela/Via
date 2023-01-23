package AdvanceSelenium;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToExploreOnDependencyOnMethods {
	@Test
	public void createAccount() {
		Reporter.log("from create account",true);
	}
	@Test(priority = -1,dependsOnMethods  = {"register","createAccount"})
	public void modifyAccount() {
		Reporter.log("from create account",true);
	}
	@Test
	public void register() {
		Reporter.log("from create account",true);
	}
	@Test
	public void deleteAccount() {
		Reporter.log("from create account",true);
	}
	@Test
	public void transferAccount() {
		Reporter.log("from create account",true);
	}
}