package Selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DEMO4 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.get("https://www.irctc.co.in/nget/train-search");
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		d.findElement(By.xpath("//*[@id=\"stayIcon\"]/a/span")).click();

		Set<String> h = d.getWindowHandles();
		Iterator<String> p = h.iterator();

		String j = p.next();

		d.switchTo().window(j);
		d.findElement(By.xpath("/html/body/app-root/app-home/div[1]/div[3]/div/div/div/ul/li[3]/a/i")).click();

	}

}
