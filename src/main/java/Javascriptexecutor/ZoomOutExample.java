package Javascriptexecutor;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ZoomOutExample {
public WebDriver driver;

    public static void main(String[] args) throws Exception {

       WebDriverManager.chromedriver().setup();
       ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
       
        // Create an instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Navigate to the webpage
        driver.get("https://www.amazon.com");
driver.manage().window().maximize();

        // Zoom out the web page by 200%
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("document.body.style.zoom = '200%'");
        Thread.sleep(2000);
        
        jsExecutor.executeScript("document.body.style.zoom = '50%'");
        Thread.sleep(2000);
        // Close the browser
        driver.quit();
    }}