package Selenium1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example22DragDrop {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.leafground.com/drag.xhtml");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();

        WebElement From = driver.findElement(By.xpath("//*[@id='form:drag_content']"));
        WebElement To = driver.findElement(By.xpath("//*[@id='form:drop_header']"));

        Actions actions = new Actions(driver);
        
        // Alternative method for drag and drop (commented out)
        // actions.clickAndHold(From).moveToElement(To).release(To).build().perform();
        
        Thread.sleep(5000);
        actions.dragAndDrop(From, To).build().perform();

        System.out.println("Successfully Dropped.");
        
        // Close the browser
        driver.quit();
    }
}
