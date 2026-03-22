package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	WebDriver d;
	
	void sde() {
		WebDriverManager.chromedriver().setup();
		 d = new ChromeDriver();
		d.get("https://www.onlinesbi.sbi/");
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	boolean b=	d.findElement(By.id("personal_icon")).isDisplayed();
	System.out.println(b);
	 
	d.findElement(By.className("classicTxt px-0")).click();
	
	
	
	
	
	
	}
	public static void main(String[] args) {
		
		Locators k= new Locators();
		k.sde();
	}

}
