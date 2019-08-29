package scrapings;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookType;

public class sample {
	
	public static void main(String[] args) throws IOException, InvalidFormatException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream(new File("C:\\Users\\subha\\Desktop\\garbage\\Plootus\\Scrapped Data - Copy\\Book8.xlsx"));
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		//XSSFSheet sheet = workbook.getSheetAt(0);
		for (int k = 0; k < workbook.getNumberOfSheets(); k++) {
			XSSFSheet sheet = workbook.getSheetAt(k);
		
		DataFormatter formatter = new DataFormatter();
		int flag=0;
		for(int i=0;i<sheet.getLastRowNum();i++) {
			
			try {
				if(flag==1) {
					break;
				}
				if(flag==0)
				{
					for(int j=0;j<15;j++) {
						String BackToTop=formatter.formatCellValue(sheet.getRow(i).getCell(j));
						if(BackToTop.contains("AVERAGE")) 
						{
							flag=1;
							sheet.removeRow(sheet.getRow(i));
							
						}
					}
					String BackToTop=formatter.formatCellValue(sheet.getRow(i).getCell(0));
					if(!BackToTop.contains("PLAN |"))						
						sheet.removeRow(sheet.getRow(i));
				}
			}
			catch(Exception e) {
				continue;
			}
		}
		
		flag=0;
		System.out.println(sheet.getLastRowNum());
		for(int i=0;i<sheet.getLastRowNum();i++) {
			try {
				if(flag==1) {
					sheet.removeRow(sheet.getRow(i));
				}
				if(flag==0)
				{
					for(int j=0;j<15;j++) {
						String BackToTop=formatter.formatCellValue(sheet.getRow(i).getCell(j));
						if(BackToTop.equals("BACK TO TOP")) 
						{
							flag=1;
							sheet.removeRow(sheet.getRow(i));
							break;
						}
						else if((BackToTop.contains("You could")||BackToTop.contains("7-day"))||(BackToTop.contains("Guarantees")||
								BackToTop.contains("A contractual"))){
							sheet.removeRow(sheet.getRow(i));
							break;
						}
						else if(BackToTop.contains("Performance")||BackToTop.contains("Expenses")||BackToTop.contains("The Account’s")) {
							sheet.removeRow(sheet.getRow(i));
							break;
						}
						else if(BackToTop.contains("Daily")) {
							sheet.removeRow(sheet.getRow(i));
							break;
						}
					}
				}
			}
			catch(Exception e) {
				continue;
			}
		}
		//sheet.shiftRows(11,14,-2);
		FileOutputStream out = new FileOutputStream("C:\\Users\\subha\\Desktop\\garbage\\Plootus\\Scrapped Data - Copy\\Book8.xlsx");
		workbook.write(out);
		System.out.println("Done");
			
		}
		System.out.println("Finished");
	}

}
