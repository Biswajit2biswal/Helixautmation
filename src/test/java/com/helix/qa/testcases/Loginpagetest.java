package com.helix.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.helix.qa.base.TestBase;
import com.helix.qa.pages.Agents;
import com.helix.qa.pages.ContactPage;
import com.helix.qa.pages.LoginPage;
import com.helix.qa.utility.TestUtility;

public class Loginpagetest extends TestBase {
	
	LoginPage login;
    TestUtility ut;
    Agents agent;
    ContactPage contact;
    
	@BeforeMethod
	public void setup()
	{
		initialization();
		login=new LoginPage();
		ut=new TestUtility();
		agent=new Agents();
		contact=new ContactPage();
	}
	
	
	@Test(description = "Verify Admin can add multiple agents ")
	public void loginHelix() {
		try {
			
			login.loginmethod("admin", "Biswa@123");
			Thread.sleep(5000);
			//agent.addagents();
			contact.addConatcts();
			System.out.print("Sucessfully added");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
		@AfterMethod
		public void tearup() {
			driver.close();
			
		}
	
}
