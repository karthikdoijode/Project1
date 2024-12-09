package javaScriptExecutor;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script12_DemoAppsSwitchTabsPassDataBrowserWindows {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.xpath("//a[text()='Open in new window']"));
		ele.click();
		
		Set<String> all_wh = driver.getWindowHandles();
		for(String str: all_wh)
		{
			driver.switchTo().window(str);
		}
		
		Thread.sleep(3000);		
		driver.findElement(By.id("email")).sendKeys("karthik");
		driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("karthik123");
		driver.findElement(By.xpath("//input[@id = 'confirm-password']")).sendKeys("karthik123");
		Thread.sleep(2000);
		
		
		driver.get("https://demoapps.qspiders.com/ui/browser/newTab?sublist=1");
		Thread.sleep(2000);
		WebElement ele2 = driver.findElement(By.xpath("//button[text()='Open window in new Tab']"));
		ele2.click();
		
		Set<String> all_wh2 = driver.getWindowHandles();
		for(String str1: all_wh2)
		{
			driver.switchTo().window(str1);
		}
		
		driver.findElement(By.id("email")).sendKeys("Karthik");
		driver.findElement(By.id("password")).sendKeys("Karthik123");
		driver.findElement(By.id("confirm-password")).sendKeys("Karthik123");
		
}
}
