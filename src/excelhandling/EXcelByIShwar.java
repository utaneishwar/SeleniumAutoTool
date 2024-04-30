package excelhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

    public class EXcelByIShwar {

	public static void main(String[] args) throws IOException 
	{
		
		String path = System.getProperty("user.dir")+"\\NewMockGroup.xlsx";
            
            File file =new File(path);
       FileInputStream fis= new FileInputStream(file);
      
       XSSFWorkbook  wb =new XSSFWorkbook(fis) ;
           XSSFSheet sheet = wb.getSheetAt(0);
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
