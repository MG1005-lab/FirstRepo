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

import junit.framework.Assert;

public class DM3 {
	
	@Test
	void HardAssert() {
		
		
		Assert.assertEquals("MG","MG");
		Assert.assertNotSame(123,456);      //Hard Assersation
		Assert.assertTrue(1==1);//if asert fail not execute other statement
		Assert.assertFalse(1==2);
		
		Assert.assertNull(null);
		Assert.assertNotNull(3);
		
		
	}
	@Test
	void SoftAssert() {
	//	SoftAssert k = new  SoftAssert();
		//k.assertEquals("MG","MJ");
		//k.assertAll();
	
		
		
		
		
		
	}
	
	
	
	
	
	
	
	

	}
