package com.helix.qa.pages;

import java.sql.Driver;
import java.time.Duration;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.helix.qa.base.TestBase;
import com.helix.qa.utility.ElementUtil;
import com.helix.qa.utility.TestUtility;

public class LoginPage extends TestBase{
	
	 @FindBy(xpath="//input[@id='username']")
	 WebElement adminId;
	
	
	@FindBy(xpath = "//input[@type='password']") 
	WebElement passowrd;
	
	@FindBy(xpath = "//button[@type='submit']") 
	WebElement submit;
	
	public LoginPage()
	{
		
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void openURL(String URL)
	{
		driver.get(URL);
	}
	
	public void loginmethod(String user, String pass) {
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement element=wait.until(ExpectedConditions.elementToBeClickable(adminId));
		element.sendKeys(user);
		passowrd.sendKeys(pass);
		submit.click();
		
//		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys(user);
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pass);
//		driver.findElement(By.xpath("//button[@title='Login']")).click();
	}
	
	
}
