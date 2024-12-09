
package javaScriptExecutor;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script7_CloseTheDedicatedTab{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://skpatro.github.io/demo/links");
		driver.findElement(By.name("NewWindow")).click();
		
		String p_id = driver.getWindowHandle();
		Set<String> allwh = driver.getWindowHandles();
		
		for(String wh:allwh)
		{
			driver.switchTo().window(wh);
			String title = driver.getTitle();
			if(title.equals("Browser Windows"));
			{
			driver.close();
			}
		}
	}
}
