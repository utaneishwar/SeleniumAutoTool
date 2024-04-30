package tusharpracticeset;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandling {

	public static void main(String[] args) throws IOException 
	{
		//String path =System.getProperty("user.dir")+"\\Book1.xlsx";

		String path = "C:\\Users\\intel\\eclipse-workspace\\SeleniumAutoTool\\src\\tusharpracticeset\\Book1.xlsx";

		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);

		int rowcount = sheet.getLastRowNum();
		System.out.println(rowcount);
		int columncount =sheet.getRow(rowcount).getLastCellNum();
		System.out.println(columncount);
		File fout = new File(path);
		
		
		FileOutputStream fos = new FileOutputStream(fout);
		sheet.createRow(1).createCell(1).setCellValue("write test data");

		wb.write(fos);

		

	}

}
