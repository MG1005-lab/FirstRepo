package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;



public class Pages{
	 WebDriver d;
	public Pages(WebDriver d) {
		this.d = d;
		PageFactory.initElements(d, this);
	}

	@FindBy(xpath="(//input[@class=\"input_error form_input\"])[1]")
	 WebElement usr;

	@FindBy(xpath = "(//input[@class=\"input_error form_input\"])[2]")
	 WebElement pwd;

	@FindBy(xpath = "//input[@class=\"submit-button btn_action\"]")
	 WebElement Btn;

	
	
public 	void p1() throws InterruptedException{
	
	
		usr.sendKeys("standard_user");
		 Thread.sleep(3000);;
		
		pwd.sendKeys("secret_sauce");
	
		Btn.click();


}
}