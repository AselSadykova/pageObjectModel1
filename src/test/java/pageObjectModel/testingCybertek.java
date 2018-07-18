package pageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilities.ConfigLoader;
import utilities.Drivers;

public class testingCybertek {

	//comment3
	
	@Test
	public void setUp() {
		Drivers.getDriver().get(ConfigLoader.getValue("url"));
		Drivers.getDriver().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		CybertekPages atrib= new CybertekPages();
	   WebElement iframe = Drivers.getDriver().findElement(By.xpath("(//iframe)[2]"));
	   Drivers.getDriver().switchTo().frame(iframe);
	   
	   atrib.firstName.sendKeys(ConfigLoader.getValue("name"));
	   atrib.lastName.sendKeys(ConfigLoader.getValue("lastName"));
	}
	
	
	
}
