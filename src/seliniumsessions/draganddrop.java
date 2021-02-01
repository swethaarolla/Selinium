package seliniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;

public class draganddrop {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "D:\\Swetha_2211\\workspace\\chromedriver.exe");
	//System.setProperty("webdriver.gecko.driver", "D:\\Swetha_2211\\workspace\\geckodriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://jqueryui.com/droppable/");
    //Thread.sleep(2000);
    driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    driver.switchTo().frame(0);
    Actions action=new Actions(driver);
    action.clickAndHold(driver.findElement(By.id("draggable"))).moveToElement(driver.findElement(By.id("droppable"))).release().build().perform();
    Thread.sleep(5000);
    driver.quit();
	}

}
