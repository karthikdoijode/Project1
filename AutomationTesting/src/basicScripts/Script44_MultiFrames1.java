package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script44_MultiFrames1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\INSPIRON\\Desktop\\SantoshPr\\frames\\MultiFrame\\usn.html");
		Thread.sleep(2000);
		WebElement usn = driver.findElement(By.xpath("//input[@type='text']"));
		usn.sendKeys("Karthik");
		
		driver.switchTo().frame("f1");
		WebElement ele2 = driver.findElement(By.xpath("//input[@type='text']"));
		ele2.sendKeys("9988776655");
		
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame("f2");
		WebElement ele3 = driver.findElement(By.xpath("//input[@type='text']"));
		ele3.sendKeys("karthik98@gmail.com");
		
		
	}

}
