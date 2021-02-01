package seliniumsessions;

import java.io.FileInputStream;
import java.io.IOException;

import jxl.*;
import jxl.read.biff.BiffException;

public class Excelloop {

	public static void main(String[] args) throws BiffException, IOException {
		FileInputStream f1=new FileInputStream("D:\\Swetha_2211\\workspace\\Excel.xls");
		Workbook objwb=Workbook.getWorkbook(f1);
		Sheet s1=objwb.getSheet(0);
		int rows=s1.getRows();
		System.out.println(rows);
		for(int i=3;i<rows;i++){
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

}
