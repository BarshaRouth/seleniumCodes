package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Example01_sendkeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("VIT"+Keys.ENTER);

	}

}
