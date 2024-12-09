package javaScriptExecutor;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Script11_DemoAppsScroll {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demoapps.qspiders.com/ui/scroll?scenario=1");
	Thread.sleep(2000);
	
	WebElement ele = driver.findElement(By.xpath("//a[text()='Open In New Tab']"));
	ele.click();
	
	String wh = driver.getWindowHandle();
	
	Set<String> allwh = driver.getWindowHandles();
	allwh.remove(wh);
	
	for(String str: allwh)
	{
		driver.switchTo().window(str);
	}
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	Thread.sleep(3000);
	WebElement ele2 = driver.findElement(By.xpath("//input[@type='checkbox']"));
	int a = ele2.getLocation().getX();
	int b = ele2.getLocation().getY();
	
	js.executeScript("window.scrollBy("+a+","+b+")");
	ele2.click();
	
	WebElement ele3 = driver.findElement(By.xpath("//button[text()='Accept Our Policy']"));
	ele3.click();
	
	TakesScreenshot ts = (TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dst = new File("./photos/" + "Switchtabs.jpeg");
	FileHandler.copy(src, dst);
	}
}
