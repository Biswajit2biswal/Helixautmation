package com.helix.qa.base;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
 protected static WebDriver driver;
 
 
 
  public void  initialization()
  {
////	  System.setProperty("webdriver.chrome.driver", "D:\\Ddrive\\Selenium tools\\Chromer diver\\v112\\chromedriver.exe");
	  driver=new ChromeDriver();  
	  driver.get("https://test.dhad.visnet.in/Helix4.x/#/admin");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }



//public static WebDriver getDriver() {
//	return driver;
//}
//
//
//
//public void setDriver(WebDriver driver) {
//	this.driver = driver;
//}
}
