package excelhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AssHandlingExcelInAnotherClass 
{

	// WAP  program to read the excel and used in as per user requirement in 
	// java script

   public static String m1(int i,int j) throws IOException
   {
	   String path = System.getProperty("user.dir")+"\\ApiExcellsheet.xlsx";
	   
	   File file=new File(path);
	   
	   FileInputStream fis = new FileInputStream(file);
	   XSSFWorkbook wb = new XSSFWorkbook(fis);
	   
	    XSSFSheet sheet = wb.getSheetAt(0);
	      String data = sheet.getRow(i).getCell(j).getStringCellValue();
	    
	      System.out.println(data);
	       return data;
	     
	 }
   
   
   
   public static void main(String[] args) throws IOException
   {
	   
                   m1(1,1);
	   
	
}
	   
   }
	
	
	
	
	

