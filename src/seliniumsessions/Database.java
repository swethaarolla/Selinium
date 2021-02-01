package seliniumsessions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Database {

	public static void main(String[] args) throws InterruptedException, SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		System.setProperty("webdriver.chrome.driver", "D:\\Swetha_2211\\workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://192.168.149.57:10690/airmanage/networkadmin/login.jsp");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).sendKeys("superadmin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test1234");
		driver.findElement(By.xpath("//img[@name='loginImg']")).click();
		driver.quit();
		String Query="select * from T_PARTNER";
		Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@//192.168.149.152:1521/XIUSRAC1","TUNETALK_PMDB_QC","TUNETALK_PMDB_QC");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(Query);
        while(rs.next()) 
        {
        	System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
        }
        rs.close();
        st.close();
        con.close();
	    
	}
	

}
