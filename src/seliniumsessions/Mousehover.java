package seliniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Mousehover {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Swetha_2211\\workspace\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://home.redbrickhealth.com/");
    //Thread.sleep(2000);
    WebElement ele=driver.findElement(By.xpath("//*[@id='menu-item-91']/a")); //1st abouts link identiying..
    Actions ac= new Actions(driver);//Actions class
    ac.moveToElement(ele).build().perform();// it will select the about us link
    Thread.sleep(2000); ///waiting for sometime to load
    WebElement ele1=driver.findElement(By.xpath("//*[@id='menu-item-85']/a")); // second dropdown--- Carrers ide //overriding here 
    ac.moveToElement(ele1).build().perform();
    ele1.click();			
    Thread.sleep(5000);
    driver.quit();
}
	}
