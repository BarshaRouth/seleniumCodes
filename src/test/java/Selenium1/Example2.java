package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		WebElement textBox=driver.findElement(By.xpath("//*[@id=\"j_idt88:name\"]"));
		textBox.sendKeys("VIT");
//		*[@id="j_idt88:j_idt99"]
		

        // 1. Enter text in email input field
        WebElement emailBox = driver.findElement(By.xpath("//*[@id='j_idt88:j_idt99']"));
        emailBox.sendKeys("barsha@gmail.com");

        // 2. Append text to a field
        WebElement appendBox = driver.findElement(By.xpath("//*[@id='j_idt88:j_idt91']"));
        appendBox.sendKeys("Asansol");

        // 3. Retrieve text from an input field
        WebElement retrieveText = driver.findElement(By.xpath("//*[@id='j_idt88:j_idt97']"));
        String value = retrieveText.getAttribute("value");
        System.out.println("Retrieved Text: " + value);

        // 4. Clear input field
        WebElement clearBox = driver.findElement(By.xpath("//*[@id='j_idt88:j_idt95']"));
        clearBox.clear();

        // 5. Check if an input field is disabled
        WebElement disabledBox = driver.findElement(By.xpath("//*[@id='j_idt88:j_idt93']"));
        boolean enabled = disabledBox.isEnabled();
        System.out.println("Is Disabled Box Enabled? " + enabled);

		
	}

}
