package Selenium1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		String URL="https://www.google.com/";
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		String getcurrUrl=driver.getCurrentUrl();
		System.out.println("Current URL of HomePage:"+getcurrUrl);
		String getPageSource=driver.getPageSource();
//		System.out.println("Current page source of HomePage:"+getPageSource);
		driver.close();
	}

}
