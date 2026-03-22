package testNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DM999  {

	WebDriver d;

	@BeforeMethod
	void Browser() {

		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver();
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        System.out.println("Browser launch");
	}

	@Test
	void t1() throws InterruptedException {

		DM99 k = new DM99(d);
		k.sd();
		System.out.println("TC Passed");

	}

	@AfterMethod
	void closed() {
		System.out.println("Done");

	}

}
