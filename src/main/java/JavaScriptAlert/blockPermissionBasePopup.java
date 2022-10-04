package JavaScriptAlert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class blockPermissionBasePopup {
public WebDriver driver;

@Test
public void Block_permissionBasePopup_Pawan() {
	
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--disable-notifications");
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver(option);
	driver.manage().window().maximize();
	driver.get("https://www.redbus.in/");
	
	
}

}
