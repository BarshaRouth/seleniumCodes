package Selenium1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Example18_PromptAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        
        // Open URL
        String url = "https://testpages.herokuapp.com/styled/alerts/alert-test.html"; 
        driver.get(url); 
        
        // Maximize window
        driver.manage().window().maximize(); 
        
        // Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
        
        // Click on the prompt alert button
        WebElement promptBox = driver.findElement(By.id("promptexample")); 
        promptBox.click(); 
        
        // Switch to alert
        Alert promptAlert = driver.switchTo().alert(); 
        Thread.sleep(5000); 
        
        // Send text to the prompt alert
        promptAlert.sendKeys("HELLO"); 
        promptAlert.accept(); 
        
        // Page scroll down
        JavascriptExecutor jse = (JavascriptExecutor) driver; 
        jse.executeScript("window.scrollBy(0,250)"); 
        
        // Close the browser
        Thread.sleep(2000); // Let changes reflect before closing
        driver.quit();  
	}

}
