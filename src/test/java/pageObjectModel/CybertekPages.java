package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Drivers;



public class CybertekPages {

	WebDriver driver;
	 public CybertekPages() {
		 driver=Drivers.getDriver();
		PageFactory.initElements(driver, this);

	}
//	adding some comments
	 
	
	@FindBy (name="SingleLine")
	public WebElement firstName;
	
	@FindBy (name="SingleLine2")
	public WebElement lastName;
	
	
	
	
	
	
}
