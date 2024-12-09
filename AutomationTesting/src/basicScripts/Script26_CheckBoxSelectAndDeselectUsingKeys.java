package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script26_CheckBoxSelectAndDeselectUsingKeys {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/INSPIRON/Desktop/SantoshPr/CheckBoxSelectDeselect1.html");
		Thread.sleep(3000);
		WebElement ele1 = driver.findElement(By.id("a1"));
		Thread.sleep(1000);
		ele1.sendKeys(Keys.SPACE);
		WebElement ele2 = driver.findElement(By.id("a2"));
		Thread.sleep(1000);
		ele2.sendKeys(Keys.SPACE);
		WebElement ele3 = driver.findElement(By.id("a3"));
		Thread.sleep(1000);
		ele3.sendKeys(Keys.SPACE);
		WebElement ele4 = driver.findElement(By.id("a4"));
		Thread.sleep(1000);
		ele4.sendKeys(Keys.SPACE);
		WebElement ele5 = driver.findElement(By.id("a5"));
		Thread.sleep(1000);
		ele5.sendKeys(Keys.SPACE);
		
		
		Thread.sleep(1000);
		ele5.sendKeys(Keys.SPACE);
	
		Thread.sleep(1000);
		ele4.sendKeys(Keys.SPACE);
	
		Thread.sleep(1000);
		ele3.sendKeys(Keys.SPACE);
		
		Thread.sleep(1000);
		ele2.sendKeys(Keys.SPACE);
		
		Thread.sleep(1000);
		ele1.sendKeys(Keys.SPACE);
		
		
	}

}
