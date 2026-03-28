package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DM2 {

	@BeforeSuite        //Annotation    // xml file
	void bs() {
		System.out.println("Before Suite");
	}

	@BeforeTest
	void bt() {
		System.out.println("Before Test");
	}

	@BeforeClass
	void bc() {
		System.out.println("Before Class");

	}

	@BeforeMethod
	void bm() {
		System.out.println("Before Method");
	}

	@Test
	void t1() {
		System.out.println("Test1");
	}

	@AfterMethod
	void am() {
		System.out.println("After Method");
	}

	@AfterClass
	void ac() {
		System.out.println("After Class");

	}

	@AfterTest
	void at() {
		System.out.println("After Test");
	}

	@AfterSuite
	void as() {
		System.out.println("After Suite");
	}

}
