package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheetForPracticePurpose {

	public static void main(String[] args) throws IOException
	{
		// MIMP 
		// we can handle the excel sheet in selenium 
		
		String path = System.getProperty("user.dir")+"\\ApiExcellsheet.xlsx";
		
		File file = new File(path);
		
		// to read the excel sheet
		
	   FileInputStream fis = new FileInputStream(file);
				
		 // To locate the Workbook
	   
	   XSSFWorkbook wb = new XSSFWorkbook(fis);
	   // to locate the Sheet
	   
	    XSSFSheet sh1 = wb.getSheetAt(0);        // sheet index position like 0,1,2,3, because multiple sheet present in excel so 
	    
	    
	  //  to locate the rows and column    // here excel shet change
	   String data = sh1.getRow(1).getCell(1).getStringCellValue();   // password1
	    System.out.println(data);
	    
	    
	   String data1 = sh1.getRow(3).getCell(0).getStringCellValue();   //username3
	   System.out.println(data1);
	   
	      String data3 = sh1.getRow(6).getCell(1).getStringCellValue(); 
	   System.out.println(data3);                                  //password6
	   
	   
	   // to get count of row and column then
	   
	       int countofrow = sh1.getLastRowNum();               
	   
	   System.out.println(countofrow);                    //will get index position of row count
	   
	   int countofcolumn=sh1.getRow(2).getLastCellNum();
	   System.out.println(countofcolumn );                // will get exact column count
	   
	}

}
