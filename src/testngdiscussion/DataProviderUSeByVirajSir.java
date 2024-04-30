package testngdiscussion;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataProviderUSeByVirajSir 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
	FileInputStream fis =new FileInputStream("src\\testngdiscussion\\DataProviderSheet.xlsx");
	String s1 = WorkbookFactory.create(fis).getSheetAt(0).getRow(1).getCell(0).getStringCellValue();
	System.out.println(s1);
	}
}
