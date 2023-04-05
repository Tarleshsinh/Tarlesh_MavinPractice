package JavaScript_Executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ZoomOUT_ZoomIn_NavennAutomation {

	public WebDriver driver;

	@Test
	public void ZOOMOUT () {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		//String AmazonChrome = ("document.body.style.zoom='150%'");
		js.executeScript("document.body.style.zoom='150%'");
		
		js.executeScript("document.body.style.zoom='250%'");
		
		js.executeScript("document.body.style.zoom='10%'");
		
		js.executeScript("document.body.style.zoom='100%'");
		
		js.executeScript("document.body.style.zoom='10%'");
		
		driver.close();
		
	}
	
	
}
