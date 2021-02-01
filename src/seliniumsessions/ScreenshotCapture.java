package seliniumsessions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotCapture {
       static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Swetha_2211\\workspace\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://192.168.149.57:8580/airmanage/networkadmin/login.jsp");
	    driver.findElement(By.name("login")).sendKeys("superadmin");
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test1234");
	    driver.findElement(By.xpath("//img[@name='loginImg']")).click();
	    takeScreenshot("Yokofone_Homepage");
	    System.out.println("Screenshot is captured successfully");
	    driver.quit();
	    
	}
   public static void takeScreenshot(String fileName) throws IOException{
	   //take screenshot and store it as a file format
	File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//copy screenshot to desired location using copyFile method
	FileUtils.copyFile(file, new File("D:\\Swetha_2211\\workspace\\Selinium\\src\\Screenshots\\"+fileName+".jpg"));
}
}
