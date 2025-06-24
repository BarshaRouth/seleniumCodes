package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example02_TextBox {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/input.xhtml");
        driver.manage().window().maximize();

        WebElement textBox = driver.findElement(By.xpath("//*[@id='j_idt88:name']"));
        textBox.sendKeys("VIT");

        WebElement emailBox = driver.findElement(By.xpath("//*[@id='j_idt88:j_idt91']"));
        emailBox.sendKeys("test@gmail.com");

        WebElement appendBox = driver.findElement(By.xpath("//*[@id='j_idt88:j_idt91']"));
        appendBox.sendKeys("Vellore");

        WebElement retrieveText = driver.findElement(By.xpath("//*[@id='j_idt88:j_idt93']"));
        String value = retrieveText.getAttribute("value");
        System.out.println(value);

        WebElement clearBox = driver.findElement(By.xpath("//*[@id='j_idt88:j_idt95']"));
        clearBox.clear();

        WebElement disabledBox = driver.findElement(By.xpath("//*[@id='j_idt88:j_idt93']"));
        boolean enabled = disabledBox.isEnabled();
        Thread.sleep(6000);
        System.out.println(enabled);

        driver.quit();
    }
}
