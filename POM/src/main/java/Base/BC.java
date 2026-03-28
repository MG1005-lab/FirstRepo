package Base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BC 
{
	public WebDriver d;
	  
   @BeforeMethod
	void Browser1() {

		WebDriverManager.chromedriver().setup();
	  d = new ChromeDriver();
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        System.out.println("Browser launch");
	}
	
   @AfterMethod
	void closed() {
	   if (d != null) {
           d.quit(); // Changed to quit() to properly close the session
       }
		System.out.println("Done");

	}
	
	
	
	
}
