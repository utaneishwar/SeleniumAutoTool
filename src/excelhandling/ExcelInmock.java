package excelhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelInmock {

	public static void main(String[] args) throws IOException
	{

	String path = System.getProperty("user.dir")+"\\NewMockGroup.xlsx";
		
		File file = new File(path);
		FileInputStream fis =new FileInputStream(file);
		
		XSSFWorkbook wb =new XSSFWorkbook(fis);
		  XSSFSheet sheet = wb.getSheetAt(0);
		  int rowcount = sheet.getLastRowNum();
		  long ColumnCount = sheet.getRow(0).getLastCellNum();
		
		FileOutputStream fos = new FileOutputStream(file);
		sheet.getRow(5).createCell(3).setCellValue("mrunali");
		System.out.println(rowcount);
		System.out.println(ColumnCount);
		wb.write(fos);
		
		
		
	}

}
