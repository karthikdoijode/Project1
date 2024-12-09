package dataDrivenTesting;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Script1_ReadSingleData {

	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis = new FileInputStream("./TestData/FacebookCredentials.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		XSSFRow row = sheet.getRow(1);
		XSSFCell cel = row.getCell(0);
		String val = cel.getStringCellValue();
		System.out.println(val);
		workbook.close();
		fis.close();
		
		

	}

}
