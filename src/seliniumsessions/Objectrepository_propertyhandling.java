package seliniumsessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Objectrepository_propertyhandling {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Swetha_2211\\workspace\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    Properties prop=new Properties();
	    FileInputStream ip=new FileInputStream("D:\\Swetha_2211\\workspace\\Selinium\\src\\seliniumsessions\\objectrepository.properties");
       prop.load(ip);
       driver.get(prop.getProperty("URL"));
       Thread.sleep(2000);
       driver.findElement(By.name("login")).sendKeys(prop.getProperty("Username"));
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys(prop.getProperty("Password"));
	    driver.findElement(By.xpath("//img[@name='loginImg']")).click();
	    Thread.sleep(2000);
       driver.quit();
	}
	

}
