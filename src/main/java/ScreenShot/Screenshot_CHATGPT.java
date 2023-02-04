package ScreenShot;



import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot_CHATGPT {
  
	public static WebDriver driver;
	public static void main(String[] args) {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com");
	  
    try {
      Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
      Rectangle screenRectangle = new Rectangle(screenSize);
      Robot robot = new Robot();
      BufferedImage image = robot.createScreenCapture(screenRectangle);
      ImageIO.write(image, "png", new File("screenshots/ChatGpt.png"));
    } catch (Exception e) {
      e.printStackTrace();
      
      driver.close();
    }
  }
}



