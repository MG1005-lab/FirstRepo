package testNG;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class DM4 {
	
	@Test                   //depends on methods
	void open() {
		Assert.assertEquals(1,1);
	}
	@Test(dependsOnMethods= {"open"})
	void login() {
		Assert.assertEquals(1,2);
	}
	@Test(dependsOnMethods= {"login"})
	void search() {
		Assert.assertEquals(1,1);
	}
	
	@Test(dependsOnMethods= {"open"})
	void logout() {
		Assert.assertEquals(1,1);
	}
	
	
	
	

}
