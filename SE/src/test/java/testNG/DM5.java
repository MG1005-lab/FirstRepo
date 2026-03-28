package testNG;

import org.testng.annotations.Test;

public class DM5 {
	
	             //Grouping    xml file
	@Test(groups= {"sanity"})
	void email() {
		System.out.println("Email");
	}
	
	@Test(groups= {"sanity"})
	void facebook() {
		System.out.println("Fb");
	}
	
	@Test(groups= {"sanity"})
	void twitter() {
		System.out.println("Twitter");
	}

}
