package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DEMO999 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.get("https://omayo.blogspot.com/");
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement a = d.findElement(By.xpath("//*[@id=\"alert1\"]"));

		if (a.isDisplayed()) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
		}

		WebElement h = d.findElement(By.xpath("//*[@id=\"but2\"]"));
		h.isEnabled();
		System.out.println("Enabled");


		WebElement p = d.findElement(By.xpath("//*[@id=\"checkbox1\"]"));
		p.isSelected();
		System.out.println("Done");

	}

}
