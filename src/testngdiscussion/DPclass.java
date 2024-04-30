package testngdiscussion;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;


public class DPclass
{
  // Data Provider is an Annotation which provide the data (single data) into the TestCase and create one test case
  
     @DataProvider (name="TestData")
    
      public static String [][]readData() throws IOException
      {
      	String path = "C:\\Users\\intel\\eclipse-workspace\\SeleniumAutoTool\\src\\testngdiscussion\\DataProviderSheet.xlsx";
      	
      	File file =new File(path);
      
      	FileInputStream fis =new FileInputStream(file);
      	
      	 XSSFWorkbook wb = new XSSFWorkbook(fis);
    	
    	       XSSFSheet sheet = wb.getSheetAt(0);
   
    	       int rowcount = sheet.getLastRowNum()+1;
                
    	         int columncount = sheet.getRow(1).getLastCellNum();
    	         
    	       
    	         String [] [] data = new String [rowcount][columncount];
    	         
    	         for(int i=0; i<rowcount; i++)
    	         {
	 				
    	        	 for(int j=0; j<columncount; j++)
    	        	 {
    	        		 data[i][j] =sheet.getRow(i).getCell(j).getStringCellValue();
    	        	
    	        	 }
    	         }
                 
    	         return data ;
    
        }

   }




