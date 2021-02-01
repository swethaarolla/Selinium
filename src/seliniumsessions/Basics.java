package seliniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basics {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "D:\\Swetha_2211\\workspace\\chromedriver.exe");
	//System.setProperty("webdriver.gecko.driver", "D:\\Swetha_2211\\workspace\\geckodriver.exe");
    WebDriver driver=new ChromeDriver();
    //driver.get("https://www.google.com");
    driver.manage().window().maximize();
    driver.get("http://192.168.149.57:8580/airmanage/networkadmin/login.jsp");
    Thread.sleep(5000);
    driver.findElement(By.name("login")).sendKeys("superadmin");
    driver.findElement(By.name("password")).sendKeys("test1234");
    driver.findElement(By.name("loginImg")).click();
    Thread.sleep(3000);
    driver.quit();
	}

}
