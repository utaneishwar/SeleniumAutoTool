package excelhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandlingByIshwar2 {

	public static void main(String[] args) throws IOException 
	{
		String path = System.getProperty("user.dir")+"ApiExcellsheet.xlsx";
		File file= new File(path);
		FileInputStream fis= new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		 XSSFSheet sheet = wb.getSheetAt(0);
		// DataFormatter df= new DataFormatter();
		FileOutputStream fos=new FileOutputStream(path);
	       sheet.createRow(9).getCell(2).setCellValue("malaPremchand");
	      wb.write(fos); 

	     
	}
// getrow() method is use if the Already data has existence inside excelsheet in row 
	// create method is used to create new row and Cell inside Excel and we can put data inside that row and column
}
