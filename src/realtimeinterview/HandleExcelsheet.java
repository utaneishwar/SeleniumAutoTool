package realtimeinterview;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HandleExcelsheet {

	public static void main(String[] args) throws IOException
	{

		String path ="C:\\Users\\intel\\eclipse-workspace\\SeleniumAutoTool\\src\\realtimeinterview\\MockExcel.xlsx";

		File file =new File(path);
		FileInputStream fis= new FileInputStream(file);
		Workbook wb =WorkbookFactory.create(file);
		// XSSFWorkbook  wb =new XSSFWorkbook(fis) ;
		XSSFSheet sheet = (XSSFSheet) wb.getSheetAt(0);
		int rowcount = sheet.getLastRowNum();
		int columncount=sheet.getRow(rowcount).getLastCellNum();

		System.out.println(rowcount);
		System.out.println(columncount);
		System.out.println( sheet.getRow(0).getCell(1));  // column2

		for(int i=0; i<=rowcount;i++)
		{
			for(int j=0; j<columncount; j++) 
			{
				String value = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+"  ");


			}
			System.out.println(" ");
		}




	}


}
