package testng;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {
	@Test(invocationTimeOut=1,expectedExceptions=NumberFormatException.class)
    public void infiniteloopTest(){
	int i=1;
	while(i==1){
		System.out.println(i);
	}
   }
	public void Test1(){
		String x="100A";
		Integer.parseInt(x);
	}
}
