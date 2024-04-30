package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class handlexcelsheetDiffLogic {

	public static void main(String[] args) throws IOException
	{//Handling excel sheet by using Diff logic


		String path = "C:\\Users\\intel\\eclipse-workspace\\SeleniumAutoTool\\ApiExcellsheet.xlsx";

		File file=new File(path);
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		int rowcount= sheet.getLastRowNum();
		int countcolumn =  sheet.getRow(1).getLastCellNum();
		int j =0;
		int k = 0;
		int l = 0;
		for(int i = 0; i<=rowcount; i++)
		{
			String print = sheet.getRow(j).getCell(0).getStringCellValue();

			String print1=sheet.getRow(k).getCell(1).getStringCellValue();
			String print2 = sheet.getRow(l).getCell(2).getStringCellValue();

			j++;
			k++;
			System.out.println(print+" "+print1+" "+print2);
		} 


	}

}
