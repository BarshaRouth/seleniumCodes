package Selenium1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Get total number of windows opened and close all child windows
public class Example21 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/window.xhtml");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        // Get parent window handle
        String oldWindow = driver.getWindowHandle();
        System.out.println("Parent Window Handle: " + oldWindow);
        // Open Multiple windows by clicking the button
        WebElement openMultiple = driver.findElement(By.xpath("//*[@id='j_idt88:j_idt91']"));
        openMultiple.click();
        // Wait for new windows to open
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Get total number of windows opened
        Set<String> allWindowHandles = driver.getWindowHandles();
        int numOfWindows = allWindowHandles.size();
        System.out.println("Number of Windows Opened: " + numOfWindows);
        System.out.println("All Window Handles: " + allWindowHandles);

        // Close all child windows except the parent
        for (String windowHandle : allWindowHandles) {
            if (!windowHandle.equals(oldWindow)) {
                driver.switchTo().window(windowHandle); // Switch to child window
                System.out.println("Closing Window: " + driver.getTitle());
                driver.close(); // Close the child window
            }
        }

        // Switch back to the parent window
        driver.switchTo().window(oldWindow);
        System.out.println("Back to Parent Window: " + driver.getTitle());

        // (Optional) Close the parent window if needed
        // driver.quit();  // This will close all remaining windows including parent
    }
}
