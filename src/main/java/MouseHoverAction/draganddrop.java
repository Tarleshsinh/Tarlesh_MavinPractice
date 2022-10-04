package MouseHoverAction;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class draganddrop {

	public static WebDriver driver;
	
	
	@Test
	public void mousehoverpawan() throws Exception {
		 WebDriverManager.chromedriver().setup();
		 //ChromeOptions option= new ChromeOptions();
		 //option.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
		 //option.setExperimentalOption("--disable-extention", Arrays.asList("disable-popup-blocking"));
		 //option.addArguments("--disable-extentions");
		 driver= new ChromeDriver();
		 driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2000));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		 
		 
		driver.get("https://www.globalsqa.com/demo-site/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[starts-with(text(),'DragAndDrop')]")).click();
		Thread.sleep(2000);
		String handle= driver.getWindowHandle();
		driver.switchTo().window(handle);
	    driver.switchTo().alert().dismiss();
		//alert.dismiss();
		driver.findElement(By.xpath("//li[@id='Photo Manager']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		WebElement item1=driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement item2= driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		
		WebElement trash=driver.findElement(By.xpath("//h4[@class='ui-widget-header']"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(item1, trash).build().perform();
		act.dragAndDrop(item2, trash).build().perform();
		driver.quit();
		
		
		
		
		
	}
	
	
	
	
	
	
}
