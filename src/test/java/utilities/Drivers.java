package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drivers {
 static WebDriver driver;

public static WebDriver getDriver() {
	 if(driver != null) {
		 //comment another comment
		 //comment
         return driver;  // if the driver object was created before, 
         //it’s not null so it will return driver and the code will be terminated 
	 }
//     } else {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	return driver; 
}
}




