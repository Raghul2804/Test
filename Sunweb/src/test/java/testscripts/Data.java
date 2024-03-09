package testscripts;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Data {
	
@Test

public void fetch() throws EncryptedDocumentException, IOException {
	
	FileInputStream path =new FileInputStream("./src/test/resources/Test.xlsx");
	Workbook wb =WorkbookFactory.create(path);
	Sheet sheet = wb.getSheet("Sheet1");
    int rowCount = sheet.getPhysicalNumberOfRows();
    int cellcount = sheet.getRow(1).getPhysicalNumberOfCells();
  
    
    for(int i=0;i<rowCount;i++)
    {
    	for(int j=0;j<cellcount;j++) {
    		String data =sheet.getRow(i).getCell(j).getStringCellValue();
    		
    		System.out.println(data);
    		
    		}
    		
    		}

}

}
