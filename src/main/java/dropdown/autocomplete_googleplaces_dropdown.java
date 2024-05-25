package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class autocomplete_googleplaces_dropdown {
public WebDriver driver;

@Test
public void GoogleAutoComplete () throws Exception {
	ChromeOptions options = new ChromeOptions();
    // Add any necessary options here
    options.addArguments("--remote-allow-origins=*");
    options.addArguments("--start-maximized"); // Maximize window
    options.addArguments("--disable-extensions"); // Disable extensions
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Sarthak Selenium\\Browsers drivers\\chromedriver.exe");
    WebDriver driver = new ChromeDriver(options);
    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // Change the duration to 20 seconds
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // Change the duration to 20 seconds
    driver.manage().deleteAllCookies();
	driver.get("https://www.costco.com/");
	driver.manage().window().maximize();
	
	
	WebElement search = driver.findElement(By.id("search-field"));
	search.clear();
	search.sendKeys("recliners");
	
	String text;
	do {
		search.sendKeys(Keys.ARROW_DOWN);
		text= search.getAttribute("value");
		System.out.println(text + "This is the get attirubte text ");
		if(text.equals("recliner sofa")) {
			search.sendKeys(Keys.ENTER);
			break;
			
		}
	}
	while(!text.isEmpty());
	driver.findElement(By.xpath("//h1[contains(text(),'recliner sofa')]")).isDisplayed();
	driver.quit();
}


}
