package excelhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NewExcelHandling 
{

	public static void main(String[] args) throws IOException 
	{
		String path = System.getProperty("user.dir")+"\\workbook.xlsx";

		File file =new File(path);
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheetAt(0);
		      int rowcount = sheet.getLastRowNum();
		    int columncount = sheet.getRow(rowcount).getLastCellNum();
		    
		    
		    
		    
		    File fout = new File (path);
		     
			 FileOutputStream fos = new FileOutputStream(fout);
	         sheet.createRow(12).createCell(5).setCellValue("ishwar");
	        
	         sheet.getRow(2).createCell(2).setCellValue("ishwarutane");
	         
	         

	         sheet.getRow(2).getCell(0).setCellValue("manju8");
	         wb.write(fos);
//	           for(int i = 0; i<=rowcount; i++)	
//	            {
//		             for(int j =0; j<=columncount; j++)
//		               {
//		                String value = sheet.getRow(i).getCell(j).getStringCellValue();
//		                  System.out.print(value+" ");
//			
//		                }
//		            System.out.println(" ");
//	             }
//		
//		
		
		
		
	}

}
