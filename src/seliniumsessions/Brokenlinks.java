package seliniumsessions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Swetha_2211\\workspace\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://192.168.149.57:8580/airmanage/networkadmin/login.jsp");
	    driver.findElement(By.name("login")).sendKeys("superadmin");
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test1234");
	    driver.findElement(By.xpath("//img[@name='loginImg']")).click();
	    //get the list of all links and images
	 List<WebElement> linksList=driver.findElements(By.tagName("a"));
	 linksList.addAll(driver.findElements(By.tagName("img")));
	 
	 System.out.println("size of full links and images--"+linksList.size());
	 List<WebElement> activeLinks=new ArrayList<WebElement>();
	 
	 //iterate linkslist :exclude all links/images-doesnt have any href value
	 
	 for(int i=0;i<linksList.size();i++) {
		 if(linksList.get(i).getAttribute("href")!=null && (! linksList.get(i).getAttribute("href").contains("javascript"))) {
		   activeLinks.add(linksList.get(i));
	       }
	       }
	 //get the size of activelinks list
     System.out.println("size of active links and images--"+activeLinks.size());
     
     //check the href url with httpconnection api
     for(int j=0;j<activeLinks.size();j++) {
    	 
    	 String url=activeLinks.get(j).getAttribute("href");
    	 System.out.println(url);
    	 int responsecode = 0;
    	 String responseMsg=null;
    	 try {
    	HttpURLConnection connection=(HttpURLConnection)new URL(url).openConnection(); 
        connection.connect();
        responsecode   =connection.getResponseCode();
        responseMsg   =connection.getResponseMessage();
        connection.disconnect();
    	 }catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
		}
        System.out.println(responsecode);
        System.out.println(responseMsg);
        
       
     }
     driver.quit();
     }
}