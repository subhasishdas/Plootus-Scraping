package scrapings;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.sun.jna.platform.FileUtils;



	public class scra{

	
	public static void main(String[] args) throws AWTException, IOException {
		System.out.println("Hi");

		FileInputStream fis=new FileInputStream("C:\\Users\\subha\\Desktop\\garbage\\Plootus\\init.xlsx");
		
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int i=0;
		while(i<sheet.getPhysicalNumberOfRows()){				
			System.out.println(sheet.getRow(i).getCell(0));
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\subha\\Desktop\\garbage\\Plootus\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get(sheet.getRow(i).getCell(0).toString());
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			Robot r = new Robot();
			r.delay(10000);
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_A);
			r.delay(1000);
			r.keyRelease(KeyEvent.VK_A);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.delay(1000);
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_C);
			r.delay(1000);
			r.keyRelease(KeyEvent.VK_C);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.delay(1000);
			
			driver.close();
			
			/*r.keyPress(KeyEvent.VK_ALT);
			r.keyPress(KeyEvent.VK_TAB);
			r.delay(1000);
			r.keyRelease(KeyEvent.VK_ALT);
			r.keyRelease(KeyEvent.VK_TAB);
			r.delay(1000);*/
			
			r.mousePress(InputEvent.BUTTON3_DOWN_MASK); 
			r.delay(1000);
			r.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
			
			r.keyPress(KeyEvent.VK_M);
			r.delay(1000);
			r.keyRelease(KeyEvent.VK_M);
			r.delay(1000);
			
			r.keyPress(KeyEvent.VK_ENTER);
			r.delay(1000);
			r.keyRelease(KeyEvent.VK_ENTER);
			r.delay(1000);
			
			r.keyPress(KeyEvent.VK_SHIFT);
			r.keyPress(KeyEvent.VK_F11);
			r.delay(1000);
			r.keyRelease(KeyEvent.VK_SHIFT);
			r.keyRelease(KeyEvent.VK_F11);
			r.delay(1000);
			
			
			/*r.keyPress(KeyEvent.VK_ALT);
			r.keyPress(KeyEvent.VK_TAB);
			r.delay(1000);
			r.keyRelease(KeyEvent.VK_ALT);
			r.keyRelease(KeyEvent.VK_TAB);
			r.delay(5000);*/
			//openlink o = new openlink();
			//o.mainfunc();
			r.delay(1000);
			System.out.println("DOne");
			
			System.out.println(i);
			i++;
		 }
	}

}

