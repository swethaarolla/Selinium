package seliniumsessions;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CalenderSelectTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Swetha_2211\\workspace\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://192.168.149.57:8580/airmanage/networkadmin/login.jsp");
	    driver.findElement(By.name("login")).sendKeys("superadmin");
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test1234");
	    driver.findElement(By.xpath("//img[@name='loginImg']")).click();
	    WebElement ele=driver.findElement(By.linkText("Transactions Report"));
	    Actions ac =new Actions(driver);
	    ac.moveToElement(ele).build().perform();
	    Thread.sleep(2000);
	    WebElement ele1=driver.findElement(By.linkText("Transaction Monitor"));
	    ac.moveToElement(ele1).build().perform();
	    ele1.click();
	    Thread.sleep(2000);
		String dateVal="10/05/2020";
		WebElement elementstartdate=driver.findElement(By.xpath("//input[@name='startDate']")); 
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("arguments[0].value='"+dateVal+"';", elementstartdate);
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"transactionprocessing\"]/a/img")).click();
		Thread.sleep(5000);
		driver.quit();
	}
	
	
}
