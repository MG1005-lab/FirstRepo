package testNG;

import org.testng.annotations.Test;

public class DM1 {

	@Test // default priority= 0   xml file
	void open() {
		System.out.println("Open");
	}

	@Test(priority = -1)
	void login() {
		System.out.println("Login");

	}

	@Test
	void logout() {
		System.out.println("Logout");

	}

}
