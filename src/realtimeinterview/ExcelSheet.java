package realtimeinterview;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheet {

	public static void main(String[] args) throws IOException
	{
		String path="C:\\Users\\intel\\eclipse-workspace\\SeleniumAutoTool\\src\\realtimeinterview\\ishwar.xlsx";
		File file =new File(path);

		FileInputStream fis =new FileInputStream(file);
		XSSFWorkbook wb =new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);

		int rowcount = sheet.getLastRowNum();
		int columncount = sheet.getRow(rowcount).getLastCellNum();

		System.out.println(rowcount);
		System.out.println(columncount);

		for(int i=0; i<rowcount; i++)
		{
			for(int j=0; j<columncount; j++)
			{
				String allvalue=sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(allvalue+" ");
			}
			System.out.println();
		}
		FileOutputStream fout =new FileOutputStream(file);
		sheet.createRow(10).createCell(9).setCellValue("ishwarutane");
		sheet.getRow(0).getCell(1).setCellValue("malamal");
                 wb.write(fout);
	}
}
