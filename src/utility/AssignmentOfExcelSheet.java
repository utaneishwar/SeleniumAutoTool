package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AssignmentOfExcelSheet 
{

	public static void main(String[] args) throws IOException 
	{
		// WAP read all values from excel sheet
	
		//String path = System.getProperty("user.dir")+"\\workbook.xlsx";
		String path ="C:\\Users\\intel\\eclipse-workspace\\SeleniumAutoTool\\src\\realtimeinterview\\ishwar.xlsx";
		File file= new File(path);
		
		FileInputStream fis = new FileInputStream(file);
		
          XSSFWorkbook wb= new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheetAt(0);
        int countrow = sheet.getLastRowNum()+1;     //6
       
        int columncount= sheet.getRow(countrow).getLastCellNum();//3
       
       
           for(int i=0; i<countrow; i++ )
            {
        	  for(int j=0; j<columncount; j++)
        	   {
        		 
               String alldetail= sheet.getRow(i).getCell(j).getStringCellValue();
                System.out.println(alldetail);
                
        	    }  
             } 
	}
// output will get all data from excel sheet .
}
