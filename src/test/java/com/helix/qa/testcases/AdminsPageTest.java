package com.helix.qa.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.helix.qa.base.TestBase;
import com.helix.qa.pages.AdminPage;
import com.helix.qa.pages.Agents;
import com.helix.qa.pages.LoginPage;
import com.helix.qa.utility.TestUtility;

public class AdminsPageTest extends TestBase{

	LoginPage login;
    TestUtility ut;
    AdminPage adminpage;
    Agents agent;
    
	@BeforeMethod
	public void setup()
	{
		//Open Google chrome Browser
		initialization();
		
		login=new LoginPage();
		ut=new TestUtility();
		adminpage=new AdminPage();
	    agent=new Agents();
		
	}
	
	@Test(description = "Verify Admin list ")
	public void adminlist() {
		try {
			//Login to Helix Admin
			login.loginmethod("admin", "Biswa@123");
			Thread.sleep(5000);
			agent.addagents();
			//adminpage.adminTab();
			//Thread.sleep(5000);
			//adminpage.adminList();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
}
