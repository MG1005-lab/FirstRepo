package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DEMO6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_confirm");
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// d.switchTo().frame("iframeResult");

		//WebElement k = d.findElement(By.xpath("//iframe[@id='iframeResult']"));
		Thread.sleep(3000);
		d.switchTo().frame("iframeResult");
		d.findElement(By.xpath("/html/body/button")).click();

	}

}
