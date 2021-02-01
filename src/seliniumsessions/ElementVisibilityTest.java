package seliniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Swetha_2211\\workspace\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://192.168.149.57:8580/airmanage/networkadmin/login.jsp");
	    Thread.sleep(2000);
	    driver.findElement(By.name("login")).sendKeys("superadmin");
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test1234");
	    //isDisplayed() method applicable on all elements
	    //used to verify presence of webelement within webpage
	    boolean b1=driver.findElement(By.xpath("//img[@name='loginImg']")).isDisplayed();
	    System.out.println(b1);
	    //isEnabled() is used to verify if webelement is enabled or disabled within webpage
	    //primarily used with buttons
	    boolean b2=driver.findElement(By.xpath("//img[@name='loginImg']")).isEnabled();
	    System.out.println(b2);
	    //isSelected() applicable to Radiobutton,checkbox and dropdown
	    boolean b3=driver.findElement(By.xpath("//img[@name='loginImg']")).isSelected();
	    System.out.println(b3);
	    driver.findElement(By.xpath("//img[@name='loginImg']")).click();
	    driver.quit();

	}

}
