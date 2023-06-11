package com.helix.qa.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;
import com.helix.qa.base.TestBase;

public class TestUtility extends TestBase{

	
	Date date = new Date();
	SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy hh:mm");  
    String strDate = formatter.format(date); 
    String datetime=strDate.toString().replace(" ", "-").replace(":", "-");
    
    
	public void scrrenshot()
	{
		
		try {
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("./screenshots/" + datetime + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
			
		
	}

