import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


public class ChromeBrowser_116_issue_Fixed {

	
	@Test 
	public  void ChromeDriverIssue () throws Exception  {
	
		ChromeOptions options = new ChromeOptions();
	    // Add any necessary options here
	    options.addArguments("--remote-allow-origins=*");
	    //options.addArguments("--start-maximized"); // Maximize window
	    options.addArguments("--disable-extensions"); // Disable extensions
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Sarthak Selenium\\Browsers drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver(options);
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // Change the duration to 20 seconds
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // Change the duration to 20 seconds
	    driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.com/");
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		driver.quit();
		

	}

}
