package handling_Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handling_FrameNaveen {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.switchTo().frame("SingleFrame");
		driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();
		WebElement outeriframe= driver.findElement(By.xpath("//*[@id=\'Multiple\']/iframe"));
		driver.switchTo().frame(outeriframe);
		
		
		
		WebElement innerframe= driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Welcome");
		driver.close();
		
		
	}

}
