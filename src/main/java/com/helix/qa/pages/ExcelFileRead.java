package com.helix.qa.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileRead {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		 
		File file = new File("D:\\Ddrive\\SeleniumPojects\\HelixAdmin\\src\\main\\java\\com\\helix\\qa\\testdata\\Admin Data.xlsx");
		;
		try {
			FileInputStream fis = new FileInputStream(file);
		
		Workbook wb= new XSSFWorkbook(fis);
		Sheet sh=wb.getSheet("Agents");
		int rowCount = sh.getLastRowNum()-sh.getFirstRowNum();
		System.out.print("     Name       ");
		   System.out.print("  Empid    ");
		   System.out.print("   ProvideAgentid      ");
		   System.out.print("    ProviderPassword    ");
		   System.out.print("   TerminalAddress    ");
		   System.out.println("");
		   System.out.println("------------------------------------------------------------------------------------------------");
		for (int i = 1; i <10; i++) 
		{
			//driver.findElement(By.xpath("//button[@title='Add New Agents']")).click();
		   
		   String name=sh.getRow(i).getCell(0).toString();
		   String empid=sh.getRow(i).getCell(1).toString();
		   Cell provideAgentid=sh.getRow(i).getCell(2);
		   String providerPassword=sh.getRow(i).getCell(3).toString();
		   String  terminalAddress=sh.getRow(i).getCell(4).toString();
		   
		   System.out.print(name);
		   System.out.print("---------");
		   System.out.print(empid);
		   System.out.print("---------");
		   System.out.print(provideAgentid);
		   System.out.print("---------");
		   System.out.print(providerPassword);
		   System.out.print("---------");
		   System.out.print(terminalAddress);
		   System.out.print("---------");
		   System.out.println("");
		   
		} }
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
