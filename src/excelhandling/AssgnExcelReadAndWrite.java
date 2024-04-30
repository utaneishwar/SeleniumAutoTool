package excelhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AssgnExcelReadAndWrite 
{

	public void ReadExcelSheet() throws IOException
	{

		// WAP to read all the values from excel sheet

		String path = System.getProperty("user.dir")+"\\ApiExcellsheet.xlsx";

		File file = new File(path);

		FileInputStream fis = new FileInputStream(file);

		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);

		int rowcount = sheet.getLastRowNum()+1;
		int columncount = sheet.getRow(2).getLastCellNum();

		for( int i=0; i<rowcount; i++)
		{
			for(int j=0; j<columncount; j++)
			{
				String data1= sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(data1+"  ");
			}
			System.out.println();        // will get all ouptput in systematic 

		}   
	} 

	public static void main(String[] args) throws IOException
	{

		AssgnExcelReadAndWrite t = new AssgnExcelReadAndWrite ();
		   t.ReadExcelSheet();

	}


}



