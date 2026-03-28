package testNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DM8 {

	// Browser       //Parallel Testing  xml file
	WebDriver d;

	@BeforeMethod
	void sd1() {

	}

	@Test()
	@Parameters({ "browser" })
	void sd(String br) {

		switch (br) {

		case "chrome":	d = new ChromeDriver();break;
		case "edge":    d = new EdgeDriver();break;

		default:
			System.out.println("Invalid Browser");
			return;
		}

		WebDriverManager.chromedriver().setup();

		d.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}
}
