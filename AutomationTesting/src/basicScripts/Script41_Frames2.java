package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script41_Frames2 {
	public static void main(String[] args) throws InterruptedException{
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("C:\\Users\\INSPIRON\\Desktop\\SantoshPr\\frames\\NestedFrame2\\Mainpage.html");
	Thread.sleep(2000);
	WebElement usn = driver.findElement(By.xpath("//input[@type='text']"));
	usn.sendKeys("Karthik");

	
	driver.switchTo().frame(0);
	WebElement psw = driver.findElement(By.xpath("//input[@type='text']"));
	psw.sendKeys("Karthik@123");
	}
	
}
