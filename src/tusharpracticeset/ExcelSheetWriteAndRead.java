package tusharpracticeset;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheetWriteAndRead
{

	public static void main(String[] args) throws IOException 
	{
		String path ="C:\\Users\\intel\\eclipse-workspace\\SeleniumAutoTool\\src\\tusharpracticeset\\excel.xlsx";
	
		File file = new File(path);
		FileInputStream fis =new FileInputStream(file);
		XSSFWorkbook wb =new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		
		int rowcount = sheet.getLastRowNum();
		long columncount = sheet.getRow(rowcount).getLastCellNum();
		System.out.println(rowcount);
		System.out.println(columncount);
		
		String value;
		
		for(int i=0; i<=rowcount; i++)
		{
			for(int j=0; j<columncount; j++)
			{
				 value = sheet.getRow(i).getCell(j).getStringCellValue();
					System.out.print(value+" ");
			}
			System.out.println();
		
		}

       	File fout= new File(path);
 		FileOutputStream fos =new FileOutputStream(fout);
 		sheet.getRow(1).getCell(1).setCellValue("kishor2");
     	wb.write(fos);
		
	}

}
