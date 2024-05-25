package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScreenshotExample {
    public static void main(String[] args) {
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
        driver.get("https://www.bankofamerica.com");
        
        // Take the screenshot and save it to a file with a unique date timestamp
        for (int i = 1; i <= 1; i++) { // Save 5 screenshots (change the limit as needed)
            // Generate timestamp with milliseconds for unique filename (inside the loop)
            SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd_HHmmssSSS");
            String timestamp = formatter.format(new Date());

            // Take the screenshot
            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            try {
                // Specify the path where you want to save the screenshot with a unique filename (using timestamp and counter)
                String filePath = "C:\\Users\\Admin\\Desktop\\File_Compare\\Tarlesh" + timestamp + "_" + i + ".png";
                FileUtils.copyFile(screenshotFile, new File(filePath));
                System.out.println("Screenshot captured and saved successfully: " + filePath);
            } catch (IOException e) {
                System.out.println("Error while saving screenshot: " + e.getMessage());
            }
        }

        // Close the browser
        driver.quit();
    }
}