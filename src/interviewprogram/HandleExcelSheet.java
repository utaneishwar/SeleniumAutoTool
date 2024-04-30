package interviewprogram;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HandleExcelSheet {

	private static String format_columnconvert;

	public static void main(String[] args) throws IOException
	{
		// handling excel sheet
		// driver.getTitle
		String path = System.getProperty("user.dir")+"\\src\\interviewprogram\\ResultExcel.xlsx";


		File file =new File (path);
		FileInputStream fis =new FileInputStream(file);
		XSSFWorkbook wb =new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);

		FileOutputStream fout=new FileOutputStream(file);    // for write operation
		sheet.createRow(7).createCell(0).setCellValue("obc");
		sheet.getRow(7).createCell(1).setCellValue(9);
		sheet.getRow(7).createCell(2).setCellValue("pass");
		sheet.getRow(8).getCell(0).setCellValue("www");
		wb.write(fout);                                       // it is necessory

		int total_Rows = sheet.getLastRowNum();  // 6
		int total_Column=sheet.getRow(0).getLastCellNum();   // 3
		System.out.println(" total_Rows: "+ total_Rows +", total_Column: "+total_Column );

		DataFormatter df =new DataFormatter();
		for(int i=0; i<=total_Rows; i++)
		{
			for(int j=0; j<total_Column; j++)
			{
				String data = df.formatCellValue(sheet.getRow(i).getCell(j));
				System.out.print(data+"	");
				
			}
			System.out.println();
		
		}
		System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
	}

}
