package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DM99 {

	WebDriver d;

	DM99(WebDriver d) {
		this.d = d;

		PageFactory.initElements(d, this);
	}

	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
	WebElement usr;

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
	WebElement pwd;

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	WebElement Btn;

	void sd() throws InterruptedException {
		usr.sendKeys("Admin");
		Thread.sleep(3000);
		pwd.sendKeys("admin123");
		Btn.click();
	}

}
