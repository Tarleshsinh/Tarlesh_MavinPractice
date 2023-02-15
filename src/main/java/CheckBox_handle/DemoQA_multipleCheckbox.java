package CheckBox_handle;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoQA_multipleCheckbox {
public WebDriver driver;
SoftAssert softassert = new SoftAssert();


@Test
public void Multiple_checkbox() throws Exception {
	
	
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2000));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	driver.get("https://demoqa.com/checkbox");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[@title='Expand all']//*[name()='svg']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@title='Collapse all']//*[name()='svg']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='rct-options']/child::button[1]//*[name()='svg']")).click();
	
	List<WebElement>checkboxes=driver.findElements(By.xpath("//span[@class='rct-checkbox']//*[name()='svg']"));
	System.out.println("This is the size of checkboxes-----" + checkboxes.size());
	
	//driver.findElement(By.xpath("//input[@id='tree-node-public']/following-sibling::span//*[name()='svg']")).click();
	
	for(int i=0; i<checkboxes.size(); i++) {
		checkboxes.get(i).click(); }
	
	//for(WebElement check: checkboxes)
	//{ check.click(); }
	//softassert.assertTrue(driver.findElement(By.xpath("//span[@class='text-success' and contains(text(),'desktop')]")).isDisplayed());
	 //String text =driver.findElement(By.xpath("//span[@class='text-success' and contains(text(),'desktop')]")).getText();
	//System.out.println("This is the text----------" +text);
	driver.quit();
	
	softassert.assertAll();

}
}
