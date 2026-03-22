package testNG;

import org.testng.annotations.Test;

public class DM6 {

	                                        // Grouping  // xml file
	@Test(groups= {"Regression"})
	void Ruppes() {
		System.out.println("Ruppes");
	}

	@Test(groups= {"Regression"})
	void Dollers() {
		System.out.println("Dollers");
	}

	

}
