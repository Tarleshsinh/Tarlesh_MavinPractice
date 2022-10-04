package keyboard_Actuions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multiplekey_action {

public WebDriver driver;
	
	
	@Test
	public void Multiplekey_operation () throws Exception {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://text-compare.com");
		driver.manage().window().maximize();
		Actions act= new Actions(driver);
		
		WebElement input1= driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		WebElement input2= driver.findElement(By.xpath("//textarea[@id='inputText2']"));
		
		input1.sendKeys("Welcome to Toronto");
		
		// Control A key Function 
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		
	// control C
		act.keyDown(Keys.CONTROL);
		act.sendKeys("x");
		act.keyUp(Keys.CONTROL);
		act.perform();

	// How to use Tab key
		
		act.sendKeys(Keys.TAB);
		act.perform();
		
	// How to use control v 
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();
	// Compare text 
		
	if (input1.getAttribute("value").equals(input2.getAttribute("value")))
		System.out.println("Text Copied ");
	else 
		System.out.println("Text not copied ");
	
	driver.quit();
	
	
	
	
	
	
	
	
	
	}
	
	
}
