package CSS_Value_Validate_Text_Colour;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.Color;
import org.testng.annotations.Test;

import graphql.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class How_To_Verify_The_Element_colour {

	public WebDriver driver;
	
	@Test
	public void verifycolour () {
		
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
		driver.get("https://www.blazedemo.com");
		WebElement B=driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
		String bckgroundcolour=B.getCssValue("background-color");
		System.out.println(bckgroundcolour);
		
		String Hexavalue=Color.fromString(bckgroundcolour).asHex();
		System.out.println(Hexavalue);
		
		
		  if (Hexavalue.equals("#006dcc"))
		  System.out.println("Test for colour validation is PASSED"); else
		  System.out.println("Test for colour validation is failed");
		 
		 
		
		Assert.assertTrue(Hexavalue.contains("#006dcc"));
		
		driver.quit();
		
		
	}
	
	
	
}
