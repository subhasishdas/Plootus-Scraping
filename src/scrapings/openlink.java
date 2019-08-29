package scrapings;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openlink {
	static WebDriver driver;
	private static void copyonly(int i) throws AWTException {
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_TAB);
		r.delay(1000);
		/*if(i>1) {
			r.keyPress(KeyEvent.VK_TAB);
			r.delay(1000);
			r.keyRelease(KeyEvent.VK_TAB);
			r.delay(1000);
		}*/
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_ALT);

		r.delay(1000);
		
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_C);
			r.delay(1000);
			r.keyRelease(KeyEvent.VK_C);
			r.keyRelease(KeyEvent.VK_CONTROL);
		r.delay(1000);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.delay(1000);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		/*ALLEGHENY COLLEGE TAX DEFERRED ANNUITY PLAN | 151012r.keyPress(KeyEvent.VK_DOWN);
		r.delay(1000);
		r.keyRelease(KeyEvent.VK_DOWN);*/
		
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_TAB);
		r.delay(1000);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_ALT);
		r.delay(1000);
		
	}
	public static void pressF(int num) throws AWTException{
		Robot r = new Robot();
		while(num>0){
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_F);
			r.delay(1000);
			r.keyRelease(KeyEvent.VK_F);
			r.keyRelease(KeyEvent.VK_CONTROL);
		num--;
		}
	}
	private static void pasteonly() throws AWTException {
		Robot r = new Robot();
		
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.delay(1000);
			r.keyRelease(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
		
		
	}
	public static void main(String[] args) throws AWTException, IOException {
		movewindow();
		System.out.println("mainfunc");
		FileInputStream linkfile=new FileInputStream("C:\\Users\\subha\\Desktop\\garbage\\Plootus\\PlanIdCopy.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(linkfile);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int link_i=98;
		int i=1;
		while(link_i<sheet.getPhysicalNumberOfRows()){
			
			WebDriver driver = new ChromeDriver();
			driver.get(sheet.getRow(link_i).getCell(0).toString());
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
			System.out.println(sheet.getRow(link_i).getCell(0).toString()+"  ");
				
			//Read from formatted data
			FileInputStream formattedfile=new FileInputStream("C:\\Users\\subha\\Desktop\\garbage\\Plootus\\Scrapped Data - Copy\\Book2_formatted.xlsx");
			
			@SuppressWarnings("resource")
			XSSFWorkbook workbook1 = new XSSFWorkbook(formattedfile);
			XSSFSheet sheet1 = workbook1.getSheetAt(0);
			int flag=1;
			
			Robot r = new Robot();
			r.delay(10000);
			while(i<sheet1.getPhysicalNumberOfRows()){
				
			//while(i<53){	
				String planName=sheet1.getRow(i).getCell(1).toString();
				//System.out.println(planName);
				if(i!=1&&flag!=1) {
					if(!planName.equals(sheet1.getRow(i-1).getCell(1).toString())) {
						flag=1;
						driver.close();
						break;
					}
					
				}
				System.out.println(planName);
				copyonly(0);
				pressF(1);
				pasteonly();
				r.delay(2000);
				r.keyPress(KeyEvent.VK_ESCAPE);
				r.delay(500);
				r.keyRelease(KeyEvent.VK_ESCAPE);
				r.delay(200);
				r.keyPress(KeyEvent.VK_ENTER);
				r.delay(500);
				r.keyRelease(KeyEvent.VK_ENTER);
				r.delay(10000);
				
				scrapelink s = new scrapelink();
				s.scrapelinkfunc(flag);
				flag=0;
				
				r.keyPress(KeyEvent.VK_ALT);
				r.keyPress(KeyEvent.VK_TAB);
				r.delay(1000);
				r.keyRelease(KeyEvent.VK_TAB);
				r.delay(1000);
				r.keyPress(KeyEvent.VK_TAB);
				r.delay(1000);
				r.keyRelease(KeyEvent.VK_TAB);			
				r.keyRelease(KeyEvent.VK_ALT);
				r.delay(1000);
				r.keyPress(KeyEvent.VK_ALT);
				r.keyPress(KeyEvent.VK_TAB);
				r.delay(1000);
				r.keyRelease(KeyEvent.VK_TAB);	
				r.keyRelease(KeyEvent.VK_ALT);
				r.delay(1000);
				
				i++;
			}
			
			link_i--;
		}
			/*
			Robot r = new Robot();
			while(i<400){		
			r.delay(10000);
			
			copyonly(i);
			pressF(1);
			pasteonly();
			r.delay(2000);
			r.mousePress(InputEvent.BUTTON1_DOWN_MASK); 
			r.delay(1000);
			r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			r.delay(10000);
			scrapelink s = new scrapelink();
			s.scrapelinkfunc(i);
			
			i++;
*/

		}
	private static void movewindow() throws AWTException {
		// TODO Auto-generated method stub
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_WINDOWS);
		r.keyPress(KeyEvent.VK_RIGHT);
		r.delay(500);
		r.keyRelease(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_WINDOWS);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
	}
	}
	
	

