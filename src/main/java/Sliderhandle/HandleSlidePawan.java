package Sliderhandle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleSlidePawan {
public WebDriver driver;

	
@Test	
public void SliderPawan () throws Exception {
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://demoqa.com/slider");
WebElement min_slider=driver.findElement(By.xpath("//div[@id='sliderContainer']/child::div[1]/child::span/child::input"));
System.out.println("Location of the Slider:"+min_slider.getLocation());
System.out.println("size of the location :" +min_slider.getSize());
Actions act = new Actions(driver);
act.dragAndDropBy(min_slider,0,100).perform();
//act.dragAndDropBy(min_slider, 10, 0).build().perform();
Thread.sleep(2000);
System.out.println("Location of the Slider------:"+min_slider.getLocation());
System.out.println("size of the location-------- :" +min_slider.getSize());


driver.quit();
		
		
		
		
	}
	
}
