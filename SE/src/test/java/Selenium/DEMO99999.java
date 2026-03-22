package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DEMO99999 {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.get("https://login.salesforce.com/?locale=in");
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		d.findElement(By.id("username")).sendKeys("Rushi");
		d.findElement(By.name("pw")).sendKeys("Patil");
		d.findElement(By.className("button r4 wide primary")).click();
		
		

		
		

	}

}
