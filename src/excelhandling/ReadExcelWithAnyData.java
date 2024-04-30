package excelhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelWithAnyData
{
	public void m1() throws IOException 
	{
	//
	String path = System.getProperty("user.dir")+"\\ApiExcellsheet.xlsx";
	
	File file=new File(path);
	
	FileInputStream fis = new FileInputStream(file);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	
	 XSSFSheet sheet = wb.getSheetAt(0);
	 
	// for read any type of data 
	     DataFormatter df= new DataFormatter();
	    
	    String data=df.formatCellValue(sheet.getRow(5).getCell(0));
	    System.out.println(data);
	
	}
	public static void main(String[] args) throws IOException
	{
		
		ReadExcelWithAnyData er = new ReadExcelWithAnyData();
		er.m1();

	}

}
