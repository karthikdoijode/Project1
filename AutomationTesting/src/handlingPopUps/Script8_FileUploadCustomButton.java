package handlingPopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script8_FileUploadCustomButton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://demoapps.qspiders.com/ui/fileUpload/custom?sublist=1");
		Thread.sleep(3000);
		
		WebElement we1 = driver.findElement(By.xpath("//div[text()='Upload File']"));
		we1.sendKeys("C:\\Users\\INSPIRON\\Desktop\\SantoshPr\\popUps\\FileUploadSendingTextDoc.txt");

	}

}
