package handling_Frame;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameExample {
public WebDriver driver;
    public static void main(String[] args) {
    	WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        
        // Navigate to the website with iframes
        driver.get("https://www.guru99.com/handling-iframes-selenium.html");
        
        // Switch to the first iframe using its name attribute
        driver.switchTo().frame("a077aa5e");
        
        // Find and click the first link within the first iframe
        WebElement link1 = driver.findElement(By.xpath("html/body/a/img"));
        link1.click();
        
        // Switch to the default content to access elements outside of the iframe
        driver.switchTo().defaultContent();
        
        // Switch to the second iframe using its index (zero-based)
        driver.switchTo().frame(1);
        
        // Find and click the first link within the second iframe
        WebElement link2 = driver.findElement(By.xpath("/html/body/a/img"));
        link2.click();
        
        // Switch back to the default content to access elements outside of the iframe
        driver.switchTo().defaultContent();
        
        // Close the browser
        driver.quit();
    }

}
