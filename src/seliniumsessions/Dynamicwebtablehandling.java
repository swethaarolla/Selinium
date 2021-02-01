package seliniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Dynamicwebtablehandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Swetha_2211\\workspace\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://192.168.149.57:10690/airmanage/networkadmin/login.jsp");
	    Thread.sleep(2000);
	    driver.findElement(By.name("login")).sendKeys("superadmin");
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test1234");
	    driver.findElement(By.xpath("//img[@name='loginImg']")).click();
	    WebElement ele=driver.findElement(By.xpath("//a[contains(text(),'Distributor Management')]"));
	    Actions ac =new Actions(driver);
	    ac.moveToElement(ele).build().perform();
	    Thread.sleep(2000);
	   WebElement ele1=driver.findElement(By.xpath("//a[contains(text(),'View External Profiles')]/../../li[4]/a"));
	    ac.moveToElement(ele1).build().perform();
	    Thread.sleep(2000);
	    WebElement ele2=driver.findElement(By.xpath("//li[1]//a[contains(text(),'Distributor Funds Transfer')]"));
	    ac.moveToElement(ele2).build().perform();
	    ele2.click();
	    Thread.sleep(2000);
	  
	  Select select=new Select(driver.findElement(By.xpath("/html/body/form/table[1]/tbody/tr[2]/td[2]/table[2]/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/select")));
	  select.selectByVisibleText("XIUSPARTNERRR");
	int rows=driver.findElements(By.xpath("//table[2]/tbody/tr[6]/td[1]/table/tbody/tr")).size();
	//table[2]/tbody/tr[6]/td[1]/table/tbody/tr[3]/td[2]
	for(int i=3;i<=rows;i++)
	{
		String dist=driver.findElement(By.xpath("//table[2]/tbody/tr[6]/td[1]/table/tbody/tr["+i+"]/td[2]")).getText();
		if(dist.contains("2282")){		
	System.out.println(dist);
	driver.findElement(By.xpath("//table[2]/tbody/tr[6]/td[1]/table/tbody/tr["+i+"]/td[2]/../td[1]/input[@type='checkbox']")).click();
	Thread.sleep(2000);
	break;
		}
		System.out.println(dist);
	}
				
			driver.quit();
			  
	

}
}
