package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DEMO99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.get("https://omayo.blogspot.com/");
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		d.findElement(By.xpath("//*[@id=\"alert1\"]")).click();
		String s = d.switchTo().alert().getText();
		System.out.println(s);
		// d.findElement(By.xpath("//*[@id=\"ta1\"]")).sendKeys("Manik");

	}

}
