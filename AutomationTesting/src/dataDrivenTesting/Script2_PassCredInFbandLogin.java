package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script2_PassCredInFbandLogin {
	public static void main(String[] args) throws InterruptedException, Exception {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		FileInputStream fis = new FileInputStream("./TestData/FacebookCredentials.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		XSSFRow row = sheet.getRow(2);
		XSSFCell cel = row.getCell(0);
		String val = cel.getStringCellValue();
		
		XSSFRow row1 = sheet.getRow(2);
		XSSFCell cel1 = row1.getCell(1);
		String val1 = cel1.getStringCellValue();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(val);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(val1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
	}

}
