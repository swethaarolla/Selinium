package seliniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class edgedriver {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\Swetha_2211\\workspace\\edgedriver_win64\\msedgedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "D:\\Swetha_2211\\workspace\\geckodriver.exe");
	    WebDriver driver=new EdgeDriver();
	    //driver.get("https://www.google.com");
	    driver.manage().window().maximize();
	    driver.get("http://192.168.149.57:8580/airmanage/networkadmin/login.jsp");
	    Thread.sleep(5000);
	    driver.quit();
	}

}
