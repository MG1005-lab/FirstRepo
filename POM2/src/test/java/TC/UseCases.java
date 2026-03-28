package TC;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


//import Base.BC;
import POM.Pages;
import io.github.bonigarcia.wdm.WebDriverManager;


public class UseCases {
	
	
  @Test
	 void tc1() throws InterruptedException{
	  

		WebDriverManager.chromedriver().setup();
		WebDriver  d = new ChromeDriver();
		d.get("https://www.saucedemo.com/");
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
      System.out.println("Browser launch");

	  Pages k = new Pages(d);
		k.p1();
		System.out.println("TC Passed");

	}

	

}
