

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowAuthentication {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Swetha_2211\\workspace\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
	    String Pagemessage=driver.findElement(By.cssSelector("p")).getText();
	    System.out.println("Page message is "+Pagemessage);
	    
	    
	}

}
