//pg12
//Textbox scenerio to automate

package Selenium1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		String Url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(Url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		driver.manage().window().maximize();
		WebElement username1 = driver.findElement(By.name("username"));
		WebElement password1 = driver.findElement(By.name("password"));
		username1.sendKeys("Admin");
		password1.sendKeys("admin123");
		System.out.println("Text Field Values Set");
		Thread.sleep(2000);

		// Delete Text Field Values
		//username1.clear();
		//password1.clear();
		username1.sendKeys(Keys.CONTROL + "a");
		username1.sendKeys(Keys.DELETE);
		password1.sendKeys(Keys.CONTROL + "a");
		password1.sendKeys(Keys.DELETE);
		System.out.println("Text Field Values deleted");

		// Find the Login button & Click
		WebElement submit = driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		username1.sendKeys("Admin");
		password1.sendKeys("admin123");
		submit.click();
		System.out.println("Login Button Clicked");

		// Find the Logout button & Click
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/p")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[3]/ul/li/ul/li[4]/a")).click();

	}

}
