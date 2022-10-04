package keyboard_Actuions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyboard_Actions {

	public WebDriver driver;
	
	
	@Test
	public void keyboardaction( ) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/key_presses");
		
		Actions act= new Actions(driver);
		
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		
		act.sendKeys(Keys.DELETE).perform();
		Thread.sleep(2000);
		
		act.sendKeys(Keys.SPACE).perform();
		Thread.sleep(2000);
		
		act.sendKeys(Keys.BACK_SPACE);
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
