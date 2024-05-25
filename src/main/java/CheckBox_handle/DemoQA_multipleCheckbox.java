package CheckBox_handle;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoQA_multipleCheckbox {
public WebDriver driver;
SoftAssert softassert = new SoftAssert();


@Test
public void Multiple_checkbox() throws Exception {
	
	
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
	driver.get("https://demoqa.com/checkbox");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[@title='Expand all']//*[name()='svg']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@title='Collapse all']//*[name()='svg']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='rct-options']/child::button[1]//*[name()='svg']")).click();
	
	List<WebElement>checkboxes=driver.findElements(By.xpath(" //span[@class='rct-checkbox']"));
	System.out.println("This is the size of checkboxes-----" + checkboxes.size());
	
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//label[@for='tree-node-home']//span[@class='rct-checkbox']//*[name()='svg']")).click();
	
	for(int i=0; i<checkboxes.size(); i++) {
		checkboxes.get(i).click(); }
	
	for(WebElement check: checkboxes)
	{ check.click(); }
	softassert.assertTrue(driver.findElement(By.xpath("//span[@class='text-success' and contains(text(),'desktop')]")).isDisplayed());
	 String text =driver.findElement(By.xpath("//span[@class='text-success' and contains(text(),'desktop')]")).getText();
	System.out.println("This is the text----------" +text);
	driver.close();
	
	softassert.assertAll();

}
}
