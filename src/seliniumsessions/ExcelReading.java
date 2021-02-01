package seliniumsessions;

import java.io.FileInputStream;
import jxl.*;

public class ExcelReading {

	public static void main(String[] args) throws Exception {
	FileInputStream f1=new FileInputStream("D:\\Swetha_2211\\workspace\\Excel.xls");
	Workbook w1=Workbook.getWorkbook(f1);
	Sheet s1=w1.getSheet("Sheet1");
	System.out.println(s1.getName());
	int i=3;
	String EmpID=s1.getCell(0,i).getContents();
	String EmpName=s1.getCell(1,i).getContents();
	String EmpSal=s1.getCell(2,i).getContents();
	String EmpEmail=s1.getCell(3,i).getContents();
	String EmpNo=s1.getCell(4,i).getContents();
	System.out.println(EmpID);
	System.out.println(EmpName);
	System.out.println(EmpSal);
	System.out.println(EmpEmail);
	System.out.println(EmpNo);
	
	}

}
