package Selenium1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example16_AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();  // Initialize WebDriver
        String url = "https://testpages.herokuapp.com/styled/alerts/alert-test.html"; 
        driver.get(url);  // Open the URL
        driver.manage().window().maximize(); 
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  // Set implicit wait

        // Locate the button that triggers the alert
        WebElement alertBox = driver.findElement(By.id("alertexamples")); 
        alertBox.click(); // Click the button

        // Wait to ensure the alert is displayed
        Thread.sleep(5000); 

        // Switch to the alert box and accept it (click OK)
        Alert alert = driver.switchTo().alert(); 
        alert.accept();  // Click "OK" on the alert

        // Close the browser
        driver.quit();
	}

}
