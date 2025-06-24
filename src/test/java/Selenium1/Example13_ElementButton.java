package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example13_ElementButton {

	public static void main(String[] args) throws Exception { // Fixed method syntax
        WebDriver driver = new ChromeDriver(); // Fixed assignment syntax
        driver.get("https://www.leafground.com/button.xhtml;jsessionid=node01eifibwzy1f5bvp5tuiwk09hd7788608.node0");
        driver.manage().window().maximize();

        // Get Position of Button
        WebElement getPositionButton = driver.findElement(By.id("j_idt88:j_idt94"));
        Point xypoint = getPositionButton.getLocation();
        int xValue = xypoint.getX();
        int yValue = xypoint.getY();
        System.out.println("X value is: " + xValue + " Y value is: " + yValue);
        Thread.sleep(3000);
        // Get Button Color
        WebElement colourButton = driver.findElement(By.id("j_idt88:j_idt96"));
        String colour = colourButton.getCssValue("background-color"); // Fixed "background" to "background-color"
        System.out.println("Button colour is: " + colour);

        // Get Button Size
        WebElement sizeButton = driver.findElement(By.id("j_idt88:j_idt98")); // Fixed variable name spacing issue
        int height = sizeButton.getSize().getHeight();
        int width = sizeButton.getSize().getWidth();
        System.out.println("Button Height is: " + height + " Button Width is: " + width);
        Thread.sleep(2000);
        driver.quit(); // Close the browser session
    }
}
