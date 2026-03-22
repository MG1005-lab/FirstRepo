package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;

public class DEMO {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.navigate().to("https://www.onlinesbi.sbi/");
		Thread.sleep(2000);
		d.navigate().to("https://www.selenium.dev/");
		Thread.sleep(2000);
		d.navigate().to("https://restful-booker.herokuapp.com/");
		d.navigate().back();
		Thread.sleep(2000);
		d.navigate().forward();
		Thread.sleep(2000);

		 String s= d.getTitle();
		 String k= d.getCurrentUrl();
		 System.out.println(s);
		 System.out.println(k);

		 

	}

}
