package seliniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Headlessbrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Swetha_2211\\workspace\\chromedriver.exe");
		WebDriver driver=new HtmlUnitDriver();
	    //WebDriver driver=new ChromeDriver();
driver.get("http://192.168.149.57:8580/airmanage/networkadmin/login.jsp");
System.out.println("Before login title is---"+driver.getTitle());
driver.findElement(By.name("login")).sendKeys("superadmin");
driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test1234");
driver.findElement(By.xpath("//img[@name='loginImg']")).click();
Thread.sleep(2000);
System.out.println("After login title--"+driver.getTitle());;
driver.quit();
	}

	

}
