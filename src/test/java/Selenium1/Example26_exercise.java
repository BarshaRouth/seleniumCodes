package Selenium1;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

public class Example26_exercise {
    public static void main(String[] args) {
        // Set up WebDriver
        WebDriver driver = new ChromeDriver();
        String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.name("username"));
        WebElement password = driver.findElement(By.name("password"));
        username.sendKeys("Admin");
        password.sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//span[text()='My Info']")).click();
        
        WebElement firstName = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div/div/div[2]/div[1]/div[2]/input"));
        firstName.sendKeys(Keys.CONTROL + "a"); 
	    firstName.sendKeys(Keys.BACK_SPACE);
        firstName.sendKeys("Levetia");
        
        WebElement middleName = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div/div/div[2]/div[2]/div[2]/input"));
        middleName.sendKeys(Keys.CONTROL + "a"); 
	    middleName.sendKeys(Keys.BACK_SPACE);
        middleName.sendKeys("Grash");
        
        WebElement lastName = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div/div/div[2]/div[3]/div[2]/input"));
        lastName.sendKeys(Keys.CONTROL + "a"); 
	    lastName.sendKeys(Keys.BACK_SPACE);
        lastName.sendKeys("Mashy");
        
        WebElement empId = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[1]/div[1]/div/div[2]/input"));
        empId.sendKeys(Keys.CONTROL + "a"); 
	    empId.sendKeys(Keys.BACK_SPACE);
        empId.sendKeys("E1234");
        
        WebElement otherId = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[1]/div[2]/div/div[2]/input"));
        otherId.sendKeys(Keys.CONTROL + "a"); 
	    otherId.sendKeys(Keys.BACK_SPACE);
        otherId.sendKeys("123456789");
        
        WebElement driverLicense = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/input"));
        driverLicense.sendKeys(Keys.CONTROL + "a"); 
	    driverLicense.sendKeys(Keys.BACK_SPACE);
        driverLicense.sendKeys("123A456");
        
        WebElement licenseExpiry = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[2]/div/div[2]/div/div/input"));
        licenseExpiry.sendKeys(Keys.CONTROL + "a"); 
        licenseExpiry.sendKeys(Keys.BACK_SPACE);
        licenseExpiry.sendKeys("2028-30-10");
        
        driver.findElement(By.xpath("//label[contains(text(),'Nationality')]/following::div[1]")).click();
        driver.findElement(By.xpath("//div[@role='option']//span[text()='Indian']")).click();
        
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[2]/div/div[2]/div/div")).click();
        driver.findElement(By.xpath("//div[@role='option']//span[text()='Married']")).click();
        
        WebElement dob = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[1]/div/div[2]/div/div/input"));
        dob.sendKeys(Keys.CONTROL + "a"); 
        dob.sendKeys(Keys.BACK_SPACE);
        dob.sendKeys("2003-24-04");
        
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/label")).click();
        
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/button")).click();
        
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div[1]/div/div[2]/div/div")).click();
        driver.findElement(By.xpath("//div[@role='option']//span[text()='O+']")).click();
        
        WebElement testField = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div[2]/div/div[2]/input"));
        testField.sendKeys(Keys.CONTROL + "a"); 
        testField.sendKeys(Keys.BACK_SPACE);
        testField.sendKeys("102");
        
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[2]/button")).click();
        
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/div/button")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div/form/div[1]/div/div/div/div[2]/div")).click();
        // Set clipboard data
//        String filePath = "C:\\Users\\kirua\\Downloads\\Sample.txt";
        String filePath ="C:\\Users\\despa\\OneDrive\\Desktop\\newTesting.txt";
        StringSelection selection = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

        
        Robot robot = null;
		try {
			robot = new Robot();
		} catch (AWTException e) {
			
			e.printStackTrace();
		}
        robot.delay(1000);
        
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        robot.delay(500);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div/form/div[3]/button[2]")).click();
    }
}