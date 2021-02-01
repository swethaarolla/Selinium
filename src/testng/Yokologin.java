package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Yokologin {
WebDriver driver;
    @BeforeClass
    public void Setup(){
	System.setProperty("webdriver.chrome.driver", "D:\\Swetha_2211\\workspace\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.manage().window().maximize();
       }
    @Test(priority=1,groups="title")
    public void url(){
    driver.get("http://192.168.149.57:8580/airmanage/networkadmin/login.jsp");
    }
    @Test(priority=2,groups="title")
    public void gettitle(){
    String title=driver.getTitle();
    System.out.println("Title of page is:"+title);
    Assert.assertEquals(title, "Channel Manager - Please enter your login","title is not matched");
    
    }
    @Test(priority=3,groups="login")
    public void login(){
    //driver.get("http://192.168.149.57:8580/airmanage/networkadmin/login.jsp");
    driver.findElement(By.xpath("//input[@name='login']")).sendKeys("superadmin");
    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test1234");
    driver.findElement(By.xpath("//img[@name='loginImg']")).click();
    }
    @Test(priority=4,dependsOnMethods="login")
    public void logout(){
    driver.findElement(By.linkText("logout")).click();	
    }
    @Test(priority=5)
    public void Teardown(){
    	driver.close();
    }
}
