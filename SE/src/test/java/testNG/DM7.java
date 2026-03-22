package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DM7 {

	WebDriver d;
	
	@BeforeMethod
	void sd1() {

	}

	@Test(dataProvider="dp")
	void sd(String email, String pwd) {
		WebDriverManager.chromedriver().setup();
		 d = new ChromeDriver();
		d.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		d.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys(email);
		d.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys(pwd);
		d.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();

	}

	@DataProvider(name = "dp")
	Object[][] login() {
		Object data[][] = { 
				{ "user23@gmail.com", "test23" }, 
				{ "user24@gmail.com", "test23" },
				{ "pavanol123@gmail.com", "test@123" } 
				};
		return data;
	}

	@AfterMethod
	void sd2() {

	}
}
