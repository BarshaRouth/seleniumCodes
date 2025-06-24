package Selenium1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example17_confirmationAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver(); // Initialize WebDriver
        String url = "https://testpages.herokuapp.com/styled/alerts/alert-test.html"; 
        driver.get(url); // Open URL
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Fixed syntax

        // Locate and click the 'Show confirm box' button
        WebElement confirmBox = driver.findElement(By.id("confirmexample")); 
        confirmBox.click();
        Thread.sleep(5000); // Wait for alert to appear

        // Switch to the confirmation alert and accept (click OK)
        Alert confirmAlert = driver.switchTo().alert();
        confirmAlert.accept();
        Thread.sleep(3000); 
        // Page scroll down
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,250)");
        
        // Close browser
        driver.quit();
	}

}
