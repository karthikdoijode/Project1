package screenshots;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Script7_ScrollDownScrScrllUpScScDwnFullSC {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ele = driver.findElement(By.xpath("//a[text()='Facebook']"));
		
		int a = ele.getLocation().getX();
		int b = ele.getLocation().getY();
		js.executeScript("window.scrollBy("+a+","+b+")");
		
		Thread.sleep(2000);
		
		String photo = "./photos/";
		Date d = new Date();
		String d1 = d.toString();
		String d2 = d1.replaceAll(":", "-");
		
		
		File src = ele.getScreenshotAs(OutputType.FILE);
		File dst = new File(photo+d2+"Elem.jpeg");
		FileHandler.copy(src, dst);
		
		WebElement ele2 = driver.findElement(By.xpath("//a[text()='Facebook']"));
		int c = ele.getLocation().getX();
		//int d = ele.getLocation().getY();
		js.executeScript("window.scrollBy("+a+","+b+")");
		js.executeScript("window.scrollBy(0,-4500)");
		
		
		

	}

}
