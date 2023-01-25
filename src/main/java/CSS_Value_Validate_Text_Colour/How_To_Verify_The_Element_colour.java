package CSS_Value_Validate_Text_Colour;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.annotations.Test;

import graphql.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class How_To_Verify_The_Element_colour {

	public WebDriver driver;
	
	@Test
	public void verifycolour () {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.blazedemo.com");
		WebElement B=driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
		
		String bckgroundcolour=B.getCssValue("background-color");
		System.out.println(bckgroundcolour);
		
		String Hexavalue=Color.fromString(bckgroundcolour).asHex();
		System.out.println(Hexavalue);
		
		/*
		 * if (Hexavalue.equals("#006dcc"))
		 * System.out.println("Test for colour validation is PASSED"); else
		 * System.out.println("Test for colour validation is failed");
		 */
		 
		
		Assert.assertTrue(Hexavalue.contains("#006dcc"));
		
		driver.close();
		
		
	}
	
	
	
}
