package Selenium1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		String URL="https://www.google.com/";
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		System.out.println("Website launched successfully");
		String getTitle=driver.getTitle();
		System.out.println("Title of home Page:"+getTitle);
		driver.close();
	}

}
