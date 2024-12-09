package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script6_FBsendKeysAndRefreshPOM {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.cssSelector("input[id='email']"));
		ele.sendKeys("Karthik");
		driver.navigate().refresh();
		ele.sendKeys("karthik");
	}
}