package com.helix.qa.pages;

import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.helix.qa.base.TestBase;



public class AdminPage extends TestBase {
	
	
	@FindBy(xpath = "//li[@title='Admin']") WebElement admintab;
	@FindBy(xpath = "//table//tr[1]//td[1]") WebElement adminListName;
	
	
	public AdminPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void adminTab()
	{
		admintab.click();
	}
	
	public void adminList()
	{
		
		List<WebElement> totalrows=driver.findElements(By.xpath("//table//tr//td[1]"));
		
//	  for (int i =1; i<24;i++) {
//		List<WebElement> rows= driver.findElements(By.xpath("//table//tr[i]//td[1]"));
//		{
//			for(WebElement s:rows)
//			System.out.println(s.getText());
//		}
//	  }
//		
	}

	public void addAdmin() {
		// TODO Auto-generated method stub
		
	}
}
