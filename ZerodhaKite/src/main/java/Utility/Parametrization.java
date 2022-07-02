package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization {

	public static String getdata(String sheetname, int row, int column) throws EncryptedDocumentException, IOException {
		FileInputStream file= new FileInputStream("C:\\automation\\ZerodhaKite\\src\\test\\resources\\inputstream.xlsx");
		String user = WorkbookFactory.create(file).getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
		return user;
		
	}
}