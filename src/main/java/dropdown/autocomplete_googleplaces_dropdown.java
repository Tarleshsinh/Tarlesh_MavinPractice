package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import graphql.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class autocomplete_googleplaces_dropdown {
public WebDriver driver;

@Test
public void GoogleAutoComplete () {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2000));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	
	WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
	search.clear();
	search.sendKeys("recliners for");
	
	String text;
	do {
		search.sendKeys(Keys.ARROW_DOWN);
		text= search.getAttribute("value");
		System.out.println(text + "This is the get attirubte text ");
		if(text.equals("recliners for kids")) {
			search.sendKeys(Keys.ENTER);
			break;
		}
	}
	while(!text.isEmpty());
	driver.findElement(By.xpath("//span[contains(text(),'recliners for kids')]")).isDisplayed();
	driver.quit();
}


}
