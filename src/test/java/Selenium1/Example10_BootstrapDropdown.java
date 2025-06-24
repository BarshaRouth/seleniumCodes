package Selenium1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example10_BootstrapDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		String URL = "https://www.hdfc.com/";
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.manage().window().maximize();
		WebElement housingdropdown=driver.findElement(By.xpath("//*[@id=\"container-91af4cb463\"]/div/div[1]/div"));
		housingdropdown.click();
		WebElement refinanceoptionElement = driver.findElement(By.xpath("//*[@id=\"productType\"]/li[4]"));
		refinanceoptionElement.click();
		WebElement product =driver.findElement(By.xpath("//*[@id=\"container-91af4cb463\"]/div/div[2]/div"));
		product.click();
		WebElement plotoption =driver.findElement(By.xpath("// *[@id=\'productName\']/li[2]")); 
		plotoption.click();
	}

}
