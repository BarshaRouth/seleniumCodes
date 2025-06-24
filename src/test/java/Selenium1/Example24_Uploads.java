package Selenium1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example24_Uploads {
    public static void main(String[] args) throws AWTException {
        // Set the path to the ChromeDriver executable (update path as needed)
//        System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/file.xhtml");
        driver.manage().window().maximize();

        // Locate the file upload button
        WebElement uploadButton = driver.findElement(By.xpath("//*[@id='j_idt88:j_idt89']/span[1]"));
        uploadButton.click();

        // Path to the file that needs to be uploaded
        String filePath = "C:\\Users\\Admin\\Downloads\\Test.xlsx";

        // Copy file path to clipboard
        StringSelection selection = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

        // Simulate keyboard events to paste the file path and press Enter
        Robot robot = new Robot();
        robot.delay(2000);  // Wait for the file dialog to open

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        System.out.println("File uploaded successfully.");

        // Close the driver
        driver.quit();
    }
}
