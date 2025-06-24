//dropdown using Select Class

package Selenium1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example7Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		String URL="https://www.amazon.in/";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.get(URL);
		//creating obj of Select class and passing dropdown
		WebElement dropdown1=driver.findElement(By.id("searchDropdownBox"));
		Select dropdown=new Select(dropdown1);
		dropdown.selectByVisibleText("Books");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);

	}
}
