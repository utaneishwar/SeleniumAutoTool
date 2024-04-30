package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Reader
{

	public static void main(String[] args) throws InvalidFormatException, IOException
	{  // It is MIMP concept interview point of view
		// how to handle the excel sheet in selenium
		
		String path = System.getProperty("user.dir")+"\\ApiExcellSheet.xlsx";
		
		File file= new File(path);
		
		//to read the excel sheet or load the excel sheet
		
		FileInputStream fis= new FileInputStream(file);
		
		// To locate the Workbook
	XSSFWorkbook wb = new XSSFWorkbook(file);
	
	
	// To locate the sheet 
	   XSSFSheet sh1 = wb.getSheetAt(0);
	   
	   
	   //To locate the Row and Column
	   String data = sh1.getRow(4).getCell(1).getStringCellValue();
	
		System.out.println(data);   // password 4
		
		
		// if we have to required quantity of rows and column the we will use
	
		
		
	     int rowcount = sh1.getLastRowNum();
		System.out.println("no of rows"+rowcount);  // 19 it will return last index position
		
		
	    int columncount = sh1.getRow(5).getLastCellNum();
		System.out.println("no of column count:"+columncount);  // 2 actual count will be return of column
		
		
		
		
		
	}

}
