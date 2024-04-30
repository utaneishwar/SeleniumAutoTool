package tusharpracticeset;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.examples.xssf.usermodel.CreateCell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandlingReadAndWrite
{
	public static void main(String[] args) throws IOException 
	{
		//String path = "C:\\Users\\intel\\eclipse-workspace\\SeleniumAutoTool\\src\\tusharpracticeset\\excel.xlsx";
		String path =System.getProperty("user.dir")+"\\src\\tusharpracticeset\\excel.xlsx";

		File file =new File(path);
		FileInputStream fis =new FileInputStream(file);
		XSSFWorkbook wb =new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(2);
		int rowcount = sheet.getLastRowNum()+1;
		int columncount =sheet.getRow(1).getLastCellNum();

		System.out.println(rowcount);
		System.out.println(columncount);
		
		 DataFormatter df = new DataFormatter();
		for(int i=0; i<rowcount; i++)
		{
			for(int j=0; j<columncount; j++)
			{
			String formatvalue =df.formatCellValue(sheet.getRow(i).getCell(j));
			System.out.print(formatvalue+" ");
			}
			System.out.println();	
		}
		
		File fout = new File(path);
		FileOutputStream fos = new FileOutputStream(fout);
		sheet.getRow(1).getCell(1).setCellValue("Rohan");
		sheet.createRow(7).createCell(3).setCellValue("gawade");
		wb.write(fos);
	
		
		

		//System.out.println(formatvalue);  /// it will convert any datatype into String 

       





	}

}
