package Selenium1;


import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Example25_FileDownload {

	public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/file.xhtml");

        WebElement downLoad = driver.findElement(By.xpath("//*[@id='j_idt93:j_idt95']"));
        downLoad.click();

        File fileLocation = new File("C:\\Users\\despa\\Downloads");
        File[] totalFiles = fileLocation.listFiles();
        for (File file : totalFiles) {
            if (file.getName().equals("TestLeaf Logo.png")) {
                System.out.println("File Download Success");
                break;
            }
        }
    }

}

