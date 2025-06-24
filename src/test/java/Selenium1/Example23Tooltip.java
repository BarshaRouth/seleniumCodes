package Selenium1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example23Tooltip {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.google.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        WebElement name = driver.findElement(By.xpath("//*[@id='APjFqb']"));
        String toolTipText = name.getAttribute("title");

        System.out.println("Tool Tip Text: " + toolTipText);

        driver.quit();
    }
}
