package scrapings;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class link_cleaning 
{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream(new File("C:\\Users\\subha\\Desktop\\garbage\\Plootus\\Scrapped Data - Copy\\Book1_1.xlsx"));
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		FileInputStream fis1=new FileInputStream(new File("C:\\Users\\subha\\Desktop\\garbage\\Plootus\\Scrapped Data\\Omitted.xlsx"));
		
		XSSFWorkbook workbook1 = new XSSFWorkbook(fis1);
		XSSFSheet sheet1 = workbook1.getSheetAt(0);
		
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
					for(int j=0;j<4;j++) {
						String BackToTop=formatter.formatCellValue(sheet.getRow(i).getCell(j));
						if(BackToTop.contains("LOG IN")) 
						{
							flag=1;
							sheet.removeRow(sheet.getRow(i));
							
						}
					}
					String BackToTop=formatter.formatCellValue(sheet.getRow(i).getCell(0));
					//if(!BackToTop.contains("PLAN |"))						
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
				String BackToTop=formatter.formatCellValue(sheet.getRow(i).getCell(0));
					for(int z=0;z<sheet1.getLastRowNum();z++) 
					{
							
						String s =formatter.formatCellValue(sheet1.getRow(z).getCell(0));
						//for(int j=0;j<3;j++) 
						//{
							
							
							if(BackToTop.contains(s)) 
							{
								//flag=1;
								sheet.removeRow(sheet.getRow(i));
								break;
							}
						//}
							
					}
				}
					/*for(int j=0;j<15;j++) {
						String BackToTop=formatter.formatCellValue(sheet.getRow(i).getCell(j));
						
						if(BackToTop.equals("BACK TO TOP")) 
						{
							flag=1;
							sheet.removeRow(sheet.getRow(i));
							break;
						}
						else if((BackToTop.contains("Expenses (Investment")||BackToTop.contains("The Account’s"))||(BackToTop.contains("The Weight (%)")||
								BackToTop.contains("A contractual"))){
							sheet.removeRow(sheet.getRow(i));
							break;
						}
						else if(BackToTop.contains("The performance")||BackToTop.contains("30 DAY SEC")||BackToTop.contains("The SEC 30")) {
							sheet.removeRow(sheet.getRow(i));
							break;
						}
						else if(BackToTop.contains("Turnover is calculated")||BackToTop.contains("LEARN MORE")||BackToTop.contains("The Morningstar Style Box")) {
							sheet.removeRow(sheet.getRow(i));
							break;
						}
						else if(BackToTop.contains("If applicable")||BackToTop.contains("The Overall Morningstar Rating")||BackToTop.contains("The Morningstar Style Box")) {
							sheet.removeRow(sheet.getRow(i));
							break;
						}
						else if(BackToTop.contains("If applicable")||BackToTop.contains("The Overall Morningstar Rating")||BackToTop.contains("The Morningstar Style Box")) {
							sheet.removeRow(sheet.getRow(i));
							break;
						}
					}
				}
			}*/
			catch(Exception e) {
				continue;
			}
		}
		//sheet.shiftRows(11,14,-2);
		FileOutputStream out = new FileOutputStream("C:\\Users\\subha\\Desktop\\garbage\\Plootus\\Scrapped Data - Copy\\Book1_1.xlsx");
		workbook.write(out);
		System.out.println("Done");
			
		}
		System.out.println("Finished");
	}
}


