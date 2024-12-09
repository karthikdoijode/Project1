package handlingPopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script6_FileUploadPopUps1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		
		driver.get("C:\\Users\\INSPIRON\\Desktop\\SantoshPr\\popUps\\FileUpload.html");
		Thread.sleep(2000);
		
		WebElement we = driver.findElement(By.name("upload file"));
		we.sendKeys("C:\\Users\\INSPIRON\\Desktop\\SantoshPr\\popUps\\FileUploadSendingTextDoc.txt");
		
		Thread.sleep(1000);
		driver.close();
	}

}
