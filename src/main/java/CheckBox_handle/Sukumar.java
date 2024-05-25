package CheckBox_handle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sukumar {

	public WebDriver driver;
	
	
	@Test
	public void method () throws Exception {
		 ChromeOptions options = new ChromeOptions();
	    // Add any necessary options here
	    options.addArguments("--remote-allow-origins=*");
	    options.addArguments("--start-maximized"); // Maximize window
	    options.addArguments("--disable-extensions"); // Disable extensions
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Sarthak Selenium\\Browsers drivers\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("HDMI splitter");
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();



		driver.quit();

		



		
	}
	
	
}
