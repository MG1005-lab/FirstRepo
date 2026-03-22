package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DEMO7 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		d.switchTo().frame("iframeResult");

		WebElement k = d.findElement(By.xpath("//*[@id=\"cars\"]"));

		Select s = new Select(k);
		s.selectByVisibleText("Saab");

	}

}
