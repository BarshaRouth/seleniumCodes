package Selenium1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Example20_SingleWindowopen {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/window.xhtml");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.manage().window().maximize();

        // Store the current (parent) window handle
        String oldWindow = driver.getWindowHandle();
        System.out.println("Parent Window Handle: " + oldWindow);

        // Find the "New Window" button and click it to open a new window
        WebElement firstButton = driver.findElement(By.xpath("//*[@id='j_idt88:new']/span"));
        firstButton.click();

        // Get all the open window handles (parent + newly opened window)
        Set<String> handles = driver.getWindowHandles();
        System.out.println("Window Handles: " + handles);

        // Loop through all handles and switch to the new window
        for (String newWindow : handles) {
            driver.switchTo().window(newWindow);
        }

        // Now Selenium is inside the new window
        // Find the email textbox and type an email address
        WebElement textBox = driver.findElement(By.xpath("//*[@id='email']"));
        textBox.sendKeys("mcavit@gmail.com");
    }
}
