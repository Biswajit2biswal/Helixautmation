package com.helix.qa.pages;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.helix.qa.base.TestBase;

public class ContactPage extends TestBase {

	
		// TODO Auto-generated method stub
		
			
			public ContactPage()
			{
				PageFactory.initElements(driver, this);
			}
			
			public void addConatcts()
			{
				driver.findElement(By.xpath("//li[@title='Contact']/i")).click();
				try{
					//Read frm Excelfile
				File file = new File("D:\\Ddrive\\SeleniumPojects\\HelixAdmin\\src\\main\\java\\com\\helix\\qa\\testdata\\Admin Data.xlsx");
				FileInputStream fis =new FileInputStream(file);
				Workbook wb= new XSSFWorkbook(fis);
				Sheet sh=wb.getSheet("Contacts");
				int rowCount = sh.getLastRowNum()-sh.getFirstRowNum();
				
				for (int i = 1; i < rowCount+1; i++) 
				{
					driver.findElement(By.xpath("//button[@title='Add New Contacts']")).click();
				   Thread.sleep(300);
				   String name=sh.getRow(i).getCell(0).toString();
				   String mobileNumber=sh.getRow(i).getCell(1).toString();
				   String workNumber=sh.getRow(i).getCell(2).toString();
				   String homeNumber=sh.getRow(i).getCell(3).toString();
				   String  department=sh.getRow(i).getCell(4).toString();
				   String  organization=sh.getRow(i).getCell(5).toString();
				   
				   driver.findElement(By.xpath("//input[@formcontrolname='Name']")).sendKeys(name);
				   driver.findElement(By.xpath("//input[@formcontrolname='MobileNo']")).sendKeys(mobileNumber);
				   driver.findElement(By.xpath("//input[@formcontrolname='WorkNo']")).sendKeys(workNumber);
				   driver.findElement(By.xpath("//input[@formcontrolname='HomeNo']")).sendKeys(homeNumber);
				   driver.findElement(By.xpath("//input[@formcontrolname='Department']")).sendKeys(department);
				   driver.findElement(By.xpath("//input[@formcontrolname='Org']")).sendKeys(organization);
				   driver.findElement(By.xpath("//button[@title='Save']")).click();
				   Thread.sleep(2000);
				   
				   
				   
				   
	             }
				}
				catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
}
