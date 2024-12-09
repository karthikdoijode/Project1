package handlingPopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script5_HiddenDivisionPopUps1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
//		driver.get("https://www.redbus.in/");
//		Thread.sleep(2000);
//		
//		
//		driver.findElement(By.xpath("//span[text()='Date']")).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//span[text()='22']")).click();
	
// ------------------------------------------------------------------------------
		
		
		driver.get("https://demoapps.qspiders.com/ui/hidden?sublist=0");
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("karthikdoijode98@gmail.com");
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("karthik");
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		
		
		
	}
}
