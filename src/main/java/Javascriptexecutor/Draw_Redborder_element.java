package Javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Draw_Redborder_element {
	public WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();

driver.get("https://www.amazon.com");
driver.manage().window().maximize();

JavascriptExecutor js = (JavascriptExecutor) driver;
WebElement element = driver.findElement(By.id("nav-logo-sprites"));
js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');", element);

		
		
		
		
		
	}

}
