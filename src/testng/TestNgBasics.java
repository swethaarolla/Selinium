package testng;

import org.apache.xerces.util.SynchronizedSymbolTable;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgBasics {

	@BeforeClass
	public void launchbrowser(){
		System.out.println("browser launched");
	}
	@BeforeMethod
	public void login(){
		System.out.println("login in to app success");
	}
	@Test
	public void gettitle(){
		System.out.println("get title of page");
	}
	@AfterMethod
	public void logout(){
		System.out.println("logout of app success");
	}
	@AfterClass
	public void browserclose(){
		System.out.println("Browser closed");
	}
	
	
	
}
