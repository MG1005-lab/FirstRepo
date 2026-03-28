package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;

public class DEMO2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		Thread.sleep(2000);
		d.get("https://retail.onlinesbi.sbi/retail/login.htm");

		String s = d.getTitle();
		String k = d.getCurrentUrl();
		System.out.println(s);
		System.out.println(k);
		d.close();
	}

}
