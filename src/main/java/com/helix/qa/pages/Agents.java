package com.helix.qa.pages;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Driver;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.helix.qa.base.TestBase;
import com.helix.qa.utility.TestUtility;

public class Agents extends TestBase{
	
	@FindBy(xpath = "//button[@title='Add New Agents']") WebElement addAgentButton;
	@FindBy(xpath = "//mat-select[@name='AgentType']") WebElement agenttype;
	@FindBy(xpath = "//mat-option[2]/span") WebElement selectAgentType;
	@FindBy(xpath = "//input[@formcontrolname='Name']']") WebElement agentName;
	@FindBy(xpath = "//input[@formcontrolname='EmpId']") WebElement empId;
	@FindBy(xpath = "//input[@formcontrolname='ProvAgentId']") WebElement providerAgentId;
	@FindBy(xpath = "//input[@formcontrolname='ProvPassword']") WebElement providerpassword;
	@FindBy(xpath = "//input[@formcontrolname='TerminalAddress']") WebElement terminalAddres;
	@FindBy(xpath = "//button[@title='Save']") WebElement saveAgentform;
	
	
	
	
	
	
	public Agents()
	{
		PageFactory.initElements(driver, this);
	}
	public void addagents()
	{
		
		try{
			//Read frm Excelfile
		File file = new File("D:\\Ddrive\\SeleniumPojects\\HelixAdmin\\src\\main\\java\\com\\helix\\qa\\testdata\\Admin Data.xlsx");
		FileInputStream fis =new FileInputStream(file);
		Workbook wb= new XSSFWorkbook(fis);
		Sheet sh=wb.getSheet("Agents");
		int rowCount = sh.getLastRowNum()-sh.getFirstRowNum();
		
		for (int i = 1; i < rowCount+1; i++) 
		{
			//driver.findElement(By.xpath("//button[@title='Add New Agents']")).click();
		   
		   String name=sh.getRow(i).getCell(0).toString();
		   String empid=sh.getRow(i).getCell(1).toString();
		   String provideAgentid=sh.getRow(i).getCell(2).toString();
		   String providerPassword=sh.getRow(i).getCell(3).toString();
		   String  terminalAddress=sh.getRow(i).getCell(4).toString();
		   System.out.println(Integer.parseInt(provideAgentid));
		   
		   addAgentButton.click();
		  agenttype.click();
		  selectAgentType.click();
		  agentName.sendKeys(name);
		  empId.sendKeys(empid);
		  providerAgentId.sendKeys(provideAgentid);
          providerpassword.sendKeys(providerPassword);
          terminalAddres.sendKeys(terminalAddress);
          saveAgentform.click();
          
          Alert alert = driver.switchTo().alert();

          // Get the text from the alert
          String alertText = alert.getText();
          System.out.println("Alert text: " + alertText);
          
          Thread.sleep(2000);
          
          
//		   
		}
		 }
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public void search(String agentName)
	{
		driver.findElement(By.xpath("//input[@class='filterinput']")).sendKeys(agentName);
		
	}
	
	public void editAgentRecord()
	{
		
	}
	
	
	
}
