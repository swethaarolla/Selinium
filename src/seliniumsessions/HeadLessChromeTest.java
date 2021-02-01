package seliniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessChromeTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Swetha_2211\\workspace\\chromedriver.exe");
	    ChromeOptions options=new ChromeOptions();
	    options.addArguments("window-size=1400,800");
	    options.addArguments("headless");
		WebDriver driver=new ChromeDriver(options);
	driver.get("http://192.168.149.57:8580/airmanage/networkadmin/login.jsp");
	 //Thread.sleep(2000);
	    System.out.println("Before login title is --"+driver.getTitle());
	    driver.findElement(By.name("login")).sendKeys("superadmin");
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test1234");
	    driver.findElement(By.xpath("//img[@name='loginImg']")).click();
	    System.out.println("After login title is---"+driver.getTitle());
	    driver.quit();
	}

}
