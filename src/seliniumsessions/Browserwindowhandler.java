package seliniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Browserwindowhandler {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Swetha_2211\\workspace\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "D:\\Swetha_2211\\workspace\\geckodriver.exe");
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
	    driver.findElement(By.xpath("//a[contains(@href,'startDate')]")).click();
		  Set<String>  handler=driver.getWindowHandles();
		  Iterator<String> it=handler.iterator();
		  String parentwindowId=it.next();
		  System.out.println("Parent window id is --- "+parentwindowId);
		  String childwindowId=it.next();
		  System.out.println("child window id is --- "+childwindowId);
		  driver.switchTo().window(childwindowId);
		  System.out.println("child window title is -- "+driver.getTitle());
		  driver.close();
		  driver.switchTo().window(parentwindowId);
		  System.out.println("parent window title is --  "+driver.getTitle());
		  driver.quit();
	}

}
