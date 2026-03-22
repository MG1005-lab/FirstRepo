package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DEMO8 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.get("https://jqueryui.com/droppable/");
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement s = d.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		//d.switchTo().frame(s);
		WebElement k = d.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement j = d.findElement(By.xpath("//*[@id=\"droppable\"]"));

		Actions a = new Actions(d);
		a.clickAndHold(k).moveToElement(j).release().build().perform();

	}

}
