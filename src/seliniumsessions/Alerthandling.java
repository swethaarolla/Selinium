package seliniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alerthandling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Swetha_2211\\workspace\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "D:\\Swetha_2211\\workspace\\geckodriver.exe");
	    WebDriver driver=new ChromeDriver();
	    //driver.get("https://www.google.com");
	    driver.manage().window().maximize();
	    driver.get("http://192.168.149.57:8580/airmanage/networkadmin/login.jsp");
	    Thread.sleep(5000);
	    
	    driver.findElement(By.name("login")).sendKeys("superadmin");
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test1234");
	    driver.findElement(By.xpath("//img[@name='loginImg']")).click();
	    Thread.sleep(2000);
	    WebElement ele=driver.findElement(By.linkText("Stock Management"));
	    Actions ac=new Actions(driver);
	    ac.moveToElement(ele).build().perform();
	    WebElement ele1=driver.findElement(By.linkText("Stock Upload"));
	    ac.moveToElement(ele1).build().perform();
	    WebElement ele2=driver.findElement(By.linkText("Voucher Upload"));
	    //ac.moveToElement(ele2).build().perform();
	    ele2.click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//img[@name='generatepinImg']")).click();
	    Alert alert=driver.switchTo().alert();//handling alert
	    alert.accept();
	    //uploading file using sendkeys
	   driver.findElement(By.xpath("//input[@name='fileLoader']")).sendKeys("C:\\Users\\swetha.arolla\\Desktop\\Voucherupload.txt");
	    Thread.sleep(2000);
	    driver.quit();
}}
