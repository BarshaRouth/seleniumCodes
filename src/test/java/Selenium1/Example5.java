package Selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		String URL="https://www.facebook.com/";
		driver.get(URL);
		String actualTitle=driver.getTitle();
		String expectedTitle="Facebook – log in or sign up";
		if(actualTitle.equalsIgnoreCase(expectedTitle)) {
			System.out.println("Verification is success");
			System.out.println("Home Page Title: "+actualTitle);
		}
		else {
			System.out.println("Verification is failed,Match not found");
			System.out.println("Home Page Title: "+actualTitle);
		}
		driver.close();

	}

}
