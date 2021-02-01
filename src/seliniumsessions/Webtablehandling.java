package seliniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Webtablehandling {

	public static void main(String[] args) throws InterruptedException {
		boolean flag = false;
		System.setProperty("webdriver.chrome.driver", "D:\\Swetha_2211\\workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://192.168.149.57:10690/airmanage/networkadmin/login.jsp");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).sendKeys("superadmin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test1234");
		driver.findElement(By.xpath("//img[@name='loginImg']")).click();
		WebElement ele = driver.findElement(By.linkText("Transactions Report"));
		// WebElement
		// ele=driver.findElement(By.xpath("//a[contains(text(),'Transactions
		// Report')]"));
		Actions ac = new Actions(driver);
		ac.moveToElement(ele).build().perform();
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.linkText("Transaction Monitor"));
		ac.moveToElement(ele1).build().perform();
		ele1.click();
		Thread.sleep(2000);
		String datevalue = "01/11/2019";
		WebElement strtdate = driver.findElement(By.xpath("//input[@name='startDate']"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].value='" + datevalue + "'", strtdate);
		driver.findElement(By.xpath("//img[@name='submitImg']")).click();
		// table/tbody/tr[8]/td[4]
		List<WebElement> pagination = driver.findElements(By.xpath("//table/tbody/tr[19]/td[1]/a"));
		System.out.println("pagination exists");
		for (int j = 1; j < pagination.size(); j++) {
			System.out.println("we are in page " + j);
			int rows = driver
					.findElements(By.xpath("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr"))
					.size();
			for (int i = 8; i <= rows; i++) {

				String transid = driver.findElement(By.xpath(
						"/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[" + i + "]/td[4]"))
						.getText();
				System.out.println(transid);

				if (transid.contains("6098")) {
					System.out.println("transid matched " + transid);
					flag = true;
					//driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).click();
					System.out.println("current flag value " + flag);
					Thread.sleep(3000);
					break;
				}
				
			}
			if(flag==true){
			break;	
			}
			if (flag == false) {
				driver.findElement(By.xpath("//table/tbody/tr[19]/td[1]/a[" + j + "]")).click();
			}
		}

		driver.quit();

	}
}
