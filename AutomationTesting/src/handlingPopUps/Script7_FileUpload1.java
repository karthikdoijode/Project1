package handlingPopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script7_FileUpload1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		Thread.sleep(8000);
		
		WebElement we = driver.findElement(By.xpath("//input[@id='fileInput']"));
		we.sendKeys("C:\\Users\\INSPIRON\\Desktop\\SantoshPr\\popUps\\FileUploadSendingTextDoc.txt");

	}

}
