package Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DEMO3 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.get("https://www.selenium.dev/");
		
	//	Dimension k = new Dimension(100, 500);
		//d.manage().window().setSize(k);
		
		Point p= new Point(100,500);
		d.manage().window().setPosition(p);
		
		
		
	}

}
