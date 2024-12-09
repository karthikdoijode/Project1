package javaScriptExecutor;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script3_PrintTheCountOfBrowserAndAlsoTheirAddresses {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links");
		driver.findElement(By.name("NewWindow")).click();
		
		Set<String> allwh = driver.getWindowHandles();
		System.out.println(allwh.size());
		
		for(String wh:allwh)
		{
			System.out.println(wh);
		}

	}

}
