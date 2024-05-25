package Javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Draw_Redborder_element {
	public WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

driver.get("https://www.amazon.com");
driver.manage().window().maximize();

JavascriptExecutor js = (JavascriptExecutor) driver;
WebElement element = driver.findElement(By.id("nav-logo-sprites"));
js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid blue;');", element);
	
		//driver.quit();
	}

}
