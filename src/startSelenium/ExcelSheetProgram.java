package startSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheetProgram {

	public static void main(String[] args) throws IOException 
	{
		String path = System.getProperty("user.dir")+"\\ApiExcellsheet2.xlsx";

		File file =new File(path);
		FileInputStream fis =new FileInputStream(file);
		XSSFWorkbook wb =new XSSFWorkbook(fis);
		XSSFSheet sheet =wb.getSheetAt(0);
		int rowcount = sheet.getLastRowNum();
		int columncount=sheet.getRow(rowcount).getLastCellNum();
		System.out.println(rowcount);
		System.out.println(columncount);

		for(int i=0; i<=rowcount; i++)
		{
			for(int j=0; j<columncount; j++)
			{
				String value = sheet.getRow(i).getCell(j).getStringCellValue();

				System.out.print(value+"	");
			}
			System.out.println();
		}
//
//		FileOutputStream fout =new FileOutputStream(file);
//		sheet.getRow(20).getCell(1).setCellValue("Ten");
//		wb.write(fout);

//		DataFormatter df =new DataFormatter();
//		String data = df.formatCellValue(sheet.getRow(20).getCell(1));
//
//		System.out.println(data);     
//






	}

}
