
package javaScriptExecutor;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script6_CloseOnlyChildBrowser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://skpatro.github.io/demo/links");
		driver.findElement(By.name("NewWindow")).click();
		
		String p_id = driver.getWindowHandle();
		Set<String> allwh = driver.getWindowHandles();
		
		System.out.println(allwh.size());
		allwh.remove(p_id);
		System.out.println(allwh.size());
		
		for(String wh:allwh)
		{
			driver.switchTo().window(wh);
			driver.close();
		
		}
	}
}
