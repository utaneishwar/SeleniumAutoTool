package excelhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataInExcel
{  // write a data in excel 
	// using  get method and create method 
	// when existing data in excel sheet then used get method 
	// when add some data in blank rows and columns then used create data 
	
	
	public void m() throws IOException
	{
	
      //
	String path = System.getProperty("user.dir")+"\\workbook.xlsx";
	
	File file=new File(path);
	
	FileInputStream fis = new FileInputStream(file);
  	XSSFWorkbook wb = new XSSFWorkbook(fis);
	
	 XSSFSheet sheet = wb.getSheetAt(1);
	 
	   // write a data in excel sheet
	  
	     File fout = new File (path);
	     
	 FileOutputStream fos = new FileOutputStream(fout);
	 
	 
	 // get method is used for existing data 
	 sheet.getRow(0).getCell(1).setCellValue("test write data");
	 
	 //create method is used for  insert new data into the excel sheet
	 
	  sheet.createRow(10).createCell(3).setCellValue("45th row data write");
	 
	       wb.write(fos);                  // to save the changes this method is used 
 
	 
	 
	}
      public static void main(String[] args) throws IOException
	    {
		 WriteDataInExcel wr= new WriteDataInExcel();
		                  wr.m();

	    }

}
