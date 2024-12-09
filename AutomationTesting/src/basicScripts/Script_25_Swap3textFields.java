package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_25_Swap3textFields {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/INSPIRON/Desktop/SantoshPr/Swap.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//input[@value='Manual']"));
		Thread.sleep(2000);
		ele.sendKeys(Keys.CONTROL+"a" + "x");
		WebElement ele2 = driver.findElement(By.xpath("//input[@value='']"));
		ele2.sendKeys(Keys.CONTROL + "v");
		WebElement ele3 = driver.findElement(By.xpath("//input[@value='Automation']"));
		ele3.sendKeys(Keys.CONTROL + "a" + "c");
		ele.sendKeys(Keys.CONTROL + "v");
		ele2.sendKeys(Keys.CONTROL + "a" + "c");
		ele3.sendKeys(Keys.CONTROL + "v");
		ele2.sendKeys(Keys.DELETE);
		}

}
