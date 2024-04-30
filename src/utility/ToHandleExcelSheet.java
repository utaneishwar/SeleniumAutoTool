package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ToHandleExcelSheet {

	public static void main(String[] args) throws FileNotFoundException 
	{
		String path=System.getProperty("user.dir")+"\\ApiExcellsheet2.xlsx";

		File file = new File(path);
		FileInputStream fis =new FileInputStream(file);
		XSSFWorkbook wb= new XSSFWorkbook();
		XSSFSheet sheet = wb.getSheetAt(1);
		
		int countrow = sheet.getLastRowNum();
		int  countcell = sheet.getRow(countrow).getLastCellNum();

		for(int i=0; i<countrow;i++)
		{
			for(int j=0; j<countcell; j++)
			{
				String alldetails = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(alldetails+" ");
				System.out.print("");
			}
		}
	}

}
