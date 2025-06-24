package Selenium1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Example19_IframesHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
	        String Url = "https://www.leafground.com/frame.xhtml";
	        driver.get(Url);
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	        driver.manage().window().maximize();
	        
	        // Find total number of Frames
	        driver.switchTo().defaultContent();
	        List<WebElement> totalFrames = driver.findElements(By.tagName("iframe"));
	        int size = totalFrames.size();
	        System.out.println("Total no of Frames: " + size);
	        
	        // Access Frames
	        driver.switchTo().frame(0);
	        WebElement button1 = driver.findElement(By.id("Click"));
	        button1.click();
	        String text = driver.findElement(By.id("Click")).getText();
	        System.out.println(text);
	        
	        // Access Nested frames
	        driver.switchTo().defaultContent(); // Switch back to main web page
	        driver.switchTo().frame(2);
	        driver.switchTo().frame("frame2");
	        WebElement button2 = driver.findElement(By.xpath("//*[@id='Click']"));
	        button2.click();
	        String text1 = driver.findElement(By.xpath("//*[@id='Click']")).getText();
	        System.out.println(text1);
	        
	        driver.switchTo().defaultContent(); // Switch back to main web page

	}
}
