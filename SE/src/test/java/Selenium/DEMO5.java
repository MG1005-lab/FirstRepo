package Selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DEMO5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.get("https://www.irctc.co.in/nget/train-search");
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		File k = ((TakesScreenshot) d).getScreenshotAs(OutputType.FILE);
		Files.copy(k, new File("C:\\Users\\mohin\\Downloads\\SSC\\AMZ.png"));

	}

}
