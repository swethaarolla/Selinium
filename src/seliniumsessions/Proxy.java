package seliniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Proxy {

	public static void main(String[] args) {
		Proxy p = new Proxy();
		System.setProperty("http.proxyHost", "xius.com");
		System.setProperty("http.proxyPort", "80");
		System.setProperty("https.proxyHost", "xius.com");
		System.setProperty("https.proxyPort", "80");
		System.setProperty("webdriver.chrome.driver", "D:\\Swetha_2211\\workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://scrolltest.com");
		System.out.println(driver.getCurrentUrl());
	}

}
