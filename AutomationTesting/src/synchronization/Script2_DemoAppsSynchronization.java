package synchronization;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script2_DemoAppsSynchronization {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demoapps.qspiders.com/ui/pageLoad?sublist=0");
		driver.findElement(By.xpath("//a[text()='Open In New Tab']")).click();
		
		 Set<String> a = driver.getWindowHandles();
		 for(String wh: a)
		 {
			 driver.switchTo().window(wh);
		 }
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("karthikdoijode98@gmail.com");
		driver.findElement(By.xpath("//button[text()='Subscribe']")).click();
		
		
	}

}
