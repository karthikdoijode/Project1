package javaScriptExecutor;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Script10_SeleniumDownFetchAddOfAllPages {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.xpath("//span[text()='Downloads']"));
		WebElement ele1 = driver.findElement(By.xpath("//span[text()='Documentation']"));
		WebElement ele2 = driver.findElement(By.xpath("//span[text()='Projects']"));
		WebElement ele3 = driver.findElement(By.xpath("//span[text()='Support']"));
		WebElement ele4 = driver.findElement(By.xpath("//span[text()='Blog']"));
		
		ArrayList<WebElement> l = new ArrayList<WebElement>();
		l.add(ele);	
		l.add(ele1);	
		l.add(ele2);	
		l.add(ele3);	
		l.add(ele4);
		
		Actions act = new Actions(driver);
		Robot r = new Robot();
		
		for(WebElement e: l)
		{
			act.contextClick(e).perform();
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_T);
			Thread.sleep(2000); 
		}
		
		Set<String> allwh = driver.getWindowHandles();
		
		for(String wh: allwh)
		{
			driver.switchTo().window(wh);
			Thread.sleep(2000);
		}
		
		
	}

}
